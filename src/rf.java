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

public class rf extends MinecraftServer {
   private static final Logger l = LogUtils.getLogger();
   private static final int m = 20;
   private static final ahb n = new ahb(null, ServicesKeySet.EMPTY, null, null);
   private final List<qv> o;
   private final ht p;
   private static final crw q = ac.a(new crw(), $$0 -> {
      $$0.a(crw.e).a(false, null);
      $$0.a(crw.v).a(false, null);
   });
   private static final dnp r = new dnp(0L, false, false);
   @Nullable
   private rl s;

   public static rf a(Thread $$0, een.c $$1, aos $$2, Collection<qv> $$3, ht $$4) {
      if ($$3.isEmpty()) {
         throw new IllegalArgumentException("No test batches were given!");
      } else {
         $$2.a();
         cst $$5 = new cst(new cro(new ArrayList<>($$2.b()), List.of()), cgf.e.a());
         cse $$6 = new cse("Test Level", crx.b, false, biu.c, true, q, $$5);
         ahd.d $$7 = new ahd.d($$2, $$5, false, true);
         ahd.c $$8 = new ahd.c($$7, dv.a.b, 4);

         try {
            l.debug("Starting resource loading");
            Stopwatch $$9 = Stopwatch.createStarted();
            ahe $$10 = ac.<ahe>c($$2x -> ahd.a($$8, $$1xx -> {
                  io<dks> $$2xx = new ik<>(jz.aK, Lifecycle.stable()).l();
                  dnm.b $$3x = $$1xx.c().d(jz.aH).f(dwx.b).a().a().a($$2xx);
                  return new ahd.b<>(new eer($$6, r, $$3x.d(), $$3x.a()), $$3x.b());
               }, ahe::new, ac.f(), $$2x)).get();
            $$9.stop();
            l.debug("Finished resource loading after {} ms", $$9.elapsed(TimeUnit.MILLISECONDS));
            return new rf($$0, $$1, $$2, $$10, $$3, $$4);
         } catch (Exception var11) {
            l.warn("Failed to load vanilla datapack, bit oops", var11);
            System.exit(-1);
            throw new IllegalStateException();
         }
      }
   }

   private rf(Thread $$0, een.c $$1, aos $$2, ahe $$3, Collection<qv> $$4, ht $$5) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, aut.a(), n, amp::new);
      this.o = Lists.newArrayList($$4);
      this.p = $$5;
   }

   @Override
   public boolean e() {
      this.a(new apu(this, this.ba(), this.h, 1) {
      });
      this.t_();
      ame $$0 = this.F();
      $$0.a(this.p, 0.0F);
      int $$1 = 20000000;
      $$0.a(20000000, 20000000, false, false);
      l.info("Started game test server");
      return true;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      ame $$1 = this.F();
      if (!this.bk()) {
         this.b($$1);
      }

      if ($$1.W() % 20L == 0L) {
         l.info(this.s.j());
      }

      if (this.s.i()) {
         this.a(false);
         l.info(this.s.j());
         ri.a();
         l.info("========= {} GAME TESTS COMPLETE ======================", this.s.h());
         if (this.s.d()) {
            l.info("{} required tests failed :(", this.s.a());
            this.s.f().forEach($$0x -> l.info("   - {}", $$0x.c()));
         } else {
            l.info("All {} required tests passed :)", this.s.h());
         }

         if (this.s.e()) {
            l.info("{} optional tests failed", this.s.b());
            this.s.g().forEach($$0x -> l.info("   - {}", $$0x.c()));
         }

         l.info("====================================================");
      }
   }

   @Override
   public void v_() {
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
      System.exit(this.s.a());
   }

   @Override
   public void a(o $$0) {
      super.a($$0);
      l.error("Game test server crashed\n{}", $$0.e());
      System.exit(1);
   }

   private void b(ame $$0) {
      Collection<ra> $$1 = rd.a(this.o, new ht(0, -59, 0), dbm.a, $$0, rg.a, 8);
      this.s = new rl($$1);
      l.info("{} tests are now running!", this.s.h());
   }

   private boolean bk() {
      return this.s != null;
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
   public boolean V_() {
      return false;
   }

   @Override
   public boolean a(GameProfile $$0) {
      return false;
   }
}
