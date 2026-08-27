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
         ln $$19 = a($$12, $$11.valuesOf($$10).stream().map($$0x -> Paths.get($$0x)).collect(Collectors.toList()), $$14, $$15, $$16, $$17, $$18, ab.b(), true);
         $$19.a();
      } else {
         $$1.printHelpOn(System.out);
      }
   }

   private static <T extends lo> lo.a<T> a(BiFunction<lq, CompletableFuture<jc.a>, T> $$0, CompletableFuture<jc.a> $$1) {
      return $$2 -> $$0.apply($$2, $$1);
   }

   public static ln a(Path $$0, Collection<Path> $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6, ae $$7, boolean $$8) {
      ln $$9 = new ln($$0, $$7, $$8);
      ln.a $$10 = $$9.a($$2 || $$3);
      $$10.a($$1x -> new pc($$1x, $$1).a(new pd()));
      CompletableFuture<jc.a> $$11 = CompletableFuture.supplyAsync(oy::a, ad.f());
      ln.a $$12 = $$9.a($$2);
      $$12.a(nk::new);
      ln.a $$13 = $$9.a($$3);
      $$13.a(a(ov::new, $$11));
      $$13.a(a(lx::a, $$11));
      $$13.a(a(nc::a, $$11));
      $$13.a(a(ot::new, $$11));
      pt<dfc> $$14 = $$13.a(a(qd::new, $$11));
      pt<cuc> $$15 = $$13.a($$2x -> new qe($$2x, $$11, $$14.c()));
      pt<dcz> $$16 = $$13.a(a(pg::new, $$11));
      pt<dpr> $$17 = $$13.a(a(pf::new, $$11));
      pt<ejt> $$18 = $$13.a(a(ps::new, $$11));
      $$13.a(a(ph::new, $$11));
      $$13.a(a(pi::new, $$11));
      $$13.a(a(pj::new, $$11));
      $$13.a(a(pk::new, $$11));
      $$13.a(a(pl::new, $$11));
      $$13.a(a(pm::new, $$11));
      $$13.a(a(pn::new, $$11));
      $$13.a(a(pq::new, $$11));
      $$13.a(a(pr::new, $$11));
      $$13.a(a(qf::new, $$11));
      $$13 = $$9.a($$4);
      $$13.a($$1x -> new pa($$1x, $$1));
      $$13 = $$9.a($$5);
      $$13.a(a(me::new, $$11));
      $$13.a(a(mh::new, $$11));
      $$13.a(a(mf::new, $$11));
      $$13.a(a(mg::new, $$11));
      $$13.a(mi::new);
      $$13 = $$9.a($$3, "bundle");
      $$13.a(a(or::new, $$11));
      $$13.a($$0x -> ng.a($$0x, xe.c("dataPack.bundle.description"), cop.a(cor.b)));
      $$13 = $$9.a($$3, "trade_rebalance");
      $$13.a($$0x -> ng.a($$0x, xe.c("dataPack.trade_rebalance.description"), cop.a(cor.d)));
      $$13.a(a(mq::a, $$11));
      $$13.a(a(pu::new, $$11));
      CompletableFuture<jq.g> $$23 = ox.a($$11);
      CompletableFuture<jc.a> $$24 = $$23.thenApply(jq.g::a);
      ln.a $$25 = $$9.a($$3, "update_1_21");
      $$25.a(a(ov::new, $$23.thenApply(jq.g::b)));
      $$25.a(a(os::new, $$24));
      pt<dfc> $$26 = $$25.a($$2x -> new px($$2x, $$24, $$14.c()));
      $$25.a($$3x -> new qb($$3x, $$24, $$15.c(), $$26.c()));
      $$25.a($$2x -> new pw($$2x, $$24, $$16.c()));
      $$25.a(a(mu::a, $$24));
      $$25.a($$0x -> ng.a($$0x, xe.c("dataPack.update_1_21.description"), cop.a(cor.c)));
      $$25.a(a(qa::new, $$24));
      $$25.a(a(py::new, $$24));
      $$25.a(a(lv::a, $$24));
      $$25.a($$2x -> new pv($$2x, $$24, $$17.c()));
      $$25.a($$2x -> new qc($$2x, $$24, $$18.c()));
      return $$9;
   }
}
