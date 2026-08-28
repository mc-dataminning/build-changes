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
         lw $$19 = a($$12, $$11.valuesOf($$10).stream().map($$0x -> Paths.get($$0x)).collect(Collectors.toList()), $$14, $$15, $$16, $$17, $$18, aa.b(), true);
         $$19.a();
      } else {
         $$1.printHelpOn(System.out);
      }
   }

   private static <T extends lx> lx.a<T> a(BiFunction<lz, CompletableFuture<jl.a>, T> $$0, CompletableFuture<jl.a> $$1) {
      return $$2 -> $$0.apply($$2, $$1);
   }

   public static lw a(Path $$0, Collection<Path> $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6, ad $$7, boolean $$8) {
      lw $$9 = new lw($$0, $$7, $$8);
      lw.a $$10 = $$9.a($$2 || $$3);
      $$10.a($$1x -> new pd($$1x, $$1).a(new pe()));
      CompletableFuture<jl.a> $$11 = CompletableFuture.supplyAsync(oz::a, ac.g());
      lw.a $$12 = $$9.a($$2);
      $$12.a(nm::new);
      lw.a $$13 = $$9.a($$3);
      $$13.a(a(ow::new, $$11));
      $$13.a(a(md::a, $$11));
      $$13.a(a(ne::a, $$11));
      $$13.a(a(ou::new, $$11));
      pv<dfh> $$14 = $$13.a(a(py::new, $$11));
      pv<ctx> $$15 = $$13.a($$2x -> new qa($$2x, $$11, $$14.c()));
      pv<ddf> $$16 = $$13.a(a(ph::new, $$11));
      pv<dpf> $$17 = $$13.a(a(pg::new, $$11));
      pv<eiw> $$18 = $$13.a(a(pu::new, $$11));
      $$13.a(a(pi::new, $$11));
      $$13.a(a(pj::new, $$11));
      $$13.a(a(pl::new, $$11));
      $$13.a(a(pm::new, $$11));
      $$13.a(a(pn::new, $$11));
      $$13.a(a(po::new, $$11));
      $$13.a(a(pp::new, $$11));
      $$13.a(a(ps::new, $$11));
      $$13.a(a(pt::new, $$11));
      $$13.a(a(qb::new, $$11));
      $$13.a(a(pz::new, $$11));
      $$13 = $$9.a($$4);
      $$13.a($$1x -> new pb($$1x, $$1));
      $$13 = $$9.a($$5);
      $$13.a(a(mk::new, $$11));
      $$13.a(a(mn::new, $$11));
      $$13.a(a(ml::new, $$11));
      $$13.a(a(mm::new, $$11));
      $$13.a(mo::new);
      $$13 = $$9.a($$3, "bundle");
      $$13.a(a(ot::new, $$11));
      $$13.a($$0x -> ni.a($$0x, wu.c("dataPack.bundle.description"), coy.a(cpa.b)));
      CompletableFuture<jz.g> $$22 = oy.a($$11);
      CompletableFuture<jl.a> $$23 = $$22.thenApply(jz.g::b);
      lw.a $$24 = $$9.a($$3, "trade_rebalance");
      $$24.a(a(ow::new, $$23));
      $$24.a($$0x -> ni.a($$0x, wu.c("dataPack.trade_rebalance.description"), coy.a(cpa.c)));
      $$24.a(a(mw::a, $$11));
      $$24.a(a(px::new, $$11));
      $$24.a(a(pw::new, $$11));
      return $$9;
   }
}
