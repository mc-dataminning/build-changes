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

public class fyl extends dcg {
   private static final Logger a = LogUtils.getLogger();
   private static final double b = 0.05;
   private static final int c = 10;
   private static final int d = 1000;
   final dwu e = new dwu();
   private final dxa<bsh> f = new dxa<>(bsh.class, new fyl.b());
   private final fym D;
   private final ged E;
   private final fyl.a F;
   private final gdu G;
   private final bqs H;
   private final ffw I = ffw.Q();
   final List<gde> J = Lists.newArrayList();
   private final Map<epw, epy> K = Maps.newHashMap();
   private static final long L = 16777215L;
   private int M;
   private final Object2ObjectArrayMap<dbr, fgz> N = ac.a(new Object2ObjectArrayMap(3), $$0x -> {
      $$0x.put(gdr.a, new fgz($$0xx -> this.b($$0xx, gdr.a)));
      $$0x.put(gdr.b, new fgz($$0xx -> this.b($$0xx, gdr.b)));
      $$0x.put(gdr.c, new fgz($$0xx -> this.b($$0xx, gdr.c)));
   });
   private final fyh O;
   private final Deque<Runnable> P = Queues.newArrayDeque();
   private int Q;
   private final fzy R = new fzy();
   private static final Set<cty> S = Set.of(cug.hB, cug.hC);

   public void b(int $$0) {
      this.R.a($$0, this);
   }

   public void b(ja $$0, dsl $$1, int $$2) {
      if (!this.R.a($$0, $$1)) {
         super.a($$0, $$1, $$2, 512);
      }
   }

   public void a(ja $$0, dsl $$1, ewh $$2) {
      dsl $$3 = this.a_($$0);
      if ($$3 != $$1) {
         this.a($$0, $$1, 19);
         cml $$4 = this.I.s;
         if (this == $$4.dR() && $$4.a($$0, $$1)) {
            $$4.h($$2.c, $$2.d, $$2.e);
         }
      }
   }

   fzy a() {
      return this.R;
   }

