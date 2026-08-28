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
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gdh extends dfm {
   private static final Logger a = LogUtils.getLogger();
   private static final double b = 0.05;
   private static final int c = 10;
   private static final int d = 1000;
   final eae e = new eae();
   private final eak<bul> f = new eak<>(bul.class, new gdh.b());
   private final gdi E;
   private final gjc F;
   private final gjb G;
   private final gdh.a H;
   private final gis I;
   private final bst J;
   private final fke K = fke.Q();
   final List<ghz> L = Lists.newArrayList();
   private final Map<etn, etp> M = Maps.newHashMap();
   private static final int N = -1;
   private int O;
   private final Object2ObjectArrayMap<dew, flh> P = ae.a(new Object2ObjectArrayMap(3), $$0x -> {
      $$0x.put(gim.a, new flh($$0xx -> this.b($$0xx, gim.a)));
      $$0x.put(gim.b, new flh($$0xx -> this.b($$0xx, gim.b)));
      $$0x.put(gim.c, new flh($$0xx -> this.b($$0xx, gim.c)));
   });
   private final gdd Q;
   private final Deque<Runnable> R = Queues.newArrayDeque();
   private int S;
   private final get T = new get();
   private final int U;
   private boolean V;
   private static final Set<cwi> W = Set.of(cwq.hB, cwq.hC);

   public void b(int $$0) {
      this.T.a($$0, this);
   }

   public void b(jh $$0, dvv $$1, int $$2) {
      if (!this.T.a($$0, $$1)) {
         super.a($$0, $$1, $$2, 512);
      }
   }

   public void a(jh $$0, dvv $$1, ezy $$2) {
      dvv $$3 = this.a_($$0);
      if ($$3 != $$1) {
         this.a($$0, $$1, 19);
         cou $$4 = this.K.t;
         if (this == $$4.dV() && $$4.a($$0, $$1)) {
            $$4.h($$2.d, $$2.e, $$2.f);
         }
      }
   }

   get a() {
      return this.T;
   }

   @Override
   public boolean a(jh $$0, dvv $$1, int $$2, int $$3) {
      if (this.T.c()) {
         dvv $$4 = this.a_($$0);
         boolean $$5 = super.a($$0, $$1, $$2, $$3);
         if ($$5) {
            this.T.a($$0, $$4, this.K.t);
         }

         return $$5;
      } else {
         return super.a($$0, $$1, $$2, $$3);
      }
   }

   public gdh(gdi $$0, gdh.a $$1, ali<dfm> $$2, jq<dzq> $$3, int $$4, int $$5, gjc $$6, boolean $$7, long $$8, int $$9) {
      super($$1, $$2, $$0.v(), $$3, true, $$7, $$8, 1000000);
      this.E = $$0;
      this.Q = new gdd(this, $$4);
      this.J = new bst();
      this.H = $$1;
      this.F = $$6;
      this.U = $$9;
      this.G = new gjb(this.K, this, $$6);
      this.I = gis.a($$3.a());
      this.a(new jh(8, 64, 8), 0.0F);
      this.S = $$5;
      this.W();
      this.Z();
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

   public gis c() {
      return this.I;
   }

   public void a(BooleanSupplier $$0) {
      this.E_().s();
      if (this.t().i()) {
         this.m();
      }

      if (this.O > 0) {
         this.c(this.O - 1);
      }

      try (boz $$1 = bot.a().d("blocks")) {
         this.Q.a($$0, true);
      }
   }

   private void m() {
      this.H.a(this.H.c() + 1L);
      if (this.V) {
         this.H.b(this.H.d() + 1L);
      }
   }

   public void a(long $$0, long $$1, boolean $$2) {
      this.H.a($$0);
      this.H.b($$1);
      this.V = $$2;
   }

   public Iterable<bul> d() {
      return this.G().a();
   }

   public void e() {
      bou $$0 = bot.a();
      $$0.a("entities");
      this.e.a($$0x -> {
         if (!$$0x.dQ() && !$$0x.bZ() && !this.J.a($$0x)) {
            this.a(this::c, $$0x);
         }
      });
      $$0.c();
      this.V();
   }

   public boolean a(bul $$0) {
      return this.e.c($$0);
   }

   @Override
   public boolean h(bul $$0) {
      return $$0.dx().a(this.K.t.dx()) <= this.S;
   }

   public void c(bul $$0) {
      $$0.bz();
      $$0.af++;
      bot.a().a(() -> lz.f.b($$0.aq()).toString());
      $$0.h();
      bot.a().c();

      for (bul $$1 : $$0.cZ()) {
         this.a($$0, $$1);
      }
   }

   private void a(bul $$0, bul $$1) {
      if ($$1.dQ() || $$1.dk() != $$0) {
         $$1.ae();
      } else if ($$1 instanceof cou || this.e.c($$1)) {
         $$1.bz();
         $$1.af++;
         $$1.r();

         for (bul $$2 : $$1.cZ()) {
            this.a($$1, $$2);
         }
      }
   }

   public void a(dya $$0) {
      $$0.G();
      this.Q.p().a($$0.f(), false);
      this.f.b($$0.f());
   }

   public void a(des $$0) {
      this.P.forEach(($$1, $$2) -> $$2.a($$0.g, $$0.h));
      this.f.a($$0);
      this.F.a($$0);
   }

   public void b(long $$0) {
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

   public void d(bul $$0) {
      this.a($$0.ar(), bul.c.b);
      this.f.a($$0);
   }

   public void a(int $$0, bul.c $$1) {
      bul $$2 = this.G().a($$0);
      if ($$2 != null) {
         $$2.b($$1);
         $$2.av();
      }
   }

   @Nullable
   @Override
   public bul a(int $$0) {
      return this.G().a($$0);
   }

   @Override
   public void aa() {
      this.E.k().a(xj.c("multiplayer.status.quitting"));
   }

   public void b(int $$0, int $$1, int $$2) {
      int $$3 = 32;
      azu $$4 = azu.a();
      diq $$5 = this.n();
      jh.a $$6 = new jh.a();

      for (int $$7 = 0; $$7 < 667; $$7++) {
         this.a($$0, $$1, $$2, 16, $$4, $$5, $$6);
         this.a($$0, $$1, $$2, 32, $$4, $$5, $$6);
      }
   }

   @Nullable
   private diq n() {
      if (this.K.r.j() == dfj.b) {
         cwm $$0 = this.K.t.eX();
         cwi $$1 = $$0.h();
         if (W.contains($$1) && $$1 instanceof cus $$2) {
            return $$2.d();
         }
      }

      return null;
   }

   public void a(int $$0, int $$1, int $$2, int $$3, azu $$4, @Nullable diq $$5, jh.a $$6) {
      int $$7 = $$0 + this.A.a($$3) - this.A.a($$3);
      int $$8 = $$1 + this.A.a($$3) - this.A.a($$3);
      int $$9 = $$2 + this.A.a($$3) - this.A.a($$3);
      $$6.d($$7, $$8, $$9);
      dvv $$10 = this.a_($$6);
      $$10.b().a($$10, this, $$6, $$4);
      erv $$11 = this.b_($$6);
      if (!$$11.c()) {
         $$11.a(this, $$6, $$4);
         lq $$12 = $$11.h();
         if ($$12 != null && this.A.a(10) == 0) {
            boolean $$13 = $$10.c(this, $$6, jm.a);
            jh $$14 = $$6.e();
            this.a($$14, this.a_($$14), $$12, $$13);
         }
      }

      if ($$5 == $$10.b()) {
         this.a(new lk(ls.c, $$10), (double)$$7 + 0.5, (double)$$8 + 0.5, (double)$$9 + 0.5, 0.0, 0.0, 0.0);
      }

      if (!$$10.m(this, $$6)) {
         this.t($$6).a().k().ifPresent($$1x -> {
            if ($$1x.a(this.A)) {
               this.a($$1x.a(), (double)$$6.u() + this.A.j(), (double)$$6.v() + this.A.j(), (double)$$6.w() + this.A.j(), 0.0, 0.0, 0.0);
            }
         });
      }
   }

   private void a(jh $$0, dvv $$1, lq $$2, boolean $$3) {
      if ($$1.y().c()) {
         fas $$4 = $$1.g(this, $$0);
         double $$5 = $$4.c(jm.a.b);
         if ($$5 < 1.0) {
            if ($$3) {
               this.a((double)$$0.u(), (double)($$0.u() + 1), (double)$$0.w(), (double)($$0.w() + 1), (double)($$0.v() + 1) - 0.05, $$2);
            }
         } else if (!$$1.a(axc.aq)) {
            double $$6 = $$4.b(jm.a.b);
            if ($$6 > 0.0) {
               this.a($$0, $$2, $$4, (double)$$0.v() + $$6 - 0.05);
            } else {
               jh $$7 = $$0.e();
               dvv $$8 = this.a_($$7);
               fas $$9 = $$8.g(this, $$7);
               double $$10 = $$9.c(jm.a.b);
               if ($$10 < 1.0 && $$8.y().c()) {
                  this.a($$0, $$2, $$4, (double)$$0.v() - 0.05);
               }
            }
         }
      }
   }

   private void a(jh $$0, lq $$1, fas $$2, double $$3) {
      this.a((double)$$0.u() + $$2.b(jm.a.a), (double)$$0.u() + $$2.c(jm.a.a), (double)$$0.w() + $$2.b(jm.a.c), (double)$$0.w() + $$2.c(jm.a.c), $$3, $$1);
   }

   private void a(double $$0, double $$1, double $$2, double $$3, double $$4, lq $$5) {
      this.a($$5, azm.d(this.A.j(), $$0, $$1), $$4, azm.d(this.A.j(), $$2, $$3), 0.0, 0.0, 0.0);
   }

   @Override
   public p a(o $$0) {
      p $$1 = super.a($$0);
      $$1.a("Server brand", () -> this.K.t.i.f());
      $$1.a("Server type", () -> this.K.V() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server");
      $$1.a("Tracked entity count", () -> String.valueOf(this.g()));
      return $$1;
   }

   @Override
   public void a(@Nullable cou $$0, double $$1, double $$2, double $$3, jq<awm> $$4, awo $$5, float $$6, float $$7, long $$8) {
      if ($$0 == this.K.t) {
         this.a($$1, $$2, $$3, $$4.a(), $$5, $$6, $$7, false, $$8);
      }
   }

   @Override
   public void a(@Nullable cou $$0, bul $$1, jq<awm> $$2, awo $$3, float $$4, float $$5, long $$6) {
      if ($$0 == this.K.t) {
         this.K.ak().a((hdb)(new hcs($$2.a(), $$3, $$4, $$5, $$1, $$6)));
      }
   }

   @Override
   public void a(bul $$0, awm $$1, awo $$2, float $$3, float $$4) {
      this.K.ak().a((hdb)(new hcs($$1, $$2, $$3, $$4, $$0, this.A.g())));
   }

   @Override
   public void a(double $$0, double $$1, double $$2, awm $$3, awo $$4, float $$5, float $$6, boolean $$7) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, this.A.g());
   }

   private void a(double $$0, double $$1, double $$2, awm $$3, awo $$4, float $$5, float $$6, boolean $$7, long $$8) {
      double $$9 = this.K.j.k().b().c($$0, $$1, $$2);
      hcw $$10 = new hcw($$3, $$4, $$5, $$6, azu.a($$8), $$0, $$1, $$2);
      if ($$7 && $$9 > 100.0) {
         double $$11 = Math.sqrt($$9) / 40.0;
         this.K.ak().a($$10, (int)($$11 * 20.0));
      } else {
         this.K.ak().a($$10);
      }
   }

   @Override
   public void a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, List<czb> $$6) {
      if ($$6.isEmpty()) {
         for (int $$7 = 0; $$7 < this.A.a(3) + 2; $$7++) {
            this.a(ls.ab, $$0, $$1, $$2, this.A.k() * 0.05, 0.005, this.A.k() * 0.05);
         }
      } else {
         this.K.g.a(new gfy.e(this, $$0, $$1, $$2, $$3, $$4, $$5, this.K.g, $$6));
      }
   }

   @Override
   public void a(zq<?> $$0) {
      this.E.b($$0);
   }

   @Override
   public dbe s() {
      return this.E.j();
   }

   @Override
   public bst t() {
      return this.J;
   }

   @Override
   public fbm<diq> S() {
      return fbj.b();
   }

   @Override
   public fbm<eru> R() {
      return fbj.b();
   }

   public gdd h() {
      return this.Q;
   }

   @Nullable
   @Override
   public etp a(etn $$0) {
      return this.M.get($$0);
   }

   public void b(etn $$0, etp $$1) {
      this.M.put($$0, $$1);
   }

   @Override
   public void a(etn $$0, etp $$1) {
   }

   @Override
   public etn w() {
      return new etn(0);
   }

   @Override
   public fbd P() {
      return this.E.z();
   }

   @Override
   public void a(jh $$0, dvv $$1, dvv $$2, int $$3) {
      this.F.a(this, $$0, $$1, $$2, $$3);
   }

   @Override
   public void b(jh $$0, dvv $$1, dvv $$2) {
      this.F.a($$0, $$1, $$2);
   }

   public void c(int $$0, int $$1, int $$2) {
      this.F.a($$0, $$1, $$2);
   }

   public void b(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5) {
      this.F.b($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(int $$0, jh $$1, int $$2) {
      this.F.a($$0, $$1, $$2);
   }

   @Override
   public void b(int $$0, jh $$1, int $$2) {
      this.G.a($$0, $$1, $$2);
   }

   @Override
   public void a(@Nullable cou $$0, int $$1, jh $$2, int $$3) {
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
   public void a(lq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.F.a($$0, $$0.a().b(), $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void a(lq $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.F.a($$0, $$0.a().b() || $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public void b(lq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this.F.a($$0, false, true, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public void b(lq $$0, boolean $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
      this.F.a($$0, $$0.a().b() || $$1, true, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public List<ghz> y() {
      return this.L;
   }

   @Override
   public jq<dgo> a(int $$0, int $$1, int $$2) {
      return this.J_().e(ma.aG).b(dgv.b);
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

   public int a(ezy $$0, float $$1) {
      float $$2 = this.f($$1);
      ezy $$3 = $$0.a(2.0, 2.0, 2.0).c(0.25);
      ezy $$4 = ayn.a($$3, ($$0x, $$1x, $$2x) -> ezy.a(this.H_().a($$0x, $$1x, $$2x).a().a()));
      float $$5 = azm.b($$2 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$5 = azm.a($$5, 0.0F, 1.0F);
      $$4 = $$4.c((double)$$5);
      int $$6 = axx.a($$4);
      float $$7 = this.d($$1);
      if ($$7 > 0.0F) {
         float $$8 = 0.6F;
         float $$9 = $$7 * 0.75F;
         int $$10 = axx.a(axx.e($$6), 0.6F);
         $$6 = axx.a($$9, $$6, $$10);
      }

      float $$11 = this.b($$1);
      if ($$11 > 0.0F) {
         float $$12 = 0.2F;
         float $$13 = $$11 * 0.75F;
         int $$14 = axx.a(axx.e($$6), 0.2F);
         $$6 = axx.a($$13, $$6, $$14);
      }

      int $$15 = this.i();
      if ($$15 > 0) {
         float $$16 = Math.min((float)$$15 - $$1, 1.0F);
         $$16 *= 0.45F;
         $$6 = axx.a($$16, $$6, axx.a(204, 204, 255));
      }

      return $$6;
   }

   public int h(float $$0) {
      int $$1 = -1;
      float $$2 = this.d($$0);
      if ($$2 > 0.0F) {
         int $$3 = axx.a(axx.e($$1), 0.6F);
         $$1 = axx.a($$2 * 0.95F, $$1, $$3);
      }

      float $$4 = this.f($$0);
      float $$5 = azm.b($$4 * (float) (Math.PI * 2)) * 2.0F + 0.5F;
      $$5 = azm.a($$5, 0.0F, 1.0F);
      $$1 = axx.a($$1, axx.a(1.0F, $$5 * 0.9F + 0.1F, $$5 * 0.9F + 0.1F, $$5 * 0.85F + 0.15F));
      float $$6 = this.b($$0);
      if ($$6 > 0.0F) {
         int $$7 = axx.a(axx.e($$1), 0.2F);
         $$1 = axx.a($$6 * 0.95F, $$1, $$7);
      }

      return $$1;
   }

   public float i(float $$0) {
      float $$1 = this.f($$0);
      float $$2 = 1.0F - (azm.b($$1 * (float) (Math.PI * 2)) * 2.0F + 0.25F);
      $$2 = azm.a($$2, 0.0F, 1.0F);
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
   public float a(jm $$0, boolean $$1) {
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
   public int a(jh $$0, dew $$1) {
      flh $$2 = (flh)this.P.get($$1);
      return $$2.a($$0);
   }

   public int b(jh $$0, dew $$1) {
      int $$2 = fke.Q().n.F().c();
      if ($$2 == 0) {
         return $$1.getColor(this.t($$0).a(), (double)$$0.u(), (double)$$0.w());
      } else {
         int $$3 = ($$2 * 2 + 1) * ($$2 * 2 + 1);
         int $$4 = 0;
         int $$5 = 0;
         int $$6 = 0;
         jj $$7 = new jj($$0.u() - $$2, $$0.v(), $$0.w() - $$2, $$0.u() + $$2, $$0.v(), $$0.w() + $$2);
         jh.a $$8 = new jh.a();

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

   public void a(jh $$0, float $$1) {
      this.B.a($$0, $$1);
   }

   @Override
   public String toString() {
      return "ClientLevel";
   }

   public gdh.a j() {
      return this.H;
   }

   @Override
   public void a(jq<ear> $$0, ezy $$1, ear.a $$2) {
   }

   protected Map<etn, etp> k() {
      return ImmutableMap.copyOf(this.M);
   }

   protected void a(Map<etn, etp> $$0) {
      this.M.putAll($$0);
   }

   @Override
   protected eah<bul> G() {
      return this.f.a();
   }

   @Override
   public String I() {
      return "Chunks[C] W: " + this.Q.e() + " E: " + this.f.c();
   }

   @Override
   public void a(jh $$0, dvv $$1) {
      this.K.g.a($$0, $$1);
   }

   public void i(int $$0) {
      this.S = $$0;
   }

   public int l() {
      return this.S;
   }

   @Override
   public crq J() {
      return this.E.y();
   }

   @Override
   public cyk K() {
      return this.E.A();
   }

   @Override
   public dtv L() {
      return this.E.B();
   }

   @Override
   public void a(
      @Nullable bul $$0,
      @Nullable btb $$1,
      @Nullable dff $$2,
      double $$3,
      double $$4,
      double $$5,
      float $$6,
      boolean $$7,
      dfm.a $$8,
      lq $$9,
      lq $$10,
      jq<awm> $$11
   ) {
   }

   @Override
   public int O() {
      return this.U;
   }

   public static class a implements eui {
      private final boolean a;
      private final boolean b;
      private jh c;
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
      public jh a() {
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
      public void a(jh $$0, float $$1) {
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
      public void a(p $$0, dfo $$1) {
         eui.super.a($$0, $$1);
      }

      public void a(bsh $$0) {
         this.h = $$0;
      }

      public void a(boolean $$0) {
         this.i = $$0;
      }

      public double a(dfo $$0) {
         return this.b ? (double)$$0.K_() : 63.0;
      }

      public float e() {
         return this.b ? 1.0F : 0.03125F;
      }
   }

   final class b implements eag<bul> {
      public void a(bul $$0) {
      }

      public void b(bul $$0) {
      }

      public void c(bul $$0) {
         gdh.this.e.a($$0);
      }

      public void d(bul $$0) {
         gdh.this.e.b($$0);
      }

      public void e(bul $$0) {
         if ($$0 instanceof ghz) {
            gdh.this.L.add((ghz)$$0);
         }
      }

      public void f(bul $$0) {
         $$0.ao();
         gdh.this.L.remove($$0);
      }

      public void g(bul $$0) {
      }
   }
}
