import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class glg {
   public final glp a = new glp();
   public final glg.a b;
   public final glg.a c;
   public final glg.a d;
   public final glg.a e;
   public final glg.a f;
   public final gln g;
   public final glr h;
   public final glt i;
   public final glg.a j;
   public final glg.a k;
   public final glg.a l;
   public final glg.a m;
   public final gla n;
   public final glv o;
   public final gkz p;
   public final glq q;
   public final glj r;
   public final gli s;
   public final glh t;
   public final glm u;
   public final glb v;
   public final gld w;
   public final glo x;
   private boolean y;
   private boolean z;

   public glg(fil $$0) {
      this.b = new glw($$0);
      this.c = new glc($$0);
      this.d = new glk($$0);
      this.e = new glf($$0);
      this.f = new glu($$0);
      this.g = new gln($$0);
      this.h = new glr($$0);
      this.i = new glt($$0);
      this.j = new gll($$0);
      this.k = new glx();
      this.l = new gls($$0);
      this.m = new gle($$0);
      this.n = new gla($$0);
      this.o = new glv();
      this.p = new gkz($$0);
      this.q = new glq($$0);
      this.r = new glj($$0);
      this.s = new gli();
      this.t = new glh($$0);
      this.u = new glm($$0, dep.a);
      this.v = new glb($$0);
      this.w = new gld($$0);
      this.x = new glo($$0);
   }

   public void a() {
      this.a.a();
      this.b.a();
      this.c.a();
      this.d.a();
      this.e.a();
      this.f.a();
      this.g.a();
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
      this.v.a();
      this.w.a();
   }

   public boolean b() {
      this.y = !this.y;
      return this.y;
   }

   public boolean c() {
      return this.z = !this.z;
   }

   public void a(fde $$0, gkx $$1, ghg.a $$2, double $$3, double $$4, double $$5) {
      if (this.y && !fil.Q().az()) {
         this.c.a($$0, $$2, $$3, $$4, $$5);
      }

      if (this.z) {
         this.x.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      this.s.a($$0, $$2, $$3, $$4, $$5);
   }

   public void a(fde $$0, ghg.a $$1, double $$2, double $$3, double $$4) {
      this.w.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bto> a(@Nullable bto $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         eys $$2 = $$0.bC();
         eys $$3 = $$0.g(1.0F).c((double)$$1);
         eys $$4 = $$2.e($$3);
         eyn $$5 = $$0.cO().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         eyp $$7 = coq.a($$0, $$2, $$4, $$5, btt.h, (double)$$6);
         if ($$7 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$7.g()) > (double)$$6 ? Optional.empty() : Optional.of($$7.a());
         }
      }
   }

   public static void a(fde $$0, ghg $$1, je $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(fde $$0, ghg $$1, je $$2, je $$3, float $$4, float $$5, float $$6, float $$7) {
      fhu $$8 = fil.Q().j.k();
      if ($$8.h()) {
         eys $$9 = $$8.b().e();
         eyn $$10 = eyn.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(fde $$0, ghg $$1, je $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      fhu $$8 = fil.Q().j.k();
      if ($$8.h()) {
         eys $$9 = $$8.b().e();
         eyn $$10 = new eyn($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(fde $$0, ghg $$1, eyn $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(fde $$0, ghg $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      fdi $$12 = $$1.getBuffer(ghq.A());
      gia.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(fde $$0, ghg $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(fde $$0, ghg $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(fde $$0, ghg $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(fde $$0, ghg $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      fil $$11 = fil.Q();
      fhu $$12 = $$11.j.k();
      if ($$12.h() && $$11.aq().d != null) {
         fjv $$13 = $$11.h;
         double $$14 = $$12.b().d;
         double $$15 = $$12.b().e;
         double $$16 = $$12.b().f;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a($$12.f());
         $$0.b($$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? fjv.a.b : fjv.a.a, 0, 15728880);
         $$0.b();
      }
   }

   private static eys a(float $$0) {
      float $$1 = 5.99999F;
      int $$2 = (int)(azd.a($$0, 0.0F, 1.0F) * 5.99999F);
      float $$3 = $$0 * 5.99999F - (float)$$2;

      return switch ($$2) {
         case 0 -> new eys(1.0, (double)$$3, 0.0);
         case 1 -> new eys((double)(1.0F - $$3), 1.0, 0.0);
         case 2 -> new eys(0.0, 1.0, (double)$$3);
         case 3 -> new eys(0.0, 1.0 - (double)$$3, 1.0);
         case 4 -> new eys((double)$$3, 0.0, 1.0);
         case 5 -> new eys(1.0, 0.0, 1.0 - (double)$$3);
         default -> throw new IllegalStateException("Unexpected value: " + $$2);
      };
   }

   private static eys a(float $$0, float $$1, float $$2, float $$3) {
      eys $$4 = a($$3).c((double)$$0);
      eys $$5 = a(($$3 + 0.33333334F) % 1.0F).c((double)$$1);
      eys $$6 = a(($$3 + 0.6666667F) % 1.0F).c((double)$$2);
      eys $$7 = $$4.e($$5).e($$6);
      double $$8 = Math.max(Math.max(1.0, $$7.d), Math.max($$7.e, $$7.f));
      return new eys($$7.d / $$8, $$7.e / $$8, $$7.f / $$8);
   }

   public static void a(fde $$0, fdi $$1, ezm $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9, boolean $$10) {
      List<eyn> $$11 = $$2.e();
      if (!$$11.isEmpty()) {
         int $$12 = $$10 ? $$11.size() : $$11.size() * 8;
         gia.a($$0, $$1, ezj.a($$11.get(0)), $$3, $$4, $$5, $$6, $$7, $$8, $$9);

         for (int $$13 = 1; $$13 < $$11.size(); $$13++) {
            eyn $$14 = $$11.get($$13);
            float $$15 = (float)$$13 / (float)$$12;
            eys $$16 = a($$6, $$7, $$8, $$15);
            gia.a($$0, $$1, ezj.a($$14), $$3, $$4, $$5, (float)$$16.d, (float)$$16.e, (float)$$16.f, $$9);
         }
      }
   }

   public interface a {
      void a(fde var1, ghg var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
