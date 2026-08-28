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

public class sq extends MinecraftServer {
   private static final Logger l = LogUtils.getLogger();
   private static final int m = 20;
   private static final int n = 14999992;
   private static final alq o = new alq(null, ServicesKeySet.EMPTY, null, null);
   private static final crs p = cru.e.a().d(crs.a(cru.c, cru.d));
   private final bnc q = new bnc(4);
   private List<sf> r = new ArrayList<>();
   private final List<tf> s;
   private final ji t;
   private final Stopwatch u = Stopwatch.createUnstarted();
   private static final dgd v = af.a(new dgd(p), $$0 -> {
      $$0.a(dgd.e).a(false, null);
      $$0.a(dgd.w).a(false, null);
      $$0.a(dgd.o).a(0, null);
      $$0.a(dgd.b).a(false, null);
   });
   private static final edp w = new edp(0L, false, false);
   @Nullable
   private sw x;

   public static sq a(Thread $$0, eve.c $$1, aua $$2, Collection<tf> $$3, ji $$4) {
      if ($$3.isEmpty()) {
         throw new IllegalArgumentException("No test functions were given!");
      } else {
         $$2.a();
         dhe $$5 = new dhe(new dfu(new ArrayList<>($$2.c()), List.of()), p);
         dgl $$6 = new dgl("Test Level", dge.b, false, bsg.c, true, v, $$5);
         alt.d $$7 = new alt.d($$2, $$5, false, true);
         alt.c $$8 = new alt.c($$7, ey.a.b, 4);

         try {
            l.debug("Starting resource loading");
            Stopwatch $$9 = Stopwatch.createStarted();
            alu $$10 = af.<alu>c($$2x -> alt.a($$8, $$1xx -> {
                  ke<eas> $$2xx = new jz<>(mc.bf, Lifecycle.stable()).n();
                  edm.b $$3x = $$1xx.c().d(mc.bb).b(enb.b).a().a().a($$2xx);
                  return new alt.b<>(new evi($$6, w, $$3x.d(), $$3x.a()), $$3x.b());
               }, alu::new, af.g(), $$2x)).get();
            $$9.stop();
            l.debug("Finished resource loading after {} ms", $$9.elapsed(TimeUnit.MILLISECONDS));
            return new sq($$0, $$1, $$2, $$10, $$3, $$4);
         } catch (Exception var11) {
            l.warn("Failed to load vanilla datapack, bit oops", var11);
            System.exit(-1);
            throw new IllegalStateException();
         }
      }
   }

   private sq(Thread $$0, eve.c $$1, aua $$2, alu $$3, Collection<tf> $$4, ji $$5) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, bao.a(), o, arp::b);
      this.s = Lists.newArrayList($$4);
      this.t = $$5;
   }

   @Override
   public boolean e() {
      this.a(new avd(this, this.bb(), this.g, 1) {
      });
      this.v_();
      ard $$0 = this.J();
      this.r = Lists.newArrayList(sg.a(this.s, $$0));
      $$0.a(this.t, 0.0F);
      int $$1 = 20000000;
      $$0.a(20000000, 20000000, false, false);
      l.info("Started game test server");
      return true;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      ard $$1 = this.J();
      if (!this.br()) {
         this.b($$1);
      }

      if ($$1.ad() % 20L == 0L) {
         l.info(this.x.j());
      }

      if (this.x.i()) {
         this.a(false);
         l.info(this.x.j());
         st.a();
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
   public bnf f() {
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
   public ad a(ad $$0) {
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

   private void b(ard $$0) {
      ji $$1 = new ji($$0.A.a(-14999992, 14999992), -59, $$0.A.a(-14999992, 14999992));
      so $$2 = so.a.a(this.r, $$0).a((so.c)(new ta($$1, 8, false))).a();
      Collection<sl> $$3 = $$2.a();
      this.x = new sw($$3);
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
