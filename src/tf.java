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

public class tf extends MinecraftServer {
   private static final Logger l = LogUtils.getLogger();
   private static final int m = 20;
   private static final int n = 14999992;
   private static final alx o = new alx(null, ServicesKeySet.EMPTY, null, null);
   private static final cqn p = cqp.f.a().d(cqn.a(cqp.d));
   private final bmo q = new bmo(4);
   private List<su> r = new ArrayList<>();
   private final List<tu> s;
   private final je t;
   private final Stopwatch u = Stopwatch.createUnstarted();
   private static final dec v = ad.a(new dec(p), $$0 -> {
      $$0.a(dec.e).a(false, null);
      $$0.a(dec.v).a(false, null);
      $$0.a(dec.o).a(0, null);
      $$0.a(dec.b).a(false, null);
   });
   private static final ebi w = new ebi(0L, false, false);
   @Nullable
   private tl x;

   public static tf a(Thread $$0, esv.c $$1, aue $$2, Collection<tu> $$3, je $$4) {
      if ($$3.isEmpty()) {
         throw new IllegalArgumentException("No test functions were given!");
      } else {
         $$2.a();
         dfc $$5 = new dfc(new ddt(new ArrayList<>($$2.b()), List.of()), p);
         dek $$6 = new dek("Test Level", ded.b, false, brm.c, true, v, $$5);
         ama.d $$7 = new ama.d($$2, $$5, false, true);
         ama.c $$8 = new ama.c($$7, eu.a.b, 4);

         try {
            l.debug("Starting resource loading");
            Stopwatch $$9 = Stopwatch.createStarted();
            amb $$10 = ad.<amb>c($$2x -> ama.a($$8, $$1xx -> {
                  ka<dyl> $$2xx = new jv<>(lv.bc, Lifecycle.stable()).l();
                  ebf.b $$3x = $$1xx.c().b(lv.aZ).b(eks.b).a().a().a($$2xx);
                  return new ama.b<>(new esz($$6, w, $$3x.d(), $$3x.a()), $$3x.b());
               }, amb::new, ad.g(), $$2x)).get();
            $$9.stop();
            l.debug("Finished resource loading after {} ms", $$9.elapsed(TimeUnit.MILLISECONDS));
            return new tf($$0, $$1, $$2, $$10, $$3, $$4);
         } catch (Exception var11) {
            l.warn("Failed to load vanilla datapack, bit oops", var11);
            System.exit(-1);
            throw new IllegalStateException();
         }
      }
   }

   private tf(Thread $$0, esv.c $$1, aue $$2, amb $$3, Collection<tu> $$4, je $$5) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, ban.a(), o, ars::b);
      this.s = Lists.newArrayList($$4);
      this.t = $$5;
   }

   @Override
   public boolean e() {
      this.a(new avh(this, this.bc(), this.g, 1) {
      });
      this.s_();
      arh $$0 = this.J();
      this.r = Lists.newArrayList(sv.a(this.s, $$0));
      $$0.a(this.t, 0.0F);
      int $$1 = 20000000;
      $$0.a(20000000, 20000000, false, false);
      l.info("Started game test server");
      return true;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      arh $$1 = this.J();
      if (!this.bs()) {
         this.b($$1);
      }

      if ($$1.aa() % 20L == 0L) {
         l.info(this.x.j());
      }

      if (this.x.i()) {
         this.a(false);
         l.info(this.x.j());
         ti.a();
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
   public bmr f() {
      return this.q;
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void u_() {
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

   private void b(arh $$0) {
      je $$1 = new je($$0.z.a(-14999992, 14999992), -59, $$0.z.a(-14999992, 14999992));
      td $$2 = td.a.a(this.r, $$0).a((td.c)(new tp($$1, 8, false))).a();
      Collection<ta> $$3 = $$2.a();
      this.x = new tl($$3);
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
   public boolean J_() {
      return false;
   }

   @Override
   public boolean a(GameProfile $$0) {
      return false;
   }
}
