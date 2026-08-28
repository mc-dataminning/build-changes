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

public class gmd extends djz implements glw.a<gmd> {
   private static final Logger a = LogUtils.getLogger();
   private static final double b = 0.05;
   private static final int c = 10;
   private static final int d = 1000;
   final efr e = new efr();
   private final efx<bwv> f = new efx<>(bwv.class, new gmd.b());
   private final gme E;
   private final grx F;
   private final grw G;
   private final gmd.a H;
   private final gro I;
   private final bvc J;
   private final frf K = frf.Q();
   final List<gqy> L = Lists.newArrayList();
   final List<cmu> M = Lists.newArrayList();
   private final Map<ezj, ezl> N = Maps.newHashMap();
   private static final int O = -1;
   private int P;
   private final Object2ObjectArrayMap<djj, fsi> Q = ag.a(new Object2ObjectArrayMap(3), $$0x -> {
      $$0x.put(grl.a, new fsi($$0xx -> this.b($$0xx, grl.a)));
      $$0x.put(grl.b, new fsi($$0xx -> this.b($$0xx, grl.b)));
      $$0x.put(grl.c, new fsi($$0xx -> this.b($$0xx, grl.c)));
      $$0x.put(grl.d, new fsi($$0xx -> this.b($$0xx, grl.d)));
   });
   private final glz R;
   private final Deque<Runnable> S = Queues.newArrayDeque();
   private int T;
   private final gnq U = new gnq();
   private final int V;
   private boolean W;
   private static final Set<czw> X = Set.of(dae.if, dae.ig);

   public void b(int $$0) {
      this.U.a($$0, this);
   }

   public void b(iw $$0, ebg $$1, int $$2) {
      if (!this.U.a($$0, $$1)) {
         super.a($$0, $$1, $$2, 512);
      }
   }

   public void a(iw $$0, ebg $$1, ffs $$2) {
      ebg $$3 = this.a_($$0);
      if ($$3 != $$1) {
         this.a($$0, $$1, 19);
         crz $$4 = this.K.t;
         if (this == $$4.dV() && $$4.a($$0, $$1)) {
            $$4.g($$2.d, $$2.e, $$2.f);
         }
      }
   }

   gnq a() {
      return this.U;
   }

