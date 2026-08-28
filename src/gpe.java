import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class gpe {
   public final gpn a = new gpn();
   public final gpe.a b;
   public final gpe.a c;
   public final gpe.a d;
   public final gpe.a e;
   public final gpe.a f;
   public final gpl g;
   public final gpp h;
   public final gpr i;
   public final gpe.a j;
   public final gpe.a k;
   public final gpe.a l;
   public final gpe.a m;
   public final goy n;
   public final gpt o;
   public final gox p;
   public final gpo q;
   public final gph r;
   public final gpg s;
   public final gpf t;
   public final gpk u;
   public final goz v;
   public final gpb w;
   public final gpm x;
   private boolean y;
   private boolean z;

   public gpe(flz $$0) {
      this.b = new gpu($$0);
      this.c = new gpa($$0);
      this.d = new gpi($$0);
      this.e = new gpd($$0);
      this.f = new gps($$0);
      this.g = new gpl($$0);
      this.h = new gpp($$0);
      this.i = new gpr($$0);
      this.j = new gpj($$0);
      this.k = new gpv();
      this.l = new gpq($$0);
      this.m = new gpc($$0);
      this.n = new goy($$0);
      this.o = new gpt();
      this.p = new gox($$0);
      this.q = new gpo($$0);
      this.r = new gph($$0);
      this.s = new gpg();
      this.t = new gpf($$0);
      this.u = new gpk($$0, dhj.a);
      this.v = new goz($$0);
      this.w = new gpb($$0);
      this.x = new gpm($$0);
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

   public void a(fgl $$0, gov $$1, gle.a $$2, double $$3, double $$4, double $$5) {
      if (this.y && !flz.Q().az()) {
         this.c.a($$0, $$2, $$3, $$4, $$5);
      }

      if (this.z) {
         this.x.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      this.s.a($$0, $$2, $$3, $$4, $$5);
   }

   public void a(fgl $$0, gle.a $$1, double $$2, double $$3, double $$4) {
      this.w.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bvf> a(@Nullable bvf $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         fbs $$2 = $$0.bF();
         fbs $$3 = $$0.g(1.0F).c((double)$$1);
         fbs $$4 = $$2.e($$3);
         fbn $$5 = $$0.cR().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         fbp $$7 = cqn.a($$0, $$2, $$4, $$5, bvk.h, (double)$$6);
         if ($$7 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$7.g()) > (double)$$6 ? Optional.empty() : Optional.of($$7.a());
         }
      }
   }

   public static void a(fgl $$0, gle $$1, jh $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(fgl $$0, gle $$1, jh $$2, jh $$3, float $$4, float $$5, float $$6, float $$7) {
      fli $$8 = flz.Q().j.k();
      if ($$8.h()) {
         fbs $$9 = $$8.b().e();
         fbn $$10 = fbn.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(fgl $$0, gle $$1, jh $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      fli $$8 = flz.Q().j.k();
      if ($$8.h()) {
         fbs $$9 = $$8.b().e();
         fbn $$10 = new fbn($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(fgl $$0, gle $$1, fbn $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(fgl $$0, gle $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      fgp $$12 = $$1.getBuffer(glo.B());
      gly.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(fgl $$0, gle $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(fgl $$0, gle $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(fgl $$0, gle $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(fgl $$0, gle $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      flz $$11 = flz.Q();
      fli $$12 = $$11.j.k();
      if ($$12.h() && $$11.aq().d != null) {
         fnj $$13 = $$11.h;
         double $$14 = $$12.b().d;
         double $$15 = $$12.b().e;
         double $$16 = $$12.b().f;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a($$12.f());
         $$0.b($$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? fnj.a.b : fnj.a.a, 0, 15728880);
         $$0.b();
      }
   }

   private static fbs a(float $$0) {
      float $$1 = 5.99999F;
      int $$2 = (int)(bae.a($$0, 0.0F, 1.0F) * 5.99999F);
      float $$3 = $$0 * 5.99999F - (float)$$2;

      return switch ($$2) {
         case 0 -> new fbs(1.0, (double)$$3, 0.0);
         case 1 -> new fbs((double)(1.0F - $$3), 1.0, 0.0);
         case 2 -> new fbs(0.0, 1.0, (double)$$3);
         case 3 -> new fbs(0.0, 1.0 - (double)$$3, 1.0);
         case 4 -> new fbs((double)$$3, 0.0, 1.0);
         case 5 -> new fbs(1.0, 0.0, 1.0 - (double)$$3);
         default -> throw new IllegalStateException("Unexpected value: " + $$2);
      };
   }

   private static fbs a(float $$0, float $$1, float $$2, float $$3) {
      fbs $$4 = a($$3).c((double)$$0);
      fbs $$5 = a(($$3 + 0.33333334F) % 1.0F).c((double)$$1);
      fbs $$6 = a(($$3 + 0.6666667F) % 1.0F).c((double)$$2);
      fbs $$7 = $$4.e($$5).e($$6);
      double $$8 = Math.max(Math.max(1.0, $$7.d), Math.max($$7.e, $$7.f));
      return new fbs($$7.d / $$8, $$7.e / $$8, $$7.f / $$8);
   }

   public static void a(fgl $$0, fgp $$1, fcm $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9, boolean $$10) {
      List<fbn> $$11 = $$2.e();
      if (!$$11.isEmpty()) {
         int $$12 = $$10 ? $$11.size() : $$11.size() * 8;
         gly.a($$0, $$1, fcj.a($$11.get(0)), $$3, $$4, $$5, ayp.a($$9, $$6, $$7, $$8));

         for (int $$13 = 1; $$13 < $$11.size(); $$13++) {
            fbn $$14 = $$11.get($$13);
            float $$15 = (float)$$13 / (float)$$12;
            fbs $$16 = a($$6, $$7, $$8, $$15);
            gly.a($$0, $$1, fcj.a($$14), $$3, $$4, $$5, ayp.a($$9, (float)$$16.d, (float)$$16.e, (float)$$16.f));
         }
      }
   }

   public interface a {
      void a(fgl var1, gle var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
