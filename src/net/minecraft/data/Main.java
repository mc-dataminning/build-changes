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
         ki $$19 = a($$12, $$11.valuesOf($$10).stream().map($$0x -> Paths.get($$0x)).collect(Collectors.toList()), $$14, $$15, $$16, $$17, $$18, aa.b(), true);
         $$19.a();
      } else {
         $$1.printHelpOn(System.out);
      }
   }

   private static <T extends kj> kj.a<T> a(BiFunction<kl, CompletableFuture<ii.b>, T> $$0, CompletableFuture<ii.b> $$1) {
      return $$2 -> $$0.apply($$2, $$1);
   }

   public static ki a(Path $$0, Collection<Path> $$1, boolean $$2, boolean $$3, boolean $$4, boolean $$5, boolean $$6, ad $$7, boolean $$8) {
      ki $$9 = new ki($$0, $$7, $$8);
      ki.a $$10 = $$9.a($$2 || $$3);
      $$10.a($$1x -> new nr($$1x, $$1).a(new ns()));
      CompletableFuture<ii.b> $$11 = CompletableFuture.supplyAsync(nn::a, ac.f());
      ki.a $$12 = $$9.a($$2);
      $$12.a(lx::new);
      ki.a $$13 = $$9.a($$3);
      $$13.a(a(nk::new, $$11));
      $$13.a(a(kp::a, $$11));
      $$13.a(lq::a);
      $$13.a(ni::new);
      oi<cvf> $$14 = $$13.a(a(om::new, $$11));
      oi<clj> $$15 = $$13.a($$2x -> new on($$2x, $$11, $$14.c()));
      $$13.a(a(nu::new, $$11));
      $$13.a(a(nv::new, $$11));
      $$13.a(a(nw::new, $$11));
      $$13.a(a(nx::new, $$11));
      $$13.a(a(ny::new, $$11));
      $$13.a(a(nz::new, $$11));
      $$13.a(a(oa::new, $$11));
      $$13.a(a(ob::new, $$11));
      $$13.a(a(oc::new, $$11));
      $$13.a(a(of::new, $$11));
      $$13.a(a(og::new, $$11));
      $$13.a(a(oh::new, $$11));
      $$13.a(a(oo::new, $$11));
      $$13 = $$9.a($$4);
      $$13.a($$1x -> new np($$1x, $$1));
      $$13 = $$9.a($$5);
      $$13.a(a(kw::new, $$11));
      $$13.a(kx::new);
      $$13.a(a(ky::new, $$11));
      $$13.a(kz::new);
      $$13 = $$9.a($$3, "bundle");
      $$13.a(ng::new);
      $$13.a($$0x -> lt.a($$0x, uv.c("dataPack.bundle.description"), cgi.a(cgk.b)));
      $$13 = $$9.a($$3, "trade_rebalance");
      $$13.a($$0x -> lt.a($$0x, uv.c("dataPack.trade_rebalance.description"), cgi.a(cgk.d)));
      $$13.a(lh::a);
      $$13.a(a(oj::new, $$11));
      CompletableFuture<ii.b> $$20 = nm.a($$11);
      ki.a $$21 = $$9.a($$3, "update_1_21");
      $$21.a(nh::new);
      oi<cvf> $$22 = $$21.a($$2x -> new ok($$2x, $$20, $$14.c()));
      $$21.a($$3x -> new ol($$3x, $$20, $$15.c(), $$22.c()));
      $$21.a(lj::a);
      $$21.a(a(nk::new, $$20));
      $$21.a($$0x -> lt.a($$0x, uv.c("dataPack.update_1_21.description"), cgi.a(cgk.c)));
      return $$9;
   }
}
