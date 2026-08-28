import com.google.common.base.Stopwatch;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.yggdrasil.ServicesKeySet;
import com.mojang.brigadier.StringReader;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Lifecycle;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;
import java.util.function.BooleanSupplier;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class sw extends MinecraftServer {
   private static final Logger l = LogUtils.getLogger();
   private static final int m = 20;
   private static final int n = 14999992;
   private static final alz o = new alz(null, ServicesKeySet.EMPTY, null, null);
   private static final cub p = cud.e.a().d(cub.a(cud.c, cud.d));
   private final bot q = new bot(4);
   private final Optional<String> r;
   private final boolean s;
   private List<sj> t = new ArrayList<>();
   private final Stopwatch u = Stopwatch.createUnstarted();
   private static final egl v = new egl(0L, false, false);
   @Nullable
   private td w;

   public static sw a(Thread $$0, eyb.c $$1, aul $$2, Optional<String> $$3, boolean $$4) {
      $$2.a();
      ArrayList<String> $$5 = new ArrayList<>($$2.c());
      $$5.remove("vanilla");
      $$5.addFirst("vanilla");
      djn $$6 = new djn(new did($$5, List.of()), p);
      dit $$7 = new dit("Test Level", dim.b, false, btv.c, true, new dil(p), $$6);
      amc.d $$8 = new amc.d($$2, $$6, false, true);
      amc.c $$9 = new amc.c($$8, ej.a.b, 4);

      try {
         l.debug("Starting resource loading");
         Stopwatch $$10 = Stopwatch.createStarted();
         amd $$11 = af.<amd>c($$2x -> amc.a($$9, $$1xx -> {
               jr<edm> $$2xx = new jm<>(mg.bn, Lifecycle.stable()).n();
               egi.b $$3x = $$1xx.c().e(mg.bl).b(epy.b).a().a().a($$2xx);
               return new amc.b<>(new eyf($$7, v, $$3x.d(), $$3x.a()), $$3x.b());
            }, amd::new, af.h(), $$2x)).get();
         $$10.stop();
         l.debug("Finished resource loading after {} ms", $$10.elapsed(TimeUnit.MILLISECONDS));
         return new sw($$0, $$1, $$2, $$11, $$3, $$4);
      } catch (Exception var12) {
         l.warn("Failed to load vanilla datapack, bit oops", var12);
         System.exit(-1);
         throw new IllegalStateException();
      }
   }

   private sw(Thread $$0, eyb.c $$1, aul $$2, amd $$3, Optional<String> $$4, boolean $$5) {
      super($$0, $$1, $$2, $$3, Proxy.NO_PROXY, bba.a(), o, asa::b);
      this.r = $$4;
      this.s = $$5;
   }

   @Override
   public boolean e() {
      this.a(new avo(this, this.bb(), this.g, 1) {
      });
      this.q_();
      aro $$0 = this.J();
      this.t = this.b($$0);
      l.info("Started game test server");
      return true;
   }

   private List<sj> b(aro $$0) {
      jr<sq> $$1 = $$0.F_().f(mg.bf);
      Collection<je.c<sq>> $$2;
      sk.a $$3;
      if (this.r.isPresent()) {
         $$2 = a($$0.F_(), this.r.get()).filter($$0x -> !((sq)$$0x.a()).i()).toList();
         if (this.s) {
            $$3 = sw::a;
            l.info("Verify requested. Will run each test that matches {} {} times", this.r.get(), 100 * dsm.values().length);
         } else {
            $$3 = sk.a;
            l.info("Will run tests matching {} ({} tests)", this.r.get(), $$2.size());
         }
      } else {
         $$2 = $$1.c().filter($$0x -> !((sq)$$0x.a()).i()).toList();
         $$3 = sk.a;
      }

      return sk.a($$2, $$3, $$0);
   }

   private static Stream<sp> a(je.c<sq> $$0, aro $$1) {
      Builder<sp> $$2 = Stream.builder();

      for (dsm $$3 : dsm.values()) {
         for (int $$4 = 0; $$4 < 100; $$4++) {
            $$2.add(new sp($$0, $$3, $$1, tf.a()));
         }
      }

      return $$2.build();
   }

   public static Stream<je.c<sq>> a(js $$0, String $$1) {
      return fn.a(new StringReader($$1), $$0.f(mg.bf)).stream();
   }

   @Override
   public void a(BooleanSupplier $$0) {
      super.a($$0);
      aro $$1 = this.J();
      if (!this.br()) {
         this.c($$1);
      }

      if ($$1.ae() % 20L == 0L) {
         l.info(this.w.j());
      }

      if (this.w.i()) {
         this.a(false);
         l.info(this.w.j());
         ta.a();
         l.info("========= {} GAME TESTS COMPLETE IN {} ======================", this.w.h(), this.u.stop());
         if (this.w.d()) {
            l.info("{} required tests failed :(", this.w.a());
            this.w.f().forEach($$0x -> l.info("   - {}", $$0x.b()));
         } else {
            l.info("All {} required tests passed :)", this.w.h());
         }

         if (this.w.e()) {
            l.info("{} optional tests failed", this.w.b());
            this.w.g().forEach($$0x -> l.info("   - {} with rotation: {}", $$0x.b(), $$0x.u()));
         }

         l.info("====================================================");
      }
   }

   @Override
   public bow f() {
      return this.q;
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void s_() {
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
      System.exit(this.w != null ? this.w.a() : -1);
   }

   @Override
   public void a(o $$0) {
      super.a($$0);
      l.error("Game test server crashed\n{}", $$0.a(y.a));
      System.exit(1);
   }

   private void c(aro $$0) {
      iu $$1 = new iu($$0.A.a(-14999992, 14999992), -59, $$0.A.a(-14999992, 14999992));
      $$0.a($$1, 0.0F);
      su $$2 = su.a.a(this.t, $$0).a((su.c)(new tg($$1, 8, false))).a();
      Collection<sp> $$3 = $$2.a();
      this.w = new td($$3);
      l.info("{} tests are now running at position {}!", this.w.h(), $$1.x());
      this.u.reset();
      this.u.start();
      $$2.b();
   }

   private boolean br() {
      return this.w != null;
   }

   @Override
   public boolean r_() {
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
