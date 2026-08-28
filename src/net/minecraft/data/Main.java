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
         mb $$19 = a($$12, $$11.valuesOf($$10).stream().map($$0x -> Paths.get($$0x)).collect(Collectors.toList()), $$14, $$15, $$16, $$17, $$18, ab.b(), true);
         $$19.a();
      } else {
         $$1.printHelpOn(System.out);
      }
   }

   private static <T extends mc> mc.a<T> a(BiFunction<me, CompletableFuture<jq.a>, T> $$0, CompletableFuture<jq.a> $$1) {
      return $$2 -> $$0.apply($$2, $$1);
   }

   public static mb a(Path $$0, Collection<Path> $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6, ae $$7, boolean $$8) {
      mb $$9 = new mb($$0, $$7, $$8);
      mb.a $$10 = $$9.a($$2 || $$3);
      $$10.a($$1x -> new pl($$1x, $$1).a(new pm()));
      CompletableFuture<jq.a> $$11 = CompletableFuture.supplyAsync(ph::a, ad.g());
      mb.a $$12 = $$9.a($$2);
      $$12.a(nu::new);
      mb.a $$13 = $$9.a($$3);
      $$13.a(a(pe::new, $$11));
      $$13.a(a(mi::a, $$11));
      $$13.a(a(nm::a, $$11));
      $$13.a(a(pc.a::new, $$11));
      qd<dhm> $$14 = $$13.a(a(qg::new, $$11));
      qd<cvn> $$15 = $$13.a($$2x -> new qi($$2x, $$11, $$14.c()));
      qd<dfk> $$16 = $$13.a(a(pp::new, $$11));
      qd<drl> $$17 = $$13.a(a(po::new, $$11));
      qd<elg> $$18 = $$13.a(a(qc::new, $$11));
      $$13.a(a(pq::new, $$11));
      $$13.a(a(pr::new, $$11));
      $$13.a(a(pt::new, $$11));
      $$13.a(a(pu::new, $$11));
      $$13.a(a(pv::new, $$11));
      $$13.a(a(pw::new, $$11));
      $$13.a(a(px::new, $$11));
      $$13.a(a(qa::new, $$11));
      $$13.a(a(qb::new, $$11));
      $$13.a(a(qj::new, $$11));
      $$13.a(a(qh::new, $$11));
      $$13 = $$9.a($$4);
      $$13.a($$1x -> new pj($$1x, $$1));
      $$13 = $$9.a($$5);
      $$13.a(a(mp::new, $$11));
      $$13.a(a(mt::new, $$11));
      $$13.a(a(mq::new, $$11));
      $$13.a(a(mr::new, $$11));
      $$13.a(mv::new);
      $$13.a(mu::new);
      $$13.a(ms::new);
      $$13 = $$9.a($$3, "bundle");
      $$13.a(a(pb.a::new, $$11));
      $$13.a($$0x -> nq.a($$0x, xe.c("dataPack.bundle.description"), cqq.a(cqs.b)));
      CompletableFuture<ke.g> $$22 = pg.a($$11);
      CompletableFuture<jq.a> $$23 = $$22.thenApply(ke.g::b);
      mb.a $$24 = $$9.a($$3, "trade_rebalance");
      $$24.a(a(pe::new, $$23));
      $$24.a($$0x -> nq.a($$0x, xe.c("dataPack.trade_rebalance.description"), cqq.a(cqs.c)));
      $$24.a(a(ne::a, $$11));
      $$24.a(a(qf::new, $$11));
      $$24.a(a(qe::new, $$11));
      $$13 = $$9.a($$3, "redstone_experiments");
      $$13.a($$0x -> nq.a($$0x, xe.c("dataPack.redstone_experiments.description"), cqq.a(cqs.d)));
      $$13 = $$9.a($$3, "minecart_improvements");
      $$13.a($$0x -> nq.a($$0x, xe.c("dataPack.minecart_improvements.description"), cqq.a(cqs.e)));
      return $$9;
   }
}
