package net.minecraft.data;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import net.minecraft.obfuscate.DontObfuscate;

public class Main {
   @DontObfuscate
   public static void main(String[] $$0) throws IOException {
      aa.a();
      OptionParser $$1 = new OptionParser();
      OptionSpec<Void> $$2 = $$1.accepts("help", "Show the help menu").forHelp();
      OptionSpec<Void> $$3 = $$1.accepts("server", "Include server generators");
      OptionSpec<Void> $$4 = $$1.accepts("client", "Include client generators");
      OptionSpec<Void> $$5 = $$1.accepts("dev", "Include development tools");
      OptionSpec<Void> $$6 = $$1.accepts("reports", "Include data reports");
      OptionSpec<Void> $$7 = $$1.accepts("validate", "Validate inputs");
      OptionSpec<Void> $$8 = $$1.accepts("all", "Include all generators");
      OptionSpec<String> $$9 = $$1.accepts("output", "Output folder").withRequiredArg().defaultsTo("generated", new String[0]);
      OptionSpec<String> $$10 = $$1.accepts("input", "Input folder").withRequiredArg();
      OptionSet $$11 = $$1.parse($$0);
      if (!$$11.has($$2) && $$11.hasOptions()) {
         Path $$12 = Paths.get((String)$$9.value($$11));
         boolean $$13 = $$11.has($$8);
         boolean $$14 = $$13 || $$11.has($$4);
         boolean $$15 = $$13 || $$11.has($$3);
         boolean $$16 = $$13 || $$11.has($$5);
         boolean $$17 = $$13 || $$11.has($$6);
         boolean $$18 = $$13 || $$11.has($$7);
         jh $$19 = a($$12, $$11.valuesOf($$10).stream().map($$0x -> Paths.get($$0x)).collect(Collectors.toList()), $$14, $$15, $$16, $$17, $$18, aa.b(), true);
         $$19.a();
      } else {
         $$1.printHelpOn(System.out);
      }
   }

   private static <T extends ji> ji.a<T> a(BiFunction<jk, CompletableFuture<hg.b>, T> $$0, CompletableFuture<hg.b> $$1) {
      return $$2 -> $$0.apply($$2, $$1);
   }

   public static jh a(Path $$0, Collection<Path> $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6, ad $$7, boolean $$8) {
      jh $$9 = new jh($$0, $$7, $$8);
      jh.a $$10 = $$9.a($$2 || $$3);
      $$10.a($$1x -> new mh($$1x, $$1).a(new mi()));
      CompletableFuture<hg.b> $$11 = CompletableFuture.supplyAsync(me::a, ac.f());
      jh.a $$12 = $$9.a($$2);
      $$12.a(ks::new);
      jh.a $$13 = $$9.a($$3);
      $$13.a(a(md::new, $$11));
      $$13.a(a(jo::a, $$11));
      $$13.a(kl::a);
      $$13.a(mb::new);
      my<cpn> $$14 = $$13.a(a(mz::new, $$11));
      my<cfu> $$15 = $$13.a($$2x -> new na($$2x, $$11, $$14.c()));
      $$13.a(a(mk::new, $$11));
      $$13.a(a(ml::new, $$11));
      $$13.a(a(mm::new, $$11));
      $$13.a(a(mn::new, $$11));
      $$13.a(a(mo::new, $$11));
      $$13.a(a(mp::new, $$11));
      $$13.a(a(mq::new, $$11));
      $$13.a(a(mr::new, $$11));
      $$13.a(a(ms::new, $$11));
      $$13.a(a(mv::new, $$11));
      $$13.a(a(mw::new, $$11));
      $$13.a(a(mx::new, $$11));
      $$13.a(a(nb::new, $$11));
      $$13 = $$9.a($$4);
      $$13.a($$1x -> new mg($$1x, $$1));
      $$13 = $$9.a($$5);
      $$13.a(a(jv::new, $$11));
      $$13.a(jw::new);
      $$13.a(a(jx::new, $$11));
      $$13.a(jy::new);
      $$13 = $$9.a($$3, "bundle");
      $$13.a(ma::new);
      $$13.a($$0x -> ko.a($$0x, sw.c("dataPack.bundle.description"), caw.a(cay.b)));
      return $$9;
   }
}
