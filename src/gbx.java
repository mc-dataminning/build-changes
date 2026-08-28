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

public class gbx extends dev {
   private static final Logger a = LogUtils.getLogger();
   private static final double b = 0.05;
   private static final int c = 10;
   private static final int d = 1000;
   final dzn e = new dzn();
   private final dzt<btz> f = new dzt<>(btz.class, new gbx.b());
   private final gby E;
   private final ghs F;
   private final ghr G;
   private final gbx.a H;
   private final ghi I;
   private final bsh J;
   private final fja K = fja.Q();
   final List<ggp> L = Lists.newArrayList();
   private final Map<esw, esy> M = Maps.newHashMap();
   private static final int N = -1;
   private int O;
   private final Object2ObjectArrayMap<def, fkd> P = ad.a(new Object2ObjectArrayMap(3), $$0x -> {
      $$0x.put(ghc.a, new fkd($$0xx -> this.b($$0xx, ghc.a)));
      $$0x.put(ghc.b, new fkd($$0xx -> this.b($$0xx, ghc.b)));
      $$0x.put(ghc.c, new fkd($$0xx -> this.b($$0xx, ghc.c)));
   });
   private final gbt Q;
   private final Deque<Runnable> R = Queues.newArrayDeque();
   private int S;
   private final gdj T = new gdj();
   private final int U;
   private static final Set<cvt> V = Set.of(cwb.hB, cwb.hC);

   public void b(int $$0) {
      this.T.a($$0, this);
   }

   public void b(jg $$0, dvd $$1, int $$2) {
      if (!this.T.a($$0, $$1)) {
         super.a($$0, $$1, $$2, 512);
      }
   }

   public void a(jg $$0, dvd $$1, ezh $$2) {
      dvd $$3 = this.a_($$0);
      if ($$3 != $$1) {
         this.a($$0, $$1, 19);
         coh $$4 = this.K.t;
         if (this == $$4.dX() && $$4.a($$0, $$1)) {
            $$4.h($$2.d, $$2.e, $$2.f);
         }
      }
   }

   gdj a() {
      return this.T;
   }

