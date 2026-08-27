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
         kj $$19 = a($$12, $$11.valuesOf($$10).stream().map($$0x -> Paths.get($$0x)).collect(Collectors.toList()), $$14, $$15, $$16, $$17, $$18, aa.b(), true);
         $$19.a();
      } else {
         $$1.printHelpOn(System.out);
      }
   }

   private static <T extends kk> kk.a<T> a(BiFunction<km, CompletableFuture<ij.b>, T> $$0, CompletableFuture<ij.b> $$1) {
      return $$2 -> $$0.apply($$2, $$1);
   }

   public static kj a(Path $$0, Collection<Path> $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6, ad $$7, boolean $$8) {
      kj $$9 = new kj($$0, $$7, $$8);
      kj.a $$10 = $$9.a($$2 || $$3);
      $$10.a($$1x -> new nr($$1x, $$1).a(new ns()));
      CompletableFuture<ij.b> $$11 = CompletableFuture.supplyAsync(nn::a, ac.f());
      kj.a $$12 = $$9.a($$2);
      $$12.a(lz::new);
      kj.a $$13 = $$9.a($$3);
      $$13.a(a(nk::new, $$11));
      $$13.a(a(kq::a, $$11));
      $$13.a(ls::a);
      $$13.a(ni::new);
      oi<cwj> $$14 = $$13.a(a(op::new, $$11));
      oi<cmm> $$15 = $$13.a($$2x -> new oq($$2x, $$11, $$14.c()));
      oi<cuh> $$16 = $$13.a(a(nv::new, $$11));
      $$13.a(a(nu::new, $$11));
      $$13.a(a(nw::new, $$11));
      $$13.a(a(nx::new, $$11));
      $$13.a(a(ny::new, $$11));
      $$13.a(a(nz::new, $$11));
      $$13.a(a(oa::new, $$11));
      $$13.a(a(ob::new, $$11));
      $$13.a(a(oc::new, $$11));
      $$13.a(a(of::new, $$11));
      $$13.a(a(og::new, $$11));
      $$13.a(a(oh::new, $$11));
      $$13.a(a(or::new, $$11));
      $$13 = $$9.a($$4);
      $$13.a($$1x -> new np($$1x, $$1));
      $$13 = $$9.a($$5);
      $$13.a(a(kx::new, $$11));
      $$13.a(ky::new);
      $$13.a(a(kz::new, $$11));
      $$13.a(la::new);
      $$13 = $$9.a($$3, "bundle");
      $$13.a(ng::new);
      $$13.a($$0x -> lv.a($$0x, vd.c("dataPack.bundle.description"), chl.a(chn.b)));
      $$13 = $$9.a($$3, "trade_rebalance");
      $$13.a($$0x -> lv.a($$0x, vd.c("dataPack.trade_rebalance.description"), chl.a(chn.d)));
      $$13.a(li::a);
      $$13.a(a(oj::new, $$11));
      CompletableFuture<iw.e> $$21 = nm.a($$11);
      CompletableFuture<ij.b> $$22 = $$21.thenApply(iw.e::a);
      CompletableFuture<ij.b> $$23 = $$21.thenApply(iw.e::b);
      kj.a $$24 = $$9.a($$3, "update_1_21");
      $$24.a(nh::new);
      oi<cwj> $$25 = $$24.a($$2x -> new ol($$2x, $$23, $$14.c()));
      $$24.a($$3x -> new oo($$3x, $$23, $$15.c(), $$25.c()));
      $$24.a($$2x -> new ok($$2x, $$23, $$16.c()));
      $$24.a(ll::a);
      $$24.a(a(nk::new, $$23));
      $$24.a($$0x -> lv.a($$0x, vd.c("dataPack.update_1_21.description"), chl.a(chn.c)));
      $$24.a(a(on::new, $$22));
      $$24.a(a(om::new, $$22));
      return $$9;
   }
}
