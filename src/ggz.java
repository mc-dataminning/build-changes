import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ggz {
   public final ghh a = new ghh();
   public final ggz.a b;
   public final ggz.a c;
   public final ggz.a d;
   public final ggz.a e;
   public final ggz.a f;
   public final ggz.a g;
   public final ghk h;
   public final ggz.a i;
   public final ggz.a j;
   public final ggz.a k;
   public final ggz.a l;
   public final ggu m;
   public final ghm n;
   public final ggt o;
   public final ghi p;
   public final ghc q;
   public final ghb r;
   public final gha s;
   public final ghf t;
   public final ggv u;
   private boolean v;

   public ggz(ffe $$0) {
      this.b = new ghn($$0);
      this.c = new ggw($$0);
      this.d = new ghd($$0);
      this.e = new ggy($$0);
      this.f = new ghl($$0);
      this.g = new ghg($$0);
      this.h = new ghk($$0);
      this.i = new ghe($$0);
      this.j = new gho();
      this.k = new ghj($$0);
      this.l = new ggx($$0);
      this.m = new ggu($$0);
      this.n = new ghm();
      this.o = new ggt($$0);
      this.p = new ghi($$0);
      this.q = new ghc($$0);
      this.r = new ghb();
      this.s = new gha($$0);
      this.t = new ghf($$0, dcg.a);
      this.u = new ggv($$0);
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

   public void a(ezx $$0, gdn.a $$1, double $$2, double $$3, double $$4) {
      if (this.v && !ffe.Q().aw()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bst> a(@Nullable bst $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         evq $$2 = $$0.bx();
         evq $$3 = $$0.f(1.0F).a((double)$$1);
         evq $$4 = $$2.e($$3);
         evl $$5 = $$0.cK().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<bst> $$7 = $$0x -> !$$0x.N_() && $$0x.bz();
         evn $$8 = cnq.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(ezx $$0, gdn $$1, iz $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(ezx $$0, gdn $$1, iz $$2, iz $$3, float $$4, float $$5, float $$6, float $$7) {
      fep $$8 = ffe.Q().j.l();
      if ($$8.h()) {
         evq $$9 = $$8.b().e();
         evl $$10 = evl.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(ezx $$0, gdn $$1, iz $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      fep $$8 = ffe.Q().j.l();
      if ($$8.h()) {
         evq $$9 = $$8.b().e();
         evl $$10 = new evl($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(ezx $$0, gdn $$1, evl $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(ezx $$0, gdn $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      fab $$12 = $$1.getBuffer(gdv.A());
      gdl.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(ezx $$0, gdn $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(ezx $$0, gdn $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(ezx $$0, gdn $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(ezx $$0, gdn $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      ffe $$11 = ffe.Q();
      fep $$12 = $$11.j.l();
      if ($$12.h() && $$11.ap().d != null) {
         fgo $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a($$12.f());
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? fgo.a.b : fgo.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(ezx var1, gdn var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
