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
         me $$19 = a($$12, $$11.valuesOf($$10).stream().map($$0x -> Paths.get($$0x)).collect(Collectors.toList()), $$14, $$15, $$16, $$17, $$18, ab.b(), true);
         $$19.a();
      } else {
         $$1.printHelpOn(System.out);
      }
   }

   private static <T extends mf> mf.a<T> a(BiFunction<mh, CompletableFuture<js.a>, T> $$0, CompletableFuture<js.a> $$1) {
      return $$2 -> $$0.apply($$2, $$1);
   }

   public static me a(Path $$0, Collection<Path> $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6, af $$7, boolean $$8) {
      me $$9 = new me($$0, $$7, $$8);
      me.a $$10 = $$9.a($$2 || $$3);
      $$10.a($$1x -> new pp($$1x, $$1).a(new pq()));
      CompletableFuture<js.a> $$11 = CompletableFuture.supplyAsync(pl::a, ae.g());
      me.a $$12 = $$9.a($$2);
      $$12.a(ny::new);
      $$12.a(nw::new);
      me.a $$13 = $$9.a($$3);
      $$13.a(a(pi::new, $$11));
      $$13.a(a(ml::a, $$11));
      $$13.a(a(np::a, $$11));
      $$13.a(a(pg.a::new, $$11));
      qh<die> $$14 = $$13.a(a(qk::new, $$11));
      qh<cvx> $$15 = $$13.a($$2x -> new qm($$2x, $$11, $$14.c()));
      qh<dgc> $$16 = $$13.a(a(pt::new, $$11));
      qh<dsc> $$17 = $$13.a(a(ps::new, $$11));
      qh<elx> $$18 = $$13.a(a(qg::new, $$11));
      $$13.a(a(pu::new, $$11));
      $$13.a(a(pv::new, $$11));
      $$13.a(a(px::new, $$11));
      $$13.a(a(py::new, $$11));
      $$13.a(a(pz::new, $$11));
      $$13.a(a(qa::new, $$11));
      $$13.a(a(qb::new, $$11));
      $$13.a(a(qe::new, $$11));
      $$13.a(a(qf::new, $$11));
      $$13.a(a(qn::new, $$11));
      $$13.a(a(ql::new, $$11));
      $$13 = $$9.a($$4);
      $$13.a($$1x -> new pn($$1x, $$1));
      $$13 = $$9.a($$5);
      $$13.a(a(ms::new, $$11));
      $$13.a(a(mw::new, $$11));
      $$13.a(a(mt::new, $$11));
      $$13.a(a(mu::new, $$11));
      $$13.a(my::new);
      $$13.a(mx::new);
      $$13.a(mv::new);
      $$13 = $$9.a($$3, "bundle");
      $$13.a(a(pf.a::new, $$11));
      $$13.a($$0x -> nt.a($$0x, xi.c("dataPack.bundle.description"), crf.a(crh.b)));
      CompletableFuture<kg.g> $$22 = pk.a($$11);
      CompletableFuture<js.a> $$23 = $$22.thenApply(kg.g::b);
      me.a $$24 = $$9.a($$3, "trade_rebalance");
      $$24.a(a(pi::new, $$23));
      $$24.a($$0x -> nt.a($$0x, xi.c("dataPack.trade_rebalance.description"), crf.a(crh.c)));
      $$24.a(a(nh::a, $$11));
      $$24.a(a(qj::new, $$11));
      $$24.a(a(qi::new, $$11));
      $$13 = $$9.a($$3, "redstone_experiments");
      $$13.a($$0x -> nt.a($$0x, xi.c("dataPack.redstone_experiments.description"), crf.a(crh.d)));
      $$13 = $$9.a($$3, "minecart_improvements");
      $$13.a($$0x -> nt.a($$0x, xi.c("dataPack.minecart_improvements.description"), crf.a(crh.e)));
      return $$9;
   }
}
