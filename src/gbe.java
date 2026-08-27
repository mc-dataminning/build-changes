import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gbe {
   public final gbm a = new gbm();
   public final gbe.a b;
   public final gbe.a c;
   public final gbe.a d;
   public final gbe.a e;
   public final gbe.a f;
   public final gbe.a g;
   public final gbp h;
   public final gbe.a i;
   public final gbe.a j;
   public final gbe.a k;
   public final gbe.a l;
   public final gaz m;
   public final gbr n;
   public final gay o;
   public final gbn p;
   public final gbh q;
   public final gbg r;
   public final gbf s;
   public final gbk t;
   public final gba u;
   private boolean v;

   public gbe(ezi $$0) {
      this.b = new gbs($$0);
      this.c = new gbb($$0);
      this.d = new gbi($$0);
      this.e = new gbd($$0);
      this.f = new gbq($$0);
      this.g = new gbl($$0);
      this.h = new gbp($$0);
      this.i = new gbj($$0);
      this.j = new gbt();
      this.k = new gbo($$0);
      this.l = new gbc($$0);
      this.m = new gaz($$0);
      this.n = new gbr();
      this.o = new gay($$0);
      this.p = new gbn($$0);
      this.q = new gbh($$0);
      this.r = new gbg();
      this.s = new gbf($$0);
      this.t = new gbk($$0, cxk.a);
      this.u = new gba($$0);
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

   public void a(eub $$0, fxs.a $$1, double $$2, double $$3, double $$4) {
      if (this.v && !ezi.Q().ax()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<box> a(@Nullable box $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         ept $$2 = $$0.bu();
         ept $$3 = $$0.f(1.0F).a((double)$$1);
         ept $$4 = $$2.e($$3);
         epo $$5 = $$0.cH().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<box> $$7 = $$0x -> !$$0x.N_() && $$0x.bw();
         epq $$8 = cjo.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(eub $$0, fxs $$1, ib $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(eub $$0, fxs $$1, ib $$2, ib $$3, float $$4, float $$5, float $$6, float $$7) {
      eyt $$8 = ezi.Q().j.m();
      if ($$8.h()) {
         ept $$9 = $$8.b().e();
         epo $$10 = epo.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(eub $$0, fxs $$1, ib $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      eyt $$8 = ezi.Q().j.m();
      if ($$8.h()) {
         ept $$9 = $$8.b().e();
         epo $$10 = new epo($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(eub $$0, fxs $$1, epo $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(eub $$0, fxs $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      euf $$12 = $$1.getBuffer(fya.A());
      fxq.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(eub $$0, fxs $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(eub $$0, fxs $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(eub $$0, fxs $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(eub $$0, fxs $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      ezi $$11 = ezi.Q();
      eyt $$12 = $$11.j.m();
      if ($$12.h() && $$11.aq().d != null) {
         fat $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a($$12.f());
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? fat.a.b : fat.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(eub var1, fxs var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
