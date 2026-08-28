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
         mh $$16 = new mh($$10, ab.b(), true);
         a($$16, $$15, $$12, $$13, $$14);
         $$16.a();
      } else {
         $$1.printHelpOn(System.out);
      }
   }

   private static <T extends mi> mi.a<T> a(BiFunction<mk, CompletableFuture<jt.a>, T> $$0, CompletableFuture<jt.a> $$1) {
      return $$2 -> $$0.apply($$2, $$1);
   }

   public static void a(mh $$0, Collection<Path> $$1, boolean $$2, boolean $$3, boolean $$4) {
      mh.a $$5 = $$0.a($$2);
      $$5.a($$1x -> new ov($$1x, $$1).a(new ow()));
      CompletableFuture<jt.a> $$6 = CompletableFuture.supplyAsync(or::a, af.g());
      mh.a $$7 = $$0.a($$2);
      $$7.a(a(oo::new, $$6));
      $$7.a(a(mo::a, $$6));
      $$7.a(a(ns::a, $$6));
      $$7.a(a(om.a::new, $$6));
      pn<djk> $$8 = $$7.a(a(pq::new, $$6));
      pn<cwj> $$9 = $$7.a($$2x -> new ps($$2x, $$6, $$8.c()));
      pn<dhi> $$10 = $$7.a(a(oz::new, $$6));
      pn<dtn> $$11 = $$7.a(a(oy::new, $$6));
      pn<enk> $$12 = $$7.a(a(pm::new, $$6));
      $$7.a(a(pa::new, $$6));
      $$7.a(a(pb::new, $$6));
      $$7.a(a(pd::new, $$6));
      $$7.a(a(pe::new, $$6));
      $$7.a(a(pf::new, $$6));
      $$7.a(a(pg::new, $$6));
      $$7.a(a(ph::new, $$6));
      $$7.a(a(pk::new, $$6));
      $$7.a(a(pl::new, $$6));
      $$7.a(a(pt::new, $$6));
      $$7.a(a(pr::new, $$6));
      $$7 = $$0.a($$3);
      $$7.a($$1x -> new ot($$1x, $$1));
      $$7 = $$0.a($$4);
      $$7.a(a(mv::new, $$6));
      $$7.a(a(mz::new, $$6));
      $$7.a(a(mw::new, $$6));
      $$7.a(a(mx::new, $$6));
      $$7.a(nb::new);
      $$7.a(na::new);
      $$7.a(my::new);
      CompletableFuture<kh.g> $$15 = oq.a($$6);
      CompletableFuture<jt.a> $$16 = $$15.thenApply(kh.g::b);
      mh.a $$17 = $$0.a($$2, "trade_rebalance");
      $$17.a(a(oo::new, $$16));
      $$17.a($$0x -> nw.a($$0x, wo.c("dataPack.trade_rebalance.description"), crr.a(crt.b)));
      $$17.a(a(nk::a, $$6));
      $$17.a(a(pp::new, $$6));
      $$17.a(a(po::new, $$6));
      $$7 = $$0.a($$2, "redstone_experiments");
      $$7.a($$0x -> nw.a($$0x, wo.c("dataPack.redstone_experiments.description"), crr.a(crt.c)));
      $$7 = $$0.a($$2, "minecart_improvements");
      $$7.a($$0x -> nw.a($$0x, wo.c("dataPack.minecart_improvements.description"), crr.a(crt.d)));
   }
}
