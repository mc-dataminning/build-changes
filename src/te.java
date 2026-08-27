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

public class te extends MinecraftServer {
   private static final Logger k = LogUtils.getLogger();
   private static final int l = 20;
   private static final int m = 14999992;
   private static final alg n = new alg(null, ServicesKeySet.EMPTY, null, null);
   private final bku o = new bku(4);
   private List<st> p = new ArrayList<>();
   private final List<tt> q;
   private final io r;
   private final Stopwatch s = Stopwatch.createUnstarted();
   private static final dat t = ac.a(new dat(), $$0 -> {
      $$0.a(dat.e).a(false, null);
      $$0.a(dat.v).a(false, null);
   });
   private static final dxr u = new dxr(0L, false, false);
   @Nullable
   private tk v;

   public static te a(Thread $$0, eov.c $$1, ath $$2, Collection<tt> $$3, io $$4) {
      if ($$3.isEmpty()) {
         throw new IllegalArgumentException("No test functions were given!");
      } else {
         $$2.a();
         dbr $$5 = new dbr(new dal(new ArrayList<>($$2.b()), List.of()), col.e.a());
         dbb $$6 = new dbb("Test Level", dau.b, false, bpr.c, true, t, $$5);
         ali.d $$7 = new ali.d($$2, $$5, false, true);
         ali.c $$8 = new ali.c($$7, ef.a.b, 4);

         try {
            k.debug("Starting resource loading");
            Stopwatch $$9 = Stopwatch.createStarted();
            alj $$10 = ac.<alj>c($$2x -> ali.a($$8, $$1xx -> {
                  jk<duu> $$2xx = new jf<>(lf.aT, Lifecycle.stable()).l();
                  dxo.b $$3x = $$1xx.c().d(lf.aQ).g(egz.b).a().a().a($$2xx);
                  return new ali.b<>(new eoz($$6, u, $$3x.d(), $$3x.a()), $$3x.b());
               }, alj::new, ac.g(), $$2x)).get();
            $$9.stop();
            k.debug("Finished resource loading after {} ms", $$9.elapsed(TimeUnit.MILLISECONDS));
            return new te($$0, $$1, $$2, $$10, $$3, $$4);
         } catch (Exception var11) {
            k.warn("Failed to load vanilla datapack, bit oops", var11);
            System.exit(-1);
            throw new IllegalStateException();
         }
      }
   }

   private te(Thread $$0, eov.c $$1, ath $$2, alj $$3, Collection<tt> $$4, io $$5) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, azk.a(), n, aqx::b);
      this.q = Lists.newArrayList($$4);
      this.r = $$5;
   }

   @Override
   public boolean e() {
      this.a(new auj(this, this.bd(), this.g, 1) {
      });
      this.t_();
      aqm $$0 = this.I();
      this.p = Lists.newArrayList(su.a(this.q, $$0));
      $$0.a(this.r, 0.0F);
      int $$1 = 20000000;
      $$0.a(20000000, 20000000, false, false);
      k.info("Started game test server");
      return true;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      aqm $$1 = this.I();
      if (!this.bp()) {
         this.b($$1);
      }

      if ($$1.Y() % 20L == 0L) {
         k.info(this.v.j());
      }

      if (this.v.i()) {
         this.a(false);
         k.info(this.v.j());
         th.a();
         k.info("========= {} GAME TESTS COMPLETE IN {} ======================", this.v.h(), this.s.stop());
         if (this.v.d()) {
            k.info("{} required tests failed :(", this.v.a());
            this.v.f().forEach($$0x -> k.info("   - {}", $$0x.b()));
         } else {
            k.info("All {} required tests passed :)", this.v.h());
         }

         if (this.v.e()) {
            k.info("{} optional tests failed", this.v.b());
            this.v.g().forEach($$0x -> k.info("   - {}", $$0x.b()));
         }

         k.info("====================================================");
      }
   }

   @Override
   public bkx f() {
      return this.o;
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void v_() {
      this.bz();
   }

   @Override
   public ab a(ab $$0) {
      $$0.a("Type", "Game test server");
      return $$0;
   }

   @Override
   public void i() {
      super.i();
      k.info("Game test server shutting down");
      System.exit(this.v.a());
   }

   @Override
   public void a(o $$0) {
      super.a($$0);
      k.error("Game test server crashed\n{}", $$0.e());
      System.exit(1);
   }

   private void b(aqm $$0) {
      io $$1 = new io($$0.z.a(-14999992, 14999992), -59, $$0.z.a(-14999992, 14999992));
      tc $$2 = tc.a.a(this.p, $$0).a(new to($$1, 8)).a();
      Collection<sz> $$3 = $$2.a();
      this.v = new tk($$3);
      k.info("{} tests are now running at position {}!", this.v.h(), $$1.x());
      this.s.reset();
      this.s.start();
      $$2.b();
   }

   private boolean bp() {
      return this.v != null;
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
   public boolean U_() {
      return false;
   }

   @Override
   public boolean a(GameProfile $$0) {
      return false;
   }
}
