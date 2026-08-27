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
         ke $$19 = a($$12, $$11.valuesOf($$10).stream().map($$0x -> Paths.get($$0x)).collect(Collectors.toList()), $$14, $$15, $$16, $$17, $$18, aa.b(), true);
         $$19.a();
      } else {
         $$1.printHelpOn(System.out);
      }
   }

   private static <T extends kf> kf.a<T> a(BiFunction<kh, CompletableFuture<id.b>, T> $$0, CompletableFuture<id.b> $$1) {
      return $$2 -> $$0.apply($$2, $$1);
   }

   public static ke a(Path $$0, Collection<Path> $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6, ad $$7, boolean $$8) {
      ke $$9 = new ke($$0, $$7, $$8);
      ke.a $$10 = $$9.a($$2 || $$3);
      $$10.a($$1x -> new ni($$1x, $$1).a(new nj()));
      CompletableFuture<id.b> $$11 = CompletableFuture.supplyAsync(ne::a, ac.f());
      ke.a $$12 = $$9.a($$2);
      $$12.a(lr::new);
      ke.a $$13 = $$9.a($$3);
      $$13.a(a(nd::new, $$11));
      $$13.a(a(kl::a, $$11));
      $$13.a(lk::a);
      $$13.a(nb::new);
      nz<cua> $$14 = $$13.a(a(ob::new, $$11));
      nz<cke> $$15 = $$13.a($$2x -> new oc($$2x, $$11, $$14.c()));
      $$13.a(a(nl::new, $$11));
      $$13.a(a(nm::new, $$11));
      $$13.a(a(nn::new, $$11));
      $$13.a(a(no::new, $$11));
      $$13.a(a(np::new, $$11));
      $$13.a(a(nq::new, $$11));
      $$13.a(a(nr::new, $$11));
      $$13.a(a(ns::new, $$11));
      $$13.a(a(nt::new, $$11));
      $$13.a(a(nw::new, $$11));
      $$13.a(a(nx::new, $$11));
      $$13.a(a(ny::new, $$11));
      $$13.a(a(od::new, $$11));
      $$13 = $$9.a($$4);
      $$13.a($$1x -> new ng($$1x, $$1));
      $$13 = $$9.a($$5);
      $$13.a(a(ks::new, $$11));
      $$13.a(kt::new);
      $$13.a(a(ku::new, $$11));
      $$13.a(kv::new);
      $$13 = $$9.a($$3, "bundle");
      $$13.a(na::new);
      $$13.a($$0x -> ln.a($$0x, ui.c("dataPack.bundle.description"), cfg.a(cfi.b)));
      $$13 = $$9.a($$3, "trade_rebalance");
      $$13.a($$0x -> ln.a($$0x, ui.c("dataPack.trade_rebalance.description"), cfg.a(cfi.c)));
      $$13.a(ld::a);
      $$13.a(a(oa::new, $$11));
      return $$9;
   }
}
