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

public class sy extends MinecraftServer {
   private static final Logger k = LogUtils.getLogger();
   private static final int l = 20;
   private static final int m = 14999992;
   private static final ale n = new ale(null, ServicesKeySet.EMPTY, null, null);
   private final blg o = new blg(4);
   private List<sn> p = new ArrayList<>();
   private final List<tn> q;
   private final ja r;
   private final Stopwatch s = Stopwatch.createUnstarted();
   private static final dcb t = ac.a(new dcb(), $$0 -> {
      $$0.a(dcb.e).a(false, null);
      $$0.a(dcb.v).a(false, null);
      $$0.a(dcb.o).a(0, null);
   });
   private static final dzd u = new dzd(0L, false, false);
   @Nullable
   private te v;

   public static sy a(Thread $$0, eqi.c $$1, ath $$2, Collection<tn> $$3, ja $$4) {
      if ($$3.isEmpty()) {
         throw new IllegalArgumentException("No test functions were given!");
      } else {
         $$2.a();
         dda $$5 = new dda(new dbt(new ArrayList<>($$2.b()), List.of()), cpa.d.a());
         dcj $$6 = new dcj("Test Level", dcc.b, false, bqd.c, true, t, $$5);
         alg.d $$7 = new alg.d($$2, $$5, false, true);
         alg.c $$8 = new alg.c($$7, er.a.b, 4);

         try {
            k.debug("Starting resource loading");
            Stopwatch $$9 = Stopwatch.createStarted();
            alh $$10 = ac.<alh>c($$2x -> alg.a($$8, $$1xx -> {
                  jw<dwg> $$2xx = new jr<>(lr.ba, Lifecycle.stable()).m();
                  dza.b $$3x = $$1xx.c().d(lr.aX).g(eim.b).a().a().a($$2xx);
                  return new alg.b<>(new eqm($$6, u, $$3x.d(), $$3x.a()), $$3x.b());
               }, alh::new, ac.g(), $$2x)).get();
            $$9.stop();
            k.debug("Finished resource loading after {} ms", $$9.elapsed(TimeUnit.MILLISECONDS));
            return new sy($$0, $$1, $$2, $$10, $$3, $$4);
         } catch (Exception var11) {
            k.warn("Failed to load vanilla datapack, bit oops", var11);
            System.exit(-1);
            throw new IllegalStateException();
         }
      }
   }

   private sy(Thread $$0, eqi.c $$1, ath $$2, alh $$3, Collection<tn> $$4, ja $$5) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, azp.a(), n, aqx::b);
      this.q = Lists.newArrayList($$4);
      this.r = $$5;
   }

   @Override
   public boolean e() {
      this.a(new auj(this, this.be(), this.g, 1) {
      });
      this.t_();
      aqm $$0 = this.J();
      this.p = Lists.newArrayList(so.a(this.q, $$0));
      $$0.a(this.r, 0.0F);
      int $$1 = 20000000;
      $$0.a(20000000, 20000000, false, false);
      k.info("Started game test server");
      return true;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      aqm $$1 = this.J();
      if (!this.br()) {
         this.b($$1);
      }

      if ($$1.Z() % 20L == 0L) {
         k.info(this.v.j());
      }

      if (this.v.i()) {
         this.a(false);
         k.info(this.v.j());
         tb.a();
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
   public blj f() {
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

   private void b(aqm $$0) {
      ja $$1 = new ja($$0.z.a(-14999992, 14999992), -59, $$0.z.a(-14999992, 14999992));
      sw $$2 = sw.a.a(this.p, $$0).a(new ti($$1, 8)).a();
      Collection<st> $$3 = $$2.a();
      this.v = new te($$3);
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
   public boolean U_() {
      return false;
   }

   @Override
   public boolean a(GameProfile $$0) {
      return false;
   }
}
