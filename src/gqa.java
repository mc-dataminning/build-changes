import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class gqa {
   public final gqj a = new gqj();
   public final gqa.a b;
   public final gqa.a c;
   public final gqa.a d;
   public final gqa.a e;
   public final gqa.a f;
   public final gqh g;
   public final gql h;
   public final gqn i;
   public final gqa.a j;
   public final gqa.a k;
   public final gqa.a l;
   public final gqa.a m;
   public final gpu n;
   public final gqp o;
   public final gpt p;
   public final gqk q;
   public final gqd r;
   public final gqc s;
   public final gqb t;
   public final gqg u;
   public final gpv v;
   public final gpx w;
   public final gqi x;
   private boolean y;
   private boolean z;

   public gqa(flk $$0) {
      this.b = new gqq($$0);
      this.c = new gpw($$0);
      this.d = new gqe($$0);
      this.e = new gpz($$0);
      this.f = new gqo($$0);
      this.g = new gqh($$0);
      this.h = new gql($$0);
      this.i = new gqn($$0);
      this.j = new gqf($$0);
      this.k = new gqr();
      this.l = new gqm($$0);
      this.m = new gpy($$0);
      this.n = new gpu($$0);
      this.o = new gqp();
      this.p = new gpt($$0);
      this.q = new gqk($$0);
      this.r = new gqd($$0);
      this.s = new gqc();
      this.t = new gqb($$0);
      this.u = new gqg($$0, dgs.a);
      this.v = new gpv($$0);
      this.w = new gpx($$0);
      this.x = new gqi($$0);
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

   public void a(ffv $$0, gpr $$1, glz.a $$2, double $$3, double $$4, double $$5) {
      if (this.y && !flk.Q().az()) {
         this.c.a($$0, $$2, $$3, $$4, $$5);
      }

      if (this.z) {
         this.x.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      this.s.a($$0, $$2, $$3, $$4, $$5);
   }

   public void a(ffv $$0, glz.a $$1, double $$2, double $$3, double $$4) {
      this.w.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bum> a(@Nullable bum $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         fbb $$2 = $$0.bF();
         fbb $$3 = $$0.g(1.0F).c((double)$$1);
         fbb $$4 = $$2.e($$3);
         faw $$5 = $$0.cR().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         fay $$7 = cpt.a($$0, $$2, $$4, $$5, bur.h, (double)$$6);
         if ($$7 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$7.g()) > (double)$$6 ? Optional.empty() : Optional.of($$7.a());
         }
      }
   }

   public static void a(ffv $$0, glz $$1, ji $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(ffv $$0, glz $$1, ji $$2, ji $$3, float $$4, float $$5, float $$6, float $$7) {
      fks $$8 = flk.Q().j.k();
      if ($$8.h()) {
         fbb $$9 = $$8.b().e();
         faw $$10 = faw.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(ffv $$0, glz $$1, ji $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      fks $$8 = flk.Q().j.k();
      if ($$8.h()) {
         fbb $$9 = $$8.b().e();
         faw $$10 = new faw($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(ffv $$0, glz $$1, faw $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(ffv $$0, glz $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      ffz $$12 = $$1.getBuffer(gmj.B());
      gmt.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(ffv $$0, glz $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(ffv $$0, glz $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(ffv $$0, glz $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(ffv $$0, glz $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      flk $$11 = flk.Q();
      fks $$12 = $$11.j.k();
      if ($$12.h() && $$11.aq().d != null) {
         fod $$13 = $$11.h;
         double $$14 = $$12.b().d;
         double $$15 = $$12.b().e;
         double $$16 = $$12.b().f;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a($$12.f());
         $$0.b($$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? fod.a.b : fod.a.a, 0, 15728880);
         $$0.b();
      }
   }

   private static fbb a(float $$0) {
      float $$1 = 5.99999F;
      int $$2 = (int)(ayz.a($$0, 0.0F, 1.0F) * 5.99999F);
      float $$3 = $$0 * 5.99999F - (float)$$2;

      return switch ($$2) {
         case 0 -> new fbb(1.0, (double)$$3, 0.0);
         case 1 -> new fbb((double)(1.0F - $$3), 1.0, 0.0);
         case 2 -> new fbb(0.0, 1.0, (double)$$3);
         case 3 -> new fbb(0.0, 1.0 - (double)$$3, 1.0);
         case 4 -> new fbb((double)$$3, 0.0, 1.0);
         case 5 -> new fbb(1.0, 0.0, 1.0 - (double)$$3);
         default -> throw new IllegalStateException("Unexpected value: " + $$2);
      };
   }

   private static fbb a(float $$0, float $$1, float $$2, float $$3) {
      fbb $$4 = a($$3).c((double)$$0);
      fbb $$5 = a(($$3 + 0.33333334F) % 1.0F).c((double)$$1);
      fbb $$6 = a(($$3 + 0.6666667F) % 1.0F).c((double)$$2);
      fbb $$7 = $$4.e($$5).e($$6);
      double $$8 = Math.max(Math.max(1.0, $$7.d), Math.max($$7.e, $$7.f));
      return new fbb($$7.d / $$8, $$7.e / $$8, $$7.f / $$8);
   }

   public static void a(ffv $$0, ffz $$1, fbv $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9, boolean $$10) {
      List<faw> $$11 = $$2.e();
      if (!$$11.isEmpty()) {
         int $$12 = $$10 ? $$11.size() : $$11.size() * 8;
         gmt.a($$0, $$1, fbs.a($$11.get(0)), $$3, $$4, $$5, axk.a($$9, $$6, $$7, $$8));

         for (int $$13 = 1; $$13 < $$11.size(); $$13++) {
            faw $$14 = $$11.get($$13);
            float $$15 = (float)$$13 / (float)$$12;
            fbb $$16 = a($$6, $$7, $$8, $$15);
            gmt.a($$0, $$1, fbs.a($$14), $$3, $$4, $$5, axk.a($$9, (float)$$16.d, (float)$$16.e, (float)$$16.f));
         }
      }
   }

   public interface a {
      void a(ffv var1, glz var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
