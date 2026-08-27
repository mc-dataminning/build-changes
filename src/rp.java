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

public class rp extends MinecraftServer {
   private static final Logger l = LogUtils.getLogger();
   private static final int m = 20;
   private static final int n = 14999992;
   private static final ahm o = new ahm(null, ServicesKeySet.EMPTY, null, null);
   private final List<rf> p;
   private final hv q;
   private static final csu r = ac.a(new csu(), $$0 -> {
      $$0.a(csu.e).a(false, null);
      $$0.a(csu.v).a(false, null);
   });
   private static final dow s = new dow(0L, false, false);
   @Nullable
   private rv t;

   public static rp a(Thread $$0, efu.c $$1, apd $$2, Collection<rf> $$3, hv $$4) {
      if ($$3.isEmpty()) {
         throw new IllegalArgumentException("No test batches were given!");
      } else {
         $$2.a();
         cts $$5 = new cts(new csm(new ArrayList<>($$2.b()), List.of()), chd.e.a());
         ctc $$6 = new ctc("Test Level", csv.b, false, bji.c, true, r, $$5);
         aho.d $$7 = new aho.d($$2, $$5, false, true);
         aho.c $$8 = new aho.c($$7, dt.a.b, 4);

         try {
            l.debug("Starting resource loading");
            Stopwatch $$9 = Stopwatch.createStarted();
            ahp $$10 = ac.<ahp>c($$2x -> aho.a($$8, $$1xx -> {
                  ir<dlz> $$2xx = new in<>(kc.aM, Lifecycle.stable()).l();
                  dot.b $$3x = $$1xx.c().d(kc.aJ).f(dye.b).a().a().a($$2xx);
                  return new aho.b<>(new efy($$6, s, $$3x.d(), $$3x.a()), $$3x.b());
               }, ahp::new, ac.f(), $$2x)).get();
            $$9.stop();
            l.debug("Finished resource loading after {} ms", $$9.elapsed(TimeUnit.MILLISECONDS));
            return new rp($$0, $$1, $$2, $$10, $$3, $$4);
         } catch (Exception var11) {
            l.warn("Failed to load vanilla datapack, bit oops", var11);
            System.exit(-1);
            throw new IllegalStateException();
         }
      }
   }

   private rp(Thread $$0, efu.c $$1, apd $$2, ahp $$3, Collection<rf> $$4, hv $$5) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, avh.a(), o, ana::new);
      this.p = Lists.newArrayList($$4);
      this.q = $$5;
   }

   @Override
   public boolean e() {
      this.a(new aqf(this, this.ba(), this.h, 1) {
      });
      this.u_();
      amp $$0 = this.F();
      $$0.a(this.q, 0.0F);
      int $$1 = 20000000;
      $$0.a(20000000, 20000000, false, false);
      l.info("Started game test server");
      return true;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      amp $$1 = this.F();
      if (!this.bk()) {
         this.b($$1);
      }

      if ($$1.W() % 20L == 0L) {
         l.info(this.t.j());
      }

      if (this.t.i()) {
         this.a(false);
         l.info(this.t.j());
         rs.a();
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

   private void b(amp $$0) {
      hv $$1 = new hv($$0.z.a(-14999992, 14999992), -59, $$0.z.a(-14999992, 14999992));
      Collection<rk> $$2 = rn.a(this.p, $$1, dcl.a, $$0, rq.a, 8);
      this.t = new rv($$2);
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
