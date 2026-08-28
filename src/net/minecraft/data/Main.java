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
         mg $$19 = a($$12, $$11.valuesOf($$10).stream().map($$0x -> Paths.get($$0x)).collect(Collectors.toList()), $$14, $$15, $$16, $$17, $$18, ab.b(), true);
         $$19.a();
      } else {
         $$1.printHelpOn(System.out);
      }
   }

   private static <T extends mh> mh.a<T> a(BiFunction<mj, CompletableFuture<js.a>, T> $$0, CompletableFuture<js.a> $$1) {
      return $$2 -> $$0.apply($$2, $$1);
   }

   public static mg a(Path $$0, Collection<Path> $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6, af $$7, boolean $$8) {
      mg $$9 = new mg($$0, $$7, $$8);
      mg.a $$10 = $$9.a($$2 || $$3);
      $$10.a($$1x -> new px($$1x, $$1).a(new py()));
      CompletableFuture<js.a> $$11 = CompletableFuture.supplyAsync(ps::a, ae.g());
      mg.a $$12 = $$9.a($$2);
      $$12.a(oe::new);
      $$12.a(oc::new);
      mg.a $$13 = $$9.a($$3);
      $$13.a(a(pp::new, $$11));
      $$13.a(a(mn::a, $$11));
      $$13.a(a(nt::a, $$11));
      $$13.a(a(pm.a::new, $$11));
      qp<dkl> $$14 = $$13.a(a(qs::new, $$11));
      qp<cxk> $$15 = $$13.a($$2x -> new qu($$2x, $$11, $$14.c()));
      qp<dij> $$16 = $$13.a(a(qb::new, $$11));
      qp<dum> $$17 = $$13.a(a(qa::new, $$11));
      qp<eoj> $$18 = $$13.a(a(qo::new, $$11));
      $$13.a(a(qc::new, $$11));
      $$13.a(a(qd::new, $$11));
      $$13.a(a(qf::new, $$11));
      $$13.a(a(qg::new, $$11));
      $$13.a(a(qh::new, $$11));
      $$13.a(a(qi::new, $$11));
      $$13.a(a(qj::new, $$11));
      $$13.a(a(qm::new, $$11));
      $$13.a(a(qn::new, $$11));
      $$13.a(a(qz::new, $$11));
      $$13.a(a(qt::new, $$11));
      $$13 = $$9.a($$4);
      $$13.a($$1x -> new pv($$1x, $$1));
      $$13 = $$9.a($$5);
      $$13.a(a(mw::new, $$11));
      $$13.a(a(na::new, $$11));
      $$13.a(a(mx::new, $$11));
      $$13.a(a(my::new, $$11));
      $$13.a(nc::new);
      $$13.a(nb::new);
      $$13.a(mz::new);
      CompletableFuture<kg.g> $$21 = pr.a($$11);
      CompletableFuture<js.a> $$22 = $$21.thenApply(kg.g::b);
      mg.a $$23 = $$9.a($$3, "trade_rebalance");
      $$23.a(a(pp::new, $$22));
      $$23.a($$0x -> nz.a($$0x, xv.c("dataPack.trade_rebalance.description"), css.a(csu.c)));
      $$23.a(a(nl::a, $$11));
      $$23.a(a(qr::new, $$11));
      $$23.a(a(qq::new, $$11));
      $$13 = $$9.a($$3, "redstone_experiments");
      $$13.a($$0x -> nz.a($$0x, xv.c("dataPack.redstone_experiments.description"), css.a(csu.d)));
      $$13 = $$9.a($$3, "minecart_improvements");
      $$13.a($$0x -> nz.a($$0x, xv.c("dataPack.minecart_improvements.description"), css.a(csu.e)));
      CompletableFuture<kg.g> $$26 = pt.a($$11);
      $$22 = $$26.thenApply(kg.g::a);
      $$23 = $$9.a($$3, "winter_drop");
      $$23.a(a(pp::new, $$26.thenApply(kg.g::b)));
      $$23.a(a(pn.a::new, $$22));
      qp<dkl> $$29 = $$23.a($$2x -> new qw($$2x, $$22, $$14.c()));
      $$23.a($$3x -> new qy($$3x, $$22, $$15.c(), $$29.c()));
      $$23.a($$2x -> new qv($$2x, $$22, $$16.c()));
      $$23.a(a(nx::a, $$22));
      $$23.a($$0x -> nz.a($$0x, xv.c("dataPack.winter_drop.description"), css.a(csu.b)));
      $$23.a(a(qx::new, $$22));
      $$23.a(a(mt::a, $$22));
      return $$9;
   }
}
