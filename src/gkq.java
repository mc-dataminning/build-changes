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

public class gkq extends djm implements gkj.a<gkq> {
   private static final Logger a = LogUtils.getLogger();
   private static final double b = 0.05;
   private static final int c = 10;
   private static final int d = 1000;
   final efe e = new efe();
   private final efk<bwi> f = new efk<>(bwi.class, new gkq.b());
   private final gkr E;
   private final gqm F;
   private final gql G;
   private final gkq.a H;
   private final gqd I;
   private final bup J;
   private final fpt K = fpt.Q();
   final List<gpl> L = Lists.newArrayList();
   final List<cmh> M = Lists.newArrayList();
   private final Map<eyt, eyv> N = Maps.newHashMap();
   private static final int O = -1;
   private int P;
   private final Object2ObjectArrayMap<diw, fqw> Q = ag.a(new Object2ObjectArrayMap(3), $$0x -> {
      $$0x.put(gpy.a, new fqw($$0xx -> this.b($$0xx, gpy.a)));
      $$0x.put(gpy.b, new fqw($$0xx -> this.b($$0xx, gpy.b)));
      $$0x.put(gpy.c, new fqw($$0xx -> this.b($$0xx, gpy.c)));
      $$0x.put(gpy.d, new fqw($$0xx -> this.b($$0xx, gpy.d)));
   });
   private final gkm R;
   private final Deque<Runnable> S = Queues.newArrayDeque();
   private int T;
   private final gmd U = new gmd();
   private final int V;
   private boolean W;
   private static final Set<czj> X = Set.of(czr.if, czr.ig);

   public void b(int $$0) {
      this.U.a($$0, this);
   }

   public void b(iv $$0, eat $$1, int $$2) {
      if (!this.U.a($$0, $$1)) {
         super.a($$0, $$1, $$2, 512);
      }
   }

   public void a(iv $$0, eat $$1, ffc $$2) {
      eat $$3 = this.a_($$0);
      if ($$3 != $$1) {
         this.a($$0, $$1, 19);
         crm $$4 = this.K.t;
         if (this == $$4.dU() && $$4.a($$0, $$1)) {
            $$4.g($$2.d, $$2.e, $$2.f);
         }
      }
   }

   gmd a() {
      return this.U;
   }

