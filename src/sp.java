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

public class sp extends MinecraftServer {
   private static final Logger k = LogUtils.getLogger();
   private static final int l = 20;
   private static final int m = 14999992;
   private static final ako n = new ako(null, ServicesKeySet.EMPTY, null, null);
   private final bjz o = new bjz(4);
   private List<se> p = new ArrayList<>();
   private final List<te> q;
   private final id r;
   private final Stopwatch s = Stopwatch.createUnstarted();
   private static final czc t = ac.a(new czc(), $$0 -> {
      $$0.a(czc.e).a(false, null);
      $$0.a(czc.v).a(false, null);
   });
   private static final dvy u = new dvy(0L, false, false);
   @Nullable
   private sv v;

   public static sp a(Thread $$0, ena.c $$1, asp $$2, Collection<te> $$3, id $$4) {
      if ($$3.isEmpty()) {
         throw new IllegalArgumentException("No test functions were given!");
      } else {
         $$2.a();
         daa $$5 = new daa(new cyu(new ArrayList<>($$2.b()), List.of()), cmp.e.a());
         czk $$6 = new czk("Test Level", czd.b, false, boc.c, true, t, $$5);
         akq.d $$7 = new akq.d($$2, $$5, false, true);
         akq.c $$8 = new akq.c($$7, dw.a.b, 4);

         try {
            k.debug("Starting resource loading");
            Stopwatch $$9 = Stopwatch.createStarted();
            akr $$10 = ac.<akr>c($$2x -> akq.a($$8, $$1xx -> {
                  ja<dtb> $$2xx = new iv<>(ku.aQ, Lifecycle.stable()).l();
                  dvv.b $$3x = $$1xx.c().d(ku.aN).g(efg.b).a().a().a($$2xx);
                  return new akq.b<>(new ene($$6, u, $$3x.d(), $$3x.a()), $$3x.b());
               }, akr::new, ac.f(), $$2x)).get();
            $$9.stop();
            k.debug("Finished resource loading after {} ms", $$9.elapsed(TimeUnit.MILLISECONDS));
            return new sp($$0, $$1, $$2, $$10, $$3, $$4);
         } catch (Exception var11) {
            k.warn("Failed to load vanilla datapack, bit oops", var11);
            System.exit(-1);
            throw new IllegalStateException();
         }
      }
   }

   private sp(Thread $$0, ena.c $$1, asp $$2, akr $$3, Collection<te> $$4, id $$5) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, ayt.a(), n, aqf::b);
      this.q = Lists.newArrayList($$4);
      this.r = $$5;
   }

   @Override
   public boolean e() {
      this.a(new atr(this, this.be(), this.g, 1) {
      });
      this.t_();
      apu $$0 = this.I();
      this.p = Lists.newArrayList(sf.a(this.q, $$0));
      $$0.a(this.r, 0.0F);
      int $$1 = 20000000;
      $$0.a(20000000, 20000000, false, false);
      k.info("Started game test server");
      return true;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      apu $$1 = this.I();
      if (!this.bp()) {
         this.b($$1);
      }

      if ($$1.Y() % 20L == 0L) {
         k.info(this.v.j());
      }

      if (this.v.i()) {
         this.a(false);
         k.info(this.v.j());
         ss.a();
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
   public bkc f() {
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

   private void b(apu $$0) {
      id $$1 = new id($$0.z.a(-14999992, 14999992), -59, $$0.z.a(-14999992, 14999992));
      sn $$2 = sn.a.a(this.p, $$0).a(new sz($$1, 8)).a();
      Collection<sk> $$3 = $$2.a();
      this.v = new sv($$3);
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
