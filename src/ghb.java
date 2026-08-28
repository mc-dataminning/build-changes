import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ghb {
   public final ghj a = new ghj();
   public final ghb.a b;
   public final ghb.a c;
   public final ghb.a d;
   public final ghb.a e;
   public final ghb.a f;
   public final ghb.a g;
   public final ghm h;
   public final ghb.a i;
   public final ghb.a j;
   public final ghb.a k;
   public final ghb.a l;
   public final ggw m;
   public final gho n;
   public final ggv o;
   public final ghk p;
   public final ghe q;
   public final ghd r;
   public final ghc s;
   public final ghh t;
   public final ggx u;
   private boolean v;

   public ghb(ffg $$0) {
      this.b = new ghp($$0);
      this.c = new ggy($$0);
      this.d = new ghf($$0);
      this.e = new gha($$0);
      this.f = new ghn($$0);
      this.g = new ghi($$0);
      this.h = new ghm($$0);
      this.i = new ghg($$0);
      this.j = new ghq();
      this.k = new ghl($$0);
      this.l = new ggz($$0);
      this.m = new ggw($$0);
      this.n = new gho();
      this.o = new ggv($$0);
      this.p = new ghk($$0);
      this.q = new ghe($$0);
      this.r = new ghd();
      this.s = new ghc($$0);
      this.t = new ghh($$0, dci.a);
      this.u = new ggx($$0);
   }

   public void a() {
      this.a.a();
      this.b.a();
      this.c.a();
      this.d.a();
      this.e.a();
      this.f.a();
      this.g.a();
      this.h.a();
      this.i.a();
      this.j.a();
      this.k.a();
      this.l.a();
      this.m.a();
      this.n.a();
      this.o.a();
      this.p.a();
      this.q.a();
      this.r.a();
      this.s.a();
      this.t.a();
      this.u.a();
   }

   public boolean b() {
      this.v = !this.v;
      return this.v;
   }

   public void a(ezz $$0, gdp.a $$1, double $$2, double $$3, double $$4) {
      if (this.v && !ffg.Q().aw()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bsv> a(@Nullable bsv $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         evs $$2 = $$0.bx();
         evs $$3 = $$0.f(1.0F).a((double)$$1);
         evs $$4 = $$2.e($$3);
         evn $$5 = $$0.cK().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<bsv> $$7 = $$0x -> !$$0x.N_() && $$0x.bz();
         evp $$8 = cns.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(ezz $$0, gdp $$1, iz $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(ezz $$0, gdp $$1, iz $$2, iz $$3, float $$4, float $$5, float $$6, float $$7) {
      fer $$8 = ffg.Q().j.l();
      if ($$8.h()) {
         evs $$9 = $$8.b().e();
         evn $$10 = evn.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(ezz $$0, gdp $$1, iz $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      fer $$8 = ffg.Q().j.l();
      if ($$8.h()) {
         evs $$9 = $$8.b().e();
         evn $$10 = new evn($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(ezz $$0, gdp $$1, evn $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(ezz $$0, gdp $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      fad $$12 = $$1.getBuffer(gdx.A());
      gdn.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(ezz $$0, gdp $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(ezz $$0, gdp $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(ezz $$0, gdp $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(ezz $$0, gdp $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      ffg $$11 = ffg.Q();
      fer $$12 = $$11.j.l();
      if ($$12.h() && $$11.ap().d != null) {
         fgq $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a($$12.f());
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? fgq.a.b : fgq.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(ezz var1, gdp var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
