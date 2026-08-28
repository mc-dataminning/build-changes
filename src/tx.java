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

public class tx extends MinecraftServer {
   private static final Logger l = LogUtils.getLogger();
   private static final int m = 20;
   private static final int n = 14999992;
   private static final amu o = new amu(null, ServicesKeySet.EMPTY, null, null);
   private static final cst p = csv.f.a().d(cst.a(csv.d, csv.e));
   private final bod q = new bod(4);
   private List<tm> r = new ArrayList<>();
   private final List<um> s;
   private final jh t;
   private final Stopwatch u = Stopwatch.createUnstarted();
   private static final dhe v = ae.a(new dhe(p), $$0 -> {
      $$0.a(dhe.e).a(false, null);
      $$0.a(dhe.w).a(false, null);
      $$0.a(dhe.o).a(0, null);
      $$0.a(dhe.b).a(false, null);
   });
   private static final eeo w = new eeo(0L, false, false);
   @Nullable
   private ud x;

   public static tx a(Thread $$0, ewd.c $$1, avg $$2, Collection<um> $$3, jh $$4) {
      if ($$3.isEmpty()) {
         throw new IllegalArgumentException("No test functions were given!");
      } else {
         $$2.a();
         dif $$5 = new dif(new dgv(new ArrayList<>($$2.c()), List.of()), p);
         dhm $$6 = new dhm("Test Level", dhf.b, false, btg.c, true, v, $$5);
         amx.d $$7 = new amx.d($$2, $$5, false, true);
         amx.c $$8 = new amx.c($$7, ex.a.b, 4);

         try {
            l.debug("Starting resource loading");
            Stopwatch $$9 = Stopwatch.createStarted();
            amy $$10 = ae.<amy>c($$2x -> amx.a($$8, $$1xx -> {
                  kd<ebr> $$2xx = new jy<>(mb.bf, Lifecycle.stable()).n();
                  eel.b $$3x = $$1xx.c().d(mb.bb).b(eoa.b).a().a().a($$2xx);
                  return new amx.b<>(new ewh($$6, w, $$3x.d(), $$3x.a()), $$3x.b());
               }, amy::new, ae.g(), $$2x)).get();
            $$9.stop();
            l.debug("Finished resource loading after {} ms", $$9.elapsed(TimeUnit.MILLISECONDS));
            return new tx($$0, $$1, $$2, $$10, $$3, $$4);
         } catch (Exception var11) {
            l.warn("Failed to load vanilla datapack, bit oops", var11);
            System.exit(-1);
            throw new IllegalStateException();
         }
      }
   }

   private tx(Thread $$0, ewd.c $$1, avg $$2, amy $$3, Collection<um> $$4, jh $$5) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, bbt.a(), o, ast::b);
      this.s = Lists.newArrayList($$4);
      this.t = $$5;
   }

   @Override
   public boolean e() {
      this.a(new awi(this, this.bb(), this.g, 1) {
      });
      this.v_();
      ash $$0 = this.J();
      this.r = Lists.newArrayList(tn.a(this.s, $$0));
      $$0.a(this.t, 0.0F);
      int $$1 = 20000000;
      $$0.a(20000000, 20000000, false, false);
      l.info("Started game test server");
      return true;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      ash $$1 = this.J();
      if (!this.br()) {
         this.b($$1);
      }

      if ($$1.ac() % 20L == 0L) {
         l.info(this.x.j());
      }

      if (this.x.i()) {
         this.a(false);
         l.info(this.x.j());
         ua.a();
         l.info("========= {} GAME TESTS COMPLETE IN {} ======================", this.x.h(), this.u.stop());
         if (this.x.d()) {
            l.info("{} required tests failed :(", this.x.a());
            this.x.f().forEach($$0x -> l.info("   - {}", $$0x.b()));
         } else {
            l.info("All {} required tests passed :)", this.x.h());
         }

         if (this.x.e()) {
            l.info("{} optional tests failed", this.x.b());
            this.x.g().forEach($$0x -> l.info("   - {} with rotation: {}", $$0x.b(), $$0x.u()));
         }

         l.info("====================================================");
      }
   }

   @Override
   public bog f() {
      return this.q;
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void x_() {
      this.bA();
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

   private void b(ash $$0) {
      jh $$1 = new jh($$0.A.a(-14999992, 14999992), -59, $$0.A.a(-14999992, 14999992));
      tv $$2 = tv.a.a(this.r, $$0).a((tv.c)(new uh($$1, 8, false))).a();
      Collection<ts> $$3 = $$2.a();
      this.x = new ud($$3);
      l.info("{} tests are now running at position {}!", this.x.h(), $$1.x());
      this.u.reset();
      this.u.start();
      $$2.b();
   }

   private boolean br() {
      return this.x != null;
   }

   @Override
   public boolean w_() {
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
   public boolean c() {
      return false;
   }

   @Override
   public boolean a(GameProfile $$0) {
      return false;
   }
}
