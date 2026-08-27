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

public class rz extends MinecraftServer {
   private static final Logger k = LogUtils.getLogger();
   private static final int l = 20;
   private static final int m = 14999992;
   private static final ajv n = new ajv(null, ServicesKeySet.EMPTY, null, null);
   private final bii o = new bii(4);
   private List<ro> p = new ArrayList<>();
   private final List<so> q;
   private final ib r;
   private final Stopwatch s = Stopwatch.createUnstarted();
   private static final cwa t = ac.a(new cwa(), $$0 -> {
      $$0.a(cwa.e).a(false, null);
      $$0.a(cwa.v).a(false, null);
   });
   private static final dso u = new dso(0L, false, false);
   @Nullable
   private sf v;

   public static rz a(Thread $$0, ejo.c $$1, arq $$2, Collection<so> $$3, ib $$4) {
      if ($$3.isEmpty()) {
         throw new IllegalArgumentException("No test functions were given!");
      } else {
         $$2.a();
         cwy $$5 = new cwy(new cvs(new ArrayList<>($$2.b()), List.of()), ckn.e.a());
         cwi $$6 = new cwi("Test Level", cwb.b, false, bmi.c, true, t, $$5);
         ajx.d $$7 = new ajx.d($$2, $$5, false, true);
         ajx.c $$8 = new ajx.c($$7, dv.a.b, 4);

         try {
            k.debug("Starting resource loading");
            Stopwatch $$9 = Stopwatch.createStarted();
            ajy $$10 = ac.<ajy>c($$2x -> ajx.a($$8, $$1xx -> {
                  ix<dpr> $$2xx = new it<>(ki.aO, Lifecycle.stable()).l();
                  dsl.b $$3x = $$1xx.c().d(ki.aL).f(ebw.b).a().a().a($$2xx);
                  return new ajx.b<>(new ejs($$6, u, $$3x.d(), $$3x.a()), $$3x.b());
               }, ajy::new, ac.f(), $$2x)).get();
            $$9.stop();
            k.debug("Finished resource loading after {} ms", $$9.elapsed(TimeUnit.MILLISECONDS));
            return new rz($$0, $$1, $$2, $$10, $$3, $$4);
         } catch (Exception var11) {
            k.warn("Failed to load vanilla datapack, bit oops", var11);
            System.exit(-1);
            throw new IllegalStateException();
         }
      }
   }

   private rz(Thread $$0, ejo.c $$1, arq $$2, ajy $$3, Collection<so> $$4, ib $$5) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, axt.a(), n, apl::b);
      this.q = Lists.newArrayList($$4);
      this.r = $$5;
   }

   @Override
   public boolean e() {
      this.a(new ass(this, this.be(), this.g, 1) {
      });
      this.u_();
      apa $$0 = this.I();
      this.p = Lists.newArrayList(rp.a(this.q, $$0));
      $$0.a(this.r, 0.0F);
      int $$1 = 20000000;
      $$0.a(20000000, 20000000, false, false);
      k.info("Started game test server");
      return true;
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      apa $$1 = this.I();
      if (!this.bp()) {
         this.b($$1);
      }

      if ($$1.X() % 20L == 0L) {
         k.info(this.v.j());
      }

      if (this.v.i()) {
         this.a(false);
         k.info(this.v.j());
         sc.a();
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
   public bil f() {
      return this.o;
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void w_() {
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

   private void b(apa $$0) {
      ib $$1 = new ib($$0.z.a(-14999992, 14999992), -59, $$0.z.a(-14999992, 14999992));
      rx $$2 = rx.a.a(this.p, $$0).a(new sj($$1, 8)).a();
      Collection<ru> $$3 = $$2.a();
      this.v = new sf($$3);
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
   public boolean W_() {
      return false;
   }

   @Override
   public boolean a(GameProfile $$0) {
      return false;
   }
}