   @Override
   public boolean a(jg $$0, dvd $$1, int $$2, int $$3) {
      if (this.T.c()) {
         dvd $$4 = this.a_($$0);
         boolean $$5 = super.a($$0, $$1, $$2, $$3);
         if ($$5) {
            this.T.a($$0, $$4, this.K.t);
         }

         return $$5;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   public gbx(gby $$0, gbx.a $$1, alg<dev> $$2, jp<dyz> $$3, int $$4, int $$5, Supplier<bok> $$6, ghs $$7, boolean $$8, long $$9, int $$10) {
      super($$1, $$2, $$0.v(), $$3, $$6, true, $$8, $$9, 1000000);
      this.E = $$0;
      this.Q = new gbt(this, $$4);
      this.J = new bsh();
      this.H = $$1;
      this.F = $$7;
      this.U = $$10;
      this.G = new ghr(this.K, this, $$7);
      this.I = ghi.a($$3.a());
      this.a(new jg(8, 64, 8), 0.0F);
      this.S = $$5;
      this.V();
      this.Y();
   }

   public void a(Runnable $$0) {
      this.R.add($$0);
   }

   public void b() {
      int $$0 = this.R.size();
      int $$1 = $$0 < 1000 ? Math.max(10, $$0 / 10) : $$0;

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Runnable $$3 = this.R.poll();
         if ($$3 == null) {
            break;
         }

         $$3.run();
      }
   }

   public ghi c() {
      return this.I;
   }

   public void a(BooleanSupplier $$0) {
      this.C_().s();
      if (this.s().i()) {
         this.m();
      }

      if (this.O > 0) {
         this.c(this.O - 1);
      }

      this.ah().a("blocks");
      this.Q.a($$0, true);
      this.ah().c();
   }

   private void m() {
      this.b(this.B.c() + 1L);
      if (this.B.o().b(der.l)) {
         this.c(this.B.d() + 1L);
      }
   }

   public void b(long $$0) {
      this.H.a($$0);
   }

   public void c(long $$0) {
      if ($$0 < 0L) {
         $$0 = -$$0;
         this.ac().a(der.l).a(false, null);
      } else {
         this.ac().a(der.l).a(true, null);
      }

      this.H.b($$0);
   }

   public Iterable<btz> d() {
      return this.G().a();
   }

   public void e() {
      bok $$0 = this.ah();
      $$0.a("entities");
      this.e.a($$0x -> {
         if (!$$0x.dS() && !$$0x.ca() && !this.J.a($$0x)) {
            this.a(this::c, $$0x);
         }
      });
      $$0.c();
      this.U();
   }

   public boolean a(btz $$0) {
      return this.e.c($$0);
   }

   @Override
   public boolean h(btz $$0) {
      return $$0.dz().a(this.K.t.dz()) <= this.S;
   }

   public void c(btz $$0) {
      $$0.bA();
      $$0.ag++;
      this.ah().a(() -> lx.f.b($$0.aq()).toString());
      $$0.l();
      this.ah().c();

      for (btz $$1 : $$0.da()) {
         this.a($$0, $$1);
      }
   }

   private void a(btz $$0, btz $$1) {
      if ($$1.dS() || $$1.dl() != $$0) {
         $$1.af();
      } else if ($$1 instanceof coh || this.e.c($$1)) {
         $$1.bA();
         $$1.ag++;
         $$1.u();

         for (btz $$2 : $$1.da()) {
            this.a($$1, $$2);
         }
      }
   }

   public void a(dxj $$0) {
      $$0.H();
      this.Q.p().a($$0.f(), false);
      this.f.b($$0.f());
   }

   public void a(deb $$0) {
      this.P.forEach(($$1, $$2) -> $$2.a($$0.e, $$0.f));
      this.f.a($$0);
      this.F.a($$0);
   }

   public void d(long $$0) {
      this.F.a($$0);
   }

   public void f() {
      this.P.forEach(($$0, $$1) -> $$1.a());
   }

   @Override
   public boolean b(int $$0, int $$1) {
      return true;
   }

   public int g() {
      return this.f.b();
   }

   public void d(btz $$0) {
      this.a($$0.ar(), btz.c.b);
      this.f.a($$0);
   }

   public void a(int $$0, btz.c $$1) {
      btz $$2 = this.G().a($$0);
      if ($$2 != null) {
         $$2.b($$1);
         $$2.aw();
      }
   }

   @Nullable
   @Override
   public btz a(int $$0) {
      return this.G().a($$0);
   }

   @Override
   public void Z() {
      this.E.k().a(xh.c("multiplayer.status.quitting"));
   }

   public void b(int $$0, int $$1, int $$2) {
      int $$3 = 32;
      azr $$4 = azr.a();
      dhy $$5 = this.n();
      jg.a $$6 = new jg.a();

      for (int $$7 = 0; $$7 < 667; $$7++) {
         this.a($$0, $$1, $$2, 16, $$4, $$5, $$6);
         this.a($$0, $$1, $$2, 32, $$4, $$5, $$6);
      }
   }

   @Nullable
   private dhy n() {
      if (this.K.r.j() == des.b) {
         cvx $$0 = this.K.t.fb();
         cvt $$1 = $$0.h();
         if (V.contains($$1) && $$1 instanceof cuc $$2) {
            return $$2.d();
         }
      }

      return null;
   }

   public void a(int $$0, int $$1, int $$2, int $$3, azr $$4, @Nullable dhy $$5, jg.a $$6) {
      int $$7 = $$0 + this.A.a($$3) - this.A.a($$3);
      int $$8 = $$1 + this.A.a($$3) - this.A.a($$3);
      int $$9 = $$2 + this.A.a($$3) - this.A.a($$3);
      $$6.d($$7, $$8, $$9);
      dvd $$10 = this.a_($$6);
      $$10.b().a($$10, this, $$6, $$4);
      ere $$11 = this.b_($$6);
      if (!$$11.c()) {
         $$11.a(this, $$6, $$4);
         lo $$12 = $$11.h();
         if ($$12 != null && this.A.a(10) == 0) {
            boolean $$13 = $$10.c(this, $$6, jl.a);
            jg $$14 = $$6.e();
            this.a($$14, this.a_($$14), $$12, $$13);
         }
      }

      if ($$5 == $$10.b()) {
         this.a(new li(lq.c, $$10), (double)$$7 + 0.5, (double)$$8 + 0.5, (double)$$9 + 0.5, 0.0, 0.0, 0.0);
      }

      if (!$$10.m(this, $$6)) {
         this.t($$6).a().k().ifPresent($$1x -> {
            if ($$1x.a(this.A)) {
               this.a($$1x.a(), (double)$$6.u() + this.A.j(), (double)$$6.v() + this.A.j(), (double)$$6.w() + this.A.j(), 0.0, 0.0, 0.0);
            }
         });
      }
   }

   private void a(jg $$0, dvd $$1, lo $$2, boolean $$3) {
      if ($$1.y().c()) {
         fab $$4 = $$1.g(this, $$0);
         double $$5 = $$4.c(jl.a.b);
         if ($$5 < 1.0) {
            if ($$3) {
               this.a((double)$$0.u(), (double)($$0.u() + 1), (double)$$0.w(), (double)($$0.w() + 1), (double)($$0.v() + 1) - 0.05, $$2);
            }
         } else if (!$$1.a(awz.ap)) {
            double $$6 = $$4.b(jl.a.b);
            if ($$6 > 0.0) {
               this.a($$0, $$2, $$4, (double)$$0.v() + $$6 - 0.05);
            } else {
               jg $$7 = $$0.e();
               dvd $$8 = this.a_($$7);
               fab $$9 = $$8.g(this, $$7);
               double $$10 = $$9.c(jl.a.b);
               if ($$10 < 1.0 && $$8.y().c()) {
                  this.a($$0, $$2, $$4, (double)$$0.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(jg $$0, lo $$1, fab $$2, double $$3) {
      this.a((double)$$0.u() + $$2.b(jl.a.a), (double)$$0.u() + $$2.c(jl.a.a), (double)$$0.w() + $$2.b(jl.a.c), (double)$$0.w() + $$2.c(jl.a.c), $$3, $$1);
   }

   private void a(double $$0, double $$1, double $$2, double $$3, double $$4, lo $$5) {
      this.a($$5, azj.d(this.A.j(), $$0, $$1), $$4, azj.d(this.A.j(), $$2, $$3), 0.0, 0.0, 0.0);
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Server brand", () -> this.K.t.cw.f());
      $$1.a("Server type", () -> this.K.V() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server");
      $$1.a("Tracked entity count", () -> String.valueOf(this.g()));
      return $$1;
   }

   @Override
   public void a(@Nullable coh $$0, double $$1, double $$2, double $$3, jp<awj> $$4, awl $$5, float $$6, float $$7, long $$8) {
      if ($$0 == this.K.t) {
         this.a($$1, $$2, $$3, $$4.a(), $$5, $$6, $$7, false, $$8);
      }
   }

   @Override
   public void a(@Nullable coh $$0, btz $$1, jp<awj> $$2, awl $$3, float $$4, float $$5, long $$6) {
      if ($$0 == this.K.t) {
         this.K.ak().a((hbp)(new hbg($$2.a(), $$3, $$4, $$5, $$1, $$6)));
      }
   }

   @Override
   public void a(btz $$0, awj $$1, awl $$2, float $$3, float $$4) {
      this.K.ak().a((hbp)(new hbg($$1, $$2, $$3, $$4, $$0, this.A.g())));
   }

   @Override
   public void a(double $$0, double $$1, double $$2, awj $$3, awl $$4, float $$5, float $$6, boolean $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.A.g());
   }

   private void a(double $$0, double $$1, double $$2, awj $$3, awl $$4, float $$5, float $$6, boolean $$7, long $$8) {
      double $$9 = this.K.j.k().b().c($$0, $$1, $$2);
      hbk $$10 = new hbk($$3, $$4, $$5, $$6, azr.a($$8), $$0, $$1, $$2);
      if ($$7 && $$9 > 100.0) {
         double $$11 = Math.sqrt($$9) / 40.0;
         this.K.ak().a($$10, (int)($$11 * 20.0));
      } else {
         this.K.ak().a($$10);
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<cyk> $$6) {
      if ($$6.isEmpty()) {
         for (int $$7 = 0; $$7 < this.A.a(3) + 2; $$7++) {
            this.a(lq.ab, $$0, $$1, $$2, this.A.k() * 0.05, 0.005, this.A.k() * 0.05);
         }
      } else {
         this.K.g.a(new geo.e(this, $$0, $$1, $$2, $$3, $$4, $$5, this.K.g, $$6));
      }
   }

   @Override
   public void a(zo<?> $$0) {
      this.E.b($$0);
   }

   @Override
   public dan r() {
      return this.E.j();
   }

   @Override
   public bsh s() {
      return this.J;
   }

   @Override
   public fav<dhy> R() {
      return fas.b();
   }

   @Override
   public fav<erd> Q() {
      return fas.b();
   }

   public gbt h() {
      return this.Q;
   }

   @Nullable
   @Override
   public esy a(esw $$0) {
      return this.M.get($$0);
   }

   public void b(esw $$0, esy $$1) {
      this.M.put($$0, $$1);
   }

   @Override
   public void a(esw $$0, esy $$1) {
   }

   @Override
   public esw v() {
      return new esw(0);
   }

   @Override
   public fam O() {
      return this.E.z();
   }

   @Override
   public void a(jg $$0, dvd $$1, dvd $$2, int $$3) {
      this.F.a(this, $$0, $$1, $$2, $$3);
   }

   @Override
   public void b(jg $$0, dvd $$1, dvd $$2) {
      this.F.a($$0, $$1, $$2);
   }

   public void c(int $$0, int $$1, int $$2) {
      this.F.a($$0, $$1, $$2);
   }

   public void b(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      this.F.b($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(int $$0, jg $$1, int $$2) {
      this.F.a($$0, $$1, $$2);
   }

   @Override
   public void b(int $$0, jg $$1, int $$2) {
      this.G.a($$0, $$1, $$2);
   }

   @Override
   public void a(@Nullable coh $$0, int $$1, jg $$2, int $$3) {
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
   public void a(lo $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.F.a($$0, $$0.a().b(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void a(lo $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.F.a($$0, $$0.a().b() || $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void b(lo $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.F.a($$0, false, true, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void b(lo $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.F.a($$0, $$0.a().b() || $$1, true, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public List<ggp> x() {
      return this.L;
   }

   @Override
   public jp<dfw> a(int $$0, int $$1, int $$2) {
      return this.H_().e(ly.aG).b(dgd.b);
   }

   public float g(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (azj.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.2F);
      $$2 = azj.a($$2, 0.0F, 1.0F);
      $$2 = 1.0F - $$2;
      $$2 *= 1.0F - this.d($$0) * 5.0F / 16.0F;
      $$2 *= 1.0F - this.b($$0) * 5.0F / 16.0F;
      return $$2 * 0.8F + 0.2F;
   }

   public int a(ezh $$0, float $$1) {
      float $$2 = this.f($$1);
      ezh $$3 = $$0.a(2.0, 2.0, 2.0).c(0.25);
      ezh $$4 = ayk.a($$3, ($$0x, $$1x, $$2x) -> ezh.a(this.F_().a($$0x, $$1x, $$2x).a().a()));
      float $$5 = azj.b($$2 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$5 = azj.a($$5, 0.0F, 1.0F);
      $$4 = $$4.c((double)$$5);
      int $$6 = axu.a($$4);
      float $$7 = this.d($$1);
      if ($$7 > 0.0F) {
         float $$8 = 0.6F;
         float $$9 = $$7 * 0.75F;
         int $$10 = axu.a(axu.e($$6), 0.6F);
         $$6 = axu.a($$9, $$6, $$10);
      }

      float $$11 = this.b($$1);
      if ($$11 > 0.0F) {
         float $$12 = 0.2F;
         float $$13 = $$11 * 0.75F;
         int $$14 = axu.a(axu.e($$6), 0.2F);
         $$6 = axu.a($$13, $$6, $$14);
      }

      int $$15 = this.i();
      if ($$15 > 0) {
         float $$16 = Math.min((float)$$15 - $$1, 1.0F);
         $$16 *= 0.45F;
         $$6 = axu.a($$16, $$6, axu.a(204, 204, 255));
      }

      return $$6;
   }

   public int h(float $$0) {
      int $$1 = -1;
      float $$2 = this.d($$0);
      if ($$2 > 0.0F) {
         int $$3 = axu.a(axu.e($$1), 0.6F);
         $$1 = axu.a($$2 * 0.95F, $$1, $$3);
      }

      float $$4 = this.f($$0);
      float $$5 = azj.b($$4 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$5 = azj.a($$5, 0.0F, 1.0F);
      $$1 = axu.a($$1, axu.a(1.0F, $$5 * 0.9F + 0.1F, $$5 * 0.9F + 0.1F, $$5 * 0.85F + 0.15F));
      float $$6 = this.b($$0);
      if ($$6 > 0.0F) {
         int $$7 = axu.a(axu.e($$1), 0.2F);
         $$1 = axu.a($$6 * 0.95F, $$1, $$7);
      }

      return $$1;
   }

   public float i(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (azj.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.25F);
      $$2 = azj.a($$2, 0.0F, 1.0F);
      return $$2 * $$2 * 0.5F;
   }

   public int i() {
      return this.K.n.b().c() ? 0 : this.O;
   }

   @Override
   public void c(int $$0) {
      this.O = $$0;
   }

   @Override
   public float a(jl $$0, boolean $$1) {
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
   public int a(jg $$0, def $$1) {
      fkd $$2 = (fkd)this.P.get($$1);
      return $$2.a($$0);
   }

   public int b(jg $$0, def $$1) {
      int $$2 = fja.Q().n.F().c();
      if ($$2 == 0) {
         return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
      } else {
         int $$3 = ($$2 * 2 + 1) * ($$2 * 2 + 1);
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         ji $$7 = new ji($$0.u() - $$2, $$0.v(), $$0.w() - $$2, $$0.u() + $$2, $$0.v(), $$0.w() + $$2);
         jg.a $$8 = new jg.a();

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

   public void a(jg $$0, float $$1) {
      this.B.a($$0, $$1);
   }

   @Override
   public String toString() {
      return "ClientLevel";
   }

   public gbx.a j() {
      return this.H;
   }

   @Override
   public void a(jp<eaa> $$0, ezh $$1, eaa.a $$2) {
   }

   protected Map<esw, esy> k() {
      return ImmutableMap.copyOf(this.M);
   }

   protected void a(Map<esw, esy> $$0) {
      this.M.putAll($$0);
   }

   @Override
   protected dzq<btz> G() {
      return this.f.a();
   }

   @Override
   public String I() {
      return "Chunks[C] W: " + this.Q.e() + " E: " + this.f.c();
   }

   @Override
   public void a(jg $$0, dvd $$1) {
      this.K.g.a($$0, $$1);
   }

   public void i(int $$0) {
      this.S = $$0;
   }

   public int l() {
      return this.S;
   }

   @Override
   public cra J() {
      return this.E.y();
   }

   @Override
   public cxv K() {
      return this.E.A();
   }

   @Override
   public dtd L() {
      return this.E.B();
   }

   @Override
   public void a(
      @Nullable btz $$0,
      @Nullable bsp $$1,
      @Nullable deo $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dev.a $$8,
      lo $$9,
      lo $$10,
      jp<awj> $$11
   ) {
   }

   @Override
   public int N() {
      return this.U;
   }

   public static class a implements etr {
      private final boolean a;
      private final der b;
      private final boolean c;
      private jg d;
      private float e;
      private long f;
      private long g;
      private boolean h;
      private brv i;
      private boolean j;

      public a(cra $$0, brv $$1, boolean $$2, boolean $$3) {
         this.i = $$1;
         this.a = $$2;
         this.c = $$3;
         this.b = new der($$0);
      }

      @Override
      public jg a() {
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
      public void a(jg $$0, float $$1) {
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
      public der o() {
         return this.b;
      }

      @Override
      public brv q() {
         return this.i;
      }

      @Override
      public boolean r() {
         return this.j;
      }

      @Override
      public void a(p $$0, dex $$1) {
         etr.super.a($$0, $$1);
      }

      public void a(brv $$0) {
         this.i = $$0;
      }

      public void a(boolean $$0) {
         this.j = $$0;
      }

      public double a(dex $$0) {
         return this.c ? (double)$$0.I_() : 63.0;
      }

      public float e() {
         return this.c ? 1.0F : 0.03125F;
      }
   }

   final class b implements dzp<btz> {
      public void a(btz $$0) {
      }

      public void b(btz $$0) {
      }

      public void c(btz $$0) {
         gbx.this.e.a($$0);
      }

      public void d(btz $$0) {
         gbx.this.e.b($$0);
      }

      public void e(btz $$0) {
         if ($$0 instanceof ggp) {
            gbx.this.L.add((ggp)$$0);
         }
      }

      public void f(btz $$0) {
         $$0.ao();
         gbx.this.L.remove($$0);
      }

      public void g(btz $$0) {
      }
   }
}
