import com.google.common.base.Stopwatch;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.yggdrasil.ServicesKeySet;
import com.mojang.brigadier.StringReader;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.function.BooleanSupplier;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class sx extends MinecraftServer {
   private static final Logger l = LogUtils.getLogger();
   private static final int m = 20;
   private static final int n = 14999992;
   private static final amb o = new amb(null, ServicesKeySet.EMPTY, null, null);
   private static final cum p = cuo.e.a().d(cum.a(cuo.c, cuo.d));
   private final boy q = new boy(4);
   private final Optional<String> r;
   private final boolean s;
   private List<sj> t = new ArrayList<>();
   private final Stopwatch u = Stopwatch.createUnstarted();
   private static final ehe v = new ehe(0L, false, false);
   @Nullable
   private te w;

   public static sx a(Thread $$0, eyv.c $$1, aun $$2, Optional<String> $$3, boolean $$4) {
      $$2.a();
      ArrayList<String> $$5 = new ArrayList<>($$2.c());
      $$5.remove("vanilla");
      $$5.addFirst("vanilla");
      djy $$6 = new djy(new dio($$5, List.of()), p);
      dje $$7 = new dje("Test Level", dix.b, false, bua.c, true, new diw(p), $$6);
      ame.d $$8 = new ame.d($$2, $$6, false, true);
      ame.c $$9 = new ame.c($$8, ej.a.b, 4);

      try {
         l.debug("Starting resource loading");
         Stopwatch $$10 = Stopwatch.createStarted();
         amf $$11 = af.<amf>c($$2x -> ame.a($$9, $$1xx -> {
               jr<eef> $$2xx = new jm<>(mg.bp, Lifecycle.stable()).n();
               ehb.b $$3x = $$1xx.c().e(mg.bn).b(eqr.b).a().a().a($$2xx);
               return new ame.b<>(new eyz($$7, v, $$3x.d(), $$3x.a()), $$3x.b());
            }, amf::new, af.h(), $$2x)).get();
         $$10.stop();
         l.debug("Finished resource loading after {} ms", $$10.elapsed(TimeUnit.MILLISECONDS));
         return new sx($$0, $$1, $$2, $$11, $$3, $$4);
      } catch (Exception var12) {
         l.warn("Failed to load vanilla datapack, bit oops", var12);
         System.exit(-1);
         throw new IllegalStateException();
      }
   }

   private sx(Thread $$0, eyv.c $$1, aun $$2, amf $$3, Optional<String> $$4, boolean $$5) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, bbc.a(), o, asc::b);
      this.r = $$4;
      this.s = $$5;
   }

   @Override
   public boolean e() {
      this.a(new avq(this, this.bb(), this.g, 1) {
      });
      this.q_();
      arq $$0 = this.J();
      this.t = this.b($$0);
      l.info("Started game test server");
      return true;
   }

   private List<sj> b(arq $$0) {
      jr<sr> $$1 = $$0.F_().f(mg.bh);
      Collection<je.c<sr>> $$2;
      sk.a $$3;
      if (this.r.isPresent()) {
         $$2 = a($$0.F_(), this.r.get()).filter($$0x -> !((sr)$$0x.a()).i()).toList();
         if (this.s) {
            $$3 = sx::a;
            l.info("Verify requested. Will run each test that matches {} {} times", this.r.get(), 100 * dsz.values().length);
         } else {
            $$3 = sk.a;
            l.info("Will run tests matching {} ({} tests)", this.r.get(), $$2.size());
         }
      } else {
         $$2 = $$1.c().filter($$0x -> !((sr)$$0x.a()).i()).toList();
         $$3 = sk.a;
      }

      return sk.a($$2, $$3, $$0);
   }

   private static Stream<sq> a(je.c<sr> $$0, arq $$1) {
      Builder<sq> $$2 = Stream.builder();

      for (dsz $$3 : dsz.values()) {
         for (int $$4 = 0; $$4 < 100; $$4++) {
            $$2.add(new sq($$0, $$3, $$1, tg.a()));
         }
      }

      return $$2.build();
   }

   public static Stream<je.c<sr>> a(js $$0, String $$1) {
      return fn.a(new StringReader($$1), $$0.f(mg.bh)).stream();
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      arq $$1 = this.J();
      if (!this.br()) {
         this.c($$1);
      }

      if ($$1.ae() % 20L == 0L) {
         l.info(this.w.j());
      }

      if (this.w.i()) {
         this.a(false);
         l.info(this.w.j());
         tb.a();
         l.info("========= {} GAME TESTS COMPLETE IN {} ======================", this.w.h(), this.u.stop());
         if (this.w.d()) {
            l.info("{} required tests failed :(", this.w.a());
            this.w.f().forEach(sx::a);
         } else {
            l.info("All {} required tests passed :)", this.w.h());
         }

         if (this.w.e()) {
            l.info("{} optional tests failed", this.w.b());
            this.w.g().forEach(sx::a);
         }

         l.info("====================================================");
      }
   }

   private static void a(sq $$0) {
      if ($$0.u() != dsz.a) {
         l.info("   - {} with rotation {}: {}", new Object[]{$$0.b(), $$0.u().c(), $$0.n().a().getString()});
      } else {
         l.info("   - {}: {}", $$0.b(), $$0.n().a().getString());
      }
   }

   @Override
   public bpb f() {
      return this.q;
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void s_() {
      this.bA();
   }

   @Override
   public ad a(ad $$0) {
      $$0.a("Type", "Game test server");
      return $$0;
   }

   @Override
   public void i() {
      super.i();
      l.info("Game test server shutting down");
      System.exit(this.w != null ? this.w.a() : -1);
   }

   @Override
   public void a(o $$0) {
      super.a($$0);
      l.error("Game test server crashed\n{}", $$0.a(y.a));
      System.exit(1);
   }

   private void c(arq $$0) {
      iu $$1 = new iu($$0.A.a(-14999992, 14999992), -59, $$0.A.a(-14999992, 14999992));
      $$0.a($$1, 0.0F);
      sv $$2 = sv.a.a(this.t, $$0).a((sv.c)(new th($$1, 8, false))).a();
      Collection<sq> $$3 = $$2.a();
      this.w = new te($$3);
      l.info("{} tests are now running at position {}!", this.w.h(), $$1.x());
      this.u.reset();
      this.u.start();
      $$2.b();
   }

   private boolean br() {
      return this.w != null;
   }

   @Override
   public boolean r_() {
      return false;
   }

   @Override
   public int k() {
      return 0;
   }

   @Override
   public int l() {
      return 4;
   }

   @Override
   public boolean m() {
      return false;
   }

   @Override
   public boolean n() {
      return false;
   }

   @Override
   public int o() {
      return 0;
   }

   @Override
   public boolean p() {
      return false;
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public boolean r() {
      return false;
   }

   @Override
   public boolean c() {
      return false;
   }

   @Override
   public boolean a(GameProfile $$0) {
      return false;
   }
}
