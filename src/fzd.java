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

public class fzd extends dcw {
   private static final Logger a = LogUtils.getLogger();
   private static final double b = 0.05;
   private static final int c = 10;
   private static final int d = 1000;
   final dxm e = new dxm();
   private final dxs<bsr> f = new dxs<>(bsr.class, new fzd.b());
   private final fze D;
   private final gev E;
   private final fzd.a F;
   private final gem G;
   private final brc H;
   private final fgm I = fgm.Q();
   final List<gdw> J = Lists.newArrayList();
   private final Map<eqp, eqr> K = Maps.newHashMap();
   private static final long L = 16777215L;
   private int M;
   private final Object2ObjectArrayMap<dch, fhp> N = ad.a(new Object2ObjectArrayMap(3), $$0x -> {
      $$0x.put(gej.a, new fhp($$0xx -> this.b($$0xx, gej.a)));
      $$0x.put(gej.b, new fhp($$0xx -> this.b($$0xx, gej.b)));
      $$0x.put(gej.c, new fhp($$0xx -> this.b($$0xx, gej.c)));
   });
   private final fyz O;
   private final Deque<Runnable> P = Queues.newArrayDeque();
   private int Q;
   private final gaq R = new gaq();
   private static final Set<cul> S = Set.of(cut.hB, cut.hC);

   public void b(int $$0) {
      this.R.a($$0, this);
   }

   public void b(jd $$0, dtc $$1, int $$2) {
      if (!this.R.a($$0, $$1)) {
         super.a($$0, $$1, $$2, 512);
      }
   }

   public void a(jd $$0, dtc $$1, exa $$2) {
      dtc $$3 = this.a_($$0);
      if ($$3 != $$1) {
         this.a($$0, $$1, 19);
         cmx $$4 = this.I.s;
         if (this == $$4.dP() && $$4.a($$0, $$1)) {
            $$4.h($$2.c, $$2.d, $$2.e);
         }
      }
   }

   gaq a() {
      return this.R;
   }

