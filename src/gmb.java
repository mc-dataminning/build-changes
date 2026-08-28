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

public class gmb extends djx implements glu.a<gmb> {
   private static final Logger a = LogUtils.getLogger();
   private static final double b = 0.05;
   private static final int c = 10;
   private static final int d = 1000;
   final efp e = new efp();
   private final efv<bwt> f = new efv<>(bwt.class, new gmb.b());
   private final gmc E;
   private final grv F;
   private final gru G;
   private final gmb.a H;
   private final grm I;
   private final bva J;
   private final frd K = frd.Q();
   final List<gqw> L = Lists.newArrayList();
   final List<cms> M = Lists.newArrayList();
   private final Map<ezh, ezj> N = Maps.newHashMap();
   private static final int O = -1;
   private int P;
   private final Object2ObjectArrayMap<djh, fsg> Q = ag.a(new Object2ObjectArrayMap(3), $$0x -> {
      $$0x.put(grj.a, new fsg($$0xx -> this.b($$0xx, grj.a)));
      $$0x.put(grj.b, new fsg($$0xx -> this.b($$0xx, grj.b)));
      $$0x.put(grj.c, new fsg($$0xx -> this.b($$0xx, grj.c)));
      $$0x.put(grj.d, new fsg($$0xx -> this.b($$0xx, grj.d)));
   });
   private final glx R;
   private final Deque<Runnable> S = Queues.newArrayDeque();
   private int T;
   private final gno U = new gno();
   private final int V;
   private boolean W;
   private static final Set<czu> X = Set.of(dac.if, dac.ig);

   public void b(int $$0) {
      this.U.a($$0, this);
   }

   public void b(iv $$0, ebe $$1, int $$2) {
      if (!this.U.a($$0, $$1)) {
         super.a($$0, $$1, $$2, 512);
      }
   }

   public void a(iv $$0, ebe $$1, ffq $$2) {
      ebe $$3 = this.a_($$0);
      if ($$3 != $$1) {
         this.a($$0, $$1, 19);
         crx $$4 = this.K.t;
         if (this == $$4.dV() && $$4.a($$0, $$1)) {
            $$4.g($$2.d, $$2.e, $$2.f);
         }
      }
   }

   gno a() {
      return this.U;
   }

