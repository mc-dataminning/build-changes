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

public class pz extends MinecraftServer {
   private static final Logger n = LogUtils.getLogger();
   private static final int o = 20;
   private static final afm p = new afm(null, ServicesKeySet.EMPTY, null, null);
   private final List<pp> q;
   private final gw r;
   private static final cpm s = ac.a(new cpm(), $$0 -> {
      $$0.a(cpm.e).a(false, null);
      $$0.a(cpm.u).a(false, null);
   });
   private static final dll t = new dll(0L, false, false);
   @Nullable
   private qf u;

   public static pz a(Thread $$0, ecb.c $$1, ana $$2, Collection<pp> $$3, gw $$4) {
      if ($$3.isEmpty()) {
         throw new IllegalArgumentException("No test batches were given!");
      } else {
         $$2.a();
         cqj $$5 = new cqj(new cpe(new ArrayList<>($$2.b()), List.of()), cdz.d.a());
         cpu $$6 = new cpu("Test Level", cpn.b, false, bgq.c, true, s, $$5);
         afo.d $$7 = new afo.d($$2, $$5, false, true);
         afo.c $$8 = new afo.c($$7, du.a.b, 4);

         try {
            n.debug("Starting resource loading");
            Stopwatch $$9 = Stopwatch.createStarted();
            afp $$10 = ac.<afp>c($$2x -> afo.a($$8, $$1xx -> {
                  ht<dio> $$2xx = new ho<>(je.aI, Lifecycle.stable()).l();
                  dli.b $$3x = $$1xx.c().d(je.aF).f(dut.b).a().a().a($$2xx);
                  return new afo.b<>(new ecf($$6, t, $$3x.d(), $$3x.a()), $$3x.b());
               }, afp::new, ac.f(), $$2x)).get();
            $$9.stop();
            n.debug("Finished resource loading after {} ms", $$9.elapsed(TimeUnit.MILLISECONDS));
            return new pz($$0, $$1, $$2, $$10, $$3, $$4);
         } catch (Exception var11) {
            n.warn("Failed to load vanilla datapack, bit oops", var11);
            System.exit(-1);
            throw new IllegalStateException();
         }
      }
   }

   private pz(Thread $$0, ecb.c $$1, ana $$2, afp $$3, Collection<pp> $$4, gw $$5) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, asw.a(), p, aky::new);
      this.q = Lists.newArrayList($$4);
      this.r = $$5;
   }

   @Override
   public boolean e() {
      this.a(new aoc(this, this.aV(), this.i, 1) {
      });
      this.n_();
      akn $$0 = this.D();
      $$0.a(this.r, 0.0F);
      int $$1 = 20000000;
      $$0.a(20000000, 20000000, false, false);
      n.info("Started game test server");
      return true;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      akn $$1 = this.D();
      if (!this.bf()) {
         this.b($$1);
      }

      if ($$1.V() % 20L == 0L) {
         n.info(this.u.j());
      }

      if (this.u.i()) {
         this.a(false);
         n.info(this.u.j());
         qc.a();
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

   private void b(akn $$0) {
      Collection<pu> $$1 = px.a(this.q, new gw(0, -60, 0), czc.a, $$0, qa.a, 8);
      this.u = new qf($$1);
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
