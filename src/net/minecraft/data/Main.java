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
      ab.a();
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
         mf $$19 = a($$12, $$11.valuesOf($$10).stream().map($$0x -> Paths.get($$0x)).collect(Collectors.toList()), $$14, $$15, $$16, $$17, $$18, ab.b(), true);
         $$19.a();
      } else {
         $$1.printHelpOn(System.out);
      }
   }

   private static <T extends mg> mg.a<T> a(BiFunction<mi, CompletableFuture<js.a>, T> $$0, CompletableFuture<js.a> $$1) {
      return $$2 -> $$0.apply($$2, $$1);
   }

   public static mf a(Path $$0, Collection<Path> $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6, af $$7, boolean $$8) {
      mf $$9 = new mf($$0, $$7, $$8);
      mf.a $$10 = $$9.a($$2 || $$3);
      $$10.a($$1x -> new pq($$1x, $$1).a(new pr()));
      CompletableFuture<js.a> $$11 = CompletableFuture.supplyAsync(pm::a, ae.g());
      mf.a $$12 = $$9.a($$2);
      $$12.a(nz::new);
      $$12.a(nx::new);
      mf.a $$13 = $$9.a($$3);
      $$13.a(a(pj::new, $$11));
      $$13.a(a(mm::a, $$11));
      $$13.a(a(nq::a, $$11));
      $$13.a(a(ph.a::new, $$11));
      qi<diq> $$14 = $$13.a(a(ql::new, $$11));
      qi<cwi> $$15 = $$13.a($$2x -> new qn($$2x, $$11, $$14.c()));
      qi<dgo> $$16 = $$13.a(a(pu::new, $$11));
      qi<dso> $$17 = $$13.a(a(pt::new, $$11));
      qi<emi> $$18 = $$13.a(a(qh::new, $$11));
      $$13.a(a(pv::new, $$11));
      $$13.a(a(pw::new, $$11));
      $$13.a(a(py::new, $$11));
      $$13.a(a(pz::new, $$11));
      $$13.a(a(qa::new, $$11));
      $$13.a(a(qb::new, $$11));
      $$13.a(a(qc::new, $$11));
      $$13.a(a(qf::new, $$11));
      $$13.a(a(qg::new, $$11));
      $$13.a(a(qo::new, $$11));
      $$13.a(a(qm::new, $$11));
      $$13 = $$9.a($$4);
      $$13.a($$1x -> new po($$1x, $$1));
      $$13 = $$9.a($$5);
      $$13.a(a(mt::new, $$11));
      $$13.a(a(mx::new, $$11));
      $$13.a(a(mu::new, $$11));
      $$13.a(a(mv::new, $$11));
      $$13.a(mz::new);
      $$13.a(my::new);
      $$13.a(mw::new);
      CompletableFuture<kg.g> $$21 = pl.a($$11);
      CompletableFuture<js.a> $$22 = $$21.thenApply(kg.g::b);
      mf.a $$23 = $$9.a($$3, "trade_rebalance");
      $$23.a(a(pj::new, $$22));
      $$23.a($$0x -> nu.a($$0x, xj.c("dataPack.trade_rebalance.description"), crq.a(crs.b)));
      $$23.a(a(ni::a, $$11));
      $$23.a(a(qk::new, $$11));
      $$23.a(a(qj::new, $$11));
      $$13 = $$9.a($$3, "redstone_experiments");
      $$13.a($$0x -> nu.a($$0x, xj.c("dataPack.redstone_experiments.description"), crq.a(crs.c)));
      $$13 = $$9.a($$3, "minecart_improvements");
      $$13.a($$0x -> nu.a($$0x, xj.c("dataPack.minecart_improvements.description"), crq.a(crs.d)));
      return $$9;
   }
}
