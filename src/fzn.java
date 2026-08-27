import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Deque;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fzn extends dca {
   private static final Logger a = LogUtils.getLogger();
   private static final double b = 0.05;
   private static final int c = 10;
   private static final int d = 1000;
   final dxi e = new dxi();
   private final dxo<brv> f = new dxo<>(brv.class, new fzn.b());
   final Object2ObjectMap<UUID, fht> E = new Object2ObjectOpenHashMap();
   private final fzo F;
   private final gfe G;
   private final fzn.a H;
   private final gev I;
   private final bql J;
   private final fgj K = fgj.Q();
   final List<gef> L = Lists.newArrayList();
   private final Map<eqr, eqt> M = Maps.newHashMap();
   private int N;
   private final Object2ObjectArrayMap<dbl, fho> O = ad.a(new Object2ObjectArrayMap(3), $$0x -> {
      $$0x.put(ges.a, new fho($$0xx -> this.b($$0xx, ges.a)));
      $$0x.put(ges.b, new fho($$0xx -> this.b($$0xx, ges.b)));
      $$0x.put(ges.c, new fho($$0xx -> this.b($$0xx, ges.c)));
   });
   private final fzj P;
   private final Deque<Runnable> Q = Queues.newArrayDeque();
   private int R;
   private final gaz S = new gaz();
   private static final Set<cuc> T = Set.of(cuk.iP, cuk.iQ);
   private static final int U = 512;
   private static final float[][] V = new float[512][512];
   private static final float[][] W = new float[512][512];

   public void b(int $$0) {
      this.S.a($$0, this);
   }

   public void b(ir $$0, dtc $$1, int $$2) {
      if (!this.S.a($$0, $$1)) {
         super.a($$0, $$1, $$2, 512);
      }
   }

   public void a(ir $$0, dtc $$1, ewu $$2) {
      dtc $$3 = this.a_($$0);
      if ($$3 != $$1) {
         this.a($$0, $$1, 19);
         cly $$4 = this.K.s;
         if (this == $$4.dU() && $$4.a($$0, $$1)) {
            $$4.h($$2.c, $$2.d, $$2.e);
         }
      }
   }

   gaz a() {
      return this.S;
   }

   @Override
   public boolean a(ir $$0, dtc $$1, int $$2, int $$3) {
      if (this.S.c()) {
         dtc $$4 = this.a_($$0);
         boolean $$5 = super.a($$0, $$1, $$2, $$3);
         if ($$5) {
            this.S.a($$0, $$4, this.K.s);
         }

         return $$5;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   public fzn(fzo $$0, fzn.a $$1, aks<dca> $$2, ja<dwu> $$3, int $$4, int $$5, Supplier<bmo> $$6, gfe $$7, boolean $$8, long $$9) {
      super($$1, $$2, $$0.w(), $$3, $$6, true, $$8, $$9, 1000000);
      this.F = $$0;
      this.P = new fzj(this, $$4);
      this.J = new bql();
      this.H = $$1;
      this.G = $$7;
      this.I = gev.a($$3.a());
      this.a(new ir(8, 64, 8), 0.0F);
      this.R = $$5;
      this.U();
      this.X();
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

   public boolean c() {
      return this.Q.isEmpty();
   }

   public gev d() {
      return this.I;
   }

   public void a(BooleanSupplier $$0) {
      this.D_().s();
      if (this.s().i()) {
         this.n();
      }

      if (this.N > 0) {
         this.c(this.N - 1);
      }

      this.ag().a("blocks");
      this.P.a($$0, true);
      this.ag().c();
   }

   private void n() {
      this.b(this.B.c() + 1L);
      if (this.B.o().b(dbw.l)) {
         this.c(this.B.d() + 1L);
      }
   }

   public void b(long $$0) {
      this.H.a($$0);
   }

   public void c(long $$0) {
      if ($$0 < 0L) {
         $$0 = -$$0;
         this.ab().a(dbw.l).a(false, null);
      } else {
         this.ab().a(dbw.l).a(true, null);
      }

      this.H.b($$0);
   }

   public Iterable<brv> e() {
      return this.G().b();
   }

   public void f() {
      bmo $$0 = this.ag();
      $$0.a("entities");

      for (fht $$1 : List.copyOf(this.E.values())) {
         this.d($$1.d());
      }

      this.e.a(this::d);
      $$0.c();
      this.T();
   }

   private void d(brv $$0) {
      if (!$$0.dP() && !$$0.bW() && !this.J.a($$0)) {
         this.a(this::a, $$0);
      }
   }

   @Override
   public boolean h(brv $$0) {
      return $$0.dw().a(this.K.s.dw()) <= this.R;
   }

   public void a(brv $$0) {
      $$0.bz();
      $$0.am++;
      this.ag().a(() -> lh.g.b($$0.ak()).toString());
      $$0.l();
      this.ag().c();

      for (brv $$1 : $$0.cX()) {
         this.a($$0, $$1);
      }
   }

   private void a(brv $$0, brv $$1) {
      if ($$1.dP() || $$1.dh() != $$0) {
         $$1.ae();
      } else if ($$1 instanceof cly || this.e.c($$1)) {
         $$1.bz();
         $$1.am++;
         $$1.v();

         for (brv $$2 : $$1.cX()) {
            this.a($$1, $$2);
         }
      }
   }

   public void a(dvi $$0) {
      $$0.J();
      this.P.p().a($$0.g(), false);
      this.f.b($$0.g());
   }

   public void a(dbh $$0) {
      this.O.forEach(($$1, $$2) -> $$2.a($$0.e, $$0.f));
      this.f.a($$0);
      this.G.a($$0);
   }

   public void g() {
      this.O.forEach(($$0, $$1) -> $$1.a());
   }

   @Override
   public boolean b(int $$0, int $$1) {
      return true;
   }

   public int h() {
      return this.f.b();
   }

   public void c(brv $$0) {
      this.a($$0.al(), brv.d.b);
      this.f.a($$0);
   }

   public void a(int $$0, brv.d $$1) {
      brv $$2 = this.G().a($$0);
      if ($$2 != null) {
         $$2.b($$1);
         $$2.aq();
      }
   }

   @Nullable
   @Override
   public brv a(int $$0) {
      return this.G().a($$0);
   }

   @Override
   public void Y() {
      this.F.l().a(xe.c("multiplayer.status.quitting"));
   }

   public void b(int $$0, int $$1, int $$2) {
      int $$3 = 32;
      ayt $$4 = ayt.a();
      dfc $$5 = this.p();
      ir.a $$6 = new ir.a();

      for (int $$7 = 0; $$7 < 667; $$7++) {
         this.a($$0, $$1, $$2, 16, $$4, $$5, $$6);
         this.a($$0, $$1, $$2, 32, $$4, $$5, $$6);
      }
   }

   @Nullable
   private dfc p() {
      if (this.K.q.j() == dbx.b) {
         cuh $$0 = this.K.s.fg();
         cuc $$1 = $$0.f();
         if (T.contains($$1) && $$1 instanceof csc $$2) {
            return $$2.d();
         }
      }

      return null;
   }

   public void a(int $$0, int $$1, int $$2, int $$3, ayt $$4, @Nullable dfc $$5, ir.a $$6) {
      int $$7 = $$0 + this.A.a($$3) - this.A.a($$3);
      int $$8 = $$1 + this.A.a($$3) - this.A.a($$3);
      int $$9 = $$2 + this.A.a($$3) - this.A.a($$3);
      $$6.d($$7, $$8, $$9);
      dtc $$10 = this.a_($$6);
      $$10.b().a($$10, this, $$6, $$4);
      epe $$11 = this.b_($$6);
      if (!$$11.c()) {
         $$11.a(this, $$6, $$4);
         kz $$12 = $$11.h();
         if ($$12 != null && this.A.a(10) == 0) {
            boolean $$13 = $$10.d(this, $$6, iw.a);
            ir $$14 = $$6.d();
            this.a($$14, this.a_($$14), $$12, $$13);
         }
      }

      if ($$5 == $$10.b()) {
         this.a(new ks(lb.c, $$10), (double)$$7 + 0.5, (double)$$8 + 0.5, (double)$$9 + 0.5, 0.0, 0.0, 0.0);
      }

      if (!$$10.r(this, $$6)) {
         this.t($$6).a().k().ifPresent($$1x -> {
            if ($$1x.a(this.A)) {
               this.a($$1x.a(), (double)$$6.u() + this.A.j(), (double)$$6.v() + this.A.j(), (double)$$6.w() + this.A.j(), 0.0, 0.0, 0.0);
            }
         });
      }
   }

   private void a(ir $$0, dtc $$1, kz $$2, boolean $$3) {
      if ($$1.u().c()) {
         exn $$4 = $$1.k(this, $$0);
         double $$5 = $$4.c(iw.a.b);
         if ($$5 < 1.0) {
            if ($$3) {
               this.a((double)$$0.u(), (double)($$0.u() + 1), (double)$$0.w(), (double)($$0.w() + 1), (double)($$0.v() + 1) - 0.05, $$2);
            }
         } else if (!$$1.a(awe.ap)) {
            double $$6 = $$4.b(iw.a.b);
            if ($$6 > 0.0) {
               this.a($$0, $$2, $$4, (double)$$0.v() + $$6 - 0.05);
            } else {
               ir $$7 = $$0.d();
               dtc $$8 = this.a_($$7);
               exn $$9 = $$8.k(this, $$7);
               double $$10 = $$9.c(iw.a.b);
               if ($$10 < 1.0 && $$8.u().c()) {
                  this.a($$0, $$2, $$4, (double)$$0.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(ir $$0, kz $$1, exn $$2, double $$3) {
      this.a((double)$$0.u() + $$2.b(iw.a.a), (double)$$0.u() + $$2.c(iw.a.a), (double)$$0.w() + $$2.b(iw.a.c), (double)$$0.w() + $$2.c(iw.a.c), $$3, $$1);
   }

   private void a(double $$0, double $$1, double $$2, double $$3, double $$4, kz $$5) {
      this.a($$5, aym.d(this.A.j(), $$0, $$1), $$4, aym.d(this.A.j(), $$2, $$3), 0.0, 0.0, 0.0);
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Server brand", () -> this.K.s.h.g());
      $$1.a("Server type", () -> this.K.V() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server");
      $$1.a("Tracked entity count", () -> String.valueOf(this.h()));
      return $$1;
   }

   @Override
   public void a(@Nullable cly $$0, double $$1, double $$2, double $$3, ja<avn> $$4, avq $$5, float $$6, float $$7, long $$8) {
      if ($$0 == this.K.s) {
         this.a($$1, $$2, $$3, $$4.a(), $$5, $$6, $$7, false, $$8);
      }
   }

   @Override
   public void a(@Nullable cly $$0, brv $$1, ja<avn> $$2, avq $$3, float $$4, float $$5, long $$6) {
      if ($$0 == this.K.s) {
         this.K.ak().a((gum)(new gud($$2.a(), $$3, $$4, $$5, $$1, $$6)));
      }
   }

   @Override
   public void a(brv $$0, avn $$1, avq $$2, float $$3, float $$4) {
      this.K.ak().a((gum)(new gud($$1, $$2, $$3, $$4, $$0, this.A.g())));
   }

   @Override
   public void a(double $$0, double $$1, double $$2, avn $$3, avq $$4, float $$5, float $$6, boolean $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.A.g());
   }

   private void a(double $$0, double $$1, double $$2, avn $$3, avq $$4, float $$5, float $$6, boolean $$7, long $$8) {
      double $$9 = this.K.j.m().b().c($$0, $$1, $$2);
      guh $$10 = new guh($$3, $$4, $$5, $$6, ayt.a($$8), $$0, $$1, $$2);
      if ($$7 && $$9 > 100.0) {
         double $$11 = Math.sqrt($$9) / 40.0;
         this.K.ak().a($$10, (int)($$11 * 20.0));
      } else {
         this.K.ak().a($$10);
      }
   }

   @Override
   public void a(int $$0, double $$1, double $$2, double $$3, avn $$4, avq $$5, float $$6, float $$7) {
      guh $$8 = new guh($$4, $$5, $$6, $$7, ayt.a(0L), $$1, $$2, $$3);
      this.K.ak().a($$8, $$0);
   }

   @Override
   public void a(double $$0, double $$1, double $$2, Consumer<avp> $$3) {
      $$3.accept(($$3x, $$4, $$5, $$6, $$7) -> this.a($$3x, $$0, $$1, $$2, $$4, $$5, $$6, $$7));
   }

   @Override
   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<cxj> $$6) {
      if ($$6.isEmpty()) {
         for (int $$7 = 0; $$7 < this.A.a(3) + 2; $$7++) {
            this.a(lb.Z, $$0, $$1, $$2, this.A.k() * 0.05, 0.005, this.A.k() * 0.05);
         }
      } else {
         this.K.g.a(new gce.e(this, $$0, $$1, $$2, $$3, $$4, $$5, this.K.g, $$6));
      }
   }

   @Override
   public void a(zl<?> $$0) {
      this.F.b($$0);
   }

   @Override
   public czd r() {
      return this.F.k();
   }

   @Override
   public bql s() {
      return this.J;
   }

   @Override
   public eyh<dfc> P() {
      return eye.b();
   }

   @Override
   public eyh<epd> O() {
      return eye.b();
   }

   public fzj i() {
      return this.P;
   }

   @Nullable
   @Override
   public eqt a(eqr $$0) {
      return this.M.get($$0);
   }

   public void b(eqr $$0, eqt $$1) {
      this.M.put($$0, $$1);
   }

   @Override
   public void a(eqr $$0, eqt $$1) {
   }

   @Override
   public eqr v() {
      return new eqr(0);
   }

   @Override
   public exy M() {
      return this.F.z();
   }

   @Override
   public void a(ir $$0, dtc $$1, dtc $$2, int $$3) {
      this.G.a(this, $$0, $$1, $$2, $$3);
   }

   @Override
   public void b(ir $$0, dtc $$1, dtc $$2) {
      this.G.a($$0, $$1, $$2);
   }

   public void c(int $$0, int $$1, int $$2) {
      this.G.a($$0, $$1, $$2);
   }

   @Override
   public void a(int $$0, ir $$1, int $$2) {
      this.G.c($$0, $$1, $$2);
   }

   @Override
   public void b(int $$0, ir $$1, int $$2) {
      this.G.a($$0, $$1, $$2);
   }

   @Override
   public void a(@Nullable cly $$0, int $$1, ir $$2, int $$3) {
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
   public void a(kz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.G.a($$0, $$0.a().b(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void a(kz $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.G.a($$0, $$0.a().b() || $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void b(kz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.G.a($$0, false, true, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void b(kz $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.G.a($$0, $$0.a().b() || $$1, true, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public List<gef> x() {
      return this.L;
   }

   @Override
   public ja<dcz> a(int $$0, int $$1, int $$2) {
      return this.I_().d(li.az).g(ddg.b);
   }

   public float g(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (aym.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.2F);
      $$2 = aym.a($$2, 0.0F, 1.0F);
      $$2 = 1.0F - $$2;
      $$2 *= 1.0F - this.d($$0) * 5.0F / 16.0F;
      $$2 *= 1.0F - this.b($$0) * 5.0F / 16.0F;
      return $$2 * 0.8F + 0.2F;
   }

   public ewu a(ewu $$0, float $$1) {
      float $$2 = this.f($$1);
      ewu $$3 = $$0.a(2.0, 2.0, 2.0).a(0.25);
      ddb $$4 = this.G_();
      ewu $$5 = axn.a($$3, ($$1x, $$2x, $$3x) -> ewu.a($$4.a($$1x, $$2x, $$3x).a().a()));
      float $$6 = aym.b($$2 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$6 = aym.a($$6, 0.0F, 1.0F);
      float $$7 = (float)$$5.c * $$6;
      float $$8 = (float)$$5.d * $$6;
      float $$9 = (float)$$5.e * $$6;
      float $$10 = this.a($$1, $$0.b());
      if ($$10 > 0.0F) {
         float $$11 = ($$7 * 0.3F + $$8 * 0.59F + $$9 * 0.11F) * 0.6F;
         float $$12 = 1.0F - $$10 * 0.75F;
         $$7 = $$7 * $$12 + $$11 * (1.0F - $$12);
         $$8 = $$8 * $$12 + $$11 * (1.0F - $$12);
         $$9 = $$9 * $$12 + $$11 * (1.0F - $$12);
      }

      float $$13 = this.b($$1, $$0.b());
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

      return new ewu((double)$$7, (double)$$8, (double)$$9);
   }

   public ewu h(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = aym.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$2 = aym.a($$2, 0.0F, 1.0F);
      int $$3 = this.d().d();
      float $$4 = (float)($$3 >> 16 & 0xFF) / 255.0F;
      float $$5 = (float)($$3 >> 8 & 0xFF) / 255.0F;
      float $$6 = (float)($$3 & 0xFF) / 255.0F;
      float $$7 = this.d($$0);
      if ($$7 > 0.0F) {
         float $$8 = ($$4 * 0.3F + $$5 * 0.59F + $$6 * 0.11F) * 0.6F;
         float $$9 = 1.0F - $$7 * 0.95F;
         $$4 = $$4 * $$9 + $$8 * (1.0F - $$9);
         $$5 = $$5 * $$9 + $$8 * (1.0F - $$9);
         $$6 = $$6 * $$9 + $$8 * (1.0F - $$9);
      }

      $$4 *= $$2 * 0.9F + 0.1F;
      $$5 *= $$2 * 0.9F + 0.1F;
      $$6 *= $$2 * 0.85F + 0.15F;
      float $$10 = this.b($$0);
      if ($$10 > 0.0F) {
         float $$11 = ($$4 * 0.3F + $$5 * 0.59F + $$6 * 0.11F) * 0.2F;
         float $$12 = 1.0F - $$10 * 0.95F;
         $$4 = $$4 * $$12 + $$11 * (1.0F - $$12);
         $$5 = $$5 * $$12 + $$11 * (1.0F - $$12);
         $$6 = $$6 * $$12 + $$11 * (1.0F - $$12);
      }

      return new ewu((double)$$4, (double)$$5, (double)$$6);
   }

   public float i(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (aym.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.25F);
      $$2 = aym.a($$2, 0.0F, 1.0F);
      return $$2 * $$2 * 0.5F;
   }

   public int j() {
      return this.K.m.b().c() ? 0 : this.N;
   }

   @Override
   public void c(int $$0) {
      this.N = $$0;
   }

   @Override
   public float a(iw $$0, boolean $$1) {
      boolean $$2 = this.d().f();
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
   public int a(ir $$0, dbl $$1) {
      fho $$2 = (fho)this.O.get($$1);
      return $$2.a($$0);
   }

   public int b(ir $$0, dbl $$1) {
      int $$2 = fgj.Q().m.E().c();
      boolean $$3 = this.t($$0).a(ddg.f) && $$1 == ges.b;
      if ($$2 == 0) {
         return $$3
            ? this.t($$0).a().a(V[Math.floorMod($$0.u(), 512)][Math.floorMod($$0.w(), 512)], W[Math.floorMod($$0.u(), 512)][Math.floorMod($$0.w(), 512)])
            : $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
      } else {
         int $$4 = ($$2 * 2 + 1) * ($$2 * 2 + 1);
         int $$5 = 0;
         int $$6 = 0;
         int $$7 = 0;
         it $$8 = new it($$0.u() - $$2, $$0.v(), $$0.w() - $$2, $$0.u() + $$2, $$0.v(), $$0.w() + $$2);
         ir.a $$9 = new ir.a();

         while ($$8.a()) {
            $$9.d($$8.b(), $$8.c(), $$8.d());
            int $$10;
            if ($$3) {
               $$10 = this.t($$9)
                  .a()
                  .a(V[Math.floorMod($$9.u(), 512)][Math.floorMod($$9.w(), 512)], W[Math.floorMod($$9.u(), 512)][Math.floorMod($$9.w(), 512)]);
            } else {
               $$10 = $$1.getColor(this.t($$9).a(), (double)$$9.u(), (double)$$9.w());
            }

            $$5 += ($$10 & 0xFF0000) >> 16;
            $$6 += ($$10 & 0xFF00) >> 8;
            $$7 += $$10 & 0xFF;
         }

         return ($$5 / $$4 & 0xFF) << 16 | ($$6 / $$4 & 0xFF) << 8 | $$7 / $$4 & 0xFF;
      }
   }

   public void a(ir $$0, float $$1) {
      this.B.a($$0, $$1);
   }

   @Override
   public String toString() {
      return "ClientLevel";
   }

   public fzn.a k() {
      return this.H;
   }

   @Override
   public void a(ja<dxv> $$0, ewu $$1, dxv.a $$2) {
   }

   protected Map<eqr, eqt> l() {
      return ImmutableMap.copyOf(this.M);
   }

   protected void a(Map<eqr, eqt> $$0) {
      this.M.putAll($$0);
   }

   @Override
   protected dxl<brv> G() {
      return this.f.a();
   }

   @Override
   public Iterable<fht> H() {
      return this.E.values();
   }

   @Nullable
   @Override
   public cpa b(UUID $$0) {
      return (cpa)this.E.get($$0);
   }

   @Override
   public cpa a(coz $$0) {
      return new fht(this, $$0);
   }

   @Override
   public String J() {
      return "Chunks[C] W: " + this.P.e() + " E: " + this.f.c();
   }

   @Override
   public void a(ir $$0, dtc $$1) {
      this.K.g.a($$0, $$1);
   }

   public void h(int $$0) {
      this.R = $$0;
   }

   public int m() {
      return this.R;
   }

   @Override
   public cop K() {
      return this.F.y();
   }

   static {
      eoj $$0 = new eoj(new dzt(new dyv(-559038242L)), ImmutableList.of(-2, -1, 0));
      eoj $$1 = new eoj(new dzt(new dyv(-17973521L)), ImmutableList.of(-2, -1, 0));

      for (int $$2 = 0; $$2 < 512; $$2++) {
         for (int $$3 = 0; $$3 < 512; $$3++) {
            V[$$2][$$3] = 2.0F * (float)$$0.a((double)((float)$$2 / 8.0F), (double)((float)$$3 / 8.0F), false);
            W[$$2][$$3] = 2.0F * (float)$$1.a((double)((float)$$2 / 8.0F), (double)((float)$$3 / 8.0F), false);
         }
      }
   }

   public static class a implements erm {
      private final boolean a;
      private final dbw b;
      private final boolean c;
      private ir d;
      private float e;
      private long f;
      private long g;
      private boolean h;
      private bpx i;
      private boolean j;

      public a(bpx $$0, boolean $$1, boolean $$2) {
         this.i = $$0;
         this.a = $$1;
         this.c = $$2;
         this.b = new dbw();
      }

      @Override
      public ir a() {
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
      public void a(ir $$0, float $$1) {
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
      public dbw o() {
         return this.b;
      }

      @Override
      public bpx q() {
         return this.i;
      }

      @Override
      public boolean r() {
         return this.j;
      }

      @Override
      public void a(p $$0, dcc $$1) {
         erm.super.a($$0, $$1);
      }

      public void a(bpx $$0) {
         this.i = $$0;
      }

      public void a(boolean $$0) {
         this.j = $$0;
      }

      public double a(dcc $$0) {
         return this.c ? (double)$$0.J_() : 63.0;
      }

      public float e() {
         return this.c ? 1.0F : 0.03125F;
      }
   }

   final class b implements dxk<brv> {
      public void a(brv $$0) {
      }

      public void b(brv $$0) {
      }

      public void c(brv $$0) {
         if (!($$0 instanceof coz)) {
            fzn.this.e.a($$0);
         }
      }

      public void d(brv $$0) {
         fzn.this.e.b($$0);
      }

      public void e(brv $$0) {
         if ($$0 instanceof gef) {
            fzn.this.L.add((gef)$$0);
         }

         if ($$0 instanceof coz $$1 && $$1.r() instanceof fht $$2) {
            fzn.this.E.put($$1.cE(), $$2);
         }
      }

      public void f(brv $$0) {
         $$0.ai();
         fzn.this.L.remove($$0);
         if ($$0 instanceof coz $$1 && $$1.r() instanceof fht $$2) {
            $$2.close();
            fzn.this.E.remove($$2.c(), $$2);
         }
      }

      public void g(brv $$0) {
      }
   }
}