   @Override
   public boolean a(iv $$0, eat $$1, int $$2, int $$3) {
      if (this.U.c()) {
         eat $$4 = this.a_($$0);
         boolean $$5 = super.a($$0, $$1, $$2, $$3);
         if ($$5) {
            this.U.a($$0, $$4, this.K.t);
         }

         return $$5;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   public gkq(gkr $$0, gkq.a $$1, alf<djm> $$2, jf<eeq> $$3, int $$4, int $$5, gqm $$6, boolean $$7, long $$8, int $$9) {
      super($$1, $$2, $$0.v(), $$3, true, $$7, $$8, 1000000);
      this.E = $$0;
      this.R = new gkm(this, $$4);
      this.J = new bup();
      this.H = $$1;
      this.F = $$6;
      this.V = $$9;
      this.G = new gql(this.K, this, $$6);
      this.I = gqd.a($$3.a());
      this.a(new iv(8, 64, 8), 0.0F);
      this.T = $$5;
      this.Z();
      this.ac();
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

   public gqd c() {
      return this.I;
   }

   public void a(BooleanSupplier $$0) {
      this.A_().s();
      this.Z();
      if (this.u().i()) {
         this.n();
      }

      if (this.P > 0) {
         this.c(this.P - 1);
      }

      try (bqv $$1 = bqp.a().d("blocks")) {
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

   public Iterable<bwi> d() {
      return this.H().a();
   }

   public void e() {
      bqq $$0 = bqp.a();
      $$0.a("entities");
      this.e.a($$0x -> {
         if (!$$0x.dP() && !$$0x.bX() && !this.J.a($$0x)) {
            this.a(this::c, $$0x);
         }
      });
      $$0.c();
      this.Y();
   }

   public boolean a(bwi $$0) {
      return this.e.c($$0);
   }

   @Override
   public boolean h(bwi $$0) {
      return $$0.dw().a(this.K.t.dw()) <= this.T;
   }

   public void c(bwi $$0) {
      $$0.bw();
      $$0.af++;
      bqp.a().a(() -> mg.f.b($$0.an()).toString());
      $$0.h();
      bqp.a().c();

      for (bwi $$1 : $$0.cX()) {
         this.a($$0, $$1);
      }
   }

   private void a(bwi $$0, bwi $$1) {
      if ($$1.dP() || $$1.dj() != $$0) {
         $$1.bN();
      } else if ($$1 instanceof crm || this.e.c($$1)) {
         $$1.bw();
         $$1.af++;
         $$1.r();

         for (bwi $$2 : $$1.cX()) {
            this.a($$1, $$2);
         }
      }
   }

   public void a(eda $$0) {
      $$0.J();
      this.R.q().a($$0.f(), false);
      this.f.b($$0.f());
   }

   public void a(dir $$0) {
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

   public void d(bwi $$0) {
      this.a($$0.ao(), bwi.d.b);
      this.f.a($$0);
   }

   public void a(int $$0, bwi.d $$1) {
      bwi $$2 = this.H().a($$0);
      if ($$2 != null) {
         $$2.c($$1);
         $$2.as();
      }
   }

   @Override
   public List<bwi> i(bwi $$0, fex $$1) {
      gpo $$2 = this.K.t;
      return $$2 != null && $$2 != $$0 && $$2.cQ().c($$1) && bwp.a($$0).test($$2) ? List.of($$2) : List.of();
   }

   @Nullable
   @Override
   public bwi a(int $$0) {
      return this.H().a($$0);
   }

   @Override
   public void ad() {
      this.E.k().a(wy.c("multiplayer.status.quitting"));
   }

   public void b(int $$0, int $$1, int $$2) {
      int $$3 = 32;
      azv $$4 = azv.a();
      dmr $$5 = this.o();
      iv.a $$6 = new iv.a();

      for (int $$7 = 0; $$7 < 667; $$7++) {
         this.a($$0, $$1, $$2, 16, $$4, $$5, $$6);
         this.a($$0, $$1, $$2, 32, $$4, $$5, $$6);
      }
   }

   @Nullable
   private dmr o() {
      if (this.K.r.i() == djj.b) {
         czn $$0 = this.K.t.fa();
         czj $$1 = $$0.h();
         if (X.contains($$1) && $$1 instanceof cxv $$2) {
            return $$2.c();
         }
      }

      return null;
   }

   public void a(int $$0, int $$1, int $$2, int $$3, azv $$4, @Nullable dmr $$5, iv.a $$6) {
      int $$7 = $$0 + this.A.a($$3) - this.A.a($$3);
      int $$8 = $$1 + this.A.a($$3) - this.A.a($$3);
      int $$9 = $$2 + this.A.a($$3) - this.A.a($$3);
      $$6.d($$7, $$8, $$9);
      eat $$10 = this.a_($$6);
      $$10.b().a($$10, this, $$6, $$4);
      exa $$11 = this.b_($$6);
      if (!$$11.c()) {
         $$11.a(this, $$6, $$4);
         lw $$12 = $$11.h();
         if ($$12 != null && this.A.a(10) == 0) {
            boolean $$13 = $$10.c(this, $$6, jb.a);
            iv $$14 = $$6.e();
            this.a($$14, this.a_($$14), $$12, $$13);
         }
      }

      if ($$5 == $$10.b()) {
         this.a(new lq(ly.c, $$10), (double)$$7 + 0.5, (double)$$8 + 0.5, (double)$$9 + 0.5, 0.0, 0.0, 0.0);
      }

      if (!$$10.m(this, $$6)) {
         this.u($$6).a().l().ifPresent($$1x -> {
            if ($$1x.a(this.A)) {
               this.a($$1x.a(), (double)$$6.u() + this.A.j(), (double)$$6.v() + this.A.j(), (double)$$6.w() + this.A.j(), 0.0, 0.0, 0.0);
            }
         });
      }
   }

   private void a(iv $$0, eat $$1, lw $$2, boolean $$3) {
      if ($$1.y().c()) {
         ffw $$4 = $$1.g(this, $$0);
         double $$5 = $$4.c(jb.a.b);
         if ($$5 < 1.0) {
            if ($$3) {
               this.a((double)$$0.u(), (double)($$0.u() + 1), (double)$$0.w(), (double)($$0.w() + 1), (double)($$0.v() + 1) - 0.05, $$2);
            }
         } else if (!$$1.a(axc.ar)) {
            double $$6 = $$4.b(jb.a.b);
            if ($$6 > 0.0) {
               this.a($$0, $$2, $$4, (double)$$0.v() + $$6 - 0.05);
            } else {
               iv $$7 = $$0.e();
               eat $$8 = this.a_($$7);
               ffw $$9 = $$8.g(this, $$7);
               double $$10 = $$9.c(jb.a.b);
               if ($$10 < 1.0 && $$8.y().c()) {
                  this.a($$0, $$2, $$4, (double)$$0.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(iv $$0, lw $$1, ffw $$2, double $$3) {
      this.a((double)$$0.u() + $$2.b(jb.a.a), (double)$$0.u() + $$2.c(jb.a.a), (double)$$0.w() + $$2.b(jb.a.c), (double)$$0.w() + $$2.c(jb.a.c), $$3, $$1);
   }

   private void a(double $$0, double $$1, double $$2, double $$3, double $$4, lw $$5) {
      this.a($$5, azm.d(this.A.j(), $$0, $$1), $$4, azm.d(this.A.j(), $$2, $$3), 0.0, 0.0, 0.0);
   }

   @Override
   public q a(p $$0) {
      q $$1 = super.a($$0);
      $$1.a("Server brand", () -> this.K.t.j.f());
      $$1.a("Server type", () -> this.K.V() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server");
      $$1.a("Tracked entity count", () -> String.valueOf(this.g()));
      return $$1;
   }

   @Override
   public void a(@Nullable bwi $$0, double $$1, double $$2, double $$3, jf<awm> $$4, awo $$5, float $$6, float $$7, long $$8) {
      if ($$0 == this.K.t) {
         this.a($$1, $$2, $$3, $$4.a(), $$5, $$6, $$7, false, $$8);
      }
   }

   @Override
   public void a(@Nullable bwi $$0, bwi $$1, jf<awm> $$2, awo $$3, float $$4, float $$5, long $$6) {
      if ($$0 == this.K.t) {
         this.K.ak().a((hno)(new hnf($$2.a(), $$3, $$4, $$5, $$1, $$6)));
      }
   }

   @Override
   public void a(bwi $$0, awm $$1, awo $$2, float $$3, float $$4) {
      this.K.ak().a((hno)(new hnf($$1, $$2, $$3, $$4, $$0, this.A.g())));
   }

   @Override
   public void a(awm $$0, awo $$1, float $$2, float $$3) {
      if (this.K.t != null) {
         this.K.ak().a((hno)(new hnf($$0, $$1, $$2, $$3, this.K.t, this.A.g())));
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, awm $$3, awo $$4, float $$5, float $$6, boolean $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.A.g());
   }

   private void a(double $$0, double $$1, double $$2, awm $$3, awo $$4, float $$5, float $$6, boolean $$7, long $$8) {
      double $$9 = this.K.j.k().b().c($$0, $$1, $$2);
      hnj $$10 = new hnj($$3, $$4, $$5, $$6, azv.a($$8), $$0, $$1, $$2);
      if ($$7 && $$9 > 100.0) {
         double $$11 = Math.sqrt($$9) / 40.0;
         this.K.ak().a($$10, (int)($$11 * 20.0));
      } else {
         this.K.ak().a($$10);
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<dcb> $$6) {
      if ($$6.isEmpty()) {
         for (int $$7 = 0; $$7 < this.A.a(3) + 2; $$7++) {
            this.a(ly.ae, $$0, $$1, $$2, this.A.k() * 0.05, 0.005, this.A.k() * 0.05);
         }
      } else {
         this.K.g.a(new gnj.e(this, $$0, $$1, $$2, $$3, $$4, $$5, this.K.g, $$6));
      }
   }

   @Override
   public void a(zf<?> $$0) {
      this.E.b($$0);
   }

   @Override
   public def Q() {
      return this.E.j();
   }

   @Override
   public bup u() {
      return this.J;
   }

   @Override
   public fgq<dmr> U() {
      return fgn.b();
   }

   @Override
   public fgq<ewz> T() {
      return fgn.b();
   }

   public gkm h() {
      return this.R;
   }

   @Nullable
   @Override
   public eyv a(eyt $$0) {
      return this.N.get($$0);
   }

   public void b(eyt $$0, eyv $$1) {
      this.N.put($$0, $$1);
   }

   @Override
   public void a(eyt $$0, eyv $$1) {
   }

   @Override
   public eyt x() {
      return new eyt(0);
   }

   @Override
   public fgh R() {
      return this.E.z();
   }

   @Override
   public void a(iv $$0, eat $$1, eat $$2, int $$3) {
      this.F.a(this, $$0, $$1, $$2, $$3);
   }

   @Override
   public void b(iv $$0, eat $$1, eat $$2) {
      this.F.a($$0, $$1, $$2);
   }

   public void c(int $$0, int $$1, int $$2) {
      this.F.a($$0, $$1, $$2);
   }

   public void b(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      this.F.b($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(int $$0, iv $$1, int $$2) {
      this.F.a($$0, $$1, $$2);
   }

   @Override
   public void b(int $$0, iv $$1, int $$2) {
      this.G.a($$0, $$1, $$2);
   }

   @Override
   public void a(@Nullable bwi $$0, int $$1, iv $$2, int $$3) {
      try {
         this.G.b($$1, $$2, $$3);
      } catch (Throwable var8) {
         p $$5 = p.a(var8, "Playing level event");
         q $$6 = $$5.a("Level event being played");
         $$6.a("Block coordinates", q.a(this, $$2));
         $$6.a("Event source", $$0);
         $$6.a("Event type", $$1);
         $$6.a("Event data", $$3);
         throw new aa($$5);
      }
   }

   @Override
   public void a(lw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.F.a($$0, $$0.a().b(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void a(lw $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      this.F.a($$0, $$0.a().b() || $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   @Override
   public void b(lw $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.F.a($$0, false, true, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void a(lw $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.F.a($$0, $$0.a().b() || $$1, true, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public List<gpl> z() {
      return this.L;
   }

   public List<cmh> i() {
      return this.M;
   }

   @Override
   public jf<dkp> a(int $$0, int $$1, int $$2) {
      return this.F_().f(mh.aG).b(dkw.b);
   }

   public float g(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (azm.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.2F);
      $$2 = azm.a($$2, 0.0F, 1.0F);
      $$2 = 1.0F - $$2;
      $$2 *= 1.0F - this.d($$0) * 5.0F / 16.0F;
      $$2 *= 1.0F - this.b($$0) * 5.0F / 16.0F;
      return $$2 * 0.8F + 0.2F;
   }

   public int a(ffc $$0, float $$1) {
      float $$2 = this.f($$1);
      ffc $$3 = $$0.a(2.0, 2.0, 2.0).c(0.25);
      ffc $$4 = aym.a($$3, ($$0x, $$1x, $$2x) -> ffc.a(this.D_().a($$0x, $$1x, $$2x).a().a()));
      float $$5 = azm.b($$2 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$5 = azm.a($$5, 0.0F, 1.0F);
      $$4 = $$4.c((double)$$5);
      int $$6 = axw.a($$4);
      float $$7 = this.d($$1);
      if ($$7 > 0.0F) {
         float $$8 = 0.6F;
         float $$9 = $$7 * 0.75F;
         int $$10 = axw.a(axw.e($$6), 0.6F);
         $$6 = axw.a($$9, $$6, $$10);
      }

      float $$11 = this.b($$1);
      if ($$11 > 0.0F) {
         float $$12 = 0.2F;
         float $$13 = $$11 * 0.75F;
         int $$14 = axw.a(axw.e($$6), 0.2F);
         $$6 = axw.a($$13, $$6, $$14);
      }

      int $$15 = this.j();
      if ($$15 > 0) {
         float $$16 = Math.min((float)$$15 - $$1, 1.0F);
         $$16 *= 0.45F;
         $$6 = axw.a($$16, $$6, axw.a(204, 204, 255));
      }

      return $$6;
   }

   public int h(float $$0) {
      int $$1 = -1;
      float $$2 = this.d($$0);
      if ($$2 > 0.0F) {
         int $$3 = axw.a(axw.e($$1), 0.6F);
         $$1 = axw.a($$2 * 0.95F, $$1, $$3);
      }

      float $$4 = this.f($$0);
      float $$5 = azm.b($$4 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$5 = azm.a($$5, 0.0F, 1.0F);
      $$1 = axw.a($$1, axw.a(1.0F, $$5 * 0.9F + 0.1F, $$5 * 0.9F + 0.1F, $$5 * 0.85F + 0.15F));
      float $$6 = this.b($$0);
      if ($$6 > 0.0F) {
         int $$7 = axw.a(axw.e($$1), 0.2F);
         $$1 = axw.a($$6 * 0.95F, $$1, $$7);
      }

      return $$1;
   }

   public float i(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (azm.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.25F);
      $$2 = azm.a($$2, 0.0F, 1.0F);
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
   public float a(jb $$0, boolean $$1) {
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
   public int a(iv $$0, diw $$1) {
      fqw $$2 = (fqw)this.Q.get($$1);
      return $$2.a($$0);
   }

   public int b(iv $$0, diw $$1) {
      int $$2 = fpt.Q().n.G().c();
      if ($$2 == 0) {
         return $$1.getColor(this.u($$0).a(), (double)$$0.u(), (double)$$0.w());
      } else {
         int $$3 = ($$2 * 2 + 1) * ($$2 * 2 + 1);
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         iy $$7 = new iy($$0.u() - $$2, $$0.v(), $$0.w() - $$2, $$0.u() + $$2, $$0.v(), $$0.w() + $$2);
         iv.a $$8 = new iv.a();

         while ($$7.a()) {
            $$8.d($$7.b(), $$7.c(), $$7.d());
            int $$9 = $$1.getColor(this.u($$8).a(), (double)$$8.u(), (double)$$8.w());
            $$4 += ($$9 & 0xFF0000) >> 16;
            $$5 += ($$9 & 0xFF00) >> 8;
            $$6 += $$9 & 0xFF;
         }

         return ($$4 / $$3 & 0xFF) << 16 | ($$5 / $$3 & 0xFF) << 8 | $$6 / $$3 & 0xFF;
      }
   }

   public void a(iv $$0, float $$1) {
      this.B.a($$0, $$1);
   }

   @Override
   public String toString() {
      return "ClientLevel";
   }

   public gkq.a k() {
      return this.H;
   }

   @Override
   public void a(jf<eft> $$0, ffc $$1, eft.a $$2) {
   }

   protected Map<eyt, eyv> l() {
      return ImmutableMap.copyOf(this.N);
   }

   protected void a(Map<eyt, eyv> $$0) {
      this.N.putAll($$0);
   }

   @Override
   protected efh<bwi> H() {
      return this.f.a();
   }

   @Override
   public String J() {
      return "Chunks[C] W: " + this.R.e() + " E: " + this.f.c();
   }

   @Override
   public void a(iv $$0, eat $$1) {
      this.K.g.a($$0, $$1);
   }

   public void i(int $$0) {
      this.T = $$0;
   }

   public int m() {
      return this.T;
   }

   @Override
   public cuw K() {
      return this.E.y();
   }

   @Override
   public dbi L() {
      return this.E.A();
   }

   @Override
   public dyq M() {
      return this.E.B();
   }

   @Override
   public void a(
      @Nullable bwi $$0,
      @Nullable bux $$1,
      @Nullable djg $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      djm.a $$8,
      lw $$9,
      lw $$10,
      jf<awm> $$11
   ) {
   }

   @Override
   public int P() {
      return this.V;
   }

   @Override
   public int s(iv $$0) {
      return fpt.Q().aw().a(this.a_($$0), this, $$0, 0);
   }

   @Override
   public void registerForCleaning(gkj<gkq, ?> $$0) {
      this.E.a($$0);
   }

   public static class a implements ezo {
      private final boolean a;
      private final boolean b;
      private iv c;
      private float d;
      private long e;
      private long f;
      private boolean g;
      private bud h;
      private boolean i;

      public a(bud $$0, boolean $$1, boolean $$2) {
         this.h = $$0;
         this.a = $$1;
         this.b = $$2;
      }

      @Override
      public iv a() {
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
      public void a(iv $$0, float $$1) {
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
      public bud q() {
         return this.h;
      }

      @Override
      public boolean r() {
         return this.i;
      }

      @Override
      public void a(q $$0, djo $$1) {
         ezo.super.a($$0, $$1);
      }

      public void a(bud $$0) {
         this.h = $$0;
      }

      public void a(boolean $$0) {
         this.i = $$0;
      }

      public double a(djo $$0) {
         return this.b ? (double)$$0.G_() : 63.0;
      }

      public float e() {
         return this.b ? 1.0F : 0.03125F;
      }
   }

   final class b implements efg<bwi> {
      public void a(bwi $$0) {
      }

      public void b(bwi $$0) {
      }

      public void c(bwi $$0) {
         gkq.this.e.a($$0);
      }

      public void d(bwi $$0) {
         gkq.this.e.b($$0);
      }

      public void e(bwi $$0) {
         Objects.requireNonNull($$0);
         switch ($$0) {
            case gpl $$1:
               gkq.this.L.add($$1);
               break;
            case cmk $$2:
               gkq.this.M.addAll(Arrays.asList($$2.q()));
               break;
         }
      }

      public void f(bwi $$0) {
         $$0.al();
         Objects.requireNonNull($$0);
         switch ($$0) {
            case gpl $$1:
               gkq.this.L.remove($$1);
               break;
            case cmk $$2:
               gkq.this.M.removeAll(Arrays.asList($$2.q()));
               break;
         }
      }

      public void g(bwi $$0) {
      }
   }
}