   @Override
   public boolean a(jd $$0, dtc $$1, int $$2, int $$3) {
      if (this.R.c()) {
         dtc $$4 = this.a_($$0);
         boolean $$5 = super.a($$0, $$1, $$2, $$3);
         if ($$5) {
            this.R.a($$0, $$4, this.I.s);
         }

         return $$5;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   public fzd(fze $$0, fzd.a $$1, akq<dcw> $$2, jm<dwy> $$3, int $$4, int $$5, Supplier<bnf> $$6, gev $$7, boolean $$8, long $$9) {
      super($$1, $$2, $$0.v(), $$3, $$6, true, $$8, $$9, 1000000);
      this.D = $$0;
      this.O = new fyz(this, $$4);
      this.H = new brc();
      this.F = $$1;
      this.E = $$7;
      this.G = gem.a($$3.a());
      this.a(new jd(8, 64, 8), 0.0F);
      this.Q = $$5;
      this.U();
      this.X();
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

   public gem d() {
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

      this.ag().a("blocks");
      this.O.a($$0, true);
      this.ag().c();
   }

   private void n() {
      this.b(this.A.c() + 1L);
      if (this.A.o().b(dcs.l)) {
         this.c(this.A.d() + 1L);
      }
   }

   public void b(long $$0) {
      this.F.a($$0);
   }

   public void c(long $$0) {
      if ($$0 < 0L) {
         $$0 = -$$0;
         this.ab().a(dcs.l).a(false, null);
      } else {
         this.ab().a(dcs.l).a(true, null);
      }

      this.F.b($$0);
   }

   public Iterable<bsr> e() {
      return this.G().a();
   }

   public void f() {
      bnf $$0 = this.ag();
      $$0.a("entities");
      this.e.a($$0x -> {
         if (!$$0x.dK() && !$$0x.bS() && !this.H.a($$0x)) {
            this.a(this::a, $$0x);
         }
      });
      $$0.c();
      this.T();
   }

   @Override
   public boolean h(bsr $$0) {
      return $$0.dr().a(this.I.s.dr()) <= this.Q;
   }

   public void a(bsr $$0) {
      $$0.bv();
      $$0.ai++;
      this.ag().a(() -> lt.f.b($$0.am()).toString());
      $$0.l();
      this.ag().c();

      for (bsr $$1 : $$0.cT()) {
         this.a($$0, $$1);
      }
   }

   private void a(bsr $$0, bsr $$1) {
      if ($$1.dK() || $$1.dd() != $$0) {
         $$1.ad();
      } else if ($$1 instanceof cmx || this.e.c($$1)) {
         $$1.bv();
         $$1.ai++;
         $$1.u();

         for (bsr $$2 : $$1.cT()) {
            this.a($$1, $$2);
         }
      }
   }

   public void a(dvi $$0) {
      $$0.I();
      this.O.p().a($$0.f(), false);
      this.f.b($$0.f());
   }

   public void a(dcd $$0) {
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

   public void c(bsr $$0) {
      this.a($$0.an(), bsr.c.b);
      this.f.a($$0);
   }

   public void a(int $$0, bsr.c $$1) {
      bsr $$2 = this.G().a($$0);
      if ($$2 != null) {
         $$2.b($$1);
         $$2.as();
      }
   }

   @Nullable
   @Override
   public bsr a(int $$0) {
      return this.G().a($$0);
   }

   @Override
   public void Y() {
      this.D.k().a(wz.c("multiplayer.status.quitting"));
   }

   public void b(int $$0, int $$1, int $$2) {
      int $$3 = 32;
      ayw $$4 = ayw.a();
      dfy $$5 = this.p();
      jd.a $$6 = new jd.a();

      for (int $$7 = 0; $$7 < 667; $$7++) {
         this.a($$0, $$1, $$2, 16, $$4, $$5, $$6);
         this.a($$0, $$1, $$2, 32, $$4, $$5, $$6);
      }
   }

   @Nullable
   private dfy p() {
      if (this.I.q.j() == dct.b) {
         cuq $$0 = this.I.s.eU();
         cul $$1 = $$0.g();
         if (S.contains($$1) && $$1 instanceof cso $$2) {
            return $$2.d();
         }
      }

      return null;
   }

   public void a(int $$0, int $$1, int $$2, int $$3, ayw $$4, @Nullable dfy $$5, jd.a $$6) {
      int $$7 = $$0 + this.z.a($$3) - this.z.a($$3);
      int $$8 = $$1 + this.z.a($$3) - this.z.a($$3);
      int $$9 = $$2 + this.z.a($$3) - this.z.a($$3);
      $$6.d($$7, $$8, $$9);
      dtc $$10 = this.a_($$6);
      $$10.b().a($$10, this, $$6, $$4);
      epc $$11 = this.b_($$6);
      if (!$$11.c()) {
         $$11.a(this, $$6, $$4);
         lk $$12 = $$11.h();
         if ($$12 != null && this.z.a(10) == 0) {
            boolean $$13 = $$10.d(this, $$6, ji.a);
            jd $$14 = $$6.e();
            this.a($$14, this.a_($$14), $$12, $$13);
         }
      }

      if ($$5 == $$10.b()) {
         this.a(new le(lm.c, $$10), (double)$$7 + 0.5, (double)$$8 + 0.5, (double)$$9 + 0.5, 0.0, 0.0, 0.0);
      }

      if (!$$10.r(this, $$6)) {
         this.t($$6).a().k().ifPresent($$1x -> {
            if ($$1x.a(this.z)) {
               this.a($$1x.a(), (double)$$6.u() + this.z.j(), (double)$$6.v() + this.z.j(), (double)$$6.w() + this.z.j(), 0.0, 0.0, 0.0);
            }
         });
      }
   }

   private void a(jd $$0, dtc $$1, lk $$2, boolean $$3) {
      if ($$1.u().c()) {
         ext $$4 = $$1.k(this, $$0);
         double $$5 = $$4.c(ji.a.b);
         if ($$5 < 1.0) {
            if ($$3) {
               this.a((double)$$0.u(), (double)($$0.u() + 1), (double)$$0.w(), (double)($$0.w() + 1), (double)($$0.v() + 1) - 0.05, $$2);
            }
         } else if (!$$1.a(awe.ao)) {
            double $$6 = $$4.b(ji.a.b);
            if ($$6 > 0.0) {
               this.a($$0, $$2, $$4, (double)$$0.v() + $$6 - 0.05);
            } else {
               jd $$7 = $$0.e();
               dtc $$8 = this.a_($$7);
               ext $$9 = $$8.k(this, $$7);
               double $$10 = $$9.c(ji.a.b);
               if ($$10 < 1.0 && $$8.u().c()) {
                  this.a($$0, $$2, $$4, (double)$$0.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(jd $$0, lk $$1, ext $$2, double $$3) {
      this.a((double)$$0.u() + $$2.b(ji.a.a), (double)$$0.u() + $$2.c(ji.a.a), (double)$$0.w() + $$2.b(ji.a.c), (double)$$0.w() + $$2.c(ji.a.c), $$3, $$1);
   }

   private void a(double $$0, double $$1, double $$2, double $$3, double $$4, lk $$5) {
      this.a($$5, ayo.d(this.z.j(), $$0, $$1), $$4, ayo.d(this.z.j(), $$2, $$3), 0.0, 0.0, 0.0);
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Server brand", () -> this.I.s.h.f());
      $$1.a("Server type", () -> this.I.V() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server");
      $$1.a("Tracked entity count", () -> String.valueOf(this.h()));
      return $$1;
   }

   @Override
   public void a(@Nullable cmx $$0, double $$1, double $$2, double $$3, jm<avo> $$4, avq $$5, float $$6, float $$7, long $$8) {
      if ($$0 == this.I.s) {
         this.a($$1, $$2, $$3, $$4.a(), $$5, $$6, $$7, false, $$8);
      }
   }

   @Override
   public void a(@Nullable cmx $$0, bsr $$1, jm<avo> $$2, avq $$3, float $$4, float $$5, long $$6) {
      if ($$0 == this.I.s) {
         this.I.aj().a((gty)(new gtp($$2.a(), $$3, $$4, $$5, $$1, $$6)));
      }
   }

   @Override
   public void a(bsr $$0, avo $$1, avq $$2, float $$3, float $$4) {
      this.I.aj().a((gty)(new gtp($$1, $$2, $$3, $$4, $$0, this.z.g())));
   }

   @Override
   public void a(double $$0, double $$1, double $$2, avo $$3, avq $$4, float $$5, float $$6, boolean $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.z.g());
   }

   private void a(double $$0, double $$1, double $$2, avo $$3, avq $$4, float $$5, float $$6, boolean $$7, long $$8) {
      double $$9 = this.I.j.l().b().c($$0, $$1, $$2);
      gtt $$10 = new gtt($$3, $$4, $$5, $$6, ayw.a($$8), $$0, $$1, $$2);
      if ($$7 && $$9 > 100.0) {
         double $$11 = Math.sqrt($$9) / 40.0;
         this.I.aj().a($$10, (int)($$11 * 20.0));
      } else {
         this.I.aj().a($$10);
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<cxl> $$6) {
      if ($$6.isEmpty()) {
         for (int $$7 = 0; $$7 < this.z.a(3) + 2; $$7++) {
            this.a(lm.ab, $$0, $$1, $$2, this.z.k() * 0.05, 0.005, this.z.k() * 0.05);
         }
      } else {
         this.I.g.a(new gbv.e(this, $$0, $$1, $$2, $$3, $$4, $$5, this.I.g, $$6));
      }
   }

   @Override
   public void a(zg<?> $$0) {
      this.D.b($$0);
   }

   @Override
   public czd r() {
      return this.D.j();
   }

   @Override
   public brc s() {
      return this.H;
   }

   @Override
   public eyn<dfy> P() {
      return eyk.b();
   }

   @Override
   public eyn<epb> O() {
      return eyk.b();
   }

   public fyz i() {
      return this.O;
   }

   @Nullable
   @Override
   public eqr a(eqp $$0) {
      return this.K.get($$0);
   }

   public void b(eqp $$0, eqr $$1) {
      this.K.put($$0, $$1);
   }

   @Override
   public void a(eqp $$0, eqr $$1) {
   }

   @Override
   public eqp v() {
      return new eqp(0);
   }

   @Override
   public eye M() {
      return this.D.y();
   }

   @Override
   public void a(jd $$0, dtc $$1, dtc $$2, int $$3) {
      this.E.a(this, $$0, $$1, $$2, $$3);
   }

   @Override
   public void b(jd $$0, dtc $$1, dtc $$2) {
      this.E.a($$0, $$1, $$2);
   }

   public void c(int $$0, int $$1, int $$2) {
      this.E.a($$0, $$1, $$2);
   }

   @Override
   public void a(int $$0, jd $$1, int $$2) {
      this.E.c($$0, $$1, $$2);
   }

   @Override
   public void b(int $$0, jd $$1, int $$2) {
      this.E.a($$0, $$1, $$2);
   }

   @Override
   public void a(@Nullable cmx $$0, int $$1, jd $$2, int $$3) {
      try {
         this.E.b($$1, $$2, $$3);
      } catch (Throwable var8) {
         o $$5 = o.a(var8, "Playing level event");
         p $$6 = $$5.a("Level event being played");
         $$6.a("Block coordinates", p.a(this, $$2));
         $$6.a("Event source", $$0);
         $$6.a("Event type", $$1);
         $$6.a("Event data", $$3);
         throw new z($$5);
      }
   }

   @Override
   public void a(lk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.E.a($$0, $$0.a().b(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void a(lk $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.E.a($$0, $$0.a().b() || $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void b(lk $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.E.a($$0, false, true, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void b(lk $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.E.a($$0, $$0.a().b() || $$1, true, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public List<gdw> x() {
      return this.J;
   }

   @Override
   public jm<ddw> a(int $$0, int $$1, int $$2) {
      return this.H_().d(lu.aF).g(ded.b);
   }

   public float g(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (ayo.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.2F);
      $$2 = ayo.a($$2, 0.0F, 1.0F);
      $$2 = 1.0F - $$2;
      $$2 *= 1.0F - this.d($$0) * 5.0F / 16.0F;
      $$2 *= 1.0F - this.b($$0) * 5.0F / 16.0F;
      return $$2 * 0.8F + 0.2F;
   }

   public exa a(exa $$0, float $$1) {
      float $$2 = this.f($$1);
      exa $$3 = $$0.a(2.0, 2.0, 2.0).a(0.25);
      ddy $$4 = this.F_();
      exa $$5 = axo.a($$3, ($$1x, $$2x, $$3x) -> exa.a($$4.a($$1x, $$2x, $$3x).a().a()));
      float $$6 = ayo.b($$2 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$6 = ayo.a($$6, 0.0F, 1.0F);
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

      return new exa((double)$$7, (double)$$8, (double)$$9);
   }

   public exa h(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = ayo.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$2 = ayo.a($$2, 0.0F, 1.0F);
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

      return new exa((double)$$3, (double)$$4, (double)$$5);
   }

   public float i(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (ayo.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.25F);
      $$2 = ayo.a($$2, 0.0F, 1.0F);
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
   public float a(ji $$0, boolean $$1) {
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
   public int a(jd $$0, dch $$1) {
      fhp $$2 = (fhp)this.N.get($$1);
      return $$2.a($$0);
   }

   public int b(jd $$0, dch $$1) {
      int $$2 = fgm.Q().m.E().c();
      if ($$2 == 0) {
         return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
      } else {
         int $$3 = ($$2 * 2 + 1) * ($$2 * 2 + 1);
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         jf $$7 = new jf($$0.u() - $$2, $$0.v(), $$0.w() - $$2, $$0.u() + $$2, $$0.v(), $$0.w() + $$2);
         jd.a $$8 = new jd.a();

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

   public void a(jd $$0, float $$1) {
      this.A.a($$0, $$1);
   }

   @Override
   public String toString() {
      return "ClientLevel";
   }

   public fzd.a k() {
      return this.F;
   }

   @Override
   public void a(jm<dxz> $$0, exa $$1, dxz.a $$2) {
   }

   protected Map<eqp, eqr> l() {
      return ImmutableMap.copyOf(this.K);
   }

   protected void a(Map<eqp, eqr> $$0) {
      this.K.putAll($$0);
   }

   @Override
   protected dxp<bsr> G() {
      return this.f.a();
   }

   @Override
   public String I() {
      return "Chunks[C] W: " + this.O.e() + " E: " + this.f.c();
   }

   @Override
   public void a(jd $$0, dtc $$1) {
      this.I.g.a($$0, $$1);
   }

   public void h(int $$0) {
      this.Q = $$0;
   }

   public int m() {
      return this.Q;
   }

   @Override
   public cpl J() {
      return this.D.x();
   }

   @Override
   public cwt K() {
      return this.D.z();
   }

   public static class a implements erk {
      private final boolean a;
      private final dcs b;
      private final boolean c;
      private jd d;
      private float e;
      private long f;
      private long g;
      private boolean h;
      private bqo i;
      private boolean j;

      public a(bqo $$0, boolean $$1, boolean $$2) {
         this.i = $$0;
         this.a = $$1;
         this.c = $$2;
         this.b = new dcs();
      }

      @Override
      public jd a() {
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
      public void a(jd $$0, float $$1) {
         this.d = $$0.j();
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
      public dcs o() {
         return this.b;
      }

      @Override
      public bqo q() {
         return this.i;
      }

      @Override
      public boolean r() {
         return this.j;
      }

      @Override
      public void a(p $$0, dcy $$1) {
         erk.super.a($$0, $$1);
      }

      public void a(bqo $$0) {
         this.i = $$0;
      }

      public void a(boolean $$0) {
         this.j = $$0;
      }

      public double a(dcy $$0) {
         return this.c ? (double)$$0.I_() : 63.0;
      }

      public float e() {
         return this.c ? 1.0F : 0.03125F;
      }
   }

   final class b implements dxo<bsr> {
      public void a(bsr $$0) {
      }

      public void b(bsr $$0) {
      }

      public void c(bsr $$0) {
         fzd.this.e.a($$0);
      }

      public void d(bsr $$0) {
         fzd.this.e.b($$0);
      }

      public void e(bsr $$0) {
         if ($$0 instanceof gdw) {
            fzd.this.J.add((gdw)$$0);
         }
      }

      public void f(bsr $$0) {
         $$0.ak();
         fzd.this.J.remove($$0);
      }

      public void g(bsr $$0) {
      }
   }
}
