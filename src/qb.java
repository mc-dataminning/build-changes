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

public class qb extends MinecraftServer {
   private static final Logger n = LogUtils.getLogger();
   private static final int o = 20;
   private static final afr p = new afr(null, ServicesKeySet.EMPTY, null, null);
   private final List<pr> q;
   private final gw r;
   private static final cpx s = ac.a(new cpx(), $$0 -> {
      $$0.a(cpx.e).a(false, null);
      $$0.a(cpx.u).a(false, null);
   });
   private static final dlk t = new dlk(0L, false, false);
   @Nullable
   private qh u;

   public static qb a(Thread $$0, eca.c $$1, anh $$2, Collection<pr> $$3, gw $$4) {
      if ($$3.isEmpty()) {
         throw new IllegalArgumentException("No test batches were given!");
      } else {
         $$2.a();
         cqu $$5 = new cqu(new cpp(new ArrayList<>($$2.b()), List.of()), cek.d.a());
         cqf $$6 = new cqf("Test Level", cpy.b, false, bhb.c, true, s, $$5);
         aft.d $$7 = new aft.d($$2, $$5, false, true);
         aft.c $$8 = new aft.c($$7, du.a.b, 4);

         try {
            n.debug("Starting resource loading");
            Stopwatch $$9 = Stopwatch.createStarted();
            afu $$10 = ac.<afu>c($$2x -> aft.a($$8, $$1xx -> {
                  hq<din> $$2xx = new hm<>(jc.aJ, Lifecycle.stable()).l();
                  dlh.b $$3x = $$1xx.c().d(jc.aG).f(dus.b).a().a().a($$2xx);
                  return new aft.b<>(new ece($$6, t, $$3x.d(), $$3x.a()), $$3x.b());
               }, afu::new, ac.f(), $$2x)).get();
            $$9.stop();
            n.debug("Finished resource loading after {} ms", $$9.elapsed(TimeUnit.MILLISECONDS));
            return new qb($$0, $$1, $$2, $$10, $$3, $$4);
         } catch (Exception var11) {
            n.warn("Failed to load vanilla datapack, bit oops", var11);
            System.exit(-1);
            throw new IllegalStateException();
         }
      }
   }

   private qb(Thread $$0, eca.c $$1, anh $$2, afu $$3, Collection<pr> $$4, gw $$5) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, ath.a(), p, ale::new);
      this.q = Lists.newArrayList($$4);
      this.r = $$5;
   }

   @Override
   public boolean e() {
      this.a(new aoj(this, this.aV(), this.i, 1) {
      });
      this.s_();
      akt $$0 = this.D();
      $$0.a(this.r, 0.0F);
      int $$1 = 20000000;
      $$0.a(20000000, 20000000, false, false);
      n.info("Started game test server");
      return true;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      akt $$1 = this.D();
      if (!this.bf()) {
         this.b($$1);
      }

      if ($$1.V() % 20L == 0L) {
         n.info(this.u.j());
      }

      if (this.u.i()) {
         this.a(false);
         n.info(this.u.j());
         qe.a();
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
   public void u_() {
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

   private void b(akt $$0) {
      Collection<pw> $$1 = pz.a(this.q, new gw(0, -60, 0), czn.a, $$0, qc.a, 8);
      this.u = new qh($$1);
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
   public boolean T_() {
      return false;
   }

   @Override
   public boolean a(GameProfile $$0) {
      return false;
   }
}