   @Override
   public boolean a(iv $$0, ebe $$1, int $$2, int $$3) {
      if (this.U.c()) {
         ebe $$4 = this.a_($$0);
         boolean $$5 = super.a($$0, $$1, $$2, $$3);
         if ($$5) {
            this.U.a($$0, $$4, this.K.t);
         }

         return $$5;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   public gmb(gmc $$0, gmb.a $$1, alh<djx> $$2, jf<efb> $$3, int $$4, int $$5, grv $$6, boolean $$7, long $$8, int $$9) {
      super($$1, $$2, $$0.v(), $$3, true, $$7, $$8, 1000000);
      this.E = $$0;
      this.R = new glx(this, $$4);
      this.J = new bva();
      this.H = $$1;
      this.F = $$6;
      this.V = $$9;
      this.G = new gru(this.K, this, $$6);
      this.I = grm.a($$3.a());
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

   public grm c() {
      return this.I;
   }

   public void a(BooleanSupplier $$0) {
      this.E_().s();
      this.Z();
      if (this.u().i()) {
         this.n();
      }

      if (this.P > 0) {
         this.c(this.P - 1);
      }

      try (brg $$1 = bra.a().d("blocks")) {
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

   public Iterable<bwt> d() {
      return this.H().a();
   }

   public void e() {
      brb $$0 = bra.a();
      $$0.a("entities");
      this.e.a($$0x -> {
         if (!$$0x.dQ() && !$$0x.bY() && !this.J.a($$0x)) {
            this.a(this::c, $$0x);
         }
      });
      $$0.c();
      this.Y();
   }

   public boolean a(bwt $$0) {
      return this.e.c($$0);
   }

   @Override
   public boolean h(bwt $$0) {
      return $$0.dx().a(this.K.t.dx()) <= this.T;
   }

   public void c(bwt $$0) {
      $$0.bx();
      $$0.af++;
      bra.a().a(() -> mg.f.b($$0.an()).toString());
      $$0.h();
      bra.a().c();

      for (bwt $$1 : $$0.cY()) {
         this.a($$0, $$1);
      }
   }

   private void a(bwt $$0, bwt $$1) {
      if ($$1.dQ() || $$1.dk() != $$0) {
         $$1.bO();
      } else if ($$1 instanceof crx || this.e.c($$1)) {
         $$1.bx();
         $$1.af++;
         $$1.r();

         for (bwt $$2 : $$1.cY()) {
            this.a($$1, $$2);
         }
      }
   }

   public void a(edl $$0) {
      $$0.J();
      this.R.q().a($$0.f(), false);
      this.f.b($$0.f());
   }

   public void a(djc $$0) {
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

   public void d(bwt $$0) {
      this.a($$0.ao(), bwt.d.b);
      this.f.a($$0);
   }

   public void a(int $$0, bwt.d $$1) {
      bwt $$2 = this.H().a($$0);
      if ($$2 != null) {
         $$2.c($$1);
         $$2.as();
      }
   }

   @Override
   public List<bwt> i(bwt $$0, ffl $$1) {
      gqz $$2 = this.K.t;
      return $$2 != null && $$2 != $$0 && $$2.cR().c($$1) && bxa.a($$0).test($$2) ? List.of($$2) : List.of();
   }

   @Nullable
   @Override
   public bwt a(int $$0) {
      return this.H().a($$0);
   }

   @Override
   public void ad() {
      this.E.k().a(xa.c("multiplayer.status.quitting"));
   }

   public void b(int $$0, int $$1, int $$2) {
      int $$3 = 32;
      azx $$4 = azx.a();
      dnc $$5 = this.o();
      iv.a $$6 = new iv.a();

      for (int $$7 = 0; $$7 < 667; $$7++) {
         this.a($$0, $$1, $$2, 16, $$4, $$5, $$6);
         this.a($$0, $$1, $$2, 32, $$4, $$5, $$6);
      }
   }

   @Nullable
   private dnc o() {
      if (this.K.r.i() == dju.b) {
         czy $$0 = this.K.t.fb();
         czu $$1 = $$0.h();
         if (X.contains($$1) && $$1 instanceof cyg $$2) {
            return $$2.c();
         }
      }

      return null;
   }

   public void a(int $$0, int $$1, int $$2, int $$3, azx $$4, @Nullable dnc $$5, iv.a $$6) {
      int $$7 = $$0 + this.A.a($$3) - this.A.a($$3);
      int $$8 = $$1 + this.A.a($$3) - this.A.a($$3);
      int $$9 = $$2 + this.A.a($$3) - this.A.a($$3);
      $$6.d($$7, $$8, $$9);
      ebe $$10 = this.a_($$6);
      $$10.b().a($$10, this, $$6, $$4);
      exo $$11 = this.b_($$6);
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

   private void a(iv $$0, ebe $$1, lw $$2, boolean $$3) {
      if ($$1.y().c()) {
         fgk $$4 = $$1.g(this, $$0);
         double $$5 = $$4.c(jb.a.b);
         if ($$5 < 1.0) {
            if ($$3) {
               this.a((double)$$0.u(), (double)($$0.u() + 1), (double)$$0.w(), (double)($$0.w() + 1), (double)($$0.v() + 1) - 0.05, $$2);
            }
         } else if (!$$1.a(axe.ar)) {
            double $$6 = $$4.b(jb.a.b);
            if ($$6 > 0.0) {
               this.a($$0, $$2, $$4, (double)$$0.v() + $$6 - 0.05);
            } else {
               iv $$7 = $$0.e();
               ebe $$8 = this.a_($$7);
               fgk $$9 = $$8.g(this, $$7);
               double $$10 = $$9.c(jb.a.b);
               if ($$10 < 1.0 && $$8.y().c()) {
                  this.a($$0, $$2, $$4, (double)$$0.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(iv $$0, lw $$1, fgk $$2, double $$3) {
      this.a((double)$$0.u() + $$2.b(jb.a.a), (double)$$0.u() + $$2.c(jb.a.a), (double)$$0.w() + $$2.b(jb.a.c), (double)$$0.w() + $$2.c(jb.a.c), $$3, $$1);
   }

   private void a(double $$0, double $$1, double $$2, double $$3, double $$4, lw $$5) {
      this.a($$5, azo.d(this.A.j(), $$0, $$1), $$4, azo.d(this.A.j(), $$2, $$3), 0.0, 0.0, 0.0);
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
   public void a(@Nullable bwt $$0, double $$1, double $$2, double $$3, jf<awo> $$4, awq $$5, float $$6, float $$7, long $$8) {
      if ($$0 == this.K.t) {
         this.a($$1, $$2, $$3, $$4.a(), $$5, $$6, $$7, false, $$8);
      }
   }

   @Override
   public void a(@Nullable bwt $$0, bwt $$1, jf<awo> $$2, awq $$3, float $$4, float $$5, long $$6) {
      if ($$0 == this.K.t) {
         this.K.ak().a((hox)(new hoo($$2.a(), $$3, $$4, $$5, $$1, $$6)));
      }
   }

   @Override
   public void a(bwt $$0, awo $$1, awq $$2, float $$3, float $$4) {
      this.K.ak().a((hox)(new hoo($$1, $$2, $$3, $$4, $$0, this.A.g())));
   }

   @Override
   public void a(awo $$0, awq $$1, float $$2, float $$3) {
      if (this.K.t != null) {
         this.K.ak().a((hox)(new hoo($$0, $$1, $$2, $$3, this.K.t, this.A.g())));
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, awo $$3, awq $$4, float $$5, float $$6, boolean $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.A.g());
   }

   private void a(double $$0, double $$1, double $$2, awo $$3, awq $$4, float $$5, float $$6, boolean $$7, long $$8) {
      double $$9 = this.K.j.k().b().c($$0, $$1, $$2);
      hos $$10 = new hos($$3, $$4, $$5, $$6, azx.a($$8), $$0, $$1, $$2);
      if ($$7 && $$9 > 100.0) {
         double $$11 = Math.sqrt($$9) / 40.0;
         this.K.ak().a($$10, (int)($$11 * 20.0));
      } else {
         this.K.ak().a($$10);
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<dcm> $$6) {
      if ($$6.isEmpty()) {
         for (int $$7 = 0; $$7 < this.A.a(3) + 2; $$7++) {
            this.a(ly.ae, $$0, $$1, $$2, this.A.k() * 0.05, 0.005, this.A.k() * 0.05);
         }
      } else {
         this.K.g.a(new gou.e(this, $$0, $$1, $$2, $$3, $$4, $$5, this.K.g, $$6));
      }
   }

   @Override
   public void a(zh<?> $$0) {
      this.E.b($$0);
   }

   @Override
   public deq Q() {
      return this.E.j();
   }

   @Override
   public bva u() {
      return this.J;
   }

   @Override
   public fhe<dnc> U() {
      return fhb.b();
   }

   @Override
   public fhe<exn> T() {
      return fhb.b();
   }

   public glx h() {
      return this.R;
   }

   @Nullable
   @Override
   public ezj a(ezh $$0) {
      return this.N.get($$0);
   }

   public void b(ezh $$0, ezj $$1) {
      this.N.put($$0, $$1);
   }

   @Override
   public void a(ezh $$0, ezj $$1) {
   }

   @Override
   public ezh x() {
      return new ezh(0);
   }

   @Override
   public fgv R() {
      return this.E.z();
   }

   @Override
   public void a(iv $$0, ebe $$1, ebe $$2, int $$3) {
      this.F.a(this, $$0, $$1, $$2, $$3);
   }

   @Override
   public void b(iv $$0, ebe $$1, ebe $$2) {
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
   public void a(@Nullable bwt $$0, int $$1, iv $$2, int $$3) {
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
   public List<gqw> z() {
      return this.L;
   }

   public List<cms> i() {
      return this.M;
   }

   @Override
   public jf<dla> a(int $$0, int $$1, int $$2) {
      return this.J_().f(mh.aG).b(dlh.b);
   }

   public float g(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (azo.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.2F);
      $$2 = azo.a($$2, 0.0F, 1.0F);
      $$2 = 1.0F - $$2;
      $$2 *= 1.0F - this.d($$0) * 5.0F / 16.0F;
      $$2 *= 1.0F - this.b($$0) * 5.0F / 16.0F;
      return $$2 * 0.8F + 0.2F;
   }

   public int a(ffq $$0, float $$1) {
      float $$2 = this.f($$1);
      ffq $$3 = $$0.a(2.0, 2.0, 2.0).c(0.25);
      ffq $$4 = ayo.a($$3, ($$0x, $$1x, $$2x) -> ffq.a(this.H_().a($$0x, $$1x, $$2x).a().a()));
      float $$5 = azo.b($$2 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$5 = azo.a($$5, 0.0F, 1.0F);
      $$4 = $$4.c((double)$$5);
      int $$6 = axy.a($$4);
      float $$7 = this.d($$1);
      if ($$7 > 0.0F) {
         float $$8 = 0.6F;
         float $$9 = $$7 * 0.75F;
         int $$10 = axy.a(axy.e($$6), 0.6F);
         $$6 = axy.a($$9, $$6, $$10);
      }

      float $$11 = this.b($$1);
      if ($$11 > 0.0F) {
         float $$12 = 0.2F;
         float $$13 = $$11 * 0.75F;
         int $$14 = axy.a(axy.e($$6), 0.2F);
         $$6 = axy.a($$13, $$6, $$14);
      }

      int $$15 = this.j();
      if ($$15 > 0) {
         float $$16 = Math.min((float)$$15 - $$1, 1.0F);
         $$16 *= 0.45F;
         $$6 = axy.a($$16, $$6, axy.a(204, 204, 255));
      }

      return $$6;
   }

   public int h(float $$0) {
      int $$1 = -1;
      float $$2 = this.d($$0);
      if ($$2 > 0.0F) {
         int $$3 = axy.a(axy.e($$1), 0.6F);
         $$1 = axy.a($$2 * 0.95F, $$1, $$3);
      }

      float $$4 = this.f($$0);
      float $$5 = azo.b($$4 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$5 = azo.a($$5, 0.0F, 1.0F);
      $$1 = axy.a($$1, axy.a(1.0F, $$5 * 0.9F + 0.1F, $$5 * 0.9F + 0.1F, $$5 * 0.85F + 0.15F));
      float $$6 = this.b($$0);
      if ($$6 > 0.0F) {
         int $$7 = axy.a(axy.e($$1), 0.2F);
         $$1 = axy.a($$6 * 0.95F, $$1, $$7);
      }

      return $$1;
   }

   public float i(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (azo.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.25F);
      $$2 = azo.a($$2, 0.0F, 1.0F);
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
   public int a(iv $$0, djh $$1) {
      fsg $$2 = (fsg)this.Q.get($$1);
      return $$2.a($$0);
   }

   public int b(iv $$0, djh $$1) {
      int $$2 = frd.Q().n.G().c();
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

   public gmb.a k() {
      return this.H;
   }

   @Override
   public void a(jf<ege> $$0, ffq $$1, ege.a $$2) {
   }

   protected Map<ezh, ezj> l() {
      return ImmutableMap.copyOf(this.N);
   }

   protected void a(Map<ezh, ezj> $$0) {
      this.N.putAll($$0);
   }

   @Override
   protected efs<bwt> H() {
      return this.f.a();
   }

   @Override
   public String J() {
      return "Chunks[C] W: " + this.R.e() + " E: " + this.f.c();
   }

   @Override
   public void a(iv $$0, ebe $$1) {
      this.K.g.a($$0, $$1);
   }

   public void i(int $$0) {
      this.T = $$0;
   }

   public int m() {
      return this.T;
   }

   @Override
   public cvh K() {
      return this.E.y();
   }

   @Override
   public dbt L() {
      return this.E.A();
   }

   @Override
   public dzb M() {
      return this.E.B();
   }

   @Override
   public void a(
      @Nullable bwt $$0,
      @Nullable bvi $$1,
      @Nullable djr $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      djx.a $$8,
      lw $$9,
      lw $$10,
      jf<awo> $$11
   ) {
   }

   @Override
   public int P() {
      return this.V;
   }

   @Override
   public int s(iv $$0) {
      return frd.Q().aw().a(this.a_($$0), this, $$0, 0);
   }

   @Override
   public void registerForCleaning(glu<gmb, ?> $$0) {
      this.E.a($$0);
   }

   public static class a implements fac {
      private final boolean a;
      private final boolean b;
      private iv c;
      private float d;
      private long e;
      private long f;
      private boolean g;
      private buo h;
      private boolean i;

      public a(buo $$0, boolean $$1, boolean $$2) {
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
      public buo q() {
         return this.h;
      }

      @Override
      public boolean r() {
         return this.i;
      }

      @Override
      public void a(q $$0, djz $$1) {
         fac.super.a($$0, $$1);
      }

      public void a(buo $$0) {
         this.h = $$0;
      }

      public void a(boolean $$0) {
         this.i = $$0;
      }

      public double a(djz $$0) {
         return this.b ? (double)$$0.K_() : 63.0;
      }

      public float e() {
         return this.b ? 1.0F : 0.03125F;
      }
   }

   final class b implements efr<bwt> {
      public void a(bwt $$0) {
      }

      public void b(bwt $$0) {
      }

      public void c(bwt $$0) {
         gmb.this.e.a($$0);
      }

      public void d(bwt $$0) {
         gmb.this.e.b($$0);
      }

      public void e(bwt $$0) {
         Objects.requireNonNull($$0);
         switch ($$0) {
            case gqw $$1:
               gmb.this.L.add($$1);
               break;
            case cmv $$2:
               gmb.this.M.addAll(Arrays.asList($$2.q()));
               break;
         }
      }

      public void f(bwt $$0) {
         $$0.al();
         Objects.requireNonNull($$0);
         switch ($$0) {
            case gqw $$1:
               gmb.this.L.remove($$1);
               break;
            case cmv $$2:
               gmb.this.M.removeAll(Arrays.asList($$2.q()));
               break;
         }
      }

      public void g(bwt $$0) {
      }
   }
}
