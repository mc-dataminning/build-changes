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
         lk $$19 = a($$12, $$11.valuesOf($$10).stream().map($$0x -> Paths.get($$0x)).collect(Collectors.toList()), $$14, $$15, $$16, $$17, $$18, aa.b(), true);
         $$19.a();
      } else {
         $$1.printHelpOn(System.out);
      }
   }

   private static <T extends ll> ll.a<T> a(BiFunction<ln, CompletableFuture<iz.a>, T> $$0, CompletableFuture<iz.a> $$1) {
      return $$2 -> $$0.apply($$2, $$1);
   }

   public static lk a(Path $$0, Collection<Path> $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6, ad $$7, boolean $$8) {
      lk $$9 = new lk($$0, $$7, $$8);
      lk.a $$10 = $$9.a($$2 || $$3);
      $$10.a($$1x -> new pa($$1x, $$1).a(new pb()));
      CompletableFuture<iz.a> $$11 = CompletableFuture.supplyAsync(ow::a, ac.g());
      lk.a $$12 = $$9.a($$2);
      $$12.a(ni::new);
      lk.a $$13 = $$9.a($$3);
      $$13.a(a(ot::new, $$11));
      $$13.a(a(lt::a, $$11));
      $$13.a(a(na::a, $$11));
      $$13.a(a(or::new, $$11));
      pr<ddy> $$14 = $$13.a(a(qb::new, $$11));
      pr<ctj> $$15 = $$13.a($$2x -> new qc($$2x, $$11, $$14.c()));
      pr<dbw> $$16 = $$13.a(a(pe::new, $$11));
      pr<dnw> $$17 = $$13.a(a(pd::new, $$11));
      pr<ehj> $$18 = $$13.a(a(pq::new, $$11));
      $$13.a(a(pf::new, $$11));
      $$13.a(a(pg::new, $$11));
      $$13.a(a(ph::new, $$11));
      $$13.a(a(pi::new, $$11));
      $$13.a(a(pj::new, $$11));
      $$13.a(a(pk::new, $$11));
      $$13.a(a(pl::new, $$11));
      $$13.a(a(po::new, $$11));
      $$13.a(a(pp::new, $$11));
      $$13.a(a(qd::new, $$11));
      $$13 = $$9.a($$4);
      $$13.a($$1x -> new oy($$1x, $$1));
      $$13 = $$9.a($$5);
      $$13.a(a(ma::new, $$11));
      $$13.a(a(md::new, $$11));
      $$13.a(a(mb::new, $$11));
      $$13.a(a(mc::new, $$11));
      $$13.a(me::new);
      $$13 = $$9.a($$3, "bundle");
      $$13.a(a(op::new, $$11));
      $$13.a($$0x -> ne.a($$0x, wx.c("dataPack.bundle.description"), coj.a(col.b)));
      $$13 = $$9.a($$3, "trade_rebalance");
      $$13.a($$0x -> ne.a($$0x, wx.c("dataPack.trade_rebalance.description"), coj.a(col.d)));
      $$13.a(a(mm::a, $$11));
      $$13.a(a(ps::new, $$11));
      CompletableFuture<jn.g> $$23 = ov.a($$11);
      CompletableFuture<iz.a> $$24 = $$23.thenApply(jn.g::a);
      lk.a $$25 = $$9.a($$3, "update_1_21");
      $$25.a(a(ot::new, $$23.thenApply(jn.g::b)));
      $$25.a(a(oq::new, $$24));
      pr<ddy> $$26 = $$25.a($$2x -> new pv($$2x, $$24, $$14.c()));
      $$25.a($$3x -> new pz($$3x, $$24, $$15.c(), $$26.c()));
      $$25.a($$2x -> new pu($$2x, $$24, $$16.c()));
      $$25.a(a(mr::a, $$24));
      $$25.a($$0x -> ne.a($$0x, wx.c("dataPack.update_1_21.description"), coj.a(col.c)));
      $$25.a(a(py::new, $$24));
      $$25.a(a(pw::new, $$24));
      $$25.a(a(lr::a, $$24));
      $$25.a($$2x -> new pt($$2x, $$24, $$17.c()));
      $$25.a($$2x -> new qa($$2x, $$24, $$18.c()));
      return $$9;
   }
}
