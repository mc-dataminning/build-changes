import com.google.common.base.Stopwatch;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.yggdrasil.ServicesKeySet;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class tn extends MinecraftServer {
   private static final Logger l = LogUtils.getLogger();
   private static final int m = 20;
   private static final int n = 14999992;
   private static final amg o = new amg(null, ServicesKeySet.EMPTY, null, null);
   private static final crj p = crl.f.a().d(crj.a(crl.d, crl.e));
   private final bnb q = new bnb(4);
   private List<tc> r = new ArrayList<>();
   private final List<uc> s;
   private final jh t;
   private final Stopwatch u = Stopwatch.createUnstarted();
   private static final dfb v = ae.a(new dfb(p), $$0 -> {
      $$0.a(dfb.e).a(false, null);
      $$0.a(dfb.v).a(false, null);
      $$0.a(dfb.o).a(0, null);
      $$0.a(dfb.b).a(false, null);
   });
   private static final ech w = new ech(0L, false, false);
   @Nullable
   private tt x;

   public static tn a(Thread $$0, etu.c $$1, auo $$2, Collection<uc> $$3, jh $$4) {
      if ($$3.isEmpty()) {
         throw new IllegalArgumentException("No test functions were given!");
      } else {
         $$2.a();
         dgc $$5 = new dgc(new des(new ArrayList<>($$2.c()), List.of()), p);
         dfj $$6 = new dfj("Test Level", dfc.b, false, bse.c, true, v, $$5);
         amj.d $$7 = new amj.d($$2, $$5, false, true);
         amj.c $$8 = new amj.c($$7, ex.a.b, 4);

         try {
            l.debug("Starting resource loading");
            Stopwatch $$9 = Stopwatch.createStarted();
            amk $$10 = ae.<amk>c($$2x -> amj.a($$8, $$1xx -> {
                  kd<dzk> $$2xx = new jy<>(ma.bc, Lifecycle.stable()).n();
                  ece.b $$3x = $$1xx.c().d(ma.aZ).b(elr.b).a().a().a($$2xx);
                  return new amj.b<>(new ety($$6, w, $$3x.d(), $$3x.a()), $$3x.b());
               }, amk::new, ae.g(), $$2x)).get();
            $$9.stop();
            l.debug("Finished resource loading after {} ms", $$9.elapsed(TimeUnit.MILLISECONDS));
            return new tn($$0, $$1, $$2, $$10, $$3, $$4);
         } catch (Exception var11) {
            l.warn("Failed to load vanilla datapack, bit oops", var11);
            System.exit(-1);
            throw new IllegalStateException();
         }
      }
   }

   private tn(Thread $$0, etu.c $$1, auo $$2, amk $$3, Collection<uc> $$4, jh $$5) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, bay.a(), o, asc::b);
      this.s = Lists.newArrayList($$4);
      this.t = $$5;
   }

   @Override
   public boolean e() {
      this.a(new avr(this, this.bb(), this.g, 1) {
      });
      this.t_();
      arq $$0 = this.J();
      this.r = Lists.newArrayList(td.a(this.s, $$0));
      $$0.a(this.t, 0.0F);
      int $$1 = 20000000;
      $$0.a(20000000, 20000000, false, false);
      l.info("Started game test server");
      return true;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      arq $$1 = this.J();
      if (!this.br()) {
         this.b($$1);
      }

      if ($$1.aa() % 20L == 0L) {
         l.info(this.x.j());
      }

      if (this.x.i()) {
         this.a(false);
         l.info(this.x.j());
         tq.a();
         l.info("========= {} GAME TESTS COMPLETE IN {} ======================", this.x.h(), this.u.stop());
         if (this.x.d()) {
            l.info("{} required tests failed :(", this.x.a());
            this.x.f().forEach($$0x -> l.info("   - {}", $$0x.b()));
         } else {
            l.info("All {} required tests passed :)", this.x.h());
         }

         if (this.x.e()) {
            l.info("{} optional tests failed", this.x.b());
            this.x.g().forEach($$0x -> l.info("   - {} with rotation: {}", $$0x.b(), $$0x.u()));
         }

         l.info("====================================================");
      }
   }

   @Override
   public bne f() {
      return this.q;
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void v_() {
      this.bA();
   }

   @Override
   public ac a(ac $$0) {
      $$0.a("Type", "Game test server");
      return $$0;
   }

   @Override
   public void i() {
      super.i();
      l.info("Game test server shutting down");
      System.exit(this.x.a());
   }

   @Override
   public void a(o $$0) {
      super.a($$0);
      l.error("Game test server crashed\n{}", $$0.a(y.a));
      System.exit(1);
   }

   private void b(arq $$0) {
      jh $$1 = new jh($$0.A.a(-14999992, 14999992), -59, $$0.A.a(-14999992, 14999992));
      tl $$2 = tl.a.a(this.r, $$0).a((tl.c)(new tx($$1, 8, false))).a();
      Collection<ti> $$3 = $$2.a();
      this.x = new tt($$3);
      l.info("{} tests are now running at position {}!", this.x.h(), $$1.x());
      this.u.reset();
      this.u.start();
      $$2.b();
   }

   private boolean br() {
      return this.x != null;
   }

   @Override
   public boolean u_() {
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
   public boolean L_() {
      return false;
   }

   @Override
   public boolean a(GameProfile $$0) {
      return false;
   }
}
