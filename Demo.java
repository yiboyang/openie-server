/**
 *
 */
// This demo shows how to interface with openie API; you don't need it to run
// OpenIEServer
import scala.collection.Iterator;
import scala.collection.Seq;
import edu.knowitall.openie.*;
import edu.knowitall.tool.parse.ClearParser;
import edu.knowitall.tool.postag.ClearPostagger;
import edu.knowitall.tool.postag.Postagger;
import edu.knowitall.tool.srl.ClearSrl;
import edu.knowitall.tool.tokenize.ClearTokenizer;


public class Demo {
    public static void main(String[] args)
    {
        OpenIE openIE = new OpenIE(new ClearParser(new ClearPostagger(new ClearTokenizer(ClearTokenizer.defaultModelUrl()))),
                new ClearSrl(), false);

        Seq<Instance> extractions = openIE.extract("U.S. president Barack Obama gave his inaugural address on January 20, 2013.");
        Iterator<Instance> iterator = extractions.iterator();
        while (iterator.hasNext()) {
            Instance inst = iterator.next();
            StringBuilder sb = new StringBuilder();
            sb.append(inst.confidence())
                .append('\t')
                .append(inst.extr().arg1().text())
                .append('\t')
                .append(inst.extr().rel().text())
                .append('\t');

            Iterator<Part> argIter = inst.extr().arg2s().iterator();
            while (argIter.hasNext()) {
                Part arg = argIter.next();
                sb.append(arg.text()).append("; ");
            }

            System.out.println(sb.toString());
        }
    }
}
