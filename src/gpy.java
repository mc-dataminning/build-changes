import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class gpy {
   public final gqh a = new gqh();
   public final gpy.a b;
   public final gpy.a c;
   public final gpy.a d;
   public final gpy.a e;
   public final gpy.a f;
   public final gqf g;
   public final gqj h;
   public final gql i;
   public final gpy.a j;
   public final gpy.a k;
   public final gpy.a l;
   public final gpy.a m;
   public final gps n;
   public final gqn o;
   public final gpr p;
   public final gqi q;
   public final gqb r;
   public final gqa s;
   public final gpz t;
   public final gqe u;
   public final gpt v;
   public final gpv w;
   public final gqg x;
   private boolean y;
   private boolean z;

   public gpy(fli $$0) {
      this.b = new gqo($$0);
      this.c = new gpu($$0);
      this.d = new gqc($$0);
      this.e = new gpx($$0);
      this.f = new gqm($$0);
      this.g = new gqf($$0);
      this.h = new gqj($$0);
      this.i = new gql($$0);
      this.j = new gqd($$0);
      this.k = new gqp();
      this.l = new gqk($$0);
      this.m = new gpw($$0);
      this.n = new gps($$0);
      this.o = new gqn();
      this.p = new gpr($$0);
      this.q = new gqi($$0);
      this.r = new gqb($$0);
      this.s = new gqa();
      this.t = new gpz($$0);
      this.u = new gqe($$0, dgq.a);
      this.v = new gpt($$0);
      this.w = new gpv($$0);
      this.x = new gqg($$0);
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

   public void a(fft $$0, gpp $$1, glx.a $$2, double $$3, double $$4, double $$5) {
      if (this.y && !fli.Q().az()) {
         this.c.a($$0, $$2, $$3, $$4, $$5);
      }

      if (this.z) {
         this.x.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      this.s.a($$0, $$2, $$3, $$4, $$5);
   }

   public void a(fft $$0, glx.a $$1, double $$2, double $$3, double $$4) {
      this.w.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<buk> a(@Nullable buk $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         faz $$2 = $$0.bF();
         faz $$3 = $$0.g(1.0F).c((double)$$1);
         faz $$4 = $$2.e($$3);
         fau $$5 = $$0.cR().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         faw $$7 = cpr.a($$0, $$2, $$4, $$5, bup.h, (double)$$6);
         if ($$7 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$7.g()) > (double)$$6 ? Optional.empty() : Optional.of($$7.a());
         }
      }
   }

   public static void a(fft $$0, glx $$1, ji $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(fft $$0, glx $$1, ji $$2, ji $$3, float $$4, float $$5, float $$6, float $$7) {
      fkq $$8 = fli.Q().j.k();
      if ($$8.h()) {
         faz $$9 = $$8.b().e();
         fau $$10 = fau.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(fft $$0, glx $$1, ji $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      fkq $$8 = fli.Q().j.k();
      if ($$8.h()) {
         faz $$9 = $$8.b().e();
         fau $$10 = new fau($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(fft $$0, glx $$1, fau $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(fft $$0, glx $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      ffx $$12 = $$1.getBuffer(gmh.B());
      gmr.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(fft $$0, glx $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(fft $$0, glx $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(fft $$0, glx $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(fft $$0, glx $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      fli $$11 = fli.Q();
      fkq $$12 = $$11.j.k();
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

   private static faz a(float $$0) {
      float $$1 = 5.99999F;
      int $$2 = (int)(ayz.a($$0, 0.0F, 1.0F) * 5.99999F);
      float $$3 = $$0 * 5.99999F - (float)$$2;

      return switch ($$2) {
         case 0 -> new faz(1.0, (double)$$3, 0.0);
         case 1 -> new faz((double)(1.0F - $$3), 1.0, 0.0);
         case 2 -> new faz(0.0, 1.0, (double)$$3);
         case 3 -> new faz(0.0, 1.0 - (double)$$3, 1.0);
         case 4 -> new faz((double)$$3, 0.0, 1.0);
         case 5 -> new faz(1.0, 0.0, 1.0 - (double)$$3);
         default -> throw new IllegalStateException("Unexpected value: " + $$2);
      };
   }

   private static faz a(float $$0, float $$1, float $$2, float $$3) {
      faz $$4 = a($$3).c((double)$$0);
      faz $$5 = a(($$3 + 0.33333334F) % 1.0F).c((double)$$1);
      faz $$6 = a(($$3 + 0.6666667F) % 1.0F).c((double)$$2);
      faz $$7 = $$4.e($$5).e($$6);
      double $$8 = Math.max(Math.max(1.0, $$7.d), Math.max($$7.e, $$7.f));
      return new faz($$7.d / $$8, $$7.e / $$8, $$7.f / $$8);
   }

   public static void a(fft $$0, ffx $$1, fbt $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9, boolean $$10) {
      List<fau> $$11 = $$2.e();
      if (!$$11.isEmpty()) {
         int $$12 = $$10 ? $$11.size() : $$11.size() * 8;
         gmr.a($$0, $$1, fbq.a($$11.get(0)), $$3, $$4, $$5, axk.a($$9, $$6, $$7, $$8));

         for (int $$13 = 1; $$13 < $$11.size(); $$13++) {
            fau $$14 = $$11.get($$13);
            float $$15 = (float)$$13 / (float)$$12;
            faz $$16 = a($$6, $$7, $$8, $$15);
            gmr.a($$0, $$1, fbq.a($$14), $$3, $$4, $$5, axk.a($$9, (float)$$16.d, (float)$$16.e, (float)$$16.f));
         }
      }
   }

   public interface a {
      void a(fft var1, glx var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
