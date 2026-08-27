import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gfa {
   public final gfi a = new gfi();
   public final gfa.a b;
   public final gfa.a c;
   public final gfa.a d;
   public final gfa.a e;
   public final gfa.a f;
   public final gfa.a g;
   public final gfl h;
   public final gfa.a i;
   public final gfa.a j;
   public final gfa.a k;
   public final gfa.a l;
   public final gev m;
   public final gfn n;
   public final geu o;
   public final gfj p;
   public final gfd q;
   public final gfc r;
   public final gfb s;
   public final gfg t;
   public final gew u;
   private boolean v;

   public gfa(fde $$0) {
      this.b = new gfo($$0);
      this.c = new gex($$0);
      this.d = new gfe($$0);
      this.e = new gez($$0);
      this.f = new gfm($$0);
      this.g = new gfh($$0);
      this.h = new gfl($$0);
      this.i = new gff($$0);
      this.j = new gfp();
      this.k = new gfk($$0);
      this.l = new gey($$0);
      this.m = new gev($$0);
      this.n = new gfn();
      this.o = new geu($$0);
      this.p = new gfj($$0);
      this.q = new gfd($$0);
      this.r = new gfc();
      this.s = new gfb($$0);
      this.t = new gfg($$0, dam.a);
      this.u = new gew($$0);
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

   public void a(exx $$0, gbo.a $$1, double $$2, double $$3, double $$4) {
      if (this.v && !fde.Q().ax()) {
         this.c.a($$0, $$1, $$2, $$3, $$4);
      }

      this.r.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<brh> a(@Nullable brh $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         etp $$2 = $$0.bv();
         etp $$3 = $$0.f(1.0F).a((double)$$1);
         etp $$4 = $$2.e($$3);
         etk $$5 = $$0.cI().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         Predicate<brh> $$7 = $$0x -> !$$0x.N_() && $$0x.bx();
         etm $$8 = cmb.a($$0, $$2, $$4, $$5, $$7, (double)$$6);
         if ($$8 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$8.e()) > (double)$$6 ? Optional.empty() : Optional.of($$8.a());
         }
      }
   }

   public static void a(exx $$0, gbo $$1, in $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(exx $$0, gbo $$1, in $$2, in $$3, float $$4, float $$5, float $$6, float $$7) {
      fcp $$8 = fde.Q().j.m();
      if ($$8.h()) {
         etp $$9 = $$8.b().e();
         etk $$10 = etk.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(exx $$0, gbo $$1, in $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      fcp $$8 = fde.Q().j.m();
      if ($$8.h()) {
         etp $$9 = $$8.b().e();
         etk $$10 = new etk($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(exx $$0, gbo $$1, etk $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(exx $$0, gbo $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      eyb $$12 = $$1.getBuffer(gbw.A());
      gbm.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(exx $$0, gbo $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(exx $$0, gbo $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(exx $$0, gbo $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(exx $$0, gbo $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      fde $$11 = fde.Q();
      fcp $$12 = $$11.j.m();
      if ($$12.h() && $$11.aq().d != null) {
         fep $$13 = $$11.h;
         double $$14 = $$12.b().c;
         double $$15 = $$12.b().d;
         double $$16 = $$12.b().e;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a($$12.f());
         $$0.b(-$$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? fep.a.b : fep.a.a, 0, 15728880);
         $$0.b();
      }
   }

   public interface a {
      void a(exx var1, gbo var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
