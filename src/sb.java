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

public class sb extends MinecraftServer {
   private static final Logger k = LogUtils.getLogger();
   private static final int l = 20;
   private static final int m = 14999992;
   private static final aka n = new aka(null, ServicesKeySet.EMPTY, null, null);
   private final biw o = new biw(4);
   private List<rq> p = new ArrayList<>();
   private final List<sq> q;
   private final ib r;
   private final Stopwatch s = Stopwatch.createUnstarted();
   private static final cwv t = ac.a(new cwv(), $$0 -> {
      $$0.a(cwv.e).a(false, null);
      $$0.a(cwv.v).a(false, null);
   });
   private static final dtk u = new dtk(0L, false, false);
   @Nullable
   private sh v;

   public static sb a(Thread $$0, ekk.c $$1, arz $$2, Collection<sq> $$3, ib $$4) {
      if ($$3.isEmpty()) {
         throw new IllegalArgumentException("No test functions were given!");
      } else {
         $$2.a();
         cxt $$5 = new cxt(new cwn(new ArrayList<>($$2.b()), List.of()), clh.e.a());
         cxd $$6 = new cxd("Test Level", cww.b, false, bmz.c, true, t, $$5);
         akc.d $$7 = new akc.d($$2, $$5, false, true);
         akc.c $$8 = new akc.c($$7, dv.a.b, 4);

         try {
            k.debug("Starting resource loading");
            Stopwatch $$9 = Stopwatch.createStarted();
            akd $$10 = ac.<akd>c($$2x -> akc.a($$8, $$1xx -> {
                  iy<dqn> $$2xx = new it<>(kj.aO, Lifecycle.stable()).l();
                  dth.b $$3x = $$1xx.c().d(kj.aL).g(ecs.b).a().a().a($$2xx);
                  return new akc.b<>(new eko($$6, u, $$3x.d(), $$3x.a()), $$3x.b());
               }, akd::new, ac.f(), $$2x)).get();
            $$9.stop();
            k.debug("Finished resource loading after {} ms", $$9.elapsed(TimeUnit.MILLISECONDS));
            return new sb($$0, $$1, $$2, $$10, $$3, $$4);
         } catch (Exception var11) {
            k.warn("Failed to load vanilla datapack, bit oops", var11);
            System.exit(-1);
            throw new IllegalStateException();
         }
      }
   }

   private sb(Thread $$0, ekk.c $$1, arz $$2, akd $$3, Collection<sq> $$4, ib $$5) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, ayd.a(), n, apq::b);
      this.q = Lists.newArrayList($$4);
      this.r = $$5;
   }

   @Override
   public boolean e() {
      this.a(new atb(this, this.be(), this.g, 1) {
      });
      this.t_();
      apf $$0 = this.I();
      this.p = Lists.newArrayList(rr.a(this.q, $$0));
      $$0.a(this.r, 0.0F);
      int $$1 = 20000000;
      $$0.a(20000000, 20000000, false, false);
      k.info("Started game test server");
      return true;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      apf $$1 = this.I();
      if (!this.bp()) {
         this.b($$1);
      }

      if ($$1.X() % 20L == 0L) {
         k.info(this.v.j());
      }

      if (this.v.i()) {
         this.a(false);
         k.info(this.v.j());
         se.a();
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
   public biz f() {
      return this.o;
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void v_() {
      this.bz();
   }

   @Override
   public ab a(ab $$0) {
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
      k.error("Game test server crashed\n{}", $$0.e());
      System.exit(1);
   }

   private void b(apf $$0) {
      ib $$1 = new ib($$0.z.a(-14999992, 14999992), -59, $$0.z.a(-14999992, 14999992));
      rz $$2 = rz.a.a(this.p, $$0).a(new sl($$1, 8)).a();
      Collection<rw> $$3 = $$2.a();
      this.v = new sh($$3);
      k.info("{} tests are now running at position {}!", this.v.h(), $$1.x());
      this.s.reset();
      this.s.start();
      $$2.b();
   }

   private boolean bp() {
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
   public boolean U_() {
      return false;
   }

   @Override
   public boolean a(GameProfile $$0) {
      return false;
   }
}
