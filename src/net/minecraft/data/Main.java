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
         kz $$19 = a($$12, $$11.valuesOf($$10).stream().map($$0x -> Paths.get($$0x)).collect(Collectors.toList()), $$14, $$15, $$16, $$17, $$18, aa.b(), true);
         $$19.a();
      } else {
         $$1.printHelpOn(System.out);
      }
   }

   private static <T extends la> la.a<T> a(BiFunction<lc, CompletableFuture<ip.a>, T> $$0, CompletableFuture<ip.a> $$1) {
      return $$2 -> $$0.apply($$2, $$1);
   }

   public static kz a(Path $$0, Collection<Path> $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6, ad $$7, boolean $$8) {
      kz $$9 = new kz($$0, $$7, $$8);
      kz.a $$10 = $$9.a($$2 || $$3);
      $$10.a($$1x -> new on($$1x, $$1).a(new oo()));
      CompletableFuture<ip.a> $$11 = CompletableFuture.supplyAsync(oj::a, ac.f());
      kz.a $$12 = $$9.a($$2);
      $$12.a(mv::new);
      kz.a $$13 = $$9.a($$3);
      $$13.a(a(og::new, $$11));
      $$13.a(a(li::a, $$11));
      $$13.a(a(mn::a, $$11));
      $$13.a(a(oe::new, $$11));
      pe<dch> $$14 = $$13.a(a(pm::new, $$11));
      pe<crn> $$15 = $$13.a($$2x -> new pn($$2x, $$11, $$14.c()));
      pe<daf> $$16 = $$13.a(a(or::new, $$11));
      $$13.a(a(oq::new, $$11));
      $$13.a(a(os::new, $$11));
      $$13.a(a(ot::new, $$11));
      $$13.a(a(ou::new, $$11));
      $$13.a(a(ov::new, $$11));
      $$13.a(a(ow::new, $$11));
      $$13.a(a(ox::new, $$11));
      $$13.a(a(oy::new, $$11));
      $$13.a(a(pb::new, $$11));
      $$13.a(a(pc::new, $$11));
      $$13.a(a(pd::new, $$11));
      $$13.a(a(po::new, $$11));
      $$13 = $$9.a($$4);
      $$13.a($$1x -> new ol($$1x, $$1));
      $$13 = $$9.a($$5);
      $$13.a(a(lp::new, $$11));
      $$13.a(a(ls::new, $$11));
      $$13.a(a(lq::new, $$11));
      $$13.a(a(lr::new, $$11));
      $$13.a(lt::new);
      $$13 = $$9.a($$3, "bundle");
      $$13.a(a(oc::new, $$11));
      $$13.a($$0x -> mr.a($$0x, wi.c("dataPack.bundle.description"), cmn.a(cmp.b)));
      $$13 = $$9.a($$3, "trade_rebalance");
      $$13.a($$0x -> mr.a($$0x, wi.c("dataPack.trade_rebalance.description"), cmn.a(cmp.d)));
      $$13.a(a(mb::a, $$11));
      $$13.a(a(pf::new, $$11));
      CompletableFuture<jd.g> $$21 = oi.a($$11);
      CompletableFuture<ip.a> $$22 = $$21.thenApply(jd.g::a);
      kz.a $$23 = $$9.a($$3, "update_1_21");
      $$23.a(a(og::new, $$21.thenApply(jd.g::b)));
      $$23.a(a(od::new, $$22));
      pe<dch> $$24 = $$23.a($$2x -> new ph($$2x, $$22, $$14.c()));
      $$23.a($$3x -> new pl($$3x, $$22, $$15.c(), $$24.c()));
      $$23.a($$2x -> new pg($$2x, $$22, $$16.c()));
      $$23.a(a(mf::a, $$22));
      $$23.a($$0x -> mr.a($$0x, wi.c("dataPack.update_1_21.description"), cmn.a(cmp.c)));
      $$23.a(a(pk::new, $$22));
      $$23.a(a(pi::new, $$22));
      $$23.a(a(lg::a, $$22));
      return $$9;
   }
}
