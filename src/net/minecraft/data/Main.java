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
         li $$19 = a($$12, $$11.valuesOf($$10).stream().map($$0x -> Paths.get($$0x)).collect(Collectors.toList()), $$14, $$15, $$16, $$17, $$18, aa.b(), true);
         $$19.a();
      } else {
         $$1.printHelpOn(System.out);
      }
   }

   private static <T extends lj> lj.a<T> a(BiFunction<ll, CompletableFuture<ix.a>, T> $$0, CompletableFuture<ix.a> $$1) {
      return $$2 -> $$0.apply($$2, $$1);
   }

   public static li a(Path $$0, Collection<Path> $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6, ad $$7, boolean $$8) {
      li $$9 = new li($$0, $$7, $$8);
      li.a $$10 = $$9.a($$2 || $$3);
      $$10.a($$1x -> new ow($$1x, $$1).a(new ox()));
      CompletableFuture<ix.a> $$11 = CompletableFuture.supplyAsync(os::a, ac.f());
      li.a $$12 = $$9.a($$2);
      $$12.a(ne::new);
      li.a $$13 = $$9.a($$3);
      $$13.a(a(op::new, $$11));
      $$13.a(a(lr::a, $$11));
      $$13.a(a(mw::a, $$11));
      $$13.a(a(on::new, $$11));
      pn<dcv> $$14 = $$13.a(a(pw::new, $$11));
      pn<cry> $$15 = $$13.a($$2x -> new px($$2x, $$11, $$14.c()));
      pn<dat> $$16 = $$13.a(a(pa::new, $$11));
      pn<dmt> $$17 = $$13.a(a(oz::new, $$11));
      $$13.a(a(pb::new, $$11));
      $$13.a(a(pc::new, $$11));
      $$13.a(a(pd::new, $$11));
      $$13.a(a(pe::new, $$11));
      $$13.a(a(pf::new, $$11));
      $$13.a(a(pg::new, $$11));
      $$13.a(a(ph::new, $$11));
      $$13.a(a(pk::new, $$11));
      $$13.a(a(pl::new, $$11));
      $$13.a(a(pm::new, $$11));
      $$13.a(a(py::new, $$11));
      $$13 = $$9.a($$4);
      $$13.a($$1x -> new ou($$1x, $$1));
      $$13 = $$9.a($$5);
      $$13.a(a(ly::new, $$11));
      $$13.a(a(mb::new, $$11));
      $$13.a(a(lz::new, $$11));
      $$13.a(a(ma::new, $$11));
      $$13.a(mc::new);
      $$13 = $$9.a($$3, "bundle");
      $$13.a(a(ol::new, $$11));
      $$13.a($$0x -> na.a($$0x, ws.c("dataPack.bundle.description"), cmy.a(cna.b)));
      $$13 = $$9.a($$3, "trade_rebalance");
      $$13.a($$0x -> na.a($$0x, ws.c("dataPack.trade_rebalance.description"), cmy.a(cna.d)));
      $$13.a(a(mk::a, $$11));
      $$13.a(a(po::new, $$11));
      CompletableFuture<jl.g> $$22 = or.a($$11);
      CompletableFuture<ix.a> $$23 = $$22.thenApply(jl.g::a);
      li.a $$24 = $$9.a($$3, "update_1_21");
      $$24.a(a(op::new, $$22.thenApply(jl.g::b)));
      $$24.a(a(om::new, $$23));
      pn<dcv> $$25 = $$24.a($$2x -> new pr($$2x, $$23, $$14.c()));
      $$24.a($$3x -> new pv($$3x, $$23, $$15.c(), $$25.c()));
      $$24.a($$2x -> new pq($$2x, $$23, $$16.c()));
      $$24.a(a(mo::a, $$23));
      $$24.a($$0x -> na.a($$0x, ws.c("dataPack.update_1_21.description"), cmy.a(cna.c)));
      $$24.a(a(pu::new, $$23));
      $$24.a(a(ps::new, $$23));
      $$24.a(a(lp::a, $$23));
      $$24.a($$2x -> new pp($$2x, $$23, $$17.c()));
      return $$9;
   }
}
