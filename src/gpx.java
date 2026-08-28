import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class gpx {
   public final gqg a = new gqg();
   public final gpx.a b;
   public final gpx.a c;
   public final gpx.a d;
   public final gpx.a e;
   public final gpx.a f;
   public final gqe g;
   public final gqi h;
   public final gqk i;
   public final gpx.a j;
   public final gpx.a k;
   public final gpx.a l;
   public final gpx.a m;
   public final gpr n;
   public final gqm o;
   public final gpq p;
   public final gqh q;
   public final gqa r;
   public final gpz s;
   public final gpy t;
   public final gqd u;
   public final gps v;
   public final gpu w;
   public final gqf x;
   private boolean y;
   private boolean z;

   public gpx(flj $$0) {
      this.b = new gqn($$0);
      this.c = new gpt($$0);
      this.d = new gqb($$0);
      this.e = new gpw($$0);
      this.f = new gql($$0);
      this.g = new gqe($$0);
      this.h = new gqi($$0);
      this.i = new gqk($$0);
      this.j = new gqc($$0);
      this.k = new gqo();
      this.l = new gqj($$0);
      this.m = new gpv($$0);
      this.n = new gpr($$0);
      this.o = new gqm();
      this.p = new gpq($$0);
      this.q = new gqh($$0);
      this.r = new gqa($$0);
      this.s = new gpz();
      this.t = new gpy($$0);
      this.u = new gqd($$0, dgr.a);
      this.v = new gps($$0);
      this.w = new gpu($$0);
      this.x = new gqf($$0);
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

   public void a(ffu $$0, gpo $$1, glx.a $$2, double $$3, double $$4, double $$5) {
      if (this.y && !flj.Q().az()) {
         this.c.a($$0, $$2, $$3, $$4, $$5);
      }

      if (this.z) {
         this.x.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      this.s.a($$0, $$2, $$3, $$4, $$5);
   }

   public void a(ffu $$0, glx.a $$1, double $$2, double $$3, double $$4) {
      this.w.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<buk> a(@Nullable buk $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         fba $$2 = $$0.bF();
         fba $$3 = $$0.g(1.0F).c((double)$$1);
         fba $$4 = $$2.e($$3);
         fav $$5 = $$0.cR().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         fax $$7 = cps.a($$0, $$2, $$4, $$5, bup.h, (double)$$6);
         if ($$7 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$7.g()) > (double)$$6 ? Optional.empty() : Optional.of($$7.a());
         }
      }
   }

   public static void a(ffu $$0, glx $$1, ji $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(ffu $$0, glx $$1, ji $$2, ji $$3, float $$4, float $$5, float $$6, float $$7) {
      fkr $$8 = flj.Q().j.k();
      if ($$8.h()) {
         fba $$9 = $$8.b().e();
         fav $$10 = fav.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(ffu $$0, glx $$1, ji $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      fkr $$8 = flj.Q().j.k();
      if ($$8.h()) {
         fba $$9 = $$8.b().e();
         fav $$10 = new fav($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(ffu $$0, glx $$1, fav $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(ffu $$0, glx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      ffy $$12 = $$1.getBuffer(gmh.B());
      gmr.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(ffu $$0, glx $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(ffu $$0, glx $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(ffu $$0, glx $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(ffu $$0, glx $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      flj $$11 = flj.Q();
      fkr $$12 = $$11.j.k();
      if ($$12.h() && $$11.aq().d != null) {
         fob $$13 = $$11.h;
         double $$14 = $$12.b().d;
         double $$15 = $$12.b().e;
         double $$16 = $$12.b().f;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a($$12.f());
         $$0.b($$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? fob.a.b : fob.a.a, 0, 15728880);
         $$0.b();
      }
   }

   private static fba a(float $$0) {
      float $$1 = 5.99999F;
      int $$2 = (int)(ayz.a($$0, 0.0F, 1.0F) * 5.99999F);
      float $$3 = $$0 * 5.99999F - (float)$$2;

      return switch ($$2) {
         case 0 -> new fba(1.0, (double)$$3, 0.0);
         case 1 -> new fba((double)(1.0F - $$3), 1.0, 0.0);
         case 2 -> new fba(0.0, 1.0, (double)$$3);
         case 3 -> new fba(0.0, 1.0 - (double)$$3, 1.0);
         case 4 -> new fba((double)$$3, 0.0, 1.0);
         case 5 -> new fba(1.0, 0.0, 1.0 - (double)$$3);
         default -> throw new IllegalStateException("Unexpected value: " + $$2);
      };
   }

   private static fba a(float $$0, float $$1, float $$2, float $$3) {
      fba $$4 = a($$3).c((double)$$0);
      fba $$5 = a(($$3 + 0.33333334F) % 1.0F).c((double)$$1);
      fba $$6 = a(($$3 + 0.6666667F) % 1.0F).c((double)$$2);
      fba $$7 = $$4.e($$5).e($$6);
      double $$8 = Math.max(Math.max(1.0, $$7.d), Math.max($$7.e, $$7.f));
      return new fba($$7.d / $$8, $$7.e / $$8, $$7.f / $$8);
   }

   public static void a(ffu $$0, ffy $$1, fbu $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9, boolean $$10) {
      List<fav> $$11 = $$2.e();
      if (!$$11.isEmpty()) {
         int $$12 = $$10 ? $$11.size() : $$11.size() * 8;
         gmr.a($$0, $$1, fbr.a($$11.get(0)), $$3, $$4, $$5, axk.a($$9, $$6, $$7, $$8));

         for (int $$13 = 1; $$13 < $$11.size(); $$13++) {
            fav $$14 = $$11.get($$13);
            float $$15 = (float)$$13 / (float)$$12;
            fba $$16 = a($$6, $$7, $$8, $$15);
            gmr.a($$0, $$1, fbr.a($$14), $$3, $$4, $$5, axk.a($$9, (float)$$16.d, (float)$$16.e, (float)$$16.f));
         }
      }
   }

   public interface a {
      void a(ffu var1, glx var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
