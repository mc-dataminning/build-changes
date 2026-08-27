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

public class pw extends MinecraftServer {
   private static final Logger n = LogUtils.getLogger();
   private static final int o = 20;
   private static final adh p = new adh(null, ServicesKeySet.EMPTY, null, null);
   private final List<pm> q;
   private final gu r;
   private static final cmi s = ac.a(new cmi(), $$0 -> {
      $$0.a(cmi.e).a(false, null);
      $$0.a(cmi.u).a(false, null);
   });
   private static final dii t = new dii(0L, false, false);
   @Nullable
   private qc u;

   public static pw a(Thread $$0, dyy.c $$1, aki $$2, Collection<pm> $$3, gu $$4) {
      if ($$3.isEmpty()) {
         throw new IllegalArgumentException("No test batches were given!");
      } else {
         $$2.a();
         cnf $$5 = new cnf(new cma(new ArrayList<>($$2.b()), List.of()), cay.c.a());
         cmq $$6 = new cmq("Test Level", cmj.b, false, bdu.c, true, s, $$5);
         adj.d $$7 = new adj.d($$2, $$5, false, true);
         adj.c $$8 = new adj.c($$7, dt.a.b, 4);

         try {
            n.debug("Starting resource loading");
            Stopwatch $$9 = Stopwatch.createStarted();
            adk $$10 = ac.<adk>c($$2x -> adj.a($$8, $$1xx -> {
                  hr<dfl> $$2xx = new hm<>(jc.aI, Lifecycle.stable()).l();
                  dif.b $$3x = $$1xx.c().d(jc.aF).f(drq.b).a().a().a($$2xx);
                  return new adj.b<>(new dzc($$6, t, $$3x.d(), $$3x.a()), $$3x.b());
               }, adk::new, ac.f(), $$2x)).get();
            $$9.stop();
            n.debug("Finished resource loading after {} ms", $$9.elapsed(TimeUnit.MILLISECONDS));
            return new pw($$0, $$1, $$2, $$10, $$3, $$4);
         } catch (Exception var11) {
            n.warn("Failed to load vanilla datapack, bit oops", var11);
            System.exit(-1);
            throw new IllegalStateException();
         }
      }
   }

   private pw(Thread $$0, dyy.c $$1, aki $$2, adk $$3, Collection<pm> $$4, gu $$5) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, aqd.a(), p, aiq::new);
      this.q = Lists.newArrayList($$4);
      this.r = $$5;
   }

   @Override
   public boolean e() {
      this.a(new alk(this, this.aW(), this.i, 1) {
      });
      this.n_();
      aif $$0 = this.D();
      $$0.a(this.r, 0.0F);
      int $$1 = 20000000;
      $$0.a(20000000, 20000000, false, false);
      n.info("Started game test server");
      return true;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      aif $$1 = this.D();
      if (!this.bf()) {
         this.b($$1);
      }

      if ($$1.V() % 20L == 0L) {
         n.info(this.u.j());
      }

      if (this.u.i()) {
         this.a(false);
         n.info(this.u.j());
         pz.a();
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
      this.bp();
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

   private void b(aif $$0) {
      Collection<pr> $$1 = pu.a(this.q, new gu(0, -60, 0), cvz.a, $$0, px.a, 8);
      this.u = new qc($$1);
      n.info("{} tests are now running!", this.u.h());
   }

   private boolean bf() {
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
