import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fvw extends dad {
   private static final Logger a = LogUtils.getLogger();
   private static final double b = 0.05;
   private static final int c = 10;
   private static final int d = 1000;
   final dun e = new dun();
   private final dut<brh> f = new dut<>(brh.class, new fvw.b());
   private final fvx D;
   private final gbm E;
   private final fvw.a F;
   private final gbd G;
   private final bpx H;
   private final fde I = fde.Q();
   final List<gan> J = Lists.newArrayList();
   private final Map<enn, enp> K = Maps.newHashMap();
   private static final long L = 16777215L;
   private int M;
   private final Object2ObjectArrayMap<czo, fej> N = ac.a(new Object2ObjectArrayMap(3), $$0x -> {
      $$0x.put(gba.a, new fej($$0xx -> this.b($$0xx, gba.a)));
      $$0x.put(gba.b, new fej($$0xx -> this.b($$0xx, gba.b)));
      $$0x.put(gba.c, new fej($$0xx -> this.b($$0xx, gba.c)));
   });
   private final fvs O;
   private final Deque<Runnable> P = Queues.newArrayDeque();
   private int Q;
   private final fxi R = new fxi();
   private static final Set<csu> S = Set.of(ctc.hB, ctc.hC);

   public void b(int $$0) {
      this.R.a($$0, this);
   }

   public void b(in $$0, dqh $$1, int $$2) {
      if (!this.R.a($$0, $$1)) {
         super.a($$0, $$1, $$2, 512);
      }
   }

   public void a(in $$0, dqh $$1, etp $$2) {
      dqh $$3 = this.a_($$0);
      if ($$3 != $$1) {
         this.a($$0, $$1, 19);
         clh $$4 = this.I.s;
         if (this == $$4.dN() && $$4.a($$0, $$1)) {
            $$4.h($$2.c, $$2.d, $$2.e);
         }
      }
   }

   fxi a() {
      return this.R;
   }

   @Override
   public boolean a(in $$0, dqh $$1, int $$2, int $$3) {
      if (this.R.c()) {
         dqh $$4 = this.a_($$0);
         boolean $$5 = super.a($$0, $$1, $$2, $$3);
         if ($$5) {
            this.R.a($$0, $$4, this.I.s);
         }

         return $$5;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   public fvw(fvx $$0, fvw.a $$1, akg<dad> $$2, iw<dtz> $$3, int $$4, int $$5, Supplier<bma> $$6, gbm $$7, boolean $$8, long $$9) {
      super($$1, $$2, $$0.w(), $$3, $$6, true, $$8, $$9, 1000000);
      this.D = $$0;
      this.O = new fvs(this, $$4);
      this.H = new bpx();
      this.F = $$1;
      this.E = $$7;
      this.G = gbd.a($$3.a());
      this.a(new in(8, 64, 8), 0.0F);
      this.Q = $$5;
      this.T();
      this.W();
   }

   public void a(Runnable $$0) {
      this.P.add($$0);
   }

   public void b() {
      int $$0 = this.P.size();
      int $$1 = $$0 < 1000 ? Math.max(10, $$0 / 10) : $$0;

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Runnable $$3 = this.P.poll();
         if ($$3 == null) {
            break;
         }

         $$3.run();
      }
   }

   public boolean c() {
      return this.P.isEmpty();
   }

   public gbd d() {
      return this.G;
   }

   public void a(BooleanSupplier $$0) {
      this.C_().s();
      if (this.s().i()) {
         this.n();
      }

      if (this.M > 0) {
         this.c(this.M - 1);
      }

      this.af().a("blocks");
      this.O.a($$0, true);
      this.af().c();
   }

   private void n() {
      this.b(this.A.c() + 1L);
      if (this.A.o().b(czz.l)) {
         this.c(this.A.d() + 1L);
      }
   }

   public void b(long $$0) {
      this.F.a($$0);
   }

   public void c(long $$0) {
      if ($$0 < 0L) {
         $$0 = -$$0;
         this.aa().a(czz.l).a(false, null);
      } else {
         this.aa().a(czz.l).a(true, null);
      }

      this.F.b($$0);
   }

   public Iterable<brh> e() {
      return this.G().a();
   }

   public void f() {
      bma $$0 = this.af();
      $$0.a("entities");
      this.e.a($$0x -> {
         if (!$$0x.dI() && !$$0x.bP() && !this.H.a($$0x)) {
            this.a(this::a, $$0x);
         }
      });
      $$0.c();
      this.S();
   }

   @Override
   public boolean h(brh $$0) {
      return $$0.dp().a(this.I.s.dp()) <= this.Q;
   }

   public void a(brh $$0) {
      $$0.bs();
      $$0.ai++;
      this.af().a(() -> ld.g.b($$0.ai()).toString());
      $$0.l();
      this.af().c();

      for (brh $$1 : $$0.cQ()) {
         this.a($$0, $$1);
      }
   }

   private void a(brh $$0, brh $$1) {
      if ($$1.dI() || $$1.da() != $$0) {
         $$1.ac();
      } else if ($$1 instanceof clh || this.e.c($$1)) {
         $$1.bs();
         $$1.ai++;
         $$1.t();

         for (brh $$2 : $$1.cQ()) {
            this.a($$1, $$2);
         }
      }
   }

   public void a(dsn $$0) {
      $$0.I();
      this.O.p().a($$0.f(), false);
      this.f.b($$0.f());
   }

   public void a(czk $$0) {
      this.N.forEach(($$1, $$2) -> $$2.a($$0.e, $$0.f));
      this.f.a($$0);
      this.E.a($$0);
   }

   public void g() {
      this.N.forEach(($$0, $$1) -> $$1.a());
   }

   @Override
   public boolean b(int $$0, int $$1) {
      return true;
   }

   public int h() {
      return this.f.b();
   }

   public void c(brh $$0) {
      this.a($$0.aj(), brh.c.b);
      this.f.a($$0);
   }

   public void a(int $$0, brh.c $$1) {
      brh $$2 = this.G().a($$0);
      if ($$2 != null) {
         $$2.b($$1);
         $$2.ao();
      }
   }

   @Nullable
   @Override
   public brh a(int $$0) {
      return this.G().a($$0);
   }

   @Override
   public void X() {
      this.D.l().a(wu.c("multiplayer.status.quitting"));
   }

   public void b(int $$0, int $$1, int $$2) {
      int $$3 = 32;
      ayg $$4 = ayg.a();
      dde $$5 = this.p();
      in.a $$6 = new in.a();

      for (int $$7 = 0; $$7 < 667; $$7++) {
         this.a($$0, $$1, $$2, 16, $$4, $$5, $$6);
         this.a($$0, $$1, $$2, 32, $$4, $$5, $$6);
      }
   }

   @Nullable
   private dde p() {
      if (this.I.q.j() == daa.b) {
         csz $$0 = this.I.s.eV();
         csu $$1 = $$0.f();
         if (S.contains($$1) && $$1 instanceof cqx $$2) {
            return $$2.d();
         }
      }

      return null;
   }

   public void a(int $$0, int $$1, int $$2, int $$3, ayg $$4, @Nullable dde $$5, in.a $$6) {
      int $$7 = $$0 + this.z.a($$3) - this.z.a($$3);
      int $$8 = $$1 + this.z.a($$3) - this.z.a($$3);
      int $$9 = $$2 + this.z.a($$3) - this.z.a($$3);
      $$6.d($$7, $$8, $$9);
      dqh $$10 = this.a_($$6);
      $$10.b().a($$10, this, $$6, $$4);
      ema $$11 = this.b_($$6);
      if (!$$11.c()) {
         $$11.a(this, $$6, $$4);
         kv $$12 = $$11.h();
         if ($$12 != null && this.z.a(10) == 0) {
            boolean $$13 = $$10.d(this, $$6, is.a);
            in $$14 = $$6.d();
            this.a($$14, this.a_($$14), $$12, $$13);
         }
      }

      if ($$5 == $$10.b()) {
         this.a(new ko(kx.c, $$10), (double)$$7 + 0.5, (double)$$8 + 0.5, (double)$$9 + 0.5, 0.0, 0.0, 0.0);
      }

      if (!$$10.r(this, $$6)) {
         this.t($$6).a().k().ifPresent($$1x -> {
            if ($$1x.a(this.z)) {
               this.a($$1x.a(), (double)$$6.u() + this.z.j(), (double)$$6.v() + this.z.j(), (double)$$6.w() + this.z.j(), 0.0, 0.0, 0.0);
            }
         });
      }
   }

   private void a(in $$0, dqh $$1, kv $$2, boolean $$3) {
      if ($$1.u().c()) {
         eui $$4 = $$1.k(this, $$0);
         double $$5 = $$4.c(is.a.b);
         if ($$5 < 1.0) {
            if ($$3) {
               this.a((double)$$0.u(), (double)($$0.u() + 1), (double)$$0.w(), (double)($$0.w() + 1), (double)($$0.v() + 1) - 0.05, $$2);
            }
         } else if (!$$1.a(avr.ao)) {
            double $$6 = $$4.b(is.a.b);
            if ($$6 > 0.0) {
               this.a($$0, $$2, $$4, (double)$$0.v() + $$6 - 0.05);
            } else {
               in $$7 = $$0.d();
               dqh $$8 = this.a_($$7);
               eui $$9 = $$8.k(this, $$7);
               double $$10 = $$9.c(is.a.b);
               if ($$10 < 1.0 && $$8.u().c()) {
                  this.a($$0, $$2, $$4, (double)$$0.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(in $$0, kv $$1, eui $$2, double $$3) {
      this.a((double)$$0.u() + $$2.b(is.a.a), (double)$$0.u() + $$2.c(is.a.a), (double)$$0.w() + $$2.b(is.a.c), (double)$$0.w() + $$2.c(is.a.c), $$3, $$1);
   }

   private void a(double $$0, double $$1, double $$2, double $$3, double $$4, kv $$5) {
      this.a($$5, axz.d(this.z.j(), $$0, $$1), $$4, axz.d(this.z.j(), $$2, $$3), 0.0, 0.0, 0.0);
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Server brand", () -> this.I.s.h.g());
      $$1.a("Server type", () -> this.I.V() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server");
      $$1.a("Tracked entity count", () -> String.valueOf(this.h()));
      return $$1;
   }

   @Override
   public void a(@Nullable clh $$0, double $$1, double $$2, double $$3, iw<avb> $$4, avd $$5, float $$6, float $$7, long $$8) {
      if ($$0 == this.I.s) {
         this.a($$1, $$2, $$3, $$4.a(), $$5, $$6, $$7, false, $$8);
      }
   }

   @Override
   public void a(@Nullable clh $$0, brh $$1, iw<avb> $$2, avd $$3, float $$4, float $$5, long $$6) {
      if ($$0 == this.I.s) {
         this.I.ak().a((gqm)(new gqd($$2.a(), $$3, $$4, $$5, $$1, $$6)));
      }
   }

   @Override
   public void a(brh $$0, avb $$1, avd $$2, float $$3, float $$4) {
      this.I.ak().a((gqm)(new gqd($$1, $$2, $$3, $$4, $$0, this.z.g())));
   }

   @Override
   public void a(double $$0, double $$1, double $$2, avb $$3, avd $$4, float $$5, float $$6, boolean $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.z.g());
   }

   private void a(double $$0, double $$1, double $$2, avb $$3, avd $$4, float $$5, float $$6, boolean $$7, long $$8) {
      double $$9 = this.I.j.m().b().c($$0, $$1, $$2);
      gqh $$10 = new gqh($$3, $$4, $$5, $$6, ayg.a($$8), $$0, $$1, $$2);
      if ($$7 && $$9 > 100.0) {
         double $$11 = Math.sqrt($$9) / 40.0;
         this.I.ak().a($$10, (int)($$11 * 20.0));
      } else {
         this.I.ak().a($$10);
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<cvq> $$6) {
      if ($$6.isEmpty()) {
         for (int $$7 = 0; $$7 < this.z.a(3) + 2; $$7++) {
            this.a(kx.Y, $$0, $$1, $$2, this.z.k() * 0.05, 0.005, this.z.k() * 0.05);
         }
      } else {
         this.I.g.a(new fyn.e(this, $$0, $$1, $$2, $$3, $$4, $$5, this.I.g, $$6));
      }
   }

   @Override
   public void a(zb<?> $$0) {
      this.D.b($$0);
   }

   @Override
   public cxg r() {
      return this.D.k();
   }

   @Override
   public bpx s() {
      return this.H;
   }

   @Override
   public evc<dde> O() {
      return euz.b();
   }

   @Override
   public evc<elz> N() {
      return euz.b();
   }

   public fvs i() {
      return this.O;
   }

   @Nullable
   @Override
   public enp a(enn $$0) {
      return this.K.get($$0);
   }

   public void b(enn $$0, enp $$1) {
      this.K.put($$0, $$1);
   }

   @Override
   public void a(enn $$0, enp $$1) {
   }

   @Override
   public enn v() {
      return new enn(0);
   }

   @Override
   public eut L() {
      return this.D.z();
   }

   @Override
   public void a(in $$0, dqh $$1, dqh $$2, int $$3) {
      this.E.a(this, $$0, $$1, $$2, $$3);
   }

   @Override
   public void b(in $$0, dqh $$1, dqh $$2) {
      this.E.a($$0, $$1, $$2);
   }

   public void c(int $$0, int $$1, int $$2) {
      this.E.a($$0, $$1, $$2);
   }

   @Override
   public void a(int $$0, in $$1, int $$2) {
      this.E.c($$0, $$1, $$2);
   }

   @Override
   public void b(int $$0, in $$1, int $$2) {
      this.E.a($$0, $$1, $$2);
   }

   @Override
   public void a(@Nullable clh $$0, int $$1, in $$2, int $$3) {
      try {
         this.E.b($$1, $$2, $$3);
      } catch (Throwable var8) {
         o $$5 = o.a(var8, "Playing level event");
         p $$6 = $$5.a("Level event being played");
         $$6.a("Block coordinates", p.a(this, $$2));
         $$6.a("Event source", $$0);
         $$6.a("Event type", $$1);
         $$6.a("Event data", $$3);
         throw new y($$5);
      }
   }

   @Override
   public void a(kv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.E.a($$0, $$0.a().b(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void a(kv $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.E.a($$0, $$0.a().b() || $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void b(kv $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.E.a($$0, false, true, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void b(kv $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.E.a($$0, $$0.a().b() || $$1, true, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public List<gan> x() {
      return this.J;
   }

   @Override
   public iw<dbc> a(int $$0, int $$1, int $$2) {
      return this.H_().d(le.az).g(dbj.b);
   }

   public float g(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (axz.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.2F);
      $$2 = axz.a($$2, 0.0F, 1.0F);
      $$2 = 1.0F - $$2;
      $$2 *= 1.0F - this.d($$0) * 5.0F / 16.0F;
      $$2 *= 1.0F - this.b($$0) * 5.0F / 16.0F;
      return $$2 * 0.8F + 0.2F;
   }

   public etp a(etp $$0, float $$1) {
      float $$2 = this.f($$1);
      etp $$3 = $$0.a(2.0, 2.0, 2.0).a(0.25);
      dbe $$4 = this.F_();
      etp $$5 = axa.a($$3, ($$1x, $$2x, $$3x) -> etp.a($$4.a($$1x, $$2x, $$3x).a().a()));
      float $$6 = axz.b($$2 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$6 = axz.a($$6, 0.0F, 1.0F);
      float $$7 = (float)$$5.c * $$6;
      float $$8 = (float)$$5.d * $$6;
      float $$9 = (float)$$5.e * $$6;
      float $$10 = this.d($$1);
      if ($$10 > 0.0F) {
         float $$11 = ($$7 * 0.3F + $$8 * 0.59F + $$9 * 0.11F) * 0.6F;
         float $$12 = 1.0F - $$10 * 0.75F;
         $$7 = $$7 * $$12 + $$11 * (1.0F - $$12);
         $$8 = $$8 * $$12 + $$11 * (1.0F - $$12);
         $$9 = $$9 * $$12 + $$11 * (1.0F - $$12);
      }

      float $$13 = this.b($$1);
      if ($$13 > 0.0F) {
         float $$14 = ($$7 * 0.3F + $$8 * 0.59F + $$9 * 0.11F) * 0.2F;
         float $$15 = 1.0F - $$13 * 0.75F;
         $$7 = $$7 * $$15 + $$14 * (1.0F - $$15);
         $$8 = $$8 * $$15 + $$14 * (1.0F - $$15);
         $$9 = $$9 * $$15 + $$14 * (1.0F - $$15);
      }

      int $$16 = this.j();
      if ($$16 > 0) {
         float $$17 = (float)$$16 - $$1;
         if ($$17 > 1.0F) {
            $$17 = 1.0F;
         }

         $$17 *= 0.45F;
         $$7 = $$7 * (1.0F - $$17) + 0.8F * $$17;
         $$8 = $$8 * (1.0F - $$17) + 0.8F * $$17;
         $$9 = $$9 * (1.0F - $$17) + 1.0F * $$17;
      }

      return new etp((double)$$7, (double)$$8, (double)$$9);
   }

   public etp h(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = axz.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$2 = axz.a($$2, 0.0F, 1.0F);
      float $$3 = 1.0F;
      float $$4 = 1.0F;
      float $$5 = 1.0F;
      float $$6 = this.d($$0);
      if ($$6 > 0.0F) {
         float $$7 = ($$3 * 0.3F + $$4 * 0.59F + $$5 * 0.11F) * 0.6F;
         float $$8 = 1.0F - $$6 * 0.95F;
         $$3 = $$3 * $$8 + $$7 * (1.0F - $$8);
         $$4 = $$4 * $$8 + $$7 * (1.0F - $$8);
         $$5 = $$5 * $$8 + $$7 * (1.0F - $$8);
      }

      $$3 *= $$2 * 0.9F + 0.1F;
      $$4 *= $$2 * 0.9F + 0.1F;
      $$5 *= $$2 * 0.85F + 0.15F;
      float $$9 = this.b($$0);
      if ($$9 > 0.0F) {
         float $$10 = ($$3 * 0.3F + $$4 * 0.59F + $$5 * 0.11F) * 0.2F;
         float $$11 = 1.0F - $$9 * 0.95F;
         $$3 = $$3 * $$11 + $$10 * (1.0F - $$11);
         $$4 = $$4 * $$11 + $$10 * (1.0F - $$11);
         $$5 = $$5 * $$11 + $$10 * (1.0F - $$11);
      }

      return new etp((double)$$3, (double)$$4, (double)$$5);
   }

   public float i(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (axz.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.25F);
      $$2 = axz.a($$2, 0.0F, 1.0F);
      return $$2 * $$2 * 0.5F;
   }

   public int j() {
      return this.I.m.b().c() ? 0 : this.M;
   }

   @Override
   public void c(int $$0) {
      this.M = $$0;
   }

   @Override
   public float a(is $$0, boolean $$1) {
      boolean $$2 = this.d().e();
      if (!$$1) {
         return $$2 ? 0.9F : 1.0F;
      } else {
         switch ($$0) {
            case a:
               return $$2 ? 0.9F : 0.5F;
            case b:
               return $$2 ? 0.9F : 1.0F;
            case c:
            case d:
               return 0.8F;
            case e:
            case f:
               return 0.6F;
            default:
               return 1.0F;
         }
      }
   }

   @Override
   public int a(in $$0, czo $$1) {
      fej $$2 = (fej)this.N.get($$1);
      return $$2.a($$0);
   }

   public int b(in $$0, czo $$1) {
      int $$2 = fde.Q().m.E().c();
      if ($$2 == 0) {
         return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
      } else {
         int $$3 = ($$2 * 2 + 1) * ($$2 * 2 + 1);
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         ip $$7 = new ip($$0.u() - $$2, $$0.v(), $$0.w() - $$2, $$0.u() + $$2, $$0.v(), $$0.w() + $$2);
         in.a $$8 = new in.a();

         while ($$7.a()) {
            $$8.d($$7.b(), $$7.c(), $$7.d());
            int $$9 = $$1.getColor(this.t($$8).a(), (double)$$8.u(), (double)$$8.w());
            $$4 += ($$9 & 0xFF0000) >> 16;
            $$5 += ($$9 & 0xFF00) >> 8;
            $$6 += $$9 & 0xFF;
         }

         return ($$4 / $$3 & 0xFF) << 16 | ($$5 / $$3 & 0xFF) << 8 | $$6 / $$3 & 0xFF;
      }
   }

   public void a(in $$0, float $$1) {
      this.A.a($$0, $$1);
   }

   @Override
   public String toString() {
      return "ClientLevel";
   }

   public fvw.a k() {
      return this.F;
   }

   @Override
   public void a(iw<dva> $$0, etp $$1, dva.a $$2) {
   }

   protected Map<enn, enp> l() {
      return ImmutableMap.copyOf(this.K);
   }

   protected void a(Map<enn, enp> $$0) {
      this.K.putAll($$0);
   }

   @Override
   protected duq<brh> G() {
      return this.f.a();
   }

   @Override
   public String I() {
      return "Chunks[C] W: " + this.O.e() + " E: " + this.f.c();
   }

   @Override
   public void a(in $$0, dqh $$1) {
      this.I.g.a($$0, $$1);
   }

   public void h(int $$0) {
      this.Q = $$0;
   }

   public int m() {
      return this.Q;
   }

   @Override
   public cnu J() {
      return this.D.y();
   }

   public static class a implements eoi {
      private final boolean a;
      private final czz b;
      private final boolean c;
      private in d;
      private float e;
      private long f;
      private long g;
      private boolean h;
      private bpj i;
      private boolean j;

      public a(bpj $$0, boolean $$1, boolean $$2) {
         this.i = $$0;
         this.a = $$1;
         this.c = $$2;
         this.b = new czz();
      }

      @Override
      public in a() {
         return this.d;
      }

      @Override
      public float b() {
         return this.e;
      }

      @Override
      public long c() {
         return this.f;
      }

      @Override
      public long d() {
         return this.g;
      }

      public void a(long $$0) {
         this.f = $$0;
      }

      public void b(long $$0) {
         this.g = $$0;
      }

      @Override
      public void a(in $$0, float $$1) {
         this.d = $$0.i();
         this.e = $$1;
      }

      @Override
      public boolean g() {
         return false;
      }

      @Override
      public boolean i() {
         return this.h;
      }

      @Override
      public void b(boolean $$0) {
         this.h = $$0;
      }

      @Override
      public boolean l() {
         return this.a;
      }

      @Override
      public czz o() {
         return this.b;
      }

      @Override
      public bpj q() {
         return this.i;
      }

      @Override
      public boolean r() {
         return this.j;
      }

      @Override
      public void a(p $$0, daf $$1) {
         eoi.super.a($$0, $$1);
      }

      public void a(bpj $$0) {
         this.i = $$0;
      }

      public void a(boolean $$0) {
         this.j = $$0;
      }

      public double a(daf $$0) {
         return this.c ? (double)$$0.I_() : 63.0;
      }

      public float e() {
         return this.c ? 1.0F : 0.03125F;
      }
   }

   final class b implements dup<brh> {
      public void a(brh $$0) {
      }

      public void b(brh $$0) {
      }

      public void c(brh $$0) {
         fvw.this.e.a($$0);
      }

      public void d(brh $$0) {
         fvw.this.e.b($$0);
      }

      public void e(brh $$0) {
         if ($$0 instanceof gan) {
            fvw.this.J.add((gan)$$0);
         }
      }

      public void f(brh $$0) {
         $$0.ag();
         fvw.this.J.remove($$0);
      }

      public void g(brh $$0) {
      }
   }
}
