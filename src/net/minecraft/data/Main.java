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
         ko $$19 = a($$12, $$11.valuesOf($$10).stream().map($$0x -> Paths.get($$0x)).collect(Collectors.toList()), $$14, $$15, $$16, $$17, $$18, aa.b(), true);
         $$19.a();
      } else {
         $$1.printHelpOn(System.out);
      }
   }

   private static <T extends kp> kp.a<T> a(BiFunction<kr, CompletableFuture<in.a>, T> $$0, CompletableFuture<in.a> $$1) {
      return $$2 -> $$0.apply($$2, $$1);
   }

   public static ko a(Path $$0, Collection<Path> $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6, ad $$7, boolean $$8) {
      ko $$9 = new ko($$0, $$7, $$8);
      ko.a $$10 = $$9.a($$2 || $$3);
      $$10.a($$1x -> new nz($$1x, $$1).a(new oa()));
      CompletableFuture<in.a> $$11 = CompletableFuture.supplyAsync(nv::a, ac.f());
      ko.a $$12 = $$9.a($$2);
      $$12.a(mh::new);
      ko.a $$13 = $$9.a($$3);
      $$13.a(a(ns::new, $$11));
      $$13.a(a(kx::a, $$11));
      $$13.a(a(ma::a, $$11));
      $$13.a(a(nq::new, $$11));
      oq<daa> $$14 = $$13.a(a(oy::new, $$11));
      oq<cqf> $$15 = $$13.a($$2x -> new oz($$2x, $$11, $$14.c()));
      oq<cxy> $$16 = $$13.a(a(od::new, $$11));
      $$13.a(a(oc::new, $$11));
      $$13.a(a(oe::new, $$11));
      $$13.a(a(of::new, $$11));
      $$13.a(a(og::new, $$11));
      $$13.a(a(oh::new, $$11));
      $$13.a(a(oi::new, $$11));
      $$13.a(a(oj::new, $$11));
      $$13.a(a(ok::new, $$11));
      $$13.a(a(on::new, $$11));
      $$13.a(a(oo::new, $$11));
      $$13.a(a(op::new, $$11));
      $$13.a(a(pa::new, $$11));
      $$13 = $$9.a($$4);
      $$13.a($$1x -> new nx($$1x, $$1));
      $$13 = $$9.a($$5);
      $$13.a(a(le::new, $$11));
      $$13.a(lf::new);
      $$13.a(a(lg::new, $$11));
      $$13.a(lh::new);
      $$13 = $$9.a($$3, "bundle");
      $$13.a(a(no::new, $$11));
      $$13.a($$0x -> md.a($$0x, vu.c("dataPack.bundle.description"), clf.a(clh.b)));
      $$13 = $$9.a($$3, "trade_rebalance");
      $$13.a($$0x -> md.a($$0x, vu.c("dataPack.trade_rebalance.description"), clf.a(clh.d)));
      $$13.a(a(lp::a, $$11));
      $$13.a(a(or::new, $$11));
      CompletableFuture<jb.e> $$21 = nu.a($$11);
      CompletableFuture<in.a> $$22 = $$21.thenApply(jb.e::a);
      CompletableFuture<in.a> $$23 = $$21.thenApply(jb.e::b);
      ko.a $$24 = $$9.a($$3, "update_1_21");
      $$24.a(a(np::new, $$23));
      oq<daa> $$25 = $$24.a($$2x -> new ot($$2x, $$23, $$14.c()));
      $$24.a($$3x -> new ox($$3x, $$23, $$15.c(), $$25.c()));
      $$24.a($$2x -> new os($$2x, $$23, $$16.c()));
      $$24.a(a(lt::a, $$23));
      $$24.a(a(ns::new, $$23));
      $$24.a($$0x -> md.a($$0x, vu.c("dataPack.update_1_21.description"), clf.a(clh.c)));
      $$24.a(a(ow::new, $$22));
      $$24.a(a(ou::new, $$22));
      $$24.a(a(kv::a, $$22));
      return $$9;
   }
}
