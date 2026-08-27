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
         kh $$19 = a($$12, $$11.valuesOf($$10).stream().map($$0x -> Paths.get($$0x)).collect(Collectors.toList()), $$14, $$15, $$16, $$17, $$18, aa.b(), true);
         $$19.a();
      } else {
         $$1.printHelpOn(System.out);
      }
   }

   private static <T extends ki> ki.a<T> a(BiFunction<kk, CompletableFuture<ih.b>, T> $$0, CompletableFuture<ih.b> $$1) {
      return $$2 -> $$0.apply($$2, $$1);
   }

   public static kh a(Path $$0, Collection<Path> $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6, ad $$7, boolean $$8) {
      kh $$9 = new kh($$0, $$7, $$8);
      kh.a $$10 = $$9.a($$2 || $$3);
      $$10.a($$1x -> new np($$1x, $$1).a(new nq()));
      CompletableFuture<ih.b> $$11 = CompletableFuture.supplyAsync(nl::a, ac.f());
      kh.a $$12 = $$9.a($$2);
      $$12.a(lx::new);
      kh.a $$13 = $$9.a($$3);
      $$13.a(a(ni::new, $$11));
      $$13.a(a(ko::a, $$11));
      $$13.a(lq::a);
      $$13.a(ng::new);
      og<cvz> $$14 = $$13.a(a(on::new, $$11));
      og<cmc> $$15 = $$13.a($$2x -> new oo($$2x, $$11, $$14.c()));
      og<ctx> $$16 = $$13.a(a(nt::new, $$11));
      $$13.a(a(ns::new, $$11));
      $$13.a(a(nu::new, $$11));
      $$13.a(a(nv::new, $$11));
      $$13.a(a(nw::new, $$11));
      $$13.a(a(nx::new, $$11));
      $$13.a(a(ny::new, $$11));
      $$13.a(a(nz::new, $$11));
      $$13.a(a(oa::new, $$11));
      $$13.a(a(od::new, $$11));
      $$13.a(a(oe::new, $$11));
      $$13.a(a(of::new, $$11));
      $$13.a(a(op::new, $$11));
      $$13 = $$9.a($$4);
      $$13.a($$1x -> new nn($$1x, $$1));
      $$13 = $$9.a($$5);
      $$13.a(a(kv::new, $$11));
      $$13.a(kw::new);
      $$13.a(a(kx::new, $$11));
      $$13.a(ky::new);
      $$13 = $$9.a($$3, "bundle");
      $$13.a(ne::new);
      $$13.a($$0x -> lt.a($$0x, vb.c("dataPack.bundle.description"), chb.a(chd.b)));
      $$13 = $$9.a($$3, "trade_rebalance");
      $$13.a($$0x -> lt.a($$0x, vb.c("dataPack.trade_rebalance.description"), chb.a(chd.d)));
      $$13.a(lg::a);
      $$13.a(a(oh::new, $$11));
      CompletableFuture<iu.e> $$21 = nk.a($$11);
      CompletableFuture<ih.b> $$22 = $$21.thenApply(iu.e::a);
      CompletableFuture<ih.b> $$23 = $$21.thenApply(iu.e::b);
      kh.a $$24 = $$9.a($$3, "update_1_21");
      $$24.a(nf::new);
      og<cvz> $$25 = $$24.a($$2x -> new oj($$2x, $$23, $$14.c()));
      $$24.a($$3x -> new om($$3x, $$23, $$15.c(), $$25.c()));
      $$24.a($$2x -> new oi($$2x, $$23, $$16.c()));
      $$24.a(lj::a);
      $$24.a(a(ni::new, $$23));
      $$24.a($$0x -> lt.a($$0x, vb.c("dataPack.update_1_21.description"), chb.a(chd.c)));
      $$24.a(a(ol::new, $$22));
      $$24.a(a(ok::new, $$22));
      return $$9;
   }
}
