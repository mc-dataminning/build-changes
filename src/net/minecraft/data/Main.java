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
         lv $$19 = a($$12, $$11.valuesOf($$10).stream().map($$0x -> Paths.get($$0x)).collect(Collectors.toList()), $$14, $$15, $$16, $$17, $$18, aa.b(), true);
         $$19.a();
      } else {
         $$1.printHelpOn(System.out);
      }
   }

   private static <T extends lw> lw.a<T> a(BiFunction<ly, CompletableFuture<jk.a>, T> $$0, CompletableFuture<jk.a> $$1) {
      return $$2 -> $$0.apply($$2, $$1);
   }

   public static lv a(Path $$0, Collection<Path> $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6, ad $$7, boolean $$8) {
      lv $$9 = new lv($$0, $$7, $$8);
      lv.a $$10 = $$9.a($$2 || $$3);
      $$10.a($$1x -> new pl($$1x, $$1).a(new pm()));
      CompletableFuture<jk.a> $$11 = CompletableFuture.supplyAsync(ph::a, ac.g());
      lv.a $$12 = $$9.a($$2);
      $$12.a(nt::new);
      lv.a $$13 = $$9.a($$3);
      $$13.a(a(pe::new, $$11));
      $$13.a(a(me::a, $$11));
      $$13.a(a(nl::a, $$11));
      $$13.a(a(pc::new, $$11));
      qd<dex> $$14 = $$13.a(a(qo::new, $$11));
      qd<cui> $$15 = $$13.a($$2x -> new qq($$2x, $$11, $$14.c()));
      qd<dcv> $$16 = $$13.a(a(pp::new, $$11));
      qd<dov> $$17 = $$13.a(a(po::new, $$11));
      qd<eii> $$18 = $$13.a(a(qc::new, $$11));
      $$13.a(a(pq::new, $$11));
      $$13.a(a(pr::new, $$11));
      $$13.a(a(pt::new, $$11));
      $$13.a(a(pu::new, $$11));
      $$13.a(a(pv::new, $$11));
      $$13.a(a(pw::new, $$11));
      $$13.a(a(px::new, $$11));
      $$13.a(a(qa::new, $$11));
      $$13.a(a(qb::new, $$11));
      $$13.a(a(qr::new, $$11));
      $$13.a(a(qp::new, $$11));
      $$13 = $$9.a($$4);
      $$13.a($$1x -> new pj($$1x, $$1));
      $$13 = $$9.a($$5);
      $$13.a(a(ml::new, $$11));
      $$13.a(a(mo::new, $$11));
      $$13.a(a(mm::new, $$11));
      $$13.a(a(mn::new, $$11));
      $$13.a(mp::new);
      $$13 = $$9.a($$3, "bundle");
      $$13.a(a(pa::new, $$11));
      $$13.a($$0x -> np.a($$0x, xo.c("dataPack.bundle.description"), cpj.a(cpl.b)));
      $$13 = $$9.a($$3, "trade_rebalance");
      $$13.a($$0x -> np.a($$0x, xo.c("dataPack.trade_rebalance.description"), cpj.a(cpl.d)));
      $$13.a(a(mx::a, $$11));
      $$13.a(a(qe::new, $$11));
      CompletableFuture<jy.g> $$23 = pg.a($$11);
      CompletableFuture<jk.a> $$24 = $$23.thenApply(jy.g::a);
      lv.a $$25 = $$9.a($$3, "update_1_21");
      $$25.a(a(pe::new, $$23.thenApply(jy.g::b)));
      $$25.a(a(pb::new, $$24));
      qd<dex> $$26 = $$25.a($$2x -> new qh($$2x, $$24, $$14.c()));
      $$25.a($$3x -> new qm($$3x, $$24, $$15.c(), $$26.c()));
      $$25.a($$2x -> new qg($$2x, $$24, $$16.c()));
      $$25.a(a(nc::a, $$24));
      $$25.a($$0x -> np.a($$0x, xo.c("dataPack.update_1_21.description"), cpj.a(cpl.c)));
      $$25.a(a(ql::new, $$24));
      $$25.a(a(qi::new, $$24));
      $$25.a(a(mc::a, $$24));
      $$25.a($$2x -> new qf($$2x, $$24, $$17.c()));
      $$25.a($$2x -> new qn($$2x, $$24, $$18.c()));
      $$25.a(a(qk::new, $$24));
      return $$9;
   }
}
