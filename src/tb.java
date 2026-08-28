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

public class tb extends MinecraftServer {
   private static final Logger k = LogUtils.getLogger();
   private static final int l = 20;
   private static final int m = 14999992;
   private static final all n = new all(null, ServicesKeySet.EMPTY, null, null);
   private final blq o = new blq(4);
   private List<sq> p = new ArrayList<>();
   private final List<tq> q;
   private final jd r;
   private final Stopwatch s = Stopwatch.createUnstarted();
   private static final dcq t = ad.a(new dcq(), $$0 -> {
      $$0.a(dcq.e).a(false, null);
      $$0.a(dcq.v).a(false, null);
      $$0.a(dcq.o).a(0, null);
   });
   private static final dzt u = new dzt(0L, false, false);
   @Nullable
   private th v;

   public static tb a(Thread $$0, eqz.c $$1, ato $$2, Collection<tq> $$3, jd $$4) {
      if ($$3.isEmpty()) {
         throw new IllegalArgumentException("No test functions were given!");
      } else {
         $$2.a();
         ddp $$5 = new ddp(new dci(new ArrayList<>($$2.b()), List.of()), cpl.d.a());
         dcy $$6 = new dcy("Test Level", dcr.b, false, bqn.c, true, t, $$5);
         aln.d $$7 = new aln.d($$2, $$5, false, true);
         aln.c $$8 = new aln.c($$7, eu.a.b, 4);

         try {
            k.debug("Starting resource loading");
            Stopwatch $$9 = Stopwatch.createStarted();
            alo $$10 = ad.<alo>c($$2x -> aln.a($$8, $$1xx -> {
                  jz<dww> $$2xx = new ju<>(lu.bb, Lifecycle.stable()).m();
                  dzq.b $$3x = $$1xx.c().d(lu.aY).g(ejc.b).a().a().a($$2xx);
                  return new aln.b<>(new erd($$6, u, $$3x.d(), $$3x.a()), $$3x.b());
               }, alo::new, ad.g(), $$2x)).get();
            $$9.stop();
            k.debug("Finished resource loading after {} ms", $$9.elapsed(TimeUnit.MILLISECONDS));
            return new tb($$0, $$1, $$2, $$10, $$3, $$4);
         } catch (Exception var11) {
            k.warn("Failed to load vanilla datapack, bit oops", var11);
            System.exit(-1);
            throw new IllegalStateException();
         }
      }
   }

   private tb(Thread $$0, eqz.c $$1, ato $$2, alo $$3, Collection<tq> $$4, jd $$5) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, azw.a(), n, are::b);
      this.q = Lists.newArrayList($$4);
      this.r = $$5;
   }

   @Override
   public boolean e() {
      this.a(new auq(this, this.bd(), this.g, 1) {
      });
      this.t_();
      aqt $$0 = this.I();
      this.p = Lists.newArrayList(sr.a(this.q, $$0));
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
      if (!this.br()) {
         this.b($$1);
      }

      if ($$1.Z() % 20L == 0L) {
         k.info(this.v.j());
      }

      if (this.v.i()) {
         this.a(false);
         k.info(this.v.j());
         te.a();
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
   public blt f() {
      return this.o;
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void v_() {
      this.bB();
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
      k.error("Game test server crashed\n{}", $$0.a(y.a));
      System.exit(1);
   }

   private void b(aqt $$0) {
      jd $$1 = new jd($$0.z.a(-14999992, 14999992), -59, $$0.z.a(-14999992, 14999992));
      sz $$2 = sz.a.a(this.p, $$0).a(new tl($$1, 8)).a();
      Collection<sw> $$3 = $$2.a();
      this.v = new th($$3);
      k.info("{} tests are now running at position {}!", this.v.h(), $$1.x());
      this.s.reset();
      this.s.start();
      $$2.b();
   }

   private boolean br() {
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
