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

public class tg extends MinecraftServer {
   private static final Logger l = LogUtils.getLogger();
   private static final int m = 20;
   private static final int n = 14999992;
   private static final alz o = new alz(null, ServicesKeySet.EMPTY, null, null);
   private static final cqq p = cqs.f.a().d(cqq.a(cqs.d));
   private final bmr q = new bmr(4);
   private List<sv> r = new ArrayList<>();
   private final List<tv> s;
   private final jf t;
   private final Stopwatch u = Stopwatch.createUnstarted();
   private static final def v = ad.a(new def(p), $$0 -> {
      $$0.a(def.e).a(false, null);
      $$0.a(def.v).a(false, null);
      $$0.a(def.o).a(0, null);
      $$0.a(def.b).a(false, null);
   });
   private static final ebm w = new ebm(0L, false, false);
   @Nullable
   private tm x;

   public static tg a(Thread $$0, esz.c $$1, aug $$2, Collection<tv> $$3, jf $$4) {
      if ($$3.isEmpty()) {
         throw new IllegalArgumentException("No test functions were given!");
      } else {
         $$2.a();
         dff $$5 = new dff(new ddw(new ArrayList<>($$2.b()), List.of()), p);
         den $$6 = new den("Test Level", deg.b, false, brp.c, true, v, $$5);
         amc.d $$7 = new amc.d($$2, $$5, false, true);
         amc.c $$8 = new amc.c($$7, ev.a.b, 4);

         try {
            l.debug("Starting resource loading");
            Stopwatch $$9 = Stopwatch.createStarted();
            amd $$10 = ad.<amd>c($$2x -> amc.a($$8, $$1xx -> {
                  kb<dyp> $$2xx = new jw<>(lw.bd, Lifecycle.stable()).n();
                  ebj.b $$3x = $$1xx.c().d(lw.ba).b(ekw.b).a().a().a($$2xx);
                  return new amc.b<>(new etd($$6, w, $$3x.d(), $$3x.a()), $$3x.b());
               }, amd::new, ad.g(), $$2x)).get();
            $$9.stop();
            l.debug("Finished resource loading after {} ms", $$9.elapsed(TimeUnit.MILLISECONDS));
            return new tg($$0, $$1, $$2, $$10, $$3, $$4);
         } catch (Exception var11) {
            l.warn("Failed to load vanilla datapack, bit oops", var11);
            System.exit(-1);
            throw new IllegalStateException();
         }
      }
   }

   private tg(Thread $$0, esz.c $$1, aug $$2, amd $$3, Collection<tv> $$4, jf $$5) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, bap.a(), o, aru::b);
      this.s = Lists.newArrayList($$4);
      this.t = $$5;
   }

   @Override
   public boolean e() {
      this.a(new avj(this, this.bc(), this.g, 1) {
      });
      this.t_();
      arj $$0 = this.J();
      this.r = Lists.newArrayList(sw.a(this.s, $$0));
      $$0.a(this.t, 0.0F);
      int $$1 = 20000000;
      $$0.a(20000000, 20000000, false, false);
      l.info("Started game test server");
      return true;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      arj $$1 = this.J();
      if (!this.bs()) {
         this.b($$1);
      }

      if ($$1.aa() % 20L == 0L) {
         l.info(this.x.j());
      }

      if (this.x.i()) {
         this.a(false);
         l.info(this.x.j());
         tj.a();
         l.info("========= {} GAME TESTS COMPLETE IN {} ======================", this.x.h(), this.u.stop());
         if (this.x.d()) {
            l.info("{} required tests failed :(", this.x.a());
            this.x.f().forEach($$0x -> l.info("   - {}", $$0x.b()));
         } else {
            l.info("All {} required tests passed :)", this.x.h());
         }

         if (this.x.e()) {
            l.info("{} optional tests failed", this.x.b());
            this.x.g().forEach($$0x -> l.info("   - {} with rotation: {}", $$0x.b(), $$0x.t()));
         }

         l.info("====================================================");
      }
   }

   @Override
   public bmu f() {
      return this.q;
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void v_() {
      this.bC();
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

   private void b(arj $$0) {
      jf $$1 = new jf($$0.z.a(-14999992, 14999992), -59, $$0.z.a(-14999992, 14999992));
      te $$2 = te.a.a(this.r, $$0).a((te.c)(new tq($$1, 8, false))).a();
      Collection<tb> $$3 = $$2.a();
      this.x = new tm($$3);
      l.info("{} tests are now running at position {}!", this.x.h(), $$1.x());
      this.u.reset();
      this.u.start();
      $$2.b();
   }

   private boolean bs() {
      return this.x != null;
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
   public boolean K_() {
      return false;
   }

   @Override
   public boolean a(GameProfile $$0) {
      return false;
   }
}
