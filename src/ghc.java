import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ghc {
   public final ghk a = new ghk();
   public final ghc.a b;
   public final ghc.a c;
   public final ghc.a d;
   public final ghc.a e;
   public final ghc.a f;
   public final ghc.a g;
   public final ghn h;
   public final ghc.a i;
   public final ghc.a j;
   public final ghc.a k;
   public final ghc.a l;
   public final ggx m;
   public final ghp n;
   public final ggw o;
   public final ghl p;
   public final ghf q;
   public final ghe r;
   public final ghd s;
   public final ghi t;
   public final ggy u;
   private boolean v;

   public ghc(ffh $$0) {
      this.b = new ghq($$0);
      this.c = new ggz($$0);
      this.d = new ghg($$0);
      this.e = new ghb($$0);
      this.f = new gho($$0);
      this.g = new ghj($$0);
      this.h = new ghn($$0);
      this.i = new ghh($$0);
      this.j = new ghr();
      this.k = new ghm($$0);
      this.l = new gha($$0);
      this.m = new ggx($$0);
      this.n = new ghp();
      this.o = new ggw($$0);
      this.p = new ghl($$0);
      this.q = new ghf($$0);
      this.r = new ghe();
      this.s = new ghd($$0);
      this.t = new ghi($$0, dcj.a);
      this.u = new ggy($$0);
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

   public void a(faa $$0, gdq.a $$1, double $$2, double $$3, double $$4) {
      if (this.v && !ffh.Q().aw()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bsw> a(@Nullable bsw $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         evt $$2 = $$0.bx();
         evt $$3 = $$0.f(1.0F).a((double)$$1);
         evt $$4 = $$2.e($$3);
         evo $$5 = $$0.cK().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<bsw> $$7 = $$0x -> !$$0x.N_() && $$0x.bz();
         evq $$8 = cnt.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(faa $$0, gdq $$1, iz $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(faa $$0, gdq $$1, iz $$2, iz $$3, float $$4, float $$5, float $$6, float $$7) {
      fes $$8 = ffh.Q().j.l();
      if ($$8.h()) {
         evt $$9 = $$8.b().e();
         evo $$10 = evo.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(faa $$0, gdq $$1, iz $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      fes $$8 = ffh.Q().j.l();
      if ($$8.h()) {
         evt $$9 = $$8.b().e();
         evo $$10 = new evo($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(faa $$0, gdq $$1, evo $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(faa $$0, gdq $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      fae $$12 = $$1.getBuffer(gdy.A());
      gdo.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(faa $$0, gdq $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(faa $$0, gdq $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(faa $$0, gdq $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(faa $$0, gdq $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      ffh $$11 = ffh.Q();
      fes $$12 = $$11.j.l();
      if ($$12.h() && $$11.ap().d != null) {
         fgr $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a($$12.f());
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? fgr.a.b : fgr.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(faa var1, gdq var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
