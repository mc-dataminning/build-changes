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
   @ad(
      a = "System.out needed before bootstrap"
   )
   @DontObfuscate
   public static void main(String[] $$0) throws IOException {
      ac.a();
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
         mn $$16 = new mn($$10, ac.b(), true);
         a($$16, $$15, $$12, $$13, $$14);
         $$16.a();
      } else {
         $$1.printHelpOn(System.out);
      }
   }

   private static <T extends mo> mo.a<T> a(BiFunction<mq, CompletableFuture<ji.a>, T> $$0, CompletableFuture<ji.a> $$1) {
      return $$2 -> $$0.apply($$2, $$1);
   }

   public static void a(mn $$0, Collection<Path> $$1, boolean $$2, boolean $$3, boolean $$4) {
      mn.a $$5 = $$0.a($$2);
      $$5.a($$1x -> new pb($$1x, $$1).a(new pc()));
      CompletableFuture<ji.a> $$6 = CompletableFuture.supplyAsync(ox::a, ag.h());
      mn.a $$7 = $$0.a($$2);
      $$7.a(a(ou::new, $$6));
      $$7.a(a(mu::a, $$6));
      $$7.a(a(ny::a, $$6));
      $$7.a(a(os.a::new, $$6));
      ps<dno> $$8 = $$7.a(a(pu::new, $$6));
      ps<dag> $$9 = $$7.a($$2x -> new pw($$2x, $$6, $$8.c()));
      ps<dlm> $$10 = $$7.a(a(pf::new, $$6));
      ps<dyd> $$11 = $$7.a(a(pe::new, $$6));
      ps<esn> $$12 = $$7.a(a(pr::new, $$6));
      $$7.a(a(pg::new, $$6));
      $$7.a(a(pi::new, $$6));
      $$7.a(a(pj::new, $$6));
      $$7.a(a(pk::new, $$6));
      $$7.a(a(pl::new, $$6));
      $$7.a(a(pm::new, $$6));
      $$7.a(a(pp::new, $$6));
      $$7.a(a(pq::new, $$6));
      $$7.a(a(px::new, $$6));
      $$7.a(a(pv::new, $$6));
      $$7 = $$0.a($$3);
      $$7.a($$1x -> new oz($$1x, $$1));
      $$7 = $$0.a($$4);
      $$7.a(a(nb::new, $$6));
      $$7.a(a(nf::new, $$6));
      $$7.a(a(nc::new, $$6));
      $$7.a(a(nd::new, $$6));
      $$7.a(nh::new);
      $$7.a(ng::new);
      $$7.a(ne::new);
      CompletableFuture<jw.g> $$15 = ow.a($$6);
      CompletableFuture<ji.a> $$16 = $$15.thenApply(jw.g::b);
      mn.a $$17 = $$0.a($$2, "trade_rebalance");
      $$17.a(a(ou::new, $$16));
      $$17.a($$0x -> oc.a($$0x, xg.c("dataPack.trade_rebalance.description"), cvs.a(cvu.b)));
      $$17.a(a(nq::a, $$6));
      $$17.a(a(pt::new, $$6));
      $$7 = $$0.a($$2, "redstone_experiments");
      $$7.a($$0x -> oc.a($$0x, xg.c("dataPack.redstone_experiments.description"), cvs.a(cvu.c)));
      $$7 = $$0.a($$2, "minecart_improvements");
      $$7.a($$0x -> oc.a($$0x, xg.c("dataPack.minecart_improvements.description"), cvs.a(cvu.d)));
   }
}
