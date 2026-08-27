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
         kn $$19 = a($$12, $$11.valuesOf($$10).stream().map($$0x -> Paths.get($$0x)).collect(Collectors.toList()), $$14, $$15, $$16, $$17, $$18, aa.b(), true);
         $$19.a();
      } else {
         $$1.printHelpOn(System.out);
      }
   }

   private static <T extends ko> ko.a<T> a(BiFunction<kq, CompletableFuture<in.a>, T> $$0, CompletableFuture<in.a> $$1) {
      return $$2 -> $$0.apply($$2, $$1);
   }

   public static kn a(Path $$0, Collection<Path> $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6, ad $$7, boolean $$8) {
      kn $$9 = new kn($$0, $$7, $$8);
      kn.a $$10 = $$9.a($$2 || $$3);
      $$10.a($$1x -> new nx($$1x, $$1).a(new ny()));
      CompletableFuture<in.a> $$11 = CompletableFuture.supplyAsync(nt::a, ac.f());
      kn.a $$12 = $$9.a($$2);
      $$12.a(mf::new);
      kn.a $$13 = $$9.a($$3);
      $$13.a(a(nq::new, $$11));
      $$13.a(a(kw::a, $$11));
      $$13.a(a(ly::a, $$11));
      $$13.a(a(no::new, $$11));
      oo<czf> $$14 = $$13.a(a(ow::new, $$11));
      oo<cpl> $$15 = $$13.a($$2x -> new ox($$2x, $$11, $$14.c()));
      oo<cxd> $$16 = $$13.a(a(ob::new, $$11));
      $$13.a(a(oa::new, $$11));
      $$13.a(a(oc::new, $$11));
      $$13.a(a(od::new, $$11));
      $$13.a(a(oe::new, $$11));
      $$13.a(a(of::new, $$11));
      $$13.a(a(og::new, $$11));
      $$13.a(a(oh::new, $$11));
      $$13.a(a(oi::new, $$11));
      $$13.a(a(ol::new, $$11));
      $$13.a(a(om::new, $$11));
      $$13.a(a(on::new, $$11));
      $$13.a(a(oy::new, $$11));
      $$13 = $$9.a($$4);
      $$13.a($$1x -> new nv($$1x, $$1));
      $$13 = $$9.a($$5);
      $$13.a(a(ld::new, $$11));
      $$13.a(le::new);
      $$13.a(a(lf::new, $$11));
      $$13.a(lg::new);
      $$13 = $$9.a($$3, "bundle");
      $$13.a(a(nm::new, $$11));
      $$13.a($$0x -> mb.a($$0x, vs.c("dataPack.bundle.description"), ckl.a(ckn.b)));
      $$13 = $$9.a($$3, "trade_rebalance");
      $$13.a($$0x -> mb.a($$0x, vs.c("dataPack.trade_rebalance.description"), ckl.a(ckn.d)));
      $$13.a(a(lo::a, $$11));
      $$13.a(a(op::new, $$11));
      CompletableFuture<ja.e> $$21 = ns.a($$11);
      CompletableFuture<in.a> $$22 = $$21.thenApply(ja.e::a);
      CompletableFuture<in.a> $$23 = $$21.thenApply(ja.e::b);
      kn.a $$24 = $$9.a($$3, "update_1_21");
      $$24.a(a(nn::new, $$23));
      oo<czf> $$25 = $$24.a($$2x -> new or($$2x, $$23, $$14.c()));
      $$24.a($$3x -> new ov($$3x, $$23, $$15.c(), $$25.c()));
      $$24.a($$2x -> new oq($$2x, $$23, $$16.c()));
      $$24.a(a(lr::a, $$23));
      $$24.a(a(nq::new, $$23));
      $$24.a($$0x -> mb.a($$0x, vs.c("dataPack.update_1_21.description"), ckl.a(ckn.c)));
      $$24.a(a(ou::new, $$22));
      $$24.a(a(os::new, $$22));
      $$24.a(a(ku::a, $$22));
      return $$9;
   }
}
