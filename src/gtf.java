import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class gtf {
   public final gto a = new gto();
   public final gtf.a b;
   public final gtf.a c;
   public final gtf.a d;
   public final gtf.a e;
   public final gtf.a f;
   public final gtm g;
   public final gtq h;
   public final gts i;
   public final gtf.a j;
   public final gtf.a k;
   public final gtf.a l;
   public final gtf.a m;
   public final gsz n;
   public final gtu o;
   public final gsy p;
   public final gtp q;
   public final gti r;
   public final gth s;
   public final gtg t;
   public final gtl u;
   public final gta v;
   public final gtc w;
   public final gtn x;
   private boolean y;
   private boolean z;

   public gtf(fof $$0) {
      this.b = new gtv($$0);
      this.c = new gtb($$0);
      this.d = new gtj($$0);
      this.e = new gte($$0);
      this.f = new gtt($$0);
      this.g = new gtm($$0);
      this.h = new gtq($$0);
      this.i = new gts($$0);
      this.j = new gtk($$0);
      this.k = new gtw();
      this.l = new gtr($$0);
      this.m = new gtd($$0);
      this.n = new gsz($$0);
      this.o = new gtu();
      this.p = new gsy($$0);
      this.q = new gtp($$0);
      this.r = new gti($$0);
      this.s = new gth();
      this.t = new gtg($$0);
      this.u = new gtl($$0, diy.a);
      this.v = new gta($$0);
      this.w = new gtc($$0);
      this.x = new gtn($$0);
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

   public void a(fiq $$0, gsw $$1, gpd.a $$2, double $$3, double $$4, double $$5) {
      if (this.y && !fof.Q().az()) {
         this.c.a($$0, $$2, $$3, $$4, $$5);
      }

      if (this.z) {
         this.x.a($$0, $$1, $$2, $$3, $$4, $$5);
      }

      this.s.a($$0, $$2, $$3, $$4, $$5);
   }

   public void a(fiq $$0, gpd.a $$1, double $$2, double $$3, double $$4) {
      this.w.a($$0, $$1, $$2, $$3, $$4);
   }

   public static Optional<bwa> a(@Nullable bwa $$0, int $$1) {
      if ($$0 == null) {
         return Optional.empty();
      } else {
         fdw $$2 = $$0.bE();
         fdw $$3 = $$0.h(1.0F).c((double)$$1);
         fdw $$4 = $$2.e($$3);
         fdr $$5 = $$0.cR().b($$3).g(1.0);
         int $$6 = $$1 * $$1;
         fdt $$7 = cro.a($$0, $$2, $$4, $$5, bwh.h, (double)$$6);
         if ($$7 == null) {
            return Optional.empty();
         } else {
            return $$2.g($$7.g()) > (double)$$6 ? Optional.empty() : Optional.of($$7.a());
         }
      }
   }

   public static void a(fiq $$0, gpd $$1, iu $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2, $$2.b(1, 1, 1), $$3, $$4, $$5, $$6);
   }

   public static void a(fiq $$0, gpd $$1, iu $$2, iu $$3, float $$4, float $$5, float $$6, float $$7) {
      fnn $$8 = fof.Q().j.k();
      if ($$8.h()) {
         fdw $$9 = $$8.b().e();
         fdr $$10 = fdr.a($$2, $$3).c($$9);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(fiq $$0, gpd $$1, iu $$2, float $$3, float $$4, float $$5, float $$6, float $$7) {
      fnn $$8 = fof.Q().j.k();
      if ($$8.h()) {
         fdw $$9 = $$8.b().e();
         fdr $$10 = new fdr($$2).c($$9).g((double)$$3);
         a($$0, $$1, $$10, $$4, $$5, $$6, $$7);
      }
   }

   public static void a(fiq $$0, gpd $$1, fdr $$2, float $$3, float $$4, float $$5, float $$6) {
      a($$0, $$1, $$2.a, $$2.b, $$2.c, $$2.d, $$2.e, $$2.f, $$3, $$4, $$5, $$6);
   }

   public static void a(fiq $$0, gpd $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7, float $$8, float $$9, float $$10, float $$11) {
      fiu $$12 = $$1.getBuffer(gpn.B());
      gpx.b($$0, $$12, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9, $$10, $$11);
   }

   public static void a(fiq $$0, gpd $$1, String $$2, int $$3, int $$4, int $$5, int $$6) {
      a($$0, $$1, $$2, (double)$$3 + 0.5, (double)$$4 + 0.5, (double)$$5 + 0.5, $$6);
   }

   public static void a(fiq $$0, gpd $$1, String $$2, double $$3, double $$4, double $$5, int $$6) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, 0.02F);
   }

   public static void a(fiq $$0, gpd $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7) {
      a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, true, 0.0F, false);
   }

   public static void a(fiq $$0, gpd $$1, String $$2, double $$3, double $$4, double $$5, int $$6, float $$7, boolean $$8, float $$9, boolean $$10) {
      fof $$11 = fof.Q();
      fnn $$12 = $$11.j.k();
      if ($$12.h() && $$11.aq().d != null) {
         fra $$13 = $$11.h;
         double $$14 = $$12.b().d;
         double $$15 = $$12.b().e;
         double $$16 = $$12.b().f;
         $$0.a();
         $$0.a((float)($$3 - $$14), (float)($$4 - $$15) + 0.07F, (float)($$5 - $$16));
         $$0.a($$12.f());
         $$0.b($$7, -$$7, $$7);
         float $$17 = $$8 ? (float)(-$$13.b($$2)) / 2.0F : 0.0F;
         $$17 -= $$9 / $$7;
         $$13.a($$2, $$17, 0.0F, $$6, false, $$0.c().a(), $$1, $$10 ? fra.a.b : fra.a.a, 0, 15728880);
         $$0.b();
      }
   }

   private static fdw a(float $$0) {
      float $$1 = 5.99999F;
      int $$2 = (int)(azk.a($$0, 0.0F, 1.0F) * 5.99999F);
      float $$3 = $$0 * 5.99999F - (float)$$2;

      return switch ($$2) {
         case 0 -> new fdw(1.0, (double)$$3, 0.0);
         case 1 -> new fdw((double)(1.0F - $$3), 1.0, 0.0);
         case 2 -> new fdw(0.0, 1.0, (double)$$3);
         case 3 -> new fdw(0.0, 1.0 - (double)$$3, 1.0);
         case 4 -> new fdw((double)$$3, 0.0, 1.0);
         case 5 -> new fdw(1.0, 0.0, 1.0 - (double)$$3);
         default -> throw new IllegalStateException("Unexpected value: " + $$2);
      };
   }

   private static fdw a(float $$0, float $$1, float $$2, float $$3) {
      fdw $$4 = a($$3).c((double)$$0);
      fdw $$5 = a(($$3 + 0.33333334F) % 1.0F).c((double)$$1);
      fdw $$6 = a(($$3 + 0.6666667F) % 1.0F).c((double)$$2);
      fdw $$7 = $$4.e($$5).e($$6);
      double $$8 = Math.max(Math.max(1.0, $$7.d), Math.max($$7.e, $$7.f));
      return new fdw($$7.d / $$8, $$7.e / $$8, $$7.f / $$8);
   }

   public static void a(fiq $$0, fiu $$1, feq $$2, double $$3, double $$4, double $$5, float $$6, float $$7, float $$8, float $$9, boolean $$10) {
      List<fdr> $$11 = $$2.e();
      if (!$$11.isEmpty()) {
         int $$12 = $$10 ? $$11.size() : $$11.size() * 8;
         gpx.a($$0, $$1, fen.a($$11.get(0)), $$3, $$4, $$5, axu.a($$9, $$6, $$7, $$8));

         for (int $$13 = 1; $$13 < $$11.size(); $$13++) {
            fdr $$14 = $$11.get($$13);
            float $$15 = (float)$$13 / (float)$$12;
            fdw $$16 = a($$6, $$7, $$8, $$15);
            gpx.a($$0, $$1, fen.a($$14), $$3, $$4, $$5, axu.a($$9, (float)$$16.d, (float)$$16.e, (float)$$16.f));
         }
      }
   }

   public interface a {
      void a(fiq var1, gpd var2, double var3, double var5, double var7);

      default void a() {
      }
   }
}
