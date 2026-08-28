import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class glw {
   public final gmf a = new gmf();
   public final glw.a b;
   public final glw.a c;
   public final glw.a d;
   public final glw.a e;
   public final glw.a f;
   public final gmd g;
   public final gmh h;
   public final gmj i;
   public final glw.a j;
   public final glw.a k;
   public final glw.a l;
   public final glw.a m;
   public final glq n;
   public final gml o;
   public final glp p;
   public final gmg q;
   public final glz r;
   public final gly s;
   public final glx t;
   public final gmc u;
   public final glr v;
   public final glt w;
   public final gme x;
   private boolean y;
   private boolean z;

   public glw(fja $$0) {
      this.b = new gmm($$0);
      this.c = new gls($$0);
      this.d = new gma($$0);
      this.e = new glv($$0);
      this.f = new gmk($$0);
      this.g = new gmd($$0);
      this.h = new gmh($$0);
      this.i = new gmj($$0);
      this.j = new gmb($$0);
      this.k = new gmn();
      this.l = new gmi($$0);
      this.m = new glu($$0);
      this.n = new glq($$0);
      this.o = new gml();
      this.p = new glp($$0);
      this.q = new gmg($$0);
      this.r = new glz($$0);
      this.s = new gly();
      this.t = new glx($$0);
      this.u = new gmc($$0, dfe.a);
      this.v = new glr($$0);
      this.w = new glt($$0);
      this.x = new gme($$0);
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

   public void a(fdt $$0, gln $$1, ghw.a $$2, double $$3, double $$4, double $$5) {
      if (this.y && !fja.Q().az()) {
         this.c.a($$0, $$2, $$3, $$4, $$5);
      }

      if (this.z) {
         this.x.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      this.s.a($$0, $$2, $$3, $$4, $$5);
   }

   public void a(fdt $$0, ghw.a $$1, double $$2, double $$3, double $$4) {
      this.w.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<btz> a(@Nullable btz $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         ezh $$2 = $$0.bG();
         ezh $$3 = $$0.g(1.0F).c((double)$$1);
         ezh $$4 = $$2.e($$3);
         ezc $$5 = $$0.cS().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         eze $$7 = cpd.a($$0, $$2, $$4, $$5, bue.h, (double)$$6);
         if ($$7 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$7.g()) > (double)$$6 ? Optional.empty() : Optional.of($$7.a());
         }
      }
   }

   public static void a(fdt $$0, ghw $$1, jg $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(fdt $$0, ghw $$1, jg $$2, jg $$3, float $$4, float $$5, float $$6, float $$7) {
      fij $$8 = fja.Q().j.k();
      if ($$8.h()) {
         ezh $$9 = $$8.b().e();
         ezc $$10 = ezc.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(fdt $$0, ghw $$1, jg $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      fij $$8 = fja.Q().j.k();
      if ($$8.h()) {
         ezh $$9 = $$8.b().e();
         ezc $$10 = new ezc($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(fdt $$0, ghw $$1, ezc $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(fdt $$0, ghw $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      fdx $$12 = $$1.getBuffer(gig.A());
      giq.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(fdt $$0, ghw $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(fdt $$0, ghw $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(fdt $$0, ghw $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(fdt $$0, ghw $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      fja $$11 = fja.Q();
      fij $$12 = $$11.j.k();
      if ($$12.h() && $$11.aq().d != null) {
         fkk $$13 = $$11.h;
         double $$14 = $$12.b().d;
         double $$15 = $$12.b().e;
         double $$16 = $$12.b().f;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a($$12.f());
         $$0.b($$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? fkk.a.b : fkk.a.a, 0, 15728880);
         $$0.b();
      }
   }

   private static ezh a(float $$0) {
      float $$1 = 5.99999F;
      int $$2 = (int)(azj.a($$0, 0.0F, 1.0F) * 5.99999F);
      float $$3 = $$0 * 5.99999F - (float)$$2;

      return switch ($$2) {
         case 0 -> new ezh(1.0, (double)$$3, 0.0);
         case 1 -> new ezh((double)(1.0F - $$3), 1.0, 0.0);
         case 2 -> new ezh(0.0, 1.0, (double)$$3);
         case 3 -> new ezh(0.0, 1.0 - (double)$$3, 1.0);
         case 4 -> new ezh((double)$$3, 0.0, 1.0);
         case 5 -> new ezh(1.0, 0.0, 1.0 - (double)$$3);
         default -> throw new IllegalStateException("Unexpected value: " + $$2);
      };
   }

   private static ezh a(float $$0, float $$1, float $$2, float $$3) {
      ezh $$4 = a($$3).c((double)$$0);
      ezh $$5 = a(($$3 + 0.33333334F) % 1.0F).c((double)$$1);
      ezh $$6 = a(($$3 + 0.6666667F) % 1.0F).c((double)$$2);
      ezh $$7 = $$4.e($$5).e($$6);
      double $$8 = Math.max(Math.max(1.0, $$7.d), Math.max($$7.e, $$7.f));
      return new ezh($$7.d / $$8, $$7.e / $$8, $$7.f / $$8);
   }

   public static void a(fdt $$0, fdx $$1, fab $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9, boolean $$10) {
      List<ezc> $$11 = $$2.e();
      if (!$$11.isEmpty()) {
         int $$12 = $$10 ? $$11.size() : $$11.size() * 8;
         giq.a($$0, $$1, ezy.a($$11.get(0)), $$3, $$4, $$5, $$6, $$7, $$8, $$9);

         for (int $$13 = 1; $$13 < $$11.size(); $$13++) {
            ezc $$14 = $$11.get($$13);
            float $$15 = (float)$$13 / (float)$$12;
            ezh $$16 = a($$6, $$7, $$8, $$15);
            giq.a($$0, $$1, ezy.a($$14), $$3, $$4, $$5, (float)$$16.d, (float)$$16.e, (float)$$16.f, $$9);
         }
      }
   }

   public interface a {
      void a(fdt var1, ghw var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
