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

public class ru extends MinecraftServer {
   private static final Logger l = LogUtils.getLogger();
   private static final int m = 20;
   private static final int n = 14999992;
   private static final aia o = new aia(null, ServicesKeySet.EMPTY, null, null);
   private final List<rk> p;
   private final hx q;
   private static final ctt r = ac.a(new ctt(), $$0 -> {
      $$0.a(ctt.e).a(false, null);
      $$0.a(ctt.v).a(false, null);
   });
   private static final dpw s = new dpw(0L, false, false);
   @Nullable
   private sa t;

   public static ru a(Thread $$0, egv.c $$1, apu $$2, Collection<rk> $$3, hx $$4) {
      if ($$3.isEmpty()) {
         throw new IllegalArgumentException("No test batches were given!");
      } else {
         $$2.a();
         cur $$5 = new cur(new ctl(new ArrayList<>($$2.b()), List.of()), cic.e.a());
         cub $$6 = new cub("Test Level", ctu.b, false, bjz.c, true, r, $$5);
         aic.d $$7 = new aic.d($$2, $$5, false, true);
         aic.c $$8 = new aic.c($$7, dt.a.b, 4);

         try {
            l.debug("Starting resource loading");
            Stopwatch $$9 = Stopwatch.createStarted();
            aid $$10 = ac.<aid>c($$2x -> aic.a($$8, $$1xx -> {
                  it<dmz> $$2xx = new ip<>(ke.aN, Lifecycle.stable()).l();
                  dpt.b $$3x = $$1xx.c().d(ke.aK).f(dze.b).a().a().a($$2xx);
                  return new aic.b<>(new egz($$6, s, $$3x.d(), $$3x.a()), $$3x.b());
               }, aid::new, ac.f(), $$2x)).get();
            $$9.stop();
            l.debug("Finished resource loading after {} ms", $$9.elapsed(TimeUnit.MILLISECONDS));
            return new ru($$0, $$1, $$2, $$10, $$3, $$4);
         } catch (Exception var11) {
            l.warn("Failed to load vanilla datapack, bit oops", var11);
            System.exit(-1);
            throw new IllegalStateException();
         }
      }
   }

   private ru(Thread $$0, egv.c $$1, apu $$2, aid $$3, Collection<rk> $$4, hx $$5) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, avy.a(), o, anp::new);
      this.p = Lists.newArrayList($$4);
      this.q = $$5;
   }

   @Override
   public boolean e() {
      this.a(new aqw(this, this.ba(), this.h, 1) {
      });
      this.u_();
      ane $$0 = this.F();
      $$0.a(this.q, 0.0F);
      int $$1 = 20000000;
      $$0.a(20000000, 20000000, false, false);
      l.info("Started game test server");
      return true;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      ane $$1 = this.F();
      if (!this.bk()) {
         this.b($$1);
      }

      if ($$1.X() % 20L == 0L) {
         l.info(this.t.j());
      }

      if (this.t.i()) {
         this.a(false);
         l.info(this.t.j());
         rx.a();
         l.info("========= {} GAME TESTS COMPLETE ======================", this.t.h());
         if (this.t.d()) {
            l.info("{} required tests failed :(", this.t.a());
            this.t.f().forEach($$0x -> l.info("   - {}", $$0x.c()));
         } else {
            l.info("All {} required tests passed :)", this.t.h());
         }

         if (this.t.e()) {
            l.info("{} optional tests failed", this.t.b());
            this.t.g().forEach($$0x -> l.info("   - {}", $$0x.c()));
         }

         l.info("====================================================");
      }
   }

   @Override
   public void w_() {
      this.bu();
   }

   @Override
   public ab a(ab $$0) {
      $$0.a("Type", "Game test server");
      return $$0;
   }

   @Override
   public void g() {
      super.g();
      l.info("Game test server shutting down");
      System.exit(this.t.a());
   }

   @Override
   public void a(o $$0) {
      super.a($$0);
      l.error("Game test server crashed\n{}", $$0.e());
      System.exit(1);
   }

   private void b(ane $$0) {
      hx $$1 = new hx($$0.z.a(-14999992, 14999992), -59, $$0.z.a(-14999992, 14999992));
      Collection<rp> $$2 = rs.a(this.p, $$1, ddk.a, $$0, rv.a, 8);
      this.t = new sa($$2);
      l.info("{} tests are now running at position {}!", this.t.h(), $$1.x());
   }

   private boolean bk() {
      return this.t != null;
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
