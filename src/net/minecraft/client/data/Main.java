package net.minecraft.client.data;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import net.minecraft.obfuscate.DontObfuscate;

public class Main {
   @DontObfuscate
   @ac(
      a = "System.out needed before bootstrap"
   )
   public static void main(String[] $$0) throws IOException {
      ab.a();
      OptionParser $$1 = new OptionParser();
      OptionSpec<Void> $$2 = $$1.accepts("help", "Show the help menu").forHelp();
      OptionSpec<Void> $$3 = $$1.accepts("client", "Include client generators");
      OptionSpec<Void> $$4 = $$1.accepts("all", "Include all generators");
      OptionSpec<String> $$5 = $$1.accepts("output", "Output folder").withRequiredArg().defaultsTo("generated", new String[0]);
      OptionSet $$6 = $$1.parse($$0);
      if (!$$6.has($$2) && $$6.hasOptions()) {
         Path $$7 = Paths.get((String)$$5.value($$6));
         boolean $$8 = $$6.has($$4);
         boolean $$9 = $$8 || $$6.has($$3);
         ali.a();
         foi.a();
         ml $$10 = new ml($$7, ab.b(), true);
         a($$10, $$9);
         $$10.a();
      } else {
         $$1.printHelpOn(System.out);
      }
   }

   public static void a(ml $$0, boolean $$1) {
      ml.a $$2 = $$0.a($$1);
      $$2.a(fqu::new);
      $$2.a(fqr::new);
      $$2.a(fqp::new);
   }
}
