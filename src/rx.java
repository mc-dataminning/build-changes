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

public class rx extends MinecraftServer {
   private static final Logger k = LogUtils.getLogger();
   private static final int l = 20;
   private static final int m = 14999992;
   private static final ajr n = new ajr(null, ServicesKeySet.EMPTY, null, null);
   private List<rm> o = new ArrayList<>();
   private final List<sm> p;
   private final hz q;
   private final Stopwatch r = Stopwatch.createUnstarted();
   private static final cvj s = ac.a(new cvj(), $$0 -> {
      $$0.a(cvj.e).a(false, null);
      $$0.a(cvj.v).a(false, null);
   });
   private static final drm t = new drm(0L, false, false);
   @Nullable
   private sd u;

   public static rx a(Thread $$0, eil.c $$1, arl $$2, Collection<sm> $$3, hz $$4) {
      if ($$3.isEmpty()) {
         throw new IllegalArgumentException("No test functions were given!");
      } else {
         $$2.a();
         cwh $$5 = new cwh(new cvb(new ArrayList<>($$2.b()), List.of()), cju.e.a());
         cvr $$6 = new cvr("Test Level", cvk.b, false, blr.c, true, s, $$5);
         ajt.d $$7 = new ajt.d($$2, $$5, false, true);
         ajt.c $$8 = new ajt.c($$7, dv.a.b, 4);

         try {
            k.debug("Starting resource loading");
            Stopwatch $$9 = Stopwatch.createStarted();
            aju $$10 = ac.<aju>c($$2x -> ajt.a($$8, $$1xx -> {
                  iv<dop> $$2xx = new ir<>(kg.aN, Lifecycle.stable()).l();
                  drj.b $$3x = $$1xx.c().d(kg.aK).f(eau.b).a().a().a($$2xx);
                  return new ajt.b<>(new eip($$6, t, $$3x.d(), $$3x.a()), $$3x.b());
               }, aju::new, ac.f(), $$2x)).get();
            $$9.stop();
            k.debug("Finished resource loading after {} ms", $$9.elapsed(TimeUnit.MILLISECONDS));
            return new rx($$0, $$1, $$2, $$10, $$3, $$4);
         } catch (Exception var11) {
            k.warn("Failed to load vanilla datapack, bit oops", var11);
            System.exit(-1);
            throw new IllegalStateException();
         }
      }
   }

   private rx(Thread $$0, eil.c $$1, arl $$2, aju $$3, Collection<sm> $$4, hz $$5) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, axp.a(), n, apg::b);
      this.p = Lists.newArrayList($$4);
      this.q = $$5;
   }

   @Override
   public boolean e() {
      this.a(new asn(this, this.ba(), this.g, 1) {
      });
      this.u_();
      aov $$0 = this.F();
      this.o = Lists.newArrayList(rn.a(this.p, $$0));
      $$0.a(this.q, 0.0F);
      int $$1 = 20000000;
      $$0.a(20000000, 20000000, false, false);
      k.info("Started game test server");
      return true;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      aov $$1 = this.F();
      if (!this.bl()) {
         this.b($$1);
      }

      if ($$1.X() % 20L == 0L) {
         k.info(this.u.j());
      }

      if (this.u.i()) {
         this.a(false);
         k.info(this.u.j());
         sa.a();
         k.info("========= {} GAME TESTS COMPLETE IN {} ======================", this.u.h(), this.r.stop());
         if (this.u.d()) {
            k.info("{} required tests failed :(", this.u.a());
            this.u.f().forEach($$0x -> k.info("   - {}", $$0x.b()));
         } else {
            k.info("All {} required tests passed :)", this.u.h());
         }

         if (this.u.e()) {
            k.info("{} optional tests failed", this.u.b());
            this.u.g().forEach($$0x -> k.info("   - {}", $$0x.b()));
         }

         k.info("====================================================");
      }
   }

   @Override
   public void w_() {
      this.bv();
   }

   @Override
   public ab a(ab $$0) {
      $$0.a("Type", "Game test server");
      return $$0;
   }

   @Override
   public void g() {
      super.g();
      k.info("Game test server shutting down");
      System.exit(this.u.a());
   }

   @Override
   public void a(o $$0) {
      super.a($$0);
      k.error("Game test server crashed\n{}", $$0.e());
      System.exit(1);
   }

   private void b(aov $$0) {
      hz $$1 = new hz($$0.z.a(-14999992, 14999992), -59, $$0.z.a(-14999992, 14999992));
      rv $$2 = rv.a.a(this.o, $$0).a(new sh($$1, 8)).a();
      Collection<rs> $$3 = $$2.a();
      this.u = new sd($$3);
      k.info("{} tests are now running at position {}!", this.u.h(), $$1.x());
      this.r.reset();
      this.r.start();
      $$2.b();
   }

   private boolean bl() {
      return this.u != null;
   }

   @Override
   public boolean h() {
      return false;
   }

   @Override
   public int i() {
      return 0;
   }

   @Override
   public int j() {
      return 4;
   }

   @Override
   public boolean k() {
      return false;
   }

   @Override
   public boolean l() {
      return false;
   }

   @Override
   public int m() {
      return 0;
   }

   @Override
   public boolean n() {
      return false;
   }

   @Override
   public boolean o() {
      return true;
   }

   @Override
   public boolean p() {
      return false;
   }

   @Override
   public boolean W_() {
      return false;
   }

   @Override
   public boolean a(GameProfile $$0) {
      return false;
   }
}