   @Override
   public boolean a(iw $$0, ebg $$1, int $$2, int $$3) {
      if (this.U.c()) {
         ebg $$4 = this.a_($$0);
         boolean $$5 = super.a($$0, $$1, $$2, $$3);
         if ($$5) {
            this.U.a($$0, $$4, this.K.t);
         }

         return $$5;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   public gmd(gme $$0, gmd.a $$1, alj<djz> $$2, jg<efd> $$3, int $$4, int $$5, grx $$6, boolean $$7, long $$8, int $$9) {
      super($$1, $$2, $$0.v(), $$3, true, $$7, $$8, 1000000);
      this.E = $$0;
      this.R = new glz(this, $$4);
      this.J = new bvc();
      this.H = $$1;
      this.F = $$6;
      this.V = $$9;
      this.G = new grw(this.K, this, $$6);
      this.I = gro.a($$3.a());
      this.a(new iw(8, 64, 8), 0.0F);
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

   public gro c() {
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

      try (bri $$1 = brc.a().d("blocks")) {
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

   public Iterable<bwv> d() {
      return this.H().a();
   }

   public void e() {
      brd $$0 = brc.a();
      $$0.a("entities");
      this.e.a($$0x -> {
         if (!$$0x.dQ() && !$$0x.bY() && !this.J.a($$0x)) {
            this.a(this::c, $$0x);
         }
      });
      $$0.c();
      this.Y();
   }

   public boolean a(bwv $$0) {
      return this.e.c($$0);
   }

   @Override
   public boolean h(bwv $$0) {
      return $$0.dx().a(this.K.t.dx()) <= this.T;
   }

   public void c(bwv $$0) {
      $$0.bx();
      $$0.af++;
      brc.a().a(() -> mh.f.b($$0.an()).toString());
      $$0.h();
      brc.a().c();

      for (bwv $$1 : $$0.cY()) {
         this.a($$0, $$1);
      }
   }

   private void a(bwv $$0, bwv $$1) {
      if ($$1.dQ() || $$1.dk() != $$0) {
         $$1.bO();
      } else if ($$1 instanceof crz || this.e.c($$1)) {
         $$1.bx();
         $$1.af++;
         $$1.r();

         for (bwv $$2 : $$1.cY()) {
            this.a($$1, $$2);
         }
      }
   }

   public void a(edn $$0) {
      $$0.J();
      this.R.q().a($$0.f(), false);
      this.f.b($$0.f());
   }

   public void a(dje $$0) {
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

   public void d(bwv $$0) {
      this.a($$0.ao(), bwv.d.b);
      this.f.a($$0);
   }

   public void a(int $$0, bwv.d $$1) {
      bwv $$2 = this.H().a($$0);
      if ($$2 != null) {
         $$2.c($$1);
         $$2.as();
      }
   }

   @Override
   public List<bwv> i(bwv $$0, ffn $$1) {
      grb $$2 = this.K.t;
      return $$2 != null && $$2 != $$0 && $$2.cR().c($$1) && bxc.a($$0).test($$2) ? List.of($$2) : List.of();
   }

   @Nullable
   @Override
   public bwv a(int $$0) {
      return this.H().a($$0);
   }

   @Override
   public void ad() {
      this.E.k().a(xc.c("multiplayer.status.quitting"));
   }

   public void b(int $$0, int $$1, int $$2) {
      int $$3 = 32;
      azz $$4 = azz.a();
      dne $$5 = this.o();
      iw.a $$6 = new iw.a();

      for (int $$7 = 0; $$7 < 667; $$7++) {
         this.a($$0, $$1, $$2, 16, $$4, $$5, $$6);
         this.a($$0, $$1, $$2, 32, $$4, $$5, $$6);
      }
   }

   @Nullable
   private dne o() {
      if (this.K.r.i() == djw.b) {
         daa $$0 = this.K.t.fb();
         czw $$1 = $$0.h();
         if (X.contains($$1) && $$1 instanceof cyi $$2) {
            return $$2.c();
         }
      }

      return null;
   }

   public void a(int $$0, int $$1, int $$2, int $$3, azz $$4, @Nullable dne $$5, iw.a $$6) {
      int $$7 = $$0 + this.A.a($$3) - this.A.a($$3);
      int $$8 = $$1 + this.A.a($$3) - this.A.a($$3);
      int $$9 = $$2 + this.A.a($$3) - this.A.a($$3);
      $$6.d($$7, $$8, $$9);
      ebg $$10 = this.a_($$6);
      $$10.b().a($$10, this, $$6, $$4);
      exq $$11 = this.b_($$6);
      if (!$$11.c()) {
         $$11.a(this, $$6, $$4);
         lx $$12 = $$11.h();
         if ($$12 != null && this.A.a(10) == 0) {
            boolean $$13 = $$10.c(this, $$6, jc.a);
            iw $$14 = $$6.e();
            this.a($$14, this.a_($$14), $$12, $$13);
         }
      }

      if ($$5 == $$10.b()) {
         this.a(new lr(lz.c, $$10), (double)$$7 + 0.5, (double)$$8 + 0.5, (double)$$9 + 0.5, 0.0, 0.0, 0.0);
      }

      if (!$$10.m(this, $$6)) {
         this.u($$6).a().l().ifPresent($$1x -> {
            if ($$1x.a(this.A)) {
               this.a($$1x.a(), (double)$$6.u() + this.A.j(), (double)$$6.v() + this.A.j(), (double)$$6.w() + this.A.j(), 0.0, 0.0, 0.0);
            }
         });
      }
   }

   private void a(iw $$0, ebg $$1, lx $$2, boolean $$3) {
      if ($$1.y().c()) {
         fgm $$4 = $$1.g(this, $$0);
         double $$5 = $$4.c(jc.a.b);
         if ($$5 < 1.0) {
            if ($$3) {
               this.a((double)$$0.u(), (double)($$0.u() + 1), (double)$$0.w(), (double)($$0.w() + 1), (double)($$0.v() + 1) - 0.05, $$2);
            }
         } else if (!$$1.a(axg.ar)) {
            double $$6 = $$4.b(jc.a.b);
            if ($$6 > 0.0) {
               this.a($$0, $$2, $$4, (double)$$0.v() + $$6 - 0.05);
            } else {
               iw $$7 = $$0.e();
               ebg $$8 = this.a_($$7);
               fgm $$9 = $$8.g(this, $$7);
               double $$10 = $$9.c(jc.a.b);
               if ($$10 < 1.0 && $$8.y().c()) {
                  this.a($$0, $$2, $$4, (double)$$0.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(iw $$0, lx $$1, fgm $$2, double $$3) {
      this.a((double)$$0.u() + $$2.b(jc.a.a), (double)$$0.u() + $$2.c(jc.a.a), (double)$$0.w() + $$2.b(jc.a.c), (double)$$0.w() + $$2.c(jc.a.c), $$3, $$1);
   }

   private void a(double $$0, double $$1, double $$2, double $$3, double $$4, lx $$5) {
      this.a($$5, azq.d(this.A.j(), $$0, $$1), $$4, azq.d(this.A.j(), $$2, $$3), 0.0, 0.0, 0.0);
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
   public void a(@Nullable bwv $$0, double $$1, double $$2, double $$3, jg<awq> $$4, aws $$5, float $$6, float $$7, long $$8) {
      if ($$0 == this.K.t) {
         this.a($$1, $$2, $$3, $$4.a(), $$5, $$6, $$7, false, $$8);
      }
   }

   @Override
   public void a(@Nullable bwv $$0, bwv $$1, jg<awq> $$2, aws $$3, float $$4, float $$5, long $$6) {
      if ($$0 == this.K.t) {
         this.K.ak().a((hoz)(new hoq($$2.a(), $$3, $$4, $$5, $$1, $$6)));
      }
   }

   @Override
   public void a(bwv $$0, awq $$1, aws $$2, float $$3, float $$4) {
      this.K.ak().a((hoz)(new hoq($$1, $$2, $$3, $$4, $$0, this.A.g())));
   }

   @Override
   public void a(awq $$0, aws $$1, float $$2, float $$3) {
      if (this.K.t != null) {
         this.K.ak().a((hoz)(new hoq($$0, $$1, $$2, $$3, this.K.t, this.A.g())));
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, awq $$3, aws $$4, float $$5, float $$6, boolean $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.A.g());
   }

   private void a(double $$0, double $$1, double $$2, awq $$3, aws $$4, float $$5, float $$6, boolean $$7, long $$8) {
      double $$9 = this.K.j.k().b().c($$0, $$1, $$2);
      hou $$10 = new hou($$3, $$4, $$5, $$6, azz.a($$8), $$0, $$1, $$2);
      if ($$7 && $$9 > 100.0) {
         double $$11 = Math.sqrt($$9) / 40.0;
         this.K.ak().a($$10, (int)($$11 * 20.0));
      } else {
         this.K.ak().a($$10);
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<dco> $$6) {
      if ($$6.isEmpty()) {
         for (int $$7 = 0; $$7 < this.A.a(3) + 2; $$7++) {
            this.a(lz.ae, $$0, $$1, $$2, this.A.k() * 0.05, 0.005, this.A.k() * 0.05);
         }
      } else {
         this.K.g.a(new gow.e(this, $$0, $$1, $$2, $$3, $$4, $$5, this.K.g, $$6));
      }
   }

   @Override
   public void a(zj<?> $$0) {
      this.E.b($$0);
   }

   @Override
   public des Q() {
      return this.E.j();
   }

   @Override
   public bvc u() {
      return this.J;
   }

   @Override
   public fhg<dne> U() {
      return fhd.b();
   }

   @Override
   public fhg<exp> T() {
      return fhd.b();
   }

   public glz h() {
      return this.R;
   }

   @Nullable
   @Override
   public ezl a(ezj $$0) {
      return this.N.get($$0);
   }

   public void b(ezj $$0, ezl $$1) {
      this.N.put($$0, $$1);
   }

   @Override
   public void a(ezj $$0, ezl $$1) {
   }

   @Override
   public ezj x() {
      return new ezj(0);
   }

   @Override
   public fgx R() {
      return this.E.z();
   }

   @Override
   public void a(iw $$0, ebg $$1, ebg $$2, int $$3) {
      this.F.a(this, $$0, $$1, $$2, $$3);
   }

   @Override
   public void b(iw $$0, ebg $$1, ebg $$2) {
      this.F.a($$0, $$1, $$2);
   }

   public void c(int $$0, int $$1, int $$2) {
      this.F.a($$0, $$1, $$2);
   }

   public void b(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      this.F.b($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(int $$0, iw $$1, int $$2) {
      this.F.a($$0, $$1, $$2);
   }

   @Override
   public void b(int $$0, iw $$1, int $$2) {
      this.G.a($$0, $$1, $$2);
   }

   @Override
   public void a(@Nullable bwv $$0, int $$1, iw $$2, int $$3) {
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
   public void a(lx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.F.a($$0, $$0.a().b(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void a(lx $$0, boolean $$1, boolean $$2, double $$3, double $$4, double $$5, double $$6, double $$7, double $$8) {
      this.F.a($$0, $$0.a().b() || $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   @Override
   public void b(lx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.F.a($$0, false, true, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void a(lx $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.F.a($$0, $$0.a().b() || $$1, true, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public List<gqy> z() {
      return this.L;
   }

   public List<cmu> i() {
      return this.M;
   }

   @Override
   public jg<dlc> a(int $$0, int $$1, int $$2) {
      return this.J_().f(mi.aG).b(dlj.b);
   }

   public float g(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (azq.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.2F);
      $$2 = azq.a($$2, 0.0F, 1.0F);
      $$2 = 1.0F - $$2;
      $$2 *= 1.0F - this.d($$0) * 5.0F / 16.0F;
      $$2 *= 1.0F - this.b($$0) * 5.0F / 16.0F;
      return $$2 * 0.8F + 0.2F;
   }

   public int a(ffs $$0, float $$1) {
      float $$2 = this.f($$1);
      ffs $$3 = $$0.a(2.0, 2.0, 2.0).c(0.25);
      ffs $$4 = ayq.a($$3, ($$0x, $$1x, $$2x) -> ffs.a(this.H_().a($$0x, $$1x, $$2x).a().a()));
      float $$5 = azq.b($$2 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$5 = azq.a($$5, 0.0F, 1.0F);
      $$4 = $$4.c((double)$$5);
      int $$6 = aya.a($$4);
      float $$7 = this.d($$1);
      if ($$7 > 0.0F) {
         float $$8 = 0.6F;
         float $$9 = $$7 * 0.75F;
         int $$10 = aya.a(aya.e($$6), 0.6F);
         $$6 = aya.a($$9, $$6, $$10);
      }

      float $$11 = this.b($$1);
      if ($$11 > 0.0F) {
         float $$12 = 0.2F;
         float $$13 = $$11 * 0.75F;
         int $$14 = aya.a(aya.e($$6), 0.2F);
         $$6 = aya.a($$13, $$6, $$14);
      }

      int $$15 = this.j();
      if ($$15 > 0) {
         float $$16 = Math.min((float)$$15 - $$1, 1.0F);
         $$16 *= 0.45F;
         $$6 = aya.a($$16, $$6, aya.a(204, 204, 255));
      }

      return $$6;
   }

   public int h(float $$0) {
      int $$1 = -1;
      float $$2 = this.d($$0);
      if ($$2 > 0.0F) {
         int $$3 = aya.a(aya.e($$1), 0.6F);
         $$1 = aya.a($$2 * 0.95F, $$1, $$3);
      }

      float $$4 = this.f($$0);
      float $$5 = azq.b($$4 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$5 = azq.a($$5, 0.0F, 1.0F);
      $$1 = aya.a($$1, aya.a(1.0F, $$5 * 0.9F + 0.1F, $$5 * 0.9F + 0.1F, $$5 * 0.85F + 0.15F));
      float $$6 = this.b($$0);
      if ($$6 > 0.0F) {
         int $$7 = aya.a(aya.e($$1), 0.2F);
         $$1 = aya.a($$6 * 0.95F, $$1, $$7);
      }

      return $$1;
   }

   public float i(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (azq.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.25F);
      $$2 = azq.a($$2, 0.0F, 1.0F);
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
   public float a(jc $$0, boolean $$1) {
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
   public int a(iw $$0, djj $$1) {
      fsi $$2 = (fsi)this.Q.get($$1);
      return $$2.a($$0);
   }

   public int b(iw $$0, djj $$1) {
      int $$2 = frf.Q().n.G().c();
      if ($$2 == 0) {
         return $$1.getColor(this.u($$0).a(), (double)$$0.u(), (double)$$0.w());
      } else {
         int $$3 = ($$2 * 2 + 1) * ($$2 * 2 + 1);
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         iz $$7 = new iz($$0.u() - $$2, $$0.v(), $$0.w() - $$2, $$0.u() + $$2, $$0.v(), $$0.w() + $$2);
         iw.a $$8 = new iw.a();

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

   public void a(iw $$0, float $$1) {
      this.B.a($$0, $$1);
   }

   @Override
   public String toString() {
      return "ClientLevel";
   }

   public gmd.a k() {
      return this.H;
   }

   @Override
   public void a(jg<egg> $$0, ffs $$1, egg.a $$2) {
   }

   protected Map<ezj, ezl> l() {
      return ImmutableMap.copyOf(this.N);
   }

   protected void a(Map<ezj, ezl> $$0) {
      this.N.putAll($$0);
   }

   @Override
   protected efu<bwv> H() {
      return this.f.a();
   }

   @Override
   public String J() {
      return "Chunks[C] W: " + this.R.e() + " E: " + this.f.c();
   }

   @Override
   public void a(iw $$0, ebg $$1) {
      this.K.g.a($$0, $$1);
   }

   public void i(int $$0) {
      this.T = $$0;
   }

   public int m() {
      return this.T;
   }

   @Override
   public cvj K() {
      return this.E.y();
   }

   @Override
   public dbv L() {
      return this.E.A();
   }

   @Override
   public dzd M() {
      return this.E.B();
   }

   @Override
   public void a(
      @Nullable bwv $$0,
      @Nullable bvk $$1,
      @Nullable djt $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      djz.a $$8,
      lx $$9,
      lx $$10,
      jg<awq> $$11
   ) {
   }

   @Override
   public int P() {
      return this.V;
   }

   @Override
   public int s(iw $$0) {
      return frf.Q().aw().a(this.a_($$0), this, $$0, 0);
   }

   @Override
   public void registerForCleaning(glw<gmd, ?> $$0) {
      this.E.a($$0);
   }

   public static class a implements fae {
      private final boolean a;
      private final boolean b;
      private iw c;
      private float d;
      private long e;
      private long f;
      private boolean g;
      private buq h;
      private boolean i;

      public a(buq $$0, boolean $$1, boolean $$2) {
         this.h = $$0;
         this.a = $$1;
         this.b = $$2;
      }

      @Override
      public iw a() {
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
      public void a(iw $$0, float $$1) {
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
      public buq q() {
         return this.h;
      }

      @Override
      public boolean r() {
         return this.i;
      }

      @Override
      public void a(q $$0, dkb $$1) {
         fae.super.a($$0, $$1);
      }

      public void a(buq $$0) {
         this.h = $$0;
      }

      public void a(boolean $$0) {
         this.i = $$0;
      }

      public double a(dkb $$0) {
         return this.b ? (double)$$0.K_() : 63.0;
      }

      public float e() {
         return this.b ? 1.0F : 0.03125F;
      }
   }

   final class b implements eft<bwv> {
      public void a(bwv $$0) {
      }

      public void b(bwv $$0) {
      }

      public void c(bwv $$0) {
         gmd.this.e.a($$0);
      }

      public void d(bwv $$0) {
         gmd.this.e.b($$0);
      }

      public void e(bwv $$0) {
         Objects.requireNonNull($$0);
         switch ($$0) {
            case gqy $$1:
               gmd.this.L.add($$1);
               break;
            case cmx $$2:
               gmd.this.M.addAll(Arrays.asList($$2.q()));
               break;
         }
      }

      public void f(bwv $$0) {
         $$0.al();
         Objects.requireNonNull($$0);
         switch ($$0) {
            case gqy $$1:
               gmd.this.L.remove($$1);
               break;
            case cmx $$2:
               gmd.this.M.removeAll(Arrays.asList($$2.q()));
               break;
         }
      }

      public void g(bwv $$0) {
      }
   }
}
