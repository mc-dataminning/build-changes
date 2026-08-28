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

public class gax extends dds {
   private static final Logger a = LogUtils.getLogger();
   private static final double b = 0.05;
   private static final int c = 10;
   private static final int d = 1000;
   final dyk e = new dyk();
   private final dyq<btj> f = new dyq<>(btj.class, new gax.b());
   private final gay D;
   private final ggr E;
   private final ggq F;
   private final gax.a G;
   private final ggg H;
   private final brt I;
   private final fib J = fib.Q();
   final List<gfp> K = Lists.newArrayList();
   private final Map<ert, erv> L = Maps.newHashMap();
   private static final int M = -1;
   private int N;
   private final Object2ObjectArrayMap<ddc, fje> O = ad.a(new Object2ObjectArrayMap(3), $$0x -> {
      $$0x.put(ggc.a, new fje($$0xx -> this.b($$0xx, ggc.a)));
      $$0x.put(ggc.b, new fje($$0xx -> this.b($$0xx, ggc.b)));
      $$0x.put(ggc.c, new fje($$0xx -> this.b($$0xx, ggc.c)));
   });
   private final gat P;
   private final Deque<Runnable> Q = Queues.newArrayDeque();
   private int R;
   private final gcj S = new gcj();
   private final int T;
   private static final Set<cvg> U = Set.of(cvo.hB, cvo.hC);

   public void b(int $$0) {
      this.S.a($$0, this);
   }

   public void b(je $$0, dua $$1, int $$2) {
      if (!this.S.a($$0, $$1)) {
         super.a($$0, $$1, $$2, 512);
      }
   }

   public void a(je $$0, dua $$1, eye $$2) {
      dua $$3 = this.a_($$0);
      if ($$3 != $$1) {
         this.a($$0, $$1, 19);
         cnp $$4 = this.J.t;
         if (this == $$4.dS() && $$4.a($$0, $$1)) {
            $$4.h($$2.d, $$2.e, $$2.f);
         }
      }
   }

   gcj a() {
      return this.S;
   }

