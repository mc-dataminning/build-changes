import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gha {
   public final ghi a = new ghi();
   public final gha.a b;
   public final gha.a c;
   public final gha.a d;
   public final gha.a e;
   public final gha.a f;
   public final gha.a g;
   public final ghl h;
   public final gha.a i;
   public final gha.a j;
   public final gha.a k;
   public final gha.a l;
   public final ggv m;
   public final ghn n;
   public final ggu o;
   public final ghj p;
   public final ghd q;
   public final ghc r;
   public final ghb s;
   public final ghg t;
   public final ggw u;
   private boolean v;

   public gha(fff $$0) {
      this.b = new gho($$0);
      this.c = new ggx($$0);
      this.d = new ghe($$0);
      this.e = new ggz($$0);
      this.f = new ghm($$0);
      this.g = new ghh($$0);
      this.h = new ghl($$0);
      this.i = new ghf($$0);
      this.j = new ghp();
      this.k = new ghk($$0);
      this.l = new ggy($$0);
      this.m = new ggv($$0);
      this.n = new ghn();
      this.o = new ggu($$0);
      this.p = new ghj($$0);
      this.q = new ghd($$0);
      this.r = new ghc();
      this.s = new ghb($$0);
      this.t = new ghg($$0, dch.a);
      this.u = new ggw($$0);
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

   public void a(ezy $$0, gdo.a $$1, double $$2, double $$3, double $$4) {
      if (this.v && !fff.Q().aw()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bsu> a(@Nullable bsu $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         evr $$2 = $$0.bx();
         evr $$3 = $$0.f(1.0F).a((double)$$1);
         evr $$4 = $$2.e($$3);
         evm $$5 = $$0.cK().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<bsu> $$7 = $$0x -> !$$0x.N_() && $$0x.bz();
         evo $$8 = cnr.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(ezy $$0, gdo $$1, iz $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(ezy $$0, gdo $$1, iz $$2, iz $$3, float $$4, float $$5, float $$6, float $$7) {
      feq $$8 = fff.Q().j.l();
      if ($$8.h()) {
         evr $$9 = $$8.b().e();
         evm $$10 = evm.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(ezy $$0, gdo $$1, iz $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      feq $$8 = fff.Q().j.l();
      if ($$8.h()) {
         evr $$9 = $$8.b().e();
         evm $$10 = new evm($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(ezy $$0, gdo $$1, evm $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(ezy $$0, gdo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      fac $$12 = $$1.getBuffer(gdw.A());
      gdm.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(ezy $$0, gdo $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(ezy $$0, gdo $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(ezy $$0, gdo $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(ezy $$0, gdo $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      fff $$11 = fff.Q();
      feq $$12 = $$11.j.l();
      if ($$12.h() && $$11.ap().d != null) {
         fgp $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a($$12.f());
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? fgp.a.b : fgp.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(ezy var1, gdo var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
