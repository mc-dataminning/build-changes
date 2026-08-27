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

public class re extends MinecraftServer {
   private static final Logger n = LogUtils.getLogger();
   private static final int o = 20;
   private static final agy p = new agy(null, ServicesKeySet.EMPTY, null, null);
   private final List<qu> q;
   private final ht r;
   private static final cro s = ac.a(new cro(), $$0 -> {
      $$0.a(cro.e).a(false, null);
      $$0.a(cro.v).a(false, null);
   });
   private static final dnd t = new dnd(0L, false, false);
   @Nullable
   private rk u;

   public static re a(Thread $$0, eeb.c $$1, aoo $$2, Collection<qu> $$3, ht $$4) {
      if ($$3.isEmpty()) {
         throw new IllegalArgumentException("No test batches were given!");
      } else {
         $$2.a();
         csl $$5 = new csl(new crg(new ArrayList<>($$2.b()), List.of()), cfx.e.a());
         crw $$6 = new crw("Test Level", crp.b, false, bin.c, true, s, $$5);
         aha.d $$7 = new aha.d($$2, $$5, false, true);
         aha.c $$8 = new aha.c($$7, dv.a.b, 4);

         try {
            n.debug("Starting resource loading");
            Stopwatch $$9 = Stopwatch.createStarted();
            ahb $$10 = ac.<ahb>c($$2x -> aha.a($$8, $$1xx -> {
                  io<dkg> $$2xx = new ik<>(jz.aK, Lifecycle.stable()).l();
                  dna.b $$3x = $$1xx.c().d(jz.aH).f(dwl.b).a().a().a($$2xx);
                  return new aha.b<>(new eef($$6, t, $$3x.d(), $$3x.a()), $$3x.b());
               }, ahb::new, ac.f(), $$2x)).get();
            $$9.stop();
            n.debug("Finished resource loading after {} ms", $$9.elapsed(TimeUnit.MILLISECONDS));
            return new re($$0, $$1, $$2, $$10, $$3, $$4);
         } catch (Exception var11) {
            n.warn("Failed to load vanilla datapack, bit oops", var11);
            System.exit(-1);
            throw new IllegalStateException();
         }
      }
   }

   private re(Thread $$0, eeb.c $$1, aoo $$2, ahb $$3, Collection<qu> $$4, ht $$5) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, auo.a(), p, aml::new);
      this.q = Lists.newArrayList($$4);
      this.r = $$5;
   }

   @Override
   public boolean e() {
      this.a(new apq(this, this.aV(), this.i, 1) {
      });
      this.t_();
      ama $$0 = this.D();
      $$0.a(this.r, 0.0F);
      int $$1 = 20000000;
      $$0.a(20000000, 20000000, false, false);
      n.info("Started game test server");
      return true;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      ama $$1 = this.D();
      if (!this.bf()) {
         this.b($$1);
      }

      if ($$1.V() % 20L == 0L) {
         n.info(this.u.j());
      }

      if (this.u.i()) {
         this.a(false);
         n.info(this.u.j());
         rh.a();
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
   public void v_() {
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

   private void b(ama $$0) {
      Collection<qz> $$1 = rc.a(this.q, new ht(0, -60, 0), dbf.a, $$0, rf.a, 8);
      this.u = new rk($$1);
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
   public boolean U_() {
      return false;
   }

   @Override
   public boolean a(GameProfile $$0) {
      return false;
   }
}
