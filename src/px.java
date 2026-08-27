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

public class px extends MinecraftServer {
   private static final Logger n = LogUtils.getLogger();
   private static final int o = 20;
   private static final afh p = new afh(null, ServicesKeySet.EMPTY, null, null);
   private final List<pn> q;
   private final gv r;
   private static final cpg s = ac.a(new cpg(), $$0 -> {
      $$0.a(cpg.e).a(false, null);
      $$0.a(cpg.u).a(false, null);
   });
   private static final dlf t = new dlf(0L, false, false);
   @Nullable
   private qd u;

   public static px a(Thread $$0, ebv.c $$1, amv $$2, Collection<pn> $$3, gv $$4) {
      if ($$3.isEmpty()) {
         throw new IllegalArgumentException("No test batches were given!");
      } else {
         $$2.a();
         cqd $$5 = new cqd(new coy(new ArrayList<>($$2.b()), List.of()), cdv.d.a());
         cpo $$6 = new cpo("Test Level", cph.b, false, bgl.c, true, s, $$5);
         afj.d $$7 = new afj.d($$2, $$5, false, true);
         afj.c $$8 = new afj.c($$7, dt.a.b, 4);

         try {
            n.debug("Starting resource loading");
            Stopwatch $$9 = Stopwatch.createStarted();
            afk $$10 = ac.<afk>c($$2x -> afj.a($$8, $$1xx -> {
                  hs<dii> $$2xx = new hn<>(jd.aI, Lifecycle.stable()).l();
                  dlc.b $$3x = $$1xx.c().d(jd.aF).f(dun.b).a().a().a($$2xx);
                  return new afj.b<>(new ebz($$6, t, $$3x.d(), $$3x.a()), $$3x.b());
               }, afk::new, ac.f(), $$2x)).get();
            $$9.stop();
            n.debug("Finished resource loading after {} ms", $$9.elapsed(TimeUnit.MILLISECONDS));
            return new px($$0, $$1, $$2, $$10, $$3, $$4);
         } catch (Exception var11) {
            n.warn("Failed to load vanilla datapack, bit oops", var11);
            System.exit(-1);
            throw new IllegalStateException();
         }
      }
   }

   private px(Thread $$0, ebv.c $$1, amv $$2, afk $$3, Collection<pn> $$4, gv $$5) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, asr.a(), p, akt::new);
      this.q = Lists.newArrayList($$4);
      this.r = $$5;
   }

   @Override
   public boolean e() {
      this.a(new anx(this, this.aW(), this.i, 1) {
      });
      this.n_();
      aki $$0 = this.D();
      $$0.a(this.r, 0.0F);
      int $$1 = 20000000;
      $$0.a(20000000, 20000000, false, false);
      n.info("Started game test server");
      return true;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      aki $$1 = this.D();
      if (!this.bg()) {
         this.b($$1);
      }

      if ($$1.V() % 20L == 0L) {
         n.info(this.u.j());
      }

      if (this.u.i()) {
         this.a(false);
         n.info(this.u.j());
         qa.a();
         n.info("========= {} GAME TESTS COMPLETE ======================", this.u.h());
         if (this.u.d()) {
            n.info("{} required tests failed :(", this.u.a());
            this.u.f().forEach($$0x -> n.info("   - {}", $$0x.c()));
         } else {
            n.info("All {} required tests passed :)", this.u.h());
         }

         if (this.u.e()) {
            n.info("{} optional tests failed", this.u.b());
            this.u.g().forEach($$0x -> n.info("   - {}", $$0x.c()));
         }

         n.info("====================================================");
      }
   }

   @Override
   public void p_() {
      this.bq();
   }

   @Override
   public ab a(ab $$0) {
      $$0.a("Type", "Game test server");
      return $$0;
   }

   @Override
   public void g() {
      super.g();
      n.info("Game test server shutting down");
      System.exit(this.u.a());
   }

   @Override
   public void a(o $$0) {
      super.a($$0);
      n.error("Game test server crashed\n{}", $$0.e());
      System.exit(1);
   }

   private void b(aki $$0) {
      Collection<ps> $$1 = pv.a(this.q, new gv(0, -60, 0), cyw.a, $$0, py.a, 8);
      this.u = new qd($$1);
      n.info("{} tests are now running!", this.u.h());
   }

   private boolean bg() {
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
   public boolean N_() {
      return false;
   }

   @Override
   public boolean a(GameProfile $$0) {
      return false;
   }
}
