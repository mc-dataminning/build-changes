package net.minecraft.data;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import java.util.function.BiFunction;
import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;
import net.minecraft.obfuscate.DontObfuscate;

public class Main {
   @ac(
      a = "System.out needed before bootstrap"
   )
   @DontObfuscate
   public static void main(String[] $$0) throws IOException {
      ab.a();
      OptionParser $$1 = new OptionParser();
      OptionSpec<Void> $$2 = $$1.accepts("help", "Show the help menu").forHelp();
      OptionSpec<Void> $$3 = $$1.accepts("server", "Include server generators");
      OptionSpec<Void> $$4 = $$1.accepts("dev", "Include development tools");
      OptionSpec<Void> $$5 = $$1.accepts("reports", "Include data reports");
      $$1.accepts("validate", "Validate inputs");
      OptionSpec<Void> $$6 = $$1.accepts("all", "Include all generators");
      OptionSpec<String> $$7 = $$1.accepts("output", "Output folder").withRequiredArg().defaultsTo("generated", new String[0]);
      OptionSpec<String> $$8 = $$1.accepts("input", "Input folder").withRequiredArg();
      OptionSet $$9 = $$1.parse($$0);
      if (!$$9.has($$2) && $$9.hasOptions()) {
         Path $$10 = Paths.get((String)$$7.value($$9));
         boolean $$11 = $$9.has($$6);
         boolean $$12 = $$11 || $$9.has($$3);
         boolean $$13 = $$11 || $$9.has($$4);
         boolean $$14 = $$11 || $$9.has($$5);
         Collection<Path> $$15 = $$9.valuesOf($$8).stream().map($$0x -> Paths.get($$0x)).toList();
         mj $$16 = new mj($$10, ab.b(), true);
         a($$16, $$15, $$12, $$13, $$14);
         $$16.a();
      } else {
         $$1.printHelpOn(System.out);
      }
   }

   private static <T extends mk> mk.a<T> a(BiFunction<mm, CompletableFuture<ju.a>, T> $$0, CompletableFuture<ju.a> $$1) {
      return $$2 -> $$0.apply($$2, $$1);
   }

   public static void a(mj $$0, Collection<Path> $$1, boolean $$2, boolean $$3, boolean $$4) {
      mj.a $$5 = $$0.a($$2);
      $$5.a($$1x -> new ox($$1x, $$1).a(new oy()));
      CompletableFuture<ju.a> $$6 = CompletableFuture.supplyAsync(ot::a, af.h());
      mj.a $$7 = $$0.a($$2);
      $$7.a(a(oq::new, $$6));
      $$7.a(a(mq::a, $$6));
      $$7.a(a(nu::a, $$6));
      $$7.a(a(oo.a::new, $$6));
      pp<dku> $$8 = $$7.a(a(ps::new, $$6));
      pp<cxu> $$9 = $$7.a($$2x -> new pu($$2x, $$6, $$8.c()));
      pp<dis> $$10 = $$7.a(a(pb::new, $$6));
      pp<dva> $$11 = $$7.a(a(pa::new, $$6));
      pp<epg> $$12 = $$7.a(a(po::new, $$6));
      $$7.a(a(pc::new, $$6));
      $$7.a(a(pd::new, $$6));
      $$7.a(a(pf::new, $$6));
      $$7.a(a(pg::new, $$6));
      $$7.a(a(ph::new, $$6));
      $$7.a(a(pi::new, $$6));
      $$7.a(a(pj::new, $$6));
      $$7.a(a(pm::new, $$6));
      $$7.a(a(pn::new, $$6));
      $$7.a(a(pv::new, $$6));
      $$7.a(a(pt::new, $$6));
      $$7 = $$0.a($$3);
      $$7.a($$1x -> new ov($$1x, $$1));
      $$7 = $$0.a($$4);
      $$7.a(a(mx::new, $$6));
      $$7.a(a(nb::new, $$6));
      $$7.a(a(my::new, $$6));
      $$7.a(a(mz::new, $$6));
      $$7.a(nd::new);
      $$7.a(nc::new);
      $$7.a(na::new);
      CompletableFuture<ki.g> $$15 = os.a($$6);
      CompletableFuture<ju.a> $$16 = $$15.thenApply(ki.g::b);
      mj.a $$17 = $$0.a($$2, "trade_rebalance");
      $$17.a(a(oq::new, $$16));
      $$17.a($$0x -> ny.a($$0x, wv.c("dataPack.trade_rebalance.description"), cte.a(ctg.b)));
      $$17.a(a(nm::a, $$6));
      $$17.a(a(pr::new, $$6));
      $$17.a(a(pq::new, $$6));
      $$7 = $$0.a($$2, "redstone_experiments");
      $$7.a($$0x -> ny.a($$0x, wv.c("dataPack.redstone_experiments.description"), cte.a(ctg.c)));
      $$7 = $$0.a($$2, "minecart_improvements");
      $$7.a($$0x -> ny.a($$0x, wv.c("dataPack.minecart_improvements.description"), cte.a(ctg.d)));
   }
}
