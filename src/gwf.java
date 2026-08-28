import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class gwf {
   public final gwo a = new gwo();
   public final gwf.a b;
   public final gwf.a c;
   public final gwf.a d;
   public final gwf.a e;
   public final gwf.a f;
   public final gwm g;
   public final gwq h;
   public final gws i;
   public final gwf.a j;
   public final gwf.a k;
   public final gwf.a l;
   public final gwf.a m;
   public final gvz n;
   public final gwu o;
   public final gvy p;
   public final gwp q;
   public final gwi r;
   public final gwh s;
   public final gwg t;
   public final gwl u;
   public final gwa v;
   public final gwc w;
   public final gwn x;
   private boolean y;
   private boolean z;

   public gwf(frf $$0) {
      this.b = new gwv($$0);
      this.c = new gwb($$0);
      this.d = new gwj($$0);
      this.e = new gwe($$0);
      this.f = new gwt($$0);
      this.g = new gwm($$0);
      this.h = new gwq($$0);
      this.i = new gws($$0);
      this.j = new gwk($$0);
      this.k = new gww();
      this.l = new gwr($$0);
      this.m = new gwd($$0);
      this.n = new gvz($$0);
      this.o = new gwu();
      this.p = new gvy($$0);
      this.q = new gwp($$0);
      this.r = new gwi($$0);
      this.s = new gwh();
      this.t = new gwg($$0);
      this.u = new gwl($$0, dki.a);
      this.v = new gwa($$0);
      this.w = new gwc($$0);
      this.x = new gwn($$0);
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

   public void a(flq $$0, gvw $$1, gsc.a $$2, double $$3, double $$4, double $$5) {
      if (this.y && !frf.Q().az()) {
         this.c.a($$0, $$2, $$3, $$4, $$5);
      }

      if (this.z) {
         this.x.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      this.s.a($$0, $$2, $$3, $$4, $$5);
   }

   public void a(flq $$0, gsc.a $$1, double $$2, double $$3, double $$4) {
      this.w.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bwv> a(@Nullable bwv $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         ffs $$2 = $$0.bD();
         ffs $$3 = $$0.h(1.0F).c((double)$$1);
         ffs $$4 = $$2.e($$3);
         ffn $$5 = $$0.cR().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         ffp $$7 = csw.a($$0, $$2, $$4, $$5, bxc.h, (double)$$6);
         if ($$7 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$7.g()) > (double)$$6 ? Optional.empty() : Optional.of($$7.a());
         }
      }
   }

   public static void a(flq $$0, gsc $$1, iw $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(flq $$0, gsc $$1, iw $$2, iw $$3, float $$4, float $$5, float $$6, float $$7) {
      fqn $$8 = frf.Q().j.k();
      if ($$8.h()) {
         ffs $$9 = $$8.b().e();
         ffn $$10 = ffn.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(flq $$0, gsc $$1, iw $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      fqn $$8 = frf.Q().j.k();
      if ($$8.h()) {
         ffs $$9 = $$8.b().e();
         ffn $$10 = new ffn($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(flq $$0, gsc $$1, ffn $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(flq $$0, gsc $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      flt $$12 = $$1.getBuffer(gsn.z());
      gsv.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(flq $$0, gsc $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(flq $$0, gsc $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(flq $$0, gsc $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(flq $$0, gsc $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      frf $$11 = frf.Q();
      fqn $$12 = $$11.j.k();
      if ($$12.h() && $$11.aq().d != null) {
         ftx $$13 = $$11.h;
         double $$14 = $$12.b().d;
         double $$15 = $$12.b().e;
         double $$16 = $$12.b().f;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a($$12.f());
         $$0.b($$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? ftx.a.b : ftx.a.a, 0, 15728880);
         $$0.b();
      }
   }

   private static ffs a(float $$0) {
      float $$1 = 5.99999F;
      int $$2 = (int)(azq.a($$0, 0.0F, 1.0F) * 5.99999F);
      float $$3 = $$0 * 5.99999F - (float)$$2;

      return switch ($$2) {
         case 0 -> new ffs(1.0, (double)$$3, 0.0);
         case 1 -> new ffs((double)(1.0F - $$3), 1.0, 0.0);
         case 2 -> new ffs(0.0, 1.0, (double)$$3);
         case 3 -> new ffs(0.0, 1.0 - (double)$$3, 1.0);
         case 4 -> new ffs((double)$$3, 0.0, 1.0);
         case 5 -> new ffs(1.0, 0.0, 1.0 - (double)$$3);
         default -> throw new IllegalStateException("Unexpected value: " + $$2);
      };
   }

   private static ffs a(float $$0, float $$1, float $$2, float $$3) {
      ffs $$4 = a($$3).c((double)$$0);
      ffs $$5 = a(($$3 + 0.33333334F) % 1.0F).c((double)$$1);
      ffs $$6 = a(($$3 + 0.6666667F) % 1.0F).c((double)$$2);
      ffs $$7 = $$4.e($$5).e($$6);
      double $$8 = Math.max(Math.max(1.0, $$7.d), Math.max($$7.e, $$7.f));
      return new ffs($$7.d / $$8, $$7.e / $$8, $$7.f / $$8);
   }

   public static void a(flq $$0, flt $$1, fgm $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9, boolean $$10) {
      List<ffn> $$11 = $$2.e();
      if (!$$11.isEmpty()) {
         int $$12 = $$10 ? $$11.size() : $$11.size() * 8;
         gsv.a($$0, $$1, fgj.a($$11.get(0)), $$3, $$4, $$5, aya.a($$9, $$6, $$7, $$8));

         for (int $$13 = 1; $$13 < $$11.size(); $$13++) {
            ffn $$14 = $$11.get($$13);
            float $$15 = (float)$$13 / (float)$$12;
            ffs $$16 = a($$6, $$7, $$8, $$15);
            gsv.a($$0, $$1, fgj.a($$14), $$3, $$4, $$5, aya.a($$9, (float)$$16.d, (float)$$16.e, (float)$$16.f));
         }
      }
   }

   public interface a {
      void a(flq var1, gsc var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
