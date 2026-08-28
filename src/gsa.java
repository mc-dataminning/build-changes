import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class gsa {
   public final gsj a = new gsj();
   public final gsa.a b;
   public final gsa.a c;
   public final gsa.a d;
   public final gsa.a e;
   public final gsa.a f;
   public final gsh g;
   public final gsl h;
   public final gsn i;
   public final gsa.a j;
   public final gsa.a k;
   public final gsa.a l;
   public final gsa.a m;
   public final gru n;
   public final gsp o;
   public final grt p;
   public final gsk q;
   public final gsd r;
   public final gsc s;
   public final gsb t;
   public final gsg u;
   public final grv v;
   public final grx w;
   public final gsi x;
   private boolean y;
   private boolean z;

   public gsa(fnd $$0) {
      this.b = new gsq($$0);
      this.c = new grw($$0);
      this.d = new gse($$0);
      this.e = new grz($$0);
      this.f = new gso($$0);
      this.g = new gsh($$0);
      this.h = new gsl($$0);
      this.i = new gsn($$0);
      this.j = new gsf($$0);
      this.k = new gsr();
      this.l = new gsm($$0);
      this.m = new gry($$0);
      this.n = new gru($$0);
      this.o = new gsp();
      this.p = new grt($$0);
      this.q = new gsk($$0);
      this.r = new gsd($$0);
      this.s = new gsc();
      this.t = new gsb($$0);
      this.u = new gsg($$0, dhy.a);
      this.v = new grv($$0);
      this.w = new grx($$0);
      this.x = new gsi($$0);
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

   public void a(fho $$0, grr $$1, gny.a $$2, double $$3, double $$4, double $$5) {
      if (this.y && !fnd.Q().az()) {
         this.c.a($$0, $$2, $$3, $$4, $$5);
      }

      if (this.z) {
         this.x.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      this.s.a($$0, $$2, $$3, $$4, $$5);
   }

   public void a(fho $$0, gny.a $$1, double $$2, double $$3, double $$4) {
      this.w.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bvs> a(@Nullable bvs $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         fcu $$2 = $$0.bE();
         fcu $$3 = $$0.h(1.0F).c((double)$$1);
         fcu $$4 = $$2.e($$3);
         fcp $$5 = $$0.cR().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         fcr $$7 = crd.a($$0, $$2, $$4, $$5, bvz.h, (double)$$6);
         if ($$7 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$7.g()) > (double)$$6 ? Optional.empty() : Optional.of($$7.a());
         }
      }
   }

   public static void a(fho $$0, gny $$1, jj $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(fho $$0, gny $$1, jj $$2, jj $$3, float $$4, float $$5, float $$6, float $$7) {
      fml $$8 = fnd.Q().j.k();
      if ($$8.h()) {
         fcu $$9 = $$8.b().e();
         fcp $$10 = fcp.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(fho $$0, gny $$1, jj $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      fml $$8 = fnd.Q().j.k();
      if ($$8.h()) {
         fcu $$9 = $$8.b().e();
         fcp $$10 = new fcp($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(fho $$0, gny $$1, fcp $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(fho $$0, gny $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      fhs $$12 = $$1.getBuffer(goi.B());
      gos.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(fho $$0, gny $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(fho $$0, gny $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(fho $$0, gny $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(fho $$0, gny $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      fnd $$11 = fnd.Q();
      fml $$12 = $$11.j.k();
      if ($$12.h() && $$11.aq().d != null) {
         fpx $$13 = $$11.h;
         double $$14 = $$12.b().d;
         double $$15 = $$12.b().e;
         double $$16 = $$12.b().f;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a($$12.f());
         $$0.b($$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? fpx.a.b : fpx.a.a, 0, 15728880);
         $$0.b();
      }
   }

   private static fcu a(float $$0) {
      float $$1 = 5.99999F;
      int $$2 = (int)(azk.a($$0, 0.0F, 1.0F) * 5.99999F);
      float $$3 = $$0 * 5.99999F - (float)$$2;

      return switch ($$2) {
         case 0 -> new fcu(1.0, (double)$$3, 0.0);
         case 1 -> new fcu((double)(1.0F - $$3), 1.0, 0.0);
         case 2 -> new fcu(0.0, 1.0, (double)$$3);
         case 3 -> new fcu(0.0, 1.0 - (double)$$3, 1.0);
         case 4 -> new fcu((double)$$3, 0.0, 1.0);
         case 5 -> new fcu(1.0, 0.0, 1.0 - (double)$$3);
         default -> throw new IllegalStateException("Unexpected value: " + $$2);
      };
   }

   private static fcu a(float $$0, float $$1, float $$2, float $$3) {
      fcu $$4 = a($$3).c((double)$$0);
      fcu $$5 = a(($$3 + 0.33333334F) % 1.0F).c((double)$$1);
      fcu $$6 = a(($$3 + 0.6666667F) % 1.0F).c((double)$$2);
      fcu $$7 = $$4.e($$5).e($$6);
      double $$8 = Math.max(Math.max(1.0, $$7.d), Math.max($$7.e, $$7.f));
      return new fcu($$7.d / $$8, $$7.e / $$8, $$7.f / $$8);
   }

   public static void a(fho $$0, fhs $$1, fdo $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9, boolean $$10) {
      List<fcp> $$11 = $$2.e();
      if (!$$11.isEmpty()) {
         int $$12 = $$10 ? $$11.size() : $$11.size() * 8;
         gos.a($$0, $$1, fdl.a($$11.get(0)), $$3, $$4, $$5, axu.a($$9, $$6, $$7, $$8));

         for (int $$13 = 1; $$13 < $$11.size(); $$13++) {
            fcp $$14 = $$11.get($$13);
            float $$15 = (float)$$13 / (float)$$12;
            fcu $$16 = a($$6, $$7, $$8, $$15);
            gos.a($$0, $$1, fdl.a($$14), $$3, $$4, $$5, axu.a($$9, (float)$$16.d, (float)$$16.e, (float)$$16.f));
         }
      }
   }

   public interface a {
      void a(fho var1, gny var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