   @Override
   public boolean a(je $$0, dua $$1, int $$2, int $$3) {
      if (this.S.c()) {
         dua $$4 = this.a_($$0);
         boolean $$5 = super.a($$0, $$1, $$2, $$3);
         if ($$5) {
            this.S.a($$0, $$4, this.J.t);
         }

         return $$5;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   public gax(gay $$0, gax.a $$1, ala<dds> $$2, jn<dxw> $$3, int $$4, int $$5, Supplier<bny> $$6, ggr $$7, boolean $$8, long $$9, int $$10) {
      super($$1, $$2, $$0.v(), $$3, $$6, true, $$8, $$9, 1000000);
      this.D = $$0;
      this.P = new gat(this, $$4);
      this.I = new brt();
      this.G = $$1;
      this.E = $$7;
      this.T = $$10;
      this.F = new ggq(this.J, this, $$7);
      this.H = ggg.a($$3.a());
      this.a(new je(8, 64, 8), 0.0F);
      this.R = $$5;
      this.V();
      this.Y();
   }

   public void a(Runnable $$0) {
      this.Q.add($$0);
   }

   public void b() {
      int $$0 = this.Q.size();
      int $$1 = $$0 < 1000 ? Math.max(10, $$0 / 10) : $$0;

      for (int $$2 = 0; $$2 < $$1; $$2++) {
         Runnable $$3 = this.Q.poll();
         if ($$3 == null) {
            break;
         }

         $$3.run();
      }
   }

   public ggg c() {
      return this.H;
   }

   public void a(BooleanSupplier $$0) {
      this.A_().s();
      if (this.s().i()) {
         this.m();
      }

      if (this.N > 0) {
         this.c(this.N - 1);
      }

      this.ah().a("blocks");
      this.P.a($$0, true);
      this.ah().c();
   }

   private void m() {
      this.b(this.A.c() + 1L);
      if (this.A.o().b(ddo.l)) {
         this.c(this.A.d() + 1L);
      }
   }

   public void b(long $$0) {
      this.G.a($$0);
   }

   public void c(long $$0) {
      if ($$0 < 0L) {
         $$0 = -$$0;
         this.ac().a(ddo.l).a(false, null);
      } else {
         this.ac().a(ddo.l).a(true, null);
      }

      this.G.b($$0);
   }

   public Iterable<btj> d() {
      return this.G().a();
   }

   public void e() {
      bny $$0 = this.ah();
      $$0.a("entities");
      this.e.a($$0x -> {
         if (!$$0x.dN() && !$$0x.bW() && !this.I.a($$0x)) {
            this.a(this::c, $$0x);
         }
      });
      $$0.c();
      this.U();
   }

   public boolean a(btj $$0) {
      return this.e.c($$0);
   }

   @Override
   public boolean h(btj $$0) {
      return $$0.du().a(this.J.t.du()) <= this.R;
   }

   public void c(btj $$0) {
      $$0.by();
      $$0.ag++;
      this.ah().a(() -> lu.f.b($$0.ao()).toString());
      $$0.l();
      this.ah().c();

      for (btj $$1 : $$0.cW()) {
         this.a($$0, $$1);
      }
   }

   private void a(btj $$0, btj $$1) {
      if ($$1.dN() || $$1.dg() != $$0) {
         $$1.af();
      } else if ($$1 instanceof cnp || this.e.c($$1)) {
         $$1.by();
         $$1.ag++;
         $$1.u();

         for (btj $$2 : $$1.cW()) {
            this.a($$1, $$2);
         }
      }
   }

   public void a(dwg $$0) {
      $$0.H();
      this.P.p().a($$0.f(), false);
      this.f.b($$0.f());
   }

   public void a(dcy $$0) {
      this.O.forEach(($$1, $$2) -> $$2.a($$0.e, $$0.f));
      this.f.a($$0);
      this.E.a($$0);
   }

   public void f() {
      this.O.forEach(($$0, $$1) -> $$1.a());
   }

   @Override
   public boolean b(int $$0, int $$1) {
      return true;
   }

   public int g() {
      return this.f.b();
   }

   public void d(btj $$0) {
      this.a($$0.ap(), btj.c.b);
      this.f.a($$0);
   }

   public void a(int $$0, btj.c $$1) {
      btj $$2 = this.G().a($$0);
      if ($$2 != null) {
         $$2.b($$1);
         $$2.au();
      }
   }

   @Nullable
   @Override
   public btj a(int $$0) {
      return this.G().a($$0);
   }

   @Override
   public void Z() {
      this.D.k().a(xd.c("multiplayer.status.quitting"));
   }

   public void b(int $$0, int $$1, int $$2) {
      int $$3 = 32;
      azk $$4 = azk.a();
      dgv $$5 = this.n();
      je.a $$6 = new je.a();

      for (int $$7 = 0; $$7 < 667; $$7++) {
         this.a($$0, $$1, $$2, 16, $$4, $$5, $$6);
         this.a($$0, $$1, $$2, 32, $$4, $$5, $$6);
      }
   }

   @Nullable
   private dgv n() {
      if (this.J.r.j() == ddp.b) {
         cvl $$0 = this.J.t.eW();
         cvg $$1 = $$0.h();
         if (U.contains($$1) && $$1 instanceof ctl $$2) {
            return $$2.d();
         }
      }

      return null;
   }

   public void a(int $$0, int $$1, int $$2, int $$3, azk $$4, @Nullable dgv $$5, je.a $$6) {
      int $$7 = $$0 + this.z.a($$3) - this.z.a($$3);
      int $$8 = $$1 + this.z.a($$3) - this.z.a($$3);
      int $$9 = $$2 + this.z.a($$3) - this.z.a($$3);
      $$6.d($$7, $$8, $$9);
      dua $$10 = this.a_($$6);
      $$10.b().a($$10, this, $$6, $$4);
      eqb $$11 = this.b_($$6);
      if (!$$11.c()) {
         $$11.a(this, $$6, $$4);
         ll $$12 = $$11.h();
         if ($$12 != null && this.z.a(10) == 0) {
            boolean $$13 = $$10.c(this, $$6, jj.a);
            je $$14 = $$6.e();
            this.a($$14, this.a_($$14), $$12, $$13);
         }
      }

      if ($$5 == $$10.b()) {
         this.a(new lf(ln.c, $$10), (double)$$7 + 0.5, (double)$$8 + 0.5, (double)$$9 + 0.5, 0.0, 0.0, 0.0);
      }

      if (!$$10.m(this, $$6)) {
         this.t($$6).a().k().ifPresent($$1x -> {
            if ($$1x.a(this.z)) {
               this.a($$1x.a(), (double)$$6.u() + this.z.j(), (double)$$6.v() + this.z.j(), (double)$$6.w() + this.z.j(), 0.0, 0.0, 0.0);
            }
         });
      }
   }

   private void a(je $$0, dua $$1, ll $$2, boolean $$3) {
      if ($$1.y().c()) {
         eyx $$4 = $$1.g(this, $$0);
         double $$5 = $$4.c(jj.a.b);
         if ($$5 < 1.0) {
            if ($$3) {
               this.a((double)$$0.u(), (double)($$0.u() + 1), (double)$$0.w(), (double)($$0.w() + 1), (double)($$0.v() + 1) - 0.05, $$2);
            }
         } else if (!$$1.a(aws.ap)) {
            double $$6 = $$4.b(jj.a.b);
            if ($$6 > 0.0) {
               this.a($$0, $$2, $$4, (double)$$0.v() + $$6 - 0.05);
            } else {
               je $$7 = $$0.e();
               dua $$8 = this.a_($$7);
               eyx $$9 = $$8.g(this, $$7);
               double $$10 = $$9.c(jj.a.b);
               if ($$10 < 1.0 && $$8.y().c()) {
                  this.a($$0, $$2, $$4, (double)$$0.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(je $$0, ll $$1, eyx $$2, double $$3) {
      this.a((double)$$0.u() + $$2.b(jj.a.a), (double)$$0.u() + $$2.c(jj.a.a), (double)$$0.w() + $$2.b(jj.a.c), (double)$$0.w() + $$2.c(jj.a.c), $$3, $$1);
   }

   private void a(double $$0, double $$1, double $$2, double $$3, double $$4, ll $$5) {
      this.a($$5, azc.d(this.z.j(), $$0, $$1), $$4, azc.d(this.z.j(), $$2, $$3), 0.0, 0.0, 0.0);
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Server brand", () -> this.J.t.cx.f());
      $$1.a("Server type", () -> this.J.V() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server");
      $$1.a("Tracked entity count", () -> String.valueOf(this.g()));
      return $$1;
   }

   @Override
   public void a(@Nullable cnp $$0, double $$1, double $$2, double $$3, jn<awc> $$4, awe $$5, float $$6, float $$7, long $$8) {
      if ($$0 == this.J.t) {
         this.a($$1, $$2, $$3, $$4.a(), $$5, $$6, $$7, false, $$8);
      }
   }

   @Override
   public void a(@Nullable cnp $$0, btj $$1, jn<awc> $$2, awe $$3, float $$4, float $$5, long $$6) {
      if ($$0 == this.J.t) {
         this.J.aj().a((hae)(new gzv($$2.a(), $$3, $$4, $$5, $$1, $$6)));
      }
   }

   @Override
   public void a(btj $$0, awc $$1, awe $$2, float $$3, float $$4) {
      this.J.aj().a((hae)(new gzv($$1, $$2, $$3, $$4, $$0, this.z.g())));
   }

   @Override
   public void a(double $$0, double $$1, double $$2, awc $$3, awe $$4, float $$5, float $$6, boolean $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.z.g());
   }

   private void a(double $$0, double $$1, double $$2, awc $$3, awe $$4, float $$5, float $$6, boolean $$7, long $$8) {
      double $$9 = this.J.j.l().b().c($$0, $$1, $$2);
      gzz $$10 = new gzz($$3, $$4, $$5, $$6, azk.a($$8), $$0, $$1, $$2);
      if ($$7 && $$9 > 100.0) {
         double $$11 = Math.sqrt($$9) / 40.0;
         this.J.aj().a($$10, (int)($$11 * 20.0));
      } else {
         this.J.aj().a($$10);
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<cye> $$6) {
      if ($$6.isEmpty()) {
         for (int $$7 = 0; $$7 < this.z.a(3) + 2; $$7++) {
            this.a(ln.ab, $$0, $$1, $$2, this.z.k() * 0.05, 0.005, this.z.k() * 0.05);
         }
      } else {
         this.J.g.a(new gdo.e(this, $$0, $$1, $$2, $$3, $$4, $$5, this.J.g, $$6));
      }
   }

   @Override
   public void a(zk<?> $$0) {
      this.D.b($$0);
   }

   @Override
   public czx r() {
      return this.D.j();
   }

   @Override
   public brt s() {
      return this.I;
   }

   @Override
   public ezr<dgv> R() {
      return ezo.b();
   }

   @Override
   public ezr<eqa> Q() {
      return ezo.b();
   }

   public gat h() {
      return this.P;
   }

   @Nullable
   @Override
   public erv a(ert $$0) {
      return this.L.get($$0);
   }

   public void b(ert $$0, erv $$1) {
      this.L.put($$0, $$1);
   }

   @Override
   public void a(ert $$0, erv $$1) {
   }

   @Override
   public ert v() {
      return new ert(0);
   }

   @Override
   public ezi O() {
      return this.D.z();
   }

   @Override
   public void a(je $$0, dua $$1, dua $$2, int $$3) {
      this.E.a(this, $$0, $$1, $$2, $$3);
   }

   @Override
   public void b(je $$0, dua $$1, dua $$2) {
      this.E.a($$0, $$1, $$2);
   }

   public void c(int $$0, int $$1, int $$2) {
      this.E.a($$0, $$1, $$2);
   }

   public void b(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      this.E.b($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(int $$0, je $$1, int $$2) {
      this.E.a($$0, $$1, $$2);
   }

   @Override
   public void b(int $$0, je $$1, int $$2) {
      this.F.a($$0, $$1, $$2);
   }

   @Override
   public void a(@Nullable cnp $$0, int $$1, je $$2, int $$3) {
      try {
         this.F.b($$1, $$2, $$3);
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
   public void a(ll $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.E.a($$0, $$0.a().b(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void a(ll $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.E.a($$0, $$0.a().b() || $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void b(ll $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.E.a($$0, false, true, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void b(ll $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.E.a($$0, $$0.a().b() || $$1, true, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public List<gfp> x() {
      return this.K;
   }

   @Override
   public jn<det> a(int $$0, int $$1, int $$2) {
      return this.F_().d(lv.aF).g(dfa.b);
   }

   public float g(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (azc.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.2F);
      $$2 = azc.a($$2, 0.0F, 1.0F);
      $$2 = 1.0F - $$2;
      $$2 *= 1.0F - this.d($$0) * 5.0F / 16.0F;
      $$2 *= 1.0F - this.b($$0) * 5.0F / 16.0F;
      return $$2 * 0.8F + 0.2F;
   }

   public int a(eye $$0, float $$1) {
      float $$2 = this.f($$1);
      eye $$3 = $$0.a(2.0, 2.0, 2.0).c(0.25);
      eye $$4 = ayd.a($$3, ($$0x, $$1x, $$2x) -> eye.a(this.D_().a($$0x, $$1x, $$2x).a().a()));
      float $$5 = azc.b($$2 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$5 = azc.a($$5, 0.0F, 1.0F);
      $$4 = $$4.c((double)$$5);
      int $$6 = axn.a($$4);
      float $$7 = this.d($$1);
      if ($$7 > 0.0F) {
         float $$8 = 0.6F;
         float $$9 = $$7 * 0.75F;
         int $$10 = axn.a(axn.e($$6), 0.6F);
         $$6 = axn.a($$9, $$6, $$10);
      }

      float $$11 = this.b($$1);
      if ($$11 > 0.0F) {
         float $$12 = 0.2F;
         float $$13 = $$11 * 0.75F;
         int $$14 = axn.a(axn.e($$6), 0.2F);
         $$6 = axn.a($$13, $$6, $$14);
      }

      int $$15 = this.i();
      if ($$15 > 0) {
         float $$16 = Math.min((float)$$15 - $$1, 1.0F);
         $$16 *= 0.45F;
         $$6 = axn.a($$16, $$6, axn.a(204, 204, 255));
      }

      return $$6;
   }

   public int h(float $$0) {
      int $$1 = -1;
      float $$2 = this.d($$0);
      if ($$2 > 0.0F) {
         int $$3 = axn.a(axn.e($$1), 0.6F);
         $$1 = axn.a($$2 * 0.95F, $$1, $$3);
      }

      float $$4 = this.f($$0);
      float $$5 = azc.b($$4 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$5 = azc.a($$5, 0.0F, 1.0F);
      $$1 = axn.a($$1, axn.a(1.0F, $$5 * 0.9F + 0.1F, $$5 * 0.9F + 0.1F, $$5 * 0.85F + 0.15F));
      float $$6 = this.b($$0);
      if ($$6 > 0.0F) {
         int $$7 = axn.a(axn.e($$1), 0.2F);
         $$1 = axn.a($$6 * 0.95F, $$1, $$7);
      }

      return $$1;
   }

   public float i(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (azc.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.25F);
      $$2 = azc.a($$2, 0.0F, 1.0F);
      return $$2 * $$2 * 0.5F;
   }

   public int i() {
      return this.J.n.b().c() ? 0 : this.N;
   }

   @Override
   public void c(int $$0) {
      this.N = $$0;
   }

   @Override
   public float a(jj $$0, boolean $$1) {
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
   public int a(je $$0, ddc $$1) {
      fje $$2 = (fje)this.O.get($$1);
      return $$2.a($$0);
   }

   public int b(je $$0, ddc $$1) {
      int $$2 = fib.Q().n.F().c();
      if ($$2 == 0) {
         return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
      } else {
         int $$3 = ($$2 * 2 + 1) * ($$2 * 2 + 1);
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         jg $$7 = new jg($$0.u() - $$2, $$0.v(), $$0.w() - $$2, $$0.u() + $$2, $$0.v(), $$0.w() + $$2);
         je.a $$8 = new je.a();

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

   public void a(je $$0, float $$1) {
      this.A.a($$0, $$1);
   }

   @Override
   public String toString() {
      return "ClientLevel";
   }

   public gax.a j() {
      return this.G;
   }

   @Override
   public void a(jn<dyx> $$0, eye $$1, dyx.a $$2) {
   }

   protected Map<ert, erv> k() {
      return ImmutableMap.copyOf(this.L);
   }

   protected void a(Map<ert, erv> $$0) {
      this.L.putAll($$0);
   }

   @Override
   protected dyn<btj> G() {
      return this.f.a();
   }

   @Override
   public String I() {
      return "Chunks[C] W: " + this.P.e() + " E: " + this.f.c();
   }

   @Override
   public void a(je $$0, dua $$1) {
      this.J.g.a($$0, $$1);
   }

   public void h(int $$0) {
      this.R = $$0;
   }

   public int l() {
      return this.R;
   }

   @Override
   public cqh J() {
      return this.D.y();
   }

   @Override
   public cxm K() {
      return this.D.A();
   }

   @Override
   public dsb L() {
      return this.D.B();
   }

   @Override
   public void a(
      @Nullable btj $$0,
      @Nullable bsb $$1,
      @Nullable ddl $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dds.a $$8,
      ll $$9,
      ll $$10,
      jn<awc> $$11
   ) {
   }

   @Override
   public int N() {
      return this.T;
   }

   public static class a implements eso {
      private final boolean a;
      private final ddo b;
      private final boolean c;
      private je d;
      private float e;
      private long f;
      private long g;
      private boolean h;
      private brh i;
      private boolean j;

      public a(cqh $$0, brh $$1, boolean $$2, boolean $$3) {
         this.i = $$1;
         this.a = $$2;
         this.c = $$3;
         this.b = new ddo($$0);
      }

      @Override
      public je a() {
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
      public void a(je $$0, float $$1) {
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
      public ddo o() {
         return this.b;
      }

      @Override
      public brh q() {
         return this.i;
      }

      @Override
      public boolean r() {
         return this.j;
      }

      @Override
      public void a(p $$0, ddu $$1) {
         eso.super.a($$0, $$1);
      }

      public void a(brh $$0) {
         this.i = $$0;
      }

      public void a(boolean $$0) {
         this.j = $$0;
      }

      public double a(ddu $$0) {
         return this.c ? (double)$$0.G_() : 63.0;
      }

      public float e() {
         return this.c ? 1.0F : 0.03125F;
      }
   }

   final class b implements dym<btj> {
      public void a(btj $$0) {
      }

      public void b(btj $$0) {
      }

      public void c(btj $$0) {
         gax.this.e.a($$0);
      }

      public void d(btj $$0) {
         gax.this.e.b($$0);
      }

      public void e(btj $$0) {
         if ($$0 instanceof gfp) {
            gax.this.K.add((gfp)$$0);
         }
      }

      public void f(btj $$0) {
         $$0.am();
         gax.this.K.remove($$0);
      }

      public void g(btj $$0) {
      }
   }
}
