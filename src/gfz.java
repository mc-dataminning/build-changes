import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.function.BooleanSupplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gfz extends dgi {
   private static final Logger a = LogUtils.getLogger();
   private static final double b = 0.05;
   private static final int c = 10;
   private static final int d = 1000;
   final ebg e = new ebg();
   private final ebm<bul> f = new ebm<>(bul.class, new gfz.b());
   private final gga E;
   private final glu F;
   private final glt G;
   private final gfz.a H;
   private final gll I;
   private final bst J;
   private final flj K = flj.Q();
   final List<gkt> L = Lists.newArrayList();
   final List<cjs> M = Lists.newArrayList();
   private final Map<eur, eut> N = Maps.newHashMap();
   private static final int O = -1;
   private int P;
   private final Object2ObjectArrayMap<dfs, fmm> Q = af.a(new Object2ObjectArrayMap(3), $$0x -> {
      $$0x.put(glg.a, new fmm($$0xx -> this.b($$0xx, glg.a)));
      $$0x.put(glg.b, new fmm($$0xx -> this.b($$0xx, glg.b)));
      $$0x.put(glg.c, new fmm($$0xx -> this.b($$0xx, glg.c)));
   });
   private final gfv R;
   private final Deque<Runnable> S = Queues.newArrayDeque();
   private int T;
   private final ghm U = new ghm();
   private final int V;
   private boolean W;
   private static final Set<cwl> X = Set.of(cwt.hY, cwt.hZ);

   public void b(int $$0) {
      this.U.a($$0, this);
   }

   public void b(ji $$0, dwx $$1, int $$2) {
      if (!this.U.a($$0, $$1)) {
         super.a($$0, $$1, $$2, 512);
      }
   }

   public void a(ji $$0, dwx $$1, fba $$2) {
      dwx $$3 = this.a_($$0);
      if ($$3 != $$1) {
         this.a($$0, $$1, 19);
         cox $$4 = this.K.t;
         if (this == $$4.dV() && $$4.a($$0, $$1)) {
            $$4.h($$2.d, $$2.e, $$2.f);
         }
      }
   }

   ghm a() {
      return this.U;
   }

   @Override
   public boolean a(ji $$0, dwx $$1, int $$2, int $$3) {
      if (this.U.c()) {
         dwx $$4 = this.a_($$0);
         boolean $$5 = super.a($$0, $$1, $$2, $$3);
         if ($$5) {
            this.U.a($$0, $$4, this.K.t);
         }

         return $$5;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   public gfz(gga $$0, gfz.a $$1, aku<dgi> $$2, jr<eas> $$3, int $$4, int $$5, glu $$6, boolean $$7, long $$8, int $$9) {
      super($$1, $$2, $$0.v(), $$3, true, $$7, $$8, 1000000);
      this.E = $$0;
      this.R = new gfv(this, $$4);
      this.J = new bst();
      this.H = $$1;
      this.F = $$6;
      this.V = $$9;
      this.G = new glt(this.K, this, $$6);
      this.I = gll.a($$3.a());
      this.a(new ji(8, 64, 8), 0.0F);
      this.T = $$5;
      this.Y();
      this.ab();
   }

   public void a(Runnable $$0) {
      this.S.add($$0);
   }

   public void b() {
      int $$0 = this.S.size();
      int $$1 = $$0 < 1000 ? Math.max(10, $$0 / 10) : $$0;

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Runnable $$3 = this.S.poll();
         if ($$3 == null) {
            break;
         }

         $$3.run();
      }
   }

   public gll c() {
      return this.I;
   }

   public void a(BooleanSupplier $$0) {
      this.F_().s();
      this.Y();
      if (this.u().i()) {
         this.n();
      }

      if (this.P > 0) {
         this.c(this.P - 1);
      }

      try (boy $$1 = bos.a().d("blocks")) {
         this.R.a($$0, true);
      }
   }

   private void n() {
      this.H.a(this.H.c() + 1L);
      if (this.W) {
         this.H.b(this.H.d() + 1L);
      }
   }

   public void a(long $$0, long $$1, boolean $$2) {
      this.H.a($$0);
      this.H.b($$1);
      this.W = $$2;
   }

   public Iterable<bul> d() {
      return this.H().a();
   }

   public void e() {
      bot $$0 = bos.a();
      $$0.a("entities");
      this.e.a($$0x -> {
         if (!$$0x.dQ() && !$$0x.bZ() && !this.J.a($$0x)) {
            this.a(this::c, $$0x);
         }
      });
      $$0.c();
      this.X();
   }

   public boolean a(bul $$0) {
      return this.e.c($$0);
   }

   @Override
   public boolean h(bul $$0) {
      return $$0.dx().a(this.K.t.dx()) <= this.T;
   }

   public void c(bul $$0) {
      $$0.bz();
      $$0.af++;
      bos.a().a(() -> mb.f.b($$0.aq()).toString());
      $$0.h();
      bos.a().c();

      for (bul $$1 : $$0.cY()) {
         this.a($$0, $$1);
      }
   }

   private void a(bul $$0, bul $$1) {
      if ($$1.dQ() || $$1.dk() != $$0) {
         $$1.ae();
      } else if ($$1 instanceof cox || this.e.c($$1)) {
         $$1.bz();
         $$1.af++;
         $$1.r();

         for (bul $$2 : $$1.cY()) {
            this.a($$1, $$2);
         }
      }
   }

   public void a(dzc $$0) {
      $$0.J();
      this.R.p().a($$0.f(), false);
      this.f.b($$0.f());
   }

   public void a(dfo $$0) {
      this.Q.forEach(($$1, $$2) -> $$2.a($$0.h, $$0.i));
      this.f.a($$0);
   }

   public void b(long $$0) {
      this.F.a($$0);
   }

   public void f() {
      this.Q.forEach(($$0, $$1) -> $$1.a());
   }

   @Override
   public boolean b(int $$0, int $$1) {
      return true;
   }

   public int g() {
      return this.f.b();
   }

   public void d(bul $$0) {
      this.a($$0.ar(), bul.d.b);
      this.f.a($$0);
   }

   public void a(int $$0, bul.d $$1) {
      bul $$2 = this.H().a($$0);
      if ($$2 != null) {
         $$2.c($$1);
         $$2.av();
      }
   }

   @Nullable
   @Override
   public bul a(int $$0) {
      return this.H().a($$0);
   }

   @Override
   public void ac() {
      this.E.k().a(wp.c("multiplayer.status.quitting"));
   }

   public void b(int $$0, int $$1, int $$2) {
      int $$3 = 32;
      azh $$4 = azh.a();
      djm $$5 = this.o();
      ji.a $$6 = new ji.a();

      for (int $$7 = 0; $$7 < 667; $$7++) {
         this.a($$0, $$1, $$2, 16, $$4, $$5, $$6);
         this.a($$0, $$1, $$2, 32, $$4, $$5, $$6);
      }
   }

   @Nullable
   private djm o() {
      if (this.K.r.j() == dgf.b) {
         cwp $$0 = this.K.t.eZ();
         cwl $$1 = $$0.h();
         if (X.contains($$1) && $$1 instanceof cuv $$2) {
            return $$2.d();
         }
      }

      return null;
   }

   public void a(int $$0, int $$1, int $$2, int $$3, azh $$4, @Nullable djm $$5, ji.a $$6) {
      int $$7 = $$0 + this.A.a($$3) - this.A.a($$3);
      int $$8 = $$1 + this.A.a($$3) - this.A.a($$3);
      int $$9 = $$2 + this.A.a($$3) - this.A.a($$3);
      $$6.d($$7, $$8, $$9);
      dwx $$10 = this.a_($$6);
      $$10.b().a($$10, this, $$6, $$4);
      esz $$11 = this.b_($$6);
      if (!$$11.c()) {
         $$11.a(this, $$6, $$4);
         lr $$12 = $$11.h();
         if ($$12 != null && this.A.a(10) == 0) {
            boolean $$13 = $$10.c(this, $$6, jn.a);
            ji $$14 = $$6.e();
            this.a($$14, this.a_($$14), $$12, $$13);
         }
      }

      if ($$5 == $$10.b()) {
         this.a(new ll(lt.c, $$10), (double)$$7 + 0.5, (double)$$8 + 0.5, (double)$$9 + 0.5, 0.0, 0.0, 0.0);
      }

      if (!$$10.m(this, $$6)) {
         this.t($$6).a().k().ifPresent($$1x -> {
            if ($$1x.a(this.A)) {
               this.a($$1x.a(), (double)$$6.u() + this.A.j(), (double)$$6.v() + this.A.j(), (double)$$6.w() + this.A.j(), 0.0, 0.0, 0.0);
            }
         });
      }
   }

   private void a(ji $$0, dwx $$1, lr $$2, boolean $$3) {
      if ($$1.y().c()) {
         fbu $$4 = $$1.g(this, $$0);
         double $$5 = $$4.c(jn.a.b);
         if ($$5 < 1.0) {
            if ($$3) {
               this.a((double)$$0.u(), (double)($$0.u() + 1), (double)$$0.w(), (double)($$0.w() + 1), (double)($$0.v() + 1) - 0.05, $$2);
            }
         } else if (!$$1.a(awp.ar)) {
            double $$6 = $$4.b(jn.a.b);
            if ($$6 > 0.0) {
               this.a($$0, $$2, $$4, (double)$$0.v() + $$6 - 0.05);
            } else {
               ji $$7 = $$0.e();
               dwx $$8 = this.a_($$7);
               fbu $$9 = $$8.g(this, $$7);
               double $$10 = $$9.c(jn.a.b);
               if ($$10 < 1.0 && $$8.y().c()) {
                  this.a($$0, $$2, $$4, (double)$$0.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(ji $$0, lr $$1, fbu $$2, double $$3) {
      this.a((double)$$0.u() + $$2.b(jn.a.a), (double)$$0.u() + $$2.c(jn.a.a), (double)$$0.w() + $$2.b(jn.a.c), (double)$$0.w() + $$2.c(jn.a.c), $$3, $$1);
   }

   private void a(double $$0, double $$1, double $$2, double $$3, double $$4, lr $$5) {
      this.a($$5, ayz.d(this.A.j(), $$0, $$1), $$4, ayz.d(this.A.j(), $$2, $$3), 0.0, 0.0, 0.0);
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Server brand", () -> this.K.t.j.f());
      $$1.a("Server type", () -> this.K.V() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server");
      $$1.a("Tracked entity count", () -> String.valueOf(this.g()));
      return $$1;
   }

   @Override
   public void a(@Nullable cox $$0, double $$1, double $$2, double $$3, jr<avz> $$4, awb $$5, float $$6, float $$7, long $$8) {
      if ($$0 == this.K.t) {
         this.a($$1, $$2, $$3, $$4.a(), $$5, $$6, $$7, false, $$8);
      }
   }

   @Override
   public void a(@Nullable cox $$0, bul $$1, jr<avz> $$2, awb $$3, float $$4, float $$5, long $$6) {
      if ($$0 == this.K.t) {
         this.K.ak().a((hip)(new hig($$2.a(), $$3, $$4, $$5, $$1, $$6)));
      }
   }

   @Override
   public void a(bul $$0, avz $$1, awb $$2, float $$3, float $$4) {
      this.K.ak().a((hip)(new hig($$1, $$2, $$3, $$4, $$0, this.A.g())));
   }

   @Override
   public void a(double $$0, double $$1, double $$2, avz $$3, awb $$4, float $$5, float $$6, boolean $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.A.g());
   }

   private void a(double $$0, double $$1, double $$2, avz $$3, awb $$4, float $$5, float $$6, boolean $$7, long $$8) {
      double $$9 = this.K.j.k().b().c($$0, $$1, $$2);
      hik $$10 = new hik($$3, $$4, $$5, $$6, azh.a($$8), $$0, $$1, $$2);
      if ($$7 && $$9 > 100.0) {
         double $$11 = Math.sqrt($$9) / 40.0;
         this.K.ak().a($$10, (int)($$11 * 20.0));
      } else {
         this.K.ak().a($$10);
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<cze> $$6) {
      if ($$6.isEmpty()) {
         for (int $$7 = 0; $$7 < this.A.a(3) + 2; $$7++) {
            this.a(lt.ad, $$0, $$1, $$2, this.A.k() * 0.05, 0.005, this.A.k() * 0.05);
         }
      } else {
         this.K.g.a(new gir.e(this, $$0, $$1, $$2, $$3, $$4, $$5, this.K.g, $$6));
      }
   }

   @Override
   public void a(yw<?> $$0) {
      this.E.b($$0);
   }

   @Override
   public dbf Q() {
      return this.E.j();
   }

   @Override
   public bst u() {
      return this.J;
   }

   @Override
   public fco<djm> U() {
      return fcl.b();
   }

   @Override
   public fco<esy> T() {
      return fcl.b();
   }

   public gfv h() {
      return this.R;
   }

   @Nullable
   @Override
   public eut a(eur $$0) {
      return this.N.get($$0);
   }

   public void b(eur $$0, eut $$1) {
      this.N.put($$0, $$1);
   }

   @Override
   public void a(eur $$0, eut $$1) {
   }

   @Override
   public eur x() {
      return new eur(0);
   }

   @Override
   public fcf R() {
      return this.E.z();
   }

   @Override
   public void a(ji $$0, dwx $$1, dwx $$2, int $$3) {
      this.F.a(this, $$0, $$1, $$2, $$3);
   }

   @Override
   public void b(ji $$0, dwx $$1, dwx $$2) {
      this.F.a($$0, $$1, $$2);
   }

   public void c(int $$0, int $$1, int $$2) {
      this.F.a($$0, $$1, $$2);
   }

   public void b(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      this.F.b($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(int $$0, ji $$1, int $$2) {
      this.F.a($$0, $$1, $$2);
   }

   @Override
   public void b(int $$0, ji $$1, int $$2) {
      this.G.a($$0, $$1, $$2);
   }

   @Override
   public void a(@Nullable cox $$0, int $$1, ji $$2, int $$3) {
      try {
         this.G.b($$1, $$2, $$3);
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
   public void a(lr $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.F.a($$0, $$0.a().b(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void a(lr $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      this.F.a($$0, $$0.a().b() || $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   @Override
   public void b(lr $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.F.a($$0, false, true, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void a(lr $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.F.a($$0, $$0.a().b() || $$1, true, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public List<gkt> z() {
      return this.L;
   }

   public List<cjs> i() {
      return this.M;
   }

   @Override
   public jr<dhk> a(int $$0, int $$1, int $$2) {
      return this.K_().e(mc.aI).b(dhr.b);
   }

   public float g(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (ayz.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.2F);
      $$2 = ayz.a($$2, 0.0F, 1.0F);
      $$2 = 1.0F - $$2;
      $$2 *= 1.0F - this.d($$0) * 5.0F / 16.0F;
      $$2 *= 1.0F - this.b($$0) * 5.0F / 16.0F;
      return $$2 * 0.8F + 0.2F;
   }

   public int a(fba $$0, float $$1) {
      float $$2 = this.f($$1);
      fba $$3 = $$0.a(2.0, 2.0, 2.0).c(0.25);
      fba $$4 = aya.a($$3, ($$0x, $$1x, $$2x) -> fba.a(this.I_().a($$0x, $$1x, $$2x).a().a()));
      float $$5 = ayz.b($$2 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$5 = ayz.a($$5, 0.0F, 1.0F);
      $$4 = $$4.c((double)$$5);
      int $$6 = axk.a($$4);
      float $$7 = this.d($$1);
      if ($$7 > 0.0F) {
         float $$8 = 0.6F;
         float $$9 = $$7 * 0.75F;
         int $$10 = axk.a(axk.e($$6), 0.6F);
         $$6 = axk.a($$9, $$6, $$10);
      }

      float $$11 = this.b($$1);
      if ($$11 > 0.0F) {
         float $$12 = 0.2F;
         float $$13 = $$11 * 0.75F;
         int $$14 = axk.a(axk.e($$6), 0.2F);
         $$6 = axk.a($$13, $$6, $$14);
      }

      int $$15 = this.j();
      if ($$15 > 0) {
         float $$16 = Math.min((float)$$15 - $$1, 1.0F);
         $$16 *= 0.45F;
         $$6 = axk.a($$16, $$6, axk.a(204, 204, 255));
      }

      return $$6;
   }

   public int h(float $$0) {
      int $$1 = -1;
      float $$2 = this.d($$0);
      if ($$2 > 0.0F) {
         int $$3 = axk.a(axk.e($$1), 0.6F);
         $$1 = axk.a($$2 * 0.95F, $$1, $$3);
      }

      float $$4 = this.f($$0);
      float $$5 = ayz.b($$4 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$5 = ayz.a($$5, 0.0F, 1.0F);
      $$1 = axk.a($$1, axk.a(1.0F, $$5 * 0.9F + 0.1F, $$5 * 0.9F + 0.1F, $$5 * 0.85F + 0.15F));
      float $$6 = this.b($$0);
      if ($$6 > 0.0F) {
         int $$7 = axk.a(axk.e($$1), 0.2F);
         $$1 = axk.a($$6 * 0.95F, $$1, $$7);
      }

      return $$1;
   }

   public float i(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (ayz.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.25F);
      $$2 = ayz.a($$2, 0.0F, 1.0F);
      return $$2 * $$2 * 0.5F;
   }

   public int j() {
      return this.K.n.b().c() ? 0 : this.P;
   }

   @Override
   public void c(int $$0) {
      this.P = $$0;
   }

   @Override
   public float a(jn $$0, boolean $$1) {
      boolean $$2 = this.c().e();
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
   public int a(ji $$0, dfs $$1) {
      fmm $$2 = (fmm)this.Q.get($$1);
      return $$2.a($$0);
   }

   public int b(ji $$0, dfs $$1) {
      int $$2 = flj.Q().n.G().c();
      if ($$2 == 0) {
         return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
      } else {
         int $$3 = ($$2 * 2 + 1) * ($$2 * 2 + 1);
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         jk $$7 = new jk($$0.u() - $$2, $$0.v(), $$0.w() - $$2, $$0.u() + $$2, $$0.v(), $$0.w() + $$2);
         ji.a $$8 = new ji.a();

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

   public void a(ji $$0, float $$1) {
      this.B.a($$0, $$1);
   }

   @Override
   public String toString() {
      return "ClientLevel";
   }

   public gfz.a k() {
      return this.H;
   }

   @Override
   public void a(jr<ebt> $$0, fba $$1, ebt.a $$2) {
   }

   protected Map<eur, eut> l() {
      return ImmutableMap.copyOf(this.N);
   }

   protected void a(Map<eur, eut> $$0) {
      this.N.putAll($$0);
   }

   @Override
   protected ebj<bul> H() {
      return this.f.a();
   }

   @Override
   public String J() {
      return "Chunks[C] W: " + this.R.e() + " E: " + this.f.c();
   }

   @Override
   public void a(ji $$0, dwx $$1) {
      this.K.g.a($$0, $$1);
   }

   public void i(int $$0) {
      this.T = $$0;
   }

   public int m() {
      return this.T;
   }

   @Override
   public crt K() {
      return this.E.y();
   }

   @Override
   public cyn L() {
      return this.E.A();
   }

   @Override
   public dux M() {
      return this.E.B();
   }

   @Override
   public void a(
      @Nullable bul $$0,
      @Nullable btb $$1,
      @Nullable dgb $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dgi.a $$8,
      lr $$9,
      lr $$10,
      jr<avz> $$11
   ) {
   }

   @Override
   public int P() {
      return this.V;
   }

   public static class a implements evm {
      private final boolean a;
      private final boolean b;
      private ji c;
      private float d;
      private long e;
      private long f;
      private boolean g;
      private bsh h;
      private boolean i;

      public a(bsh $$0, boolean $$1, boolean $$2) {
         this.h = $$0;
         this.a = $$1;
         this.b = $$2;
      }

      @Override
      public ji a() {
         return this.c;
      }

      @Override
      public float b() {
         return this.d;
      }

      @Override
      public long c() {
         return this.e;
      }

      @Override
      public long d() {
         return this.f;
      }

      public void a(long $$0) {
         this.e = $$0;
      }

      public void b(long $$0) {
         this.f = $$0;
      }

      @Override
      public void a(ji $$0, float $$1) {
         this.c = $$0.j();
         this.d = $$1;
      }

      @Override
      public boolean g() {
         return false;
      }

      @Override
      public boolean i() {
         return this.g;
      }

      @Override
      public void b(boolean $$0) {
         this.g = $$0;
      }

      @Override
      public boolean l() {
         return this.a;
      }

      @Override
      public bsh q() {
         return this.h;
      }

      @Override
      public boolean r() {
         return this.i;
      }

      @Override
      public void a(p $$0, dgk $$1) {
         evm.super.a($$0, $$1);
      }

      public void a(bsh $$0) {
         this.h = $$0;
      }

      public void a(boolean $$0) {
         this.i = $$0;
      }

      public double a(dgk $$0) {
         return this.b ? (double)$$0.L_() : 63.0;
      }

      public float e() {
         return this.b ? 1.0F : 0.03125F;
      }
   }

   final class b implements ebi<bul> {
      public void a(bul $$0) {
      }

      public void b(bul $$0) {
      }

      public void c(bul $$0) {
         gfz.this.e.a($$0);
      }

      public void d(bul $$0) {
         gfz.this.e.b($$0);
      }

      public void e(bul $$0) {
         Objects.requireNonNull($$0);
         switch ($$0) {
            case gkt $$1:
               gfz.this.L.add($$1);
               break;
            case cjv $$2:
               gfz.this.M.addAll(Arrays.asList($$2.x()));
               break;
         }
      }

      public void f(bul $$0) {
         $$0.ao();
         Objects.requireNonNull($$0);
         switch ($$0) {
            case gkt $$1:
               gfz.this.L.remove($$1);
               break;
            case cjv $$2:
               gfz.this.M.removeAll(Arrays.asList($$2.x()));
               break;
         }
      }

      public void g(bul $$0) {
      }
   }
}
