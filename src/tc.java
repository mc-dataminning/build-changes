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

public class tc extends MinecraftServer {
   private static final Logger k = LogUtils.getLogger();
   private static final int l = 20;
   private static final int m = 14999992;
   private static final alm n = new alm(null, ServicesKeySet.EMPTY, null, null);
   private final blr o = new blr(4);
   private List<sr> p = new ArrayList<>();
   private final List<tr> q;
   private final jd r;
   private final Stopwatch s = Stopwatch.createUnstarted();
   private static final dcs t = ad.a(new dcs(), $$0 -> {
      $$0.a(dcs.e).a(false, null);
      $$0.a(dcs.v).a(false, null);
      $$0.a(dcs.o).a(0, null);
      $$0.a(dcs.b).a(false, null);
   });
   private static final dzw u = new dzw(0L, false, false);
   @Nullable
   private ti v;

   public static tc a(Thread $$0, erf.c $$1, atp $$2, Collection<tr> $$3, jd $$4) {
      if ($$3.isEmpty()) {
         throw new IllegalArgumentException("No test functions were given!");
      } else {
         $$2.a();
         ddr $$5 = new ddr(new dck(new ArrayList<>($$2.b()), List.of()), cpn.d.a());
         dda $$6 = new dda("Test Level", dct.b, false, bqo.c, true, t, $$5);
         alo.d $$7 = new alo.d($$2, $$5, false, true);
         alo.c $$8 = new alo.c($$7, eu.a.b, 4);

         try {
            k.debug("Starting resource loading");
            Stopwatch $$9 = Stopwatch.createStarted();
            alp $$10 = ad.<alp>c($$2x -> alo.a($$8, $$1xx -> {
                  jz<dwz> $$2xx = new ju<>(lu.bb, Lifecycle.stable()).m();
                  dzt.b $$3x = $$1xx.c().d(lu.aY).g(ejh.b).a().a().a($$2xx);
                  return new alo.b<>(new erj($$6, u, $$3x.d(), $$3x.a()), $$3x.b());
               }, alp::new, ad.g(), $$2x)).get();
            $$9.stop();
            k.debug("Finished resource loading after {} ms", $$9.elapsed(TimeUnit.MILLISECONDS));
            return new tc($$0, $$1, $$2, $$10, $$3, $$4);
         } catch (Exception var11) {
            k.warn("Failed to load vanilla datapack, bit oops", var11);
            System.exit(-1);
            throw new IllegalStateException();
         }
      }
   }

   private tc(Thread $$0, erf.c $$1, atp $$2, alp $$3, Collection<tr> $$4, jd $$5) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, azx.a(), n, arf::b);
      this.q = Lists.newArrayList($$4);
      this.r = $$5;
   }

   @Override
   public boolean e() {
      this.a(new aur(this, this.bd(), this.g, 1) {
      });
      this.t_();
      aqu $$0 = this.I();
      this.p = Lists.newArrayList(ss.a(this.q, $$0));
      $$0.a(this.r, 0.0F);
      int $$1 = 20000000;
      $$0.a(20000000, 20000000, false, false);
      k.info("Started game test server");
      return true;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      aqu $$1 = this.I();
      if (!this.br()) {
         this.b($$1);
      }

      if ($$1.Z() % 20L == 0L) {
         k.info(this.v.j());
      }

      if (this.v.i()) {
         this.a(false);
         k.info(this.v.j());
         tf.a();
         k.info("========= {} GAME TESTS COMPLETE IN {} ======================", this.v.h(), this.s.stop());
         if (this.v.d()) {
            k.info("{} required tests failed :(", this.v.a());
            this.v.f().forEach($$0x -> k.info("   - {}", $$0x.b()));
         } else {
            k.info("All {} required tests passed :)", this.v.h());
         }

         if (this.v.e()) {
            k.info("{} optional tests failed", this.v.b());
            this.v.g().forEach($$0x -> k.info("   - {}", $$0x.b()));
         }

         k.info("====================================================");
      }
   }

   @Override
   public blu f() {
      return this.o;
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void v_() {
      this.bB();
   }

   @Override
   public ac a(ac $$0) {
      $$0.a("Type", "Game test server");
      return $$0;
   }

   @Override
   public void i() {
      super.i();
      k.info("Game test server shutting down");
      System.exit(this.v.a());
   }

   @Override
   public void a(o $$0) {
      super.a($$0);
      k.error("Game test server crashed\n{}", $$0.a(y.a));
      System.exit(1);
   }

   private void b(aqu $$0) {
      jd $$1 = new jd($$0.z.a(-14999992, 14999992), -59, $$0.z.a(-14999992, 14999992));
      ta $$2 = ta.a.a(this.p, $$0).a((ta.c)(new tm($$1, 8, false))).a();
      Collection<sx> $$3 = $$2.a();
      this.v = new ti($$3);
      k.info("{} tests are now running at position {}!", this.v.h(), $$1.x());
      this.s.reset();
      this.s.start();
      $$2.b();
   }

   private boolean br() {
      return this.v != null;
   }

   @Override
   public boolean j() {
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
   public boolean M_() {
      return false;
   }

   @Override
   public boolean a(GameProfile $$0) {
      return false;
   }
}