   @Override
   public boolean a(ja $$0, dsl $$1, int $$2, int $$3) {
      if (this.R.c()) {
         dsl $$4 = this.a_($$0);
         boolean $$5 = super.a($$0, $$1, $$2, $$3);
         if ($$5) {
            this.R.a($$0, $$4, this.I.s);
         }

         return $$5;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   public fyl(fym $$0, fyl.a $$1, akj<dcg> $$2, jj<dwg> $$3, int $$4, int $$5, Supplier<bmv> $$6, ged $$7, boolean $$8, long $$9) {
      super($$1, $$2, $$0.v(), $$3, $$6, true, $$8, $$9, 1000000);
      this.D = $$0;
      this.O = new fyh(this, $$4);
      this.H = new bqs();
      this.F = $$1;
      this.E = $$7;
      this.G = gdu.a($$3.a());
      this.a(new ja(8, 64, 8), 0.0F);
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

   public gdu d() {
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
      if (this.A.o().b(dcc.l)) {
         this.c(this.A.d() + 1L);
      }
   }

   public void b(long $$0) {
      this.F.a($$0);
   }

   public void c(long $$0) {
      if ($$0 < 0L) {
         $$0 = -$$0;
         this.ab().a(dcc.l).a(false, null);
      } else {
         this.ab().a(dcc.l).a(true, null);
      }

      this.F.b($$0);
   }

   public Iterable<bsh> e() {
      return this.G().a();
   }

   public void f() {
      bmv $$0 = this.ag();
      $$0.a("entities");
      this.e.a($$0x -> {
         if (!$$0x.dM() && !$$0x.bT() && !this.H.a($$0x)) {
            this.a(this::a, $$0x);
         }
      });
      $$0.c();
      this.T();
   }

   @Override
   public boolean h(bsh $$0) {
      return $$0.dt().a(this.I.s.dt()) <= this.Q;
   }

   public void a(bsh $$0) {
      $$0.bw();
      $$0.ai++;
      this.ag().a(() -> lq.f.b($$0.am()).toString());
      $$0.l();
      this.ag().c();

      for (bsh $$1 : $$0.cU()) {
         this.a($$0, $$1);
      }
   }

   private void a(bsh $$0, bsh $$1) {
      if ($$1.dM() || $$1.de() != $$0) {
         $$1.ad();
      } else if ($$1 instanceof cml || this.e.c($$1)) {
         $$1.bw();
         $$1.ai++;
         $$1.u();

         for (bsh $$2 : $$1.cU()) {
            this.a($$1, $$2);
         }
      }
   }

   public void a(dur $$0) {
      $$0.I();
      this.O.p().a($$0.f(), false);
      this.f.b($$0.f());
   }

   public void a(dbn $$0) {
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

   public void c(bsh $$0) {
      this.a($$0.an(), bsh.d.b);
      this.f.a($$0);
   }

   public void a(int $$0, bsh.d $$1) {
      bsh $$2 = this.G().a($$0);
      if ($$2 != null) {
         $$2.b($$1);
         $$2.as();
      }
   }

   @Nullable
   @Override
   public bsh a(int $$0) {
      return this.G().a($$0);
   }

   @Override
   public void Y() {
      this.D.k().a(wu.c("multiplayer.status.quitting"));
   }

   public void b(int $$0, int $$1, int $$2) {
      int $$3 = 32;
      ayo $$4 = ayo.a();
      dfi $$5 = this.p();
      ja.a $$6 = new ja.a();

      for (int $$7 = 0; $$7 < 667; $$7++) {
         this.a($$0, $$1, $$2, 16, $$4, $$5, $$6);
         this.a($$0, $$1, $$2, 32, $$4, $$5, $$6);
      }
   }

   @Nullable
   private dfi p() {
      if (this.I.q.j() == dcd.b) {
         cud $$0 = this.I.s.eV();
         cty $$1 = $$0.g();
         if (S.contains($$1) && $$1 instanceof csc $$2) {
            return $$2.d();
         }
      }

      return null;
   }

   public void a(int $$0, int $$1, int $$2, int $$3, ayo $$4, @Nullable dfi $$5, ja.a $$6) {
      int $$7 = $$0 + this.z.a($$3) - this.z.a($$3);
      int $$8 = $$1 + this.z.a($$3) - this.z.a($$3);
      int $$9 = $$2 + this.z.a($$3) - this.z.a($$3);
      $$6.d($$7, $$8, $$9);
      dsl $$10 = this.a_($$6);
      $$10.b().a($$10, this, $$6, $$4);
      eoj $$11 = this.b_($$6);
      if (!$$11.c()) {
         $$11.a(this, $$6, $$4);
         lh $$12 = $$11.h();
         if ($$12 != null && this.z.a(10) == 0) {
            boolean $$13 = $$10.d(this, $$6, jf.a);
            ja $$14 = $$6.d();
            this.a($$14, this.a_($$14), $$12, $$13);
         }
      }

      if ($$5 == $$10.b()) {
         this.a(new lb(lj.c, $$10), (double)$$7 + 0.5, (double)$$8 + 0.5, (double)$$9 + 0.5, 0.0, 0.0, 0.0);
      }

      if (!$$10.r(this, $$6)) {
         this.t($$6).a().k().ifPresent($$1x -> {
            if ($$1x.a(this.z)) {
               this.a($$1x.a(), (double)$$6.u() + this.z.j(), (double)$$6.v() + this.z.j(), (double)$$6.w() + this.z.j(), 0.0, 0.0, 0.0);
            }
         });
      }
   }

   private void a(ja $$0, dsl $$1, lh $$2, boolean $$3) {
      if ($$1.u().c()) {
         exa $$4 = $$1.k(this, $$0);
         double $$5 = $$4.c(jf.a.b);
         if ($$5 < 1.0) {
            if ($$3) {
               this.a((double)$$0.u(), (double)($$0.u() + 1), (double)$$0.w(), (double)($$0.w() + 1), (double)($$0.v() + 1) - 0.05, $$2);
            }
         } else if (!$$1.a(avw.ao)) {
            double $$6 = $$4.b(jf.a.b);
            if ($$6 > 0.0) {
               this.a($$0, $$2, $$4, (double)$$0.v() + $$6 - 0.05);
            } else {
               ja $$7 = $$0.d();
               dsl $$8 = this.a_($$7);
               exa $$9 = $$8.k(this, $$7);
               double $$10 = $$9.c(jf.a.b);
               if ($$10 < 1.0 && $$8.u().c()) {
                  this.a($$0, $$2, $$4, (double)$$0.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(ja $$0, lh $$1, exa $$2, double $$3) {
      this.a((double)$$0.u() + $$2.b(jf.a.a), (double)$$0.u() + $$2.c(jf.a.a), (double)$$0.w() + $$2.b(jf.a.c), (double)$$0.w() + $$2.c(jf.a.c), $$3, $$1);
   }

   private void a(double $$0, double $$1, double $$2, double $$3, double $$4, lh $$5) {
      this.a($$5, ayg.d(this.z.j(), $$0, $$1), $$4, ayg.d(this.z.j(), $$2, $$3), 0.0, 0.0, 0.0);
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
   public void a(@Nullable cml $$0, double $$1, double $$2, double $$3, jj<avg> $$4, avi $$5, float $$6, float $$7, long $$8) {
      if ($$0 == this.I.s) {
         this.a($$1, $$2, $$3, $$4.a(), $$5, $$6, $$7, false, $$8);
      }
   }

   @Override
   public void a(@Nullable cml $$0, bsh $$1, jj<avg> $$2, avi $$3, float $$4, float $$5, long $$6) {
      if ($$0 == this.I.s) {
         this.I.aj().a((gte)(new gsv($$2.a(), $$3, $$4, $$5, $$1, $$6)));
      }
   }

   @Override
   public void a(bsh $$0, avg $$1, avi $$2, float $$3, float $$4) {
      this.I.aj().a((gte)(new gsv($$1, $$2, $$3, $$4, $$0, this.z.g())));
   }

   @Override
   public void a(double $$0, double $$1, double $$2, avg $$3, avi $$4, float $$5, float $$6, boolean $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.z.g());
   }

   private void a(double $$0, double $$1, double $$2, avg $$3, avi $$4, float $$5, float $$6, boolean $$7, long $$8) {
      double $$9 = this.I.j.l().b().c($$0, $$1, $$2);
      gsz $$10 = new gsz($$3, $$4, $$5, $$6, ayo.a($$8), $$0, $$1, $$2);
      if ($$7 && $$9 > 100.0) {
         double $$11 = Math.sqrt($$9) / 40.0;
         this.I.aj().a($$10, (int)($$11 * 20.0));
      } else {
         this.I.aj().a($$10);
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<cwv> $$6) {
      if ($$6.isEmpty()) {
         for (int $$7 = 0; $$7 < this.z.a(3) + 2; $$7++) {
            this.a(lj.ab, $$0, $$1, $$2, this.z.k() * 0.05, 0.005, this.z.k() * 0.05);
         }
      } else {
         this.I.g.a(new gbd.e(this, $$0, $$1, $$2, $$3, $$4, $$5, this.I.g, $$6));
      }
   }

   @Override
   public void a(zb<?> $$0) {
      this.D.b($$0);
   }

   @Override
   public cyn r() {
      return this.D.j();
   }

   @Override
   public bqs s() {
      return this.H;
   }

   @Override
   public exu<dfi> P() {
      return exr.b();
   }

   @Override
   public exu<eoi> O() {
      return exr.b();
   }

   public fyh i() {
      return this.O;
   }

   @Nullable
   @Override
   public epy a(epw $$0) {
      return this.K.get($$0);
   }

   public void b(epw $$0, epy $$1) {
      this.K.put($$0, $$1);
   }

   @Override
   public void a(epw $$0, epy $$1) {
   }

   @Override
   public epw v() {
      return new epw(0);
   }

   @Override
   public exl M() {
      return this.D.y();
   }

   @Override
   public void a(ja $$0, dsl $$1, dsl $$2, int $$3) {
      this.E.a(this, $$0, $$1, $$2, $$3);
   }

   @Override
   public void b(ja $$0, dsl $$1, dsl $$2) {
      this.E.a($$0, $$1, $$2);
   }

   public void c(int $$0, int $$1, int $$2) {
      this.E.a($$0, $$1, $$2);
   }

   @Override
   public void a(int $$0, ja $$1, int $$2) {
      this.E.c($$0, $$1, $$2);
   }

   @Override
   public void b(int $$0, ja $$1, int $$2) {
      this.E.a($$0, $$1, $$2);
   }

   @Override
   public void a(@Nullable cml $$0, int $$1, ja $$2, int $$3) {
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
   public void a(lh $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.E.a($$0, $$0.a().b(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void a(lh $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.E.a($$0, $$0.a().b() || $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void b(lh $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.E.a($$0, false, true, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void b(lh $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.E.a($$0, $$0.a().b() || $$1, true, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public List<gde> x() {
      return this.J;
   }

   @Override
   public jj<ddg> a(int $$0, int $$1, int $$2) {
      return this.H_().d(lr.aE).g(ddn.b);
   }

   public float g(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (ayg.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.2F);
      $$2 = ayg.a($$2, 0.0F, 1.0F);
      $$2 = 1.0F - $$2;
      $$2 *= 1.0F - this.d($$0) * 5.0F / 16.0F;
      $$2 *= 1.0F - this.b($$0) * 5.0F / 16.0F;
      return $$2 * 0.8F + 0.2F;
   }

   public ewh a(ewh $$0, float $$1) {
      float $$2 = this.f($$1);
      ewh $$3 = $$0.a(2.0, 2.0, 2.0).a(0.25);
      ddi $$4 = this.F_();
      ewh $$5 = axg.a($$3, ($$1x, $$2x, $$3x) -> ewh.a($$4.a($$1x, $$2x, $$3x).a().a()));
      float $$6 = ayg.b($$2 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$6 = ayg.a($$6, 0.0F, 1.0F);
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

      return new ewh((double)$$7, (double)$$8, (double)$$9);
   }

   public ewh h(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = ayg.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$2 = ayg.a($$2, 0.0F, 1.0F);
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

      return new ewh((double)$$3, (double)$$4, (double)$$5);
   }

   public float i(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (ayg.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.25F);
      $$2 = ayg.a($$2, 0.0F, 1.0F);
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
   public float a(jf $$0, boolean $$1) {
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
   public int a(ja $$0, dbr $$1) {
      fgz $$2 = (fgz)this.N.get($$1);
      return $$2.a($$0);
   }

   public int b(ja $$0, dbr $$1) {
      int $$2 = ffw.Q().m.E().c();
      if ($$2 == 0) {
         return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
      } else {
         int $$3 = ($$2 * 2 + 1) * ($$2 * 2 + 1);
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         jc $$7 = new jc($$0.u() - $$2, $$0.v(), $$0.w() - $$2, $$0.u() + $$2, $$0.v(), $$0.w() + $$2);
         ja.a $$8 = new ja.a();

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

   public void a(ja $$0, float $$1) {
      this.A.a($$0, $$1);
   }

   @Override
   public String toString() {
      return "ClientLevel";
   }

   public fyl.a k() {
      return this.F;
   }

   @Override
   public void a(jj<dxh> $$0, ewh $$1, dxh.a $$2) {
   }

   protected Map<epw, epy> l() {
      return ImmutableMap.copyOf(this.K);
   }

   protected void a(Map<epw, epy> $$0) {
      this.K.putAll($$0);
   }

   @Override
   protected dwx<bsh> G() {
      return this.f.a();
   }

   @Override
   public String I() {
      return "Chunks[C] W: " + this.O.e() + " E: " + this.f.c();
   }

   @Override
   public void a(ja $$0, dsl $$1) {
      this.I.g.a($$0, $$1);
   }

   public void h(int $$0) {
      this.Q = $$0;
   }

   public int m() {
      return this.Q;
   }

   @Override
   public coz J() {
      return this.D.x();
   }

   @Override
   public cwd K() {
      return this.D.z();
   }

   public static class a implements eqr {
      private final boolean a;
      private final dcc b;
      private final boolean c;
      private ja d;
      private float e;
      private long f;
      private long g;
      private boolean h;
      private bqe i;
      private boolean j;

      public a(bqe $$0, boolean $$1, boolean $$2) {
         this.i = $$0;
         this.a = $$1;
         this.c = $$2;
         this.b = new dcc();
      }

      @Override
      public ja a() {
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
      public void a(ja $$0, float $$1) {
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
      public dcc o() {
         return this.b;
      }

      @Override
      public bqe q() {
         return this.i;
      }

      @Override
      public boolean r() {
         return this.j;
      }

      @Override
      public void a(p $$0, dci $$1) {
         eqr.super.a($$0, $$1);
      }

      public void a(bqe $$0) {
         this.i = $$0;
      }

      public void a(boolean $$0) {
         this.j = $$0;
      }

      public double a(dci $$0) {
         return this.c ? (double)$$0.I_() : 63.0;
      }

      public float e() {
         return this.c ? 1.0F : 0.03125F;
      }
   }

   final class b implements dww<bsh> {
      public void a(bsh $$0) {
      }

      public void b(bsh $$0) {
      }

      public void c(bsh $$0) {
         fyl.this.e.a($$0);
      }

      public void d(bsh $$0) {
         fyl.this.e.b($$0);
      }

      public void e(bsh $$0) {
         if ($$0 instanceof gde) {
            fyl.this.J.add((gde)$$0);
         }
      }

      public void f(bsh $$0) {
         $$0.ak();
         fyl.this.J.remove($$0);
      }

      public void g(bsh $$0) {
      }
   }
}
