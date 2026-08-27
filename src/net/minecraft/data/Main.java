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
         lj $$19 = a($$12, $$11.valuesOf($$10).stream().map($$0x -> Paths.get($$0x)).collect(Collectors.toList()), $$14, $$15, $$16, $$17, $$18, aa.b(), true);
         $$19.a();
      } else {
         $$1.printHelpOn(System.out);
      }
   }

   private static <T extends lk> lk.a<T> a(BiFunction<lm, CompletableFuture<iy.a>, T> $$0, CompletableFuture<iy.a> $$1) {
      return $$2 -> $$0.apply($$2, $$1);
   }

   public static lj a(Path $$0, Collection<Path> $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6, ad $$7, boolean $$8) {
      lj $$9 = new lj($$0, $$7, $$8);
      lj.a $$10 = $$9.a($$2 || $$3);
      $$10.a($$1x -> new ox($$1x, $$1).a(new oy()));
      CompletableFuture<iy.a> $$11 = CompletableFuture.supplyAsync(ot::a, ac.f());
      lj.a $$12 = $$9.a($$2);
      $$12.a(nf::new);
      lj.a $$13 = $$9.a($$3);
      $$13.a(a(oq::new, $$11));
      $$13.a(a(ls::a, $$11));
      $$13.a(a(mx::a, $$11));
      $$13.a(a(oo::new, $$11));
      po<dde> $$14 = $$13.a(a(py::new, $$11));
      po<csu> $$15 = $$13.a($$2x -> new pz($$2x, $$11, $$14.c()));
      po<dbc> $$16 = $$13.a(a(pb::new, $$11));
      po<dnc> $$17 = $$13.a(a(pa::new, $$11));
      po<egp> $$18 = $$13.a(a(pn::new, $$11));
      $$13.a(a(pc::new, $$11));
      $$13.a(a(pd::new, $$11));
      $$13.a(a(pe::new, $$11));
      $$13.a(a(pf::new, $$11));
      $$13.a(a(pg::new, $$11));
      $$13.a(a(ph::new, $$11));
      $$13.a(a(pi::new, $$11));
      $$13.a(a(pl::new, $$11));
      $$13.a(a(pm::new, $$11));
      $$13.a(a(qa::new, $$11));
      $$13 = $$9.a($$4);
      $$13.a($$1x -> new ov($$1x, $$1));
      $$13 = $$9.a($$5);
      $$13.a(a(lz::new, $$11));
      $$13.a(a(mc::new, $$11));
      $$13.a(a(ma::new, $$11));
      $$13.a(a(mb::new, $$11));
      $$13.a(md::new);
      $$13 = $$9.a($$3, "bundle");
      $$13.a(a(om::new, $$11));
      $$13.a($$0x -> nb.a($$0x, wu.c("dataPack.bundle.description"), cnu.a(cnw.b)));
      $$13 = $$9.a($$3, "trade_rebalance");
      $$13.a($$0x -> nb.a($$0x, wu.c("dataPack.trade_rebalance.description"), cnu.a(cnw.d)));
      $$13.a(a(ml::a, $$11));
      $$13.a(a(pp::new, $$11));
      CompletableFuture<jm.g> $$23 = os.a($$11);
      CompletableFuture<iy.a> $$24 = $$23.thenApply(jm.g::a);
      lj.a $$25 = $$9.a($$3, "update_1_21");
      $$25.a(a(oq::new, $$23.thenApply(jm.g::b)));
      $$25.a(a(on::new, $$24));
      po<dde> $$26 = $$25.a($$2x -> new ps($$2x, $$24, $$14.c()));
      $$25.a($$3x -> new pw($$3x, $$24, $$15.c(), $$26.c()));
      $$25.a($$2x -> new pr($$2x, $$24, $$16.c()));
      $$25.a(a(mp::a, $$24));
      $$25.a($$0x -> nb.a($$0x, wu.c("dataPack.update_1_21.description"), cnu.a(cnw.c)));
      $$25.a(a(pv::new, $$24));
      $$25.a(a(pt::new, $$24));
      $$25.a(a(lq::a, $$24));
      $$25.a($$2x -> new pq($$2x, $$24, $$17.c()));
      $$25.a($$2x -> new px($$2x, $$24, $$18.c()));
      return $$9;
   }
}
