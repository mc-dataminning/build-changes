import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ghj {
   public final ghr a = new ghr();
   public final ghj.a b;
   public final ghj.a c;
   public final ghj.a d;
   public final ghj.a e;
   public final ghj.a f;
   public final ghj.a g;
   public final ghu h;
   public final ghj.a i;
   public final ghj.a j;
   public final ghj.a k;
   public final ghj.a l;
   public final ghe m;
   public final ghw n;
   public final ghd o;
   public final ghs p;
   public final ghm q;
   public final ghl r;
   public final ghk s;
   public final ghp t;
   public final ghf u;
   private boolean v;

   public ghj(ffn $$0) {
      this.b = new ghx($$0);
      this.c = new ghg($$0);
      this.d = new ghn($$0);
      this.e = new ghi($$0);
      this.f = new ghv($$0);
      this.g = new ghq($$0);
      this.h = new ghu($$0);
      this.i = new gho($$0);
      this.j = new ghy();
      this.k = new ght($$0);
      this.l = new ghh($$0);
      this.m = new ghe($$0);
      this.n = new ghw();
      this.o = new ghd($$0);
      this.p = new ghs($$0);
      this.q = new ghm($$0);
      this.r = new ghl();
      this.s = new ghk($$0);
      this.t = new ghp($$0, dcm.a);
      this.u = new ghf($$0);
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

   public void a(fag $$0, gdx.a $$1, double $$2, double $$3, double $$4) {
      if (this.v && !ffn.Q().aw()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bsd> a(@Nullable bsd $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         evz $$2 = $$0.bx();
         evz $$3 = $$0.g(1.0F).a((double)$$1);
         evz $$4 = $$2.e($$3);
         evu $$5 = $$0.cK().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<bsd> $$7 = $$0x -> !$$0x.N_() && $$0x.bz();
         evw $$8 = cnb.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(fag $$0, gdx $$1, ja $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(fag $$0, gdx $$1, ja $$2, ja $$3, float $$4, float $$5, float $$6, float $$7) {
      fey $$8 = ffn.Q().j.l();
      if ($$8.h()) {
         evz $$9 = $$8.b().e();
         evu $$10 = evu.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(fag $$0, gdx $$1, ja $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      fey $$8 = ffn.Q().j.l();
      if ($$8.h()) {
         evz $$9 = $$8.b().e();
         evu $$10 = new evu($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(fag $$0, gdx $$1, evu $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(fag $$0, gdx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      fak $$12 = $$1.getBuffer(gef.A());
      gdv.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(fag $$0, gdx $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(fag $$0, gdx $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(fag $$0, gdx $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(fag $$0, gdx $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      ffn $$11 = ffn.Q();
      fey $$12 = $$11.j.l();
      if ($$12.h() && $$11.ap().d != null) {
         fgx $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a($$12.f());
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? fgx.a.b : fgx.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(fag var1, gdx var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
