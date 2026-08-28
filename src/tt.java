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

public class tt extends MinecraftServer {
   private static final Logger k = LogUtils.getLogger();
   private static final int l = 20;
   private static final int m = 14999992;
   private static final alz n = new alz(null, ServicesKeySet.EMPTY, null, null);
   private final blv o = new blv(4);
   private List<ti> p = new ArrayList<>();
   private final List<ui> q;
   private final iz r;
   private final Stopwatch s = Stopwatch.createUnstarted();
   private static final dbv t = ac.a(new dbv(), $$0 -> {
      $$0.a(dbv.e).a(false, null);
      $$0.a(dbv.v).a(false, null);
      $$0.a(dbv.o).a(0, null);
   });
   private static final dyt u = new dyt(0L, false, false);
   @Nullable
   private tz v;

   public static tt a(Thread $$0, epx.c $$1, aua $$2, Collection<ui> $$3, iz $$4) {
      if ($$3.isEmpty()) {
         throw new IllegalArgumentException("No test functions were given!");
      } else {
         $$2.a();
         dct $$5 = new dct(new dbn(new ArrayList<>($$2.b()), List.of()), cpo.e.a());
         dcd $$6 = new dcd("Test Level", dbw.b, false, bqs.c, true, t, $$5);
         amb.d $$7 = new amb.d($$2, $$5, false, true);
         amb.c $$8 = new amb.c($$7, eq.a.b, 4);

         try {
            k.debug("Starting resource loading");
            Stopwatch $$9 = Stopwatch.createStarted();
            amc $$10 = ac.<amc>c($$2x -> amb.a($$8, $$1xx -> {
                  jv<dvw> $$2xx = new jq<>(lq.aT, Lifecycle.stable()).l();
                  dyq.b $$3x = $$1xx.c().d(lq.aQ).g(eib.b).a().a().a($$2xx);
                  return new amb.b<>(new eqb($$6, u, $$3x.d(), $$3x.a()), $$3x.b());
               }, amc::new, ac.g(), $$2x)).get();
            $$9.stop();
            k.debug("Finished resource loading after {} ms", $$9.elapsed(TimeUnit.MILLISECONDS));
            return new tt($$0, $$1, $$2, $$10, $$3, $$4);
         } catch (Exception var11) {
            k.warn("Failed to load vanilla datapack, bit oops", var11);
            System.exit(-1);
            throw new IllegalStateException();
         }
      }
   }

   private tt(Thread $$0, epx.c $$1, aua $$2, amc $$3, Collection<ui> $$4, iz $$5) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, bah.a(), n, arq::b);
      this.q = Lists.newArrayList($$4);
      this.r = $$5;
   }

   @Override
   public boolean e() {
      this.a(new avd(this, this.bd(), this.g, 1) {
      });
      this.t_();
      arf $$0 = this.I();
      this.p = Lists.newArrayList(tj.a(this.q, $$0));
      $$0.a(this.r, 0.0F);
      int $$1 = 20000000;
      $$0.a(20000000, 20000000, false, false);
      k.info("Started game test server");
      return true;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      arf $$1 = this.I();
      if (!this.bq()) {
         this.b($$1);
      }

      if ($$1.Z() % 20L == 0L) {
         k.info(this.v.j());
      }

      if (this.v.i()) {
         this.a(false);
         k.info(this.v.j());
         tw.a();
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
   public bly f() {
      return this.o;
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

   private void b(arf $$0) {
      iz $$1 = new iz($$0.z.a(-14999992, 14999992), -59, $$0.z.a(-14999992, 14999992));
      tr $$2 = tr.a.a(this.p, $$0).a(new ud($$1, 8)).a();
      Collection<to> $$3 = $$2.a();
      this.v = new tz($$3);
      k.info("{} tests are now running at position {}!", this.v.h(), $$1.x());
      this.s.reset();
      this.s.start();
      $$2.b();
   }

   private boolean bq() {
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
