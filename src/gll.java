import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class gll {
   public final glu a = new glu();
   public final gll.a b;
   public final gll.a c;
   public final gll.a d;
   public final gll.a e;
   public final gll.a f;
   public final gls g;
   public final glw h;
   public final gly i;
   public final gll.a j;
   public final gll.a k;
   public final gll.a l;
   public final gll.a m;
   public final glf n;
   public final gma o;
   public final gle p;
   public final glv q;
   public final glo r;
   public final gln s;
   public final glm t;
   public final glr u;
   public final glg v;
   public final gli w;
   public final glt x;
   private boolean y;
   private boolean z;

   public gll(fip $$0) {
      this.b = new gmb($$0);
      this.c = new glh($$0);
      this.d = new glp($$0);
      this.e = new glk($$0);
      this.f = new glz($$0);
      this.g = new gls($$0);
      this.h = new glw($$0);
      this.i = new gly($$0);
      this.j = new glq($$0);
      this.k = new gmc();
      this.l = new glx($$0);
      this.m = new glj($$0);
      this.n = new glf($$0);
      this.o = new gma();
      this.p = new gle($$0);
      this.q = new glv($$0);
      this.r = new glo($$0);
      this.s = new gln();
      this.t = new glm($$0);
      this.u = new glr($$0, des.a);
      this.v = new glg($$0);
      this.w = new gli($$0);
      this.x = new glt($$0);
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

   public void a(fdi $$0, glc $$1, ghl.a $$2, double $$3, double $$4, double $$5) {
      if (this.y && !fip.Q().az()) {
         this.c.a($$0, $$2, $$3, $$4, $$5);
      }

      if (this.z) {
         this.x.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      this.s.a($$0, $$2, $$3, $$4, $$5);
   }

   public void a(fdi $$0, ghl.a $$1, double $$2, double $$3, double $$4) {
      this.w.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<btr> a(@Nullable btr $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         eyw $$2 = $$0.bC();
         eyw $$3 = $$0.g(1.0F).c((double)$$1);
         eyw $$4 = $$2.e($$3);
         eyr $$5 = $$0.cO().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         eyt $$7 = cot.a($$0, $$2, $$4, $$5, btw.h, (double)$$6);
         if ($$7 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$7.g()) > (double)$$6 ? Optional.empty() : Optional.of($$7.a());
         }
      }
   }

   public static void a(fdi $$0, ghl $$1, jf $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(fdi $$0, ghl $$1, jf $$2, jf $$3, float $$4, float $$5, float $$6, float $$7) {
      fhy $$8 = fip.Q().j.k();
      if ($$8.h()) {
         eyw $$9 = $$8.b().e();
         eyr $$10 = eyr.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(fdi $$0, ghl $$1, jf $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      fhy $$8 = fip.Q().j.k();
      if ($$8.h()) {
         eyw $$9 = $$8.b().e();
         eyr $$10 = new eyr($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(fdi $$0, ghl $$1, eyr $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(fdi $$0, ghl $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      fdm $$12 = $$1.getBuffer(ghv.A());
      gif.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(fdi $$0, ghl $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(fdi $$0, ghl $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(fdi $$0, ghl $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(fdi $$0, ghl $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      fip $$11 = fip.Q();
      fhy $$12 = $$11.j.k();
      if ($$12.h() && $$11.aq().d != null) {
         fjz $$13 = $$11.h;
         double $$14 = $$12.b().d;
         double $$15 = $$12.b().e;
         double $$16 = $$12.b().f;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a($$12.f());
         $$0.b($$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? fjz.a.b : fjz.a.a, 0, 15728880);
         $$0.b();
      }
   }

   private static eyw a(float $$0) {
      float $$1 = 5.99999F;
      int $$2 = (int)(azf.a($$0, 0.0F, 1.0F) * 5.99999F);
      float $$3 = $$0 * 5.99999F - (float)$$2;

      return switch ($$2) {
         case 0 -> new eyw(1.0, (double)$$3, 0.0);
         case 1 -> new eyw((double)(1.0F - $$3), 1.0, 0.0);
         case 2 -> new eyw(0.0, 1.0, (double)$$3);
         case 3 -> new eyw(0.0, 1.0 - (double)$$3, 1.0);
         case 4 -> new eyw((double)$$3, 0.0, 1.0);
         case 5 -> new eyw(1.0, 0.0, 1.0 - (double)$$3);
         default -> throw new IllegalStateException("Unexpected value: " + $$2);
      };
   }

   private static eyw a(float $$0, float $$1, float $$2, float $$3) {
      eyw $$4 = a($$3).c((double)$$0);
      eyw $$5 = a(($$3 + 0.33333334F) % 1.0F).c((double)$$1);
      eyw $$6 = a(($$3 + 0.6666667F) % 1.0F).c((double)$$2);
      eyw $$7 = $$4.e($$5).e($$6);
      double $$8 = Math.max(Math.max(1.0, $$7.d), Math.max($$7.e, $$7.f));
      return new eyw($$7.d / $$8, $$7.e / $$8, $$7.f / $$8);
   }

   public static void a(fdi $$0, fdm $$1, ezq $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9, boolean $$10) {
      List<eyr> $$11 = $$2.e();
      if (!$$11.isEmpty()) {
         int $$12 = $$10 ? $$11.size() : $$11.size() * 8;
         gif.a($$0, $$1, ezn.a($$11.get(0)), $$3, $$4, $$5, $$6, $$7, $$8, $$9);

         for (int $$13 = 1; $$13 < $$11.size(); $$13++) {
            eyr $$14 = $$11.get($$13);
            float $$15 = (float)$$13 / (float)$$12;
            eyw $$16 = a($$6, $$7, $$8, $$15);
            gif.a($$0, $$1, ezn.a($$14), $$3, $$4, $$5, (float)$$16.d, (float)$$16.e, (float)$$16.f, $$9);
         }
      }
   }

   public interface a {
      void a(fdi var1, ghl var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
