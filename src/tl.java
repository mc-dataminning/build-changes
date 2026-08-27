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

public class tl extends MinecraftServer {
   private static final Logger k = LogUtils.getLogger();
   private static final int l = 20;
   private static final int m = 14999992;
   private static final aln n = new aln(null, ServicesKeySet.EMPTY, null, null);
   private final bla o = new bla(4);
   private List<ta> p = new ArrayList<>();
   private final List<ua> q;
   private final ir r;
   private final Stopwatch s = Stopwatch.createUnstarted();
   private static final dbw t = ad.a(new dbw(), $$0 -> {
      $$0.a(dbw.e).a(false, null);
      $$0.a(dbw.v).a(false, null);
   });
   private static final dzs u = new dzs(0L, false, false);
   @Nullable
   private tr v;

   public static tl a(Thread $$0, erf.c $$1, ato $$2, Collection<ua> $$3, ir $$4) {
      if ($$3.isEmpty()) {
         throw new IllegalArgumentException("No test functions were given!");
      } else {
         $$2.a();
         dcu $$5 = new dcu(new dbo(new ArrayList<>($$2.b()), List.of()), cor.e.a());
         dce $$6 = new dce("Test Level", dbx.b, false, bpx.c, true, t, $$5);
         alp.d $$7 = new alp.d($$2, $$5, false, true);
         alp.c $$8 = new alp.c($$7, ei.a.b, 4);

         try {
            k.debug("Starting resource loading");
            Stopwatch $$9 = Stopwatch.createStarted();
            alq $$10 = ad.<alq>c($$2x -> alp.a($$8, $$1xx -> {
                  jn<dwv> $$2xx = new ji<>(li.aT, Lifecycle.stable()).l();
                  dzp.b $$3x = $$1xx.c().d(li.aQ).g(ejj.b).a().a().a($$2xx);
                  return new alp.b<>(new erj($$6, u, $$3x.d(), $$3x.a()), $$3x.b());
               }, alq::new, ad.f(), $$2x)).get();
            $$9.stop();
            k.debug("Finished resource loading after {} ms", $$9.elapsed(TimeUnit.MILLISECONDS));
            return new tl($$0, $$1, $$2, $$10, $$3, $$4);
         } catch (Exception var11) {
            k.warn("Failed to load vanilla datapack, bit oops", var11);
            System.exit(-1);
            throw new IllegalStateException();
         }
      }
   }

   private tl(Thread $$0, erf.c $$1, ato $$2, alq $$3, Collection<ua> $$4, ir $$5) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, azt.a(), n, are::b);
      this.q = Lists.newArrayList($$4);
      this.r = $$5;
   }

   @Override
   public boolean e() {
      this.a(new auq(this, this.bd(), this.g, 1) {
      });
      this.t_();
      aqt $$0 = this.I();
      this.p = Lists.newArrayList(tb.a(this.q, $$0));
      $$0.a(this.r, 0.0F);
      int $$1 = 20000000;
      $$0.a(20000000, 20000000, false, false);
      k.info("Started game test server");
      return true;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      aqt $$1 = this.I();
      if (!this.bp()) {
         this.b($$1);
      }

      if ($$1.Z() % 20L == 0L) {
         k.info(this.v.j());
      }

      if (this.v.i()) {
         this.a(false);
         k.info(this.v.j());
         to.a();
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
   public bld f() {
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
   public ac a(ac $$0) {
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

   private void b(aqt $$0) {
      ir $$1 = new ir($$0.A.a(-14999992, 14999992), -59, $$0.A.a(-14999992, 14999992));
      tj $$2 = tj.a.a(this.p, $$0).a(new tv($$1, 8)).a();
      Collection<tg> $$3 = $$2.a();
      this.v = new tr($$3);
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
   public boolean V_() {
      return false;
   }

   @Override
   public boolean a(GameProfile $$0) {
      return false;
   }
}
