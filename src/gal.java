import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gal {
   private static final ali a = ali.b("advancements/title_box");
   private static final int b = 26;
   private static final int c = 0;
   private static final int d = 200;
   private static final int e = 26;
   private static final int f = 8;
   private static final int g = 5;
   private static final int h = 26;
   private static final int i = 3;
   private static final int j = 5;
   private static final int k = 32;
   private static final int l = 9;
   private static final int m = 8;
   private static final int n = 163;
   private static final int o = 80;
   private static final int[] p = new int[]{0, 10, -10, 25, -25};
   private final gaj q;
   private final ak r;
   private final av s;
   private final List<aza> t;
   private final int u;
   private final List<aza> v;
   private final frd w;
   @Nullable
   private gal x;
   private final List<gal> y = Lists.newArrayList();
   @Nullable
   private al z;
   private final int A;
   private final int B;

   public gal(gaj $$0, frd $$1, ak $$2, av $$3) {
      this.q = $$0;
      this.r = $$2;
      this.s = $$3;
      this.w = $$1;
      this.t = $$1.h.c($$3.a(), 163);
      this.A = azo.d($$3.f() * 28.0F);
      this.B = azo.d($$3.g() * 27.0F);
      int $$4 = Math.max(this.t.stream().mapToInt($$1.h::a).max().orElse(0), 80);
      int $$5 = this.e();
      int $$6 = 29 + $$4 + $$5;
      this.v = tu.a().a(this.a(xd.a($$3.b().f(), xx.a.a($$3.e().a())), $$6));

      for (aza $$7 : this.v) {
         $$6 = Math.max($$6, $$1.h.a($$7));
      }

      this.u = $$6 + 3 + 5;
   }

   private int e() {
      int $$0 = this.r.a().f().a();
      if ($$0 <= 1) {
         return 0;
      } else {
         int $$1 = 8;
         xa $$2 = xa.a("advancements.progress", $$0, $$0);
         return this.w.h.a($$2) + 8;
      }
   }

   private static float a(frn $$0, List<xf> $$1) {
      return (float)$$1.stream().mapToDouble($$0::a).max().orElse(0.0);
   }

   private List<xf> a(xa $$0, int $$1) {
      frn $$2 = this.w.h.b();
      List<xf> $$3 = null;
      float $$4 = Float.MAX_VALUE;

      for (int $$5 : p) {
         List<xf> $$6 = $$2.b($$0, $$1 - $$5, xx.a);
         float $$7 = Math.abs(a($$2, $$6) - (float)$$1);
         if ($$7 <= 10.0F) {
            return $$6;
         }

         if ($$7 < $$4) {
            $$4 = $$7;
            $$3 = $$6;
         }
      }

      return $$3;
   }

   @Nullable
   private gal a(ak $$0) {
      do {
         $$0 = $$0.c();
      } while ($$0 != null && $$0.a().c().isEmpty());

      return $$0 != null && !$$0.a().c().isEmpty() ? this.q.a($$0.b()) : null;
   }

   public void a(ftx $$0, int $$1, int $$2, boolean $$3) {
      if (this.x != null) {
         int $$4 = $$1 + this.x.A + 13;
         int $$5 = $$1 + this.x.A + 26 + 4;
         int $$6 = $$2 + this.x.B + 13;
         int $$7 = $$1 + this.A + 13;
         int $$8 = $$2 + this.B + 13;
         int $$9 = $$3 ? -16777216 : -1;
         if ($$3) {
            $$0.a($$5, $$4, $$6 - 1, $$9);
            $$0.a($$5 + 1, $$4, $$6, $$9);
            $$0.a($$5, $$4, $$6 + 1, $$9);
            $$0.a($$7, $$5 - 1, $$8 - 1, $$9);
            $$0.a($$7, $$5 - 1, $$8, $$9);
            $$0.a($$7, $$5 - 1, $$8 + 1, $$9);
            $$0.b($$5 - 1, $$8, $$6, $$9);
            $$0.b($$5 + 1, $$8, $$6, $$9);
         } else {
            $$0.a($$5, $$4, $$6, $$9);
            $$0.a($$7, $$5, $$8, $$9);
            $$0.b($$5, $$8, $$6, $$9);
         }
      }

      for (gal $$10 : this.y) {
         $$10.a($$0, $$1, $$2, $$3);
      }
   }

   public void a(ftx $$0, int $$1, int $$2) {
      if (!this.s.j() || this.z != null && this.z.a()) {
         float $$3 = this.z == null ? 0.0F : this.z.c();
         gam $$4;
         if ($$3 >= 1.0F) {
            $$4 = gam.a;
         } else {
            $$4 = gam.b;
         }

         $$0.a(gsl::H, $$4.a(this.s.e()), $$1 + this.A + 3, $$2 + this.B, 26, 26);
         $$0.b(this.s.c(), $$1 + this.A + 8, $$2 + this.B + 5);
      }

      for (gal $$6 : this.y) {
         $$6.a($$0, $$1, $$2);
      }
   }

   public int a() {
      return this.u;
   }

   public void a(al $$0) {
      this.z = $$0;
   }

   public void a(gal $$0) {
      this.y.add($$0);
   }

   public void a(ftx $$0, int $$1, int $$2, float $$3, int $$4, int $$5) {
      ftv $$6 = this.w.h;
      int $$7 = 9 * this.t.size() + 9 + 8;
      int $$8 = $$2 + this.B + (26 - $$7) / 2;
      int $$9 = $$8 + $$7;
      int $$10 = this.v.size() * 9;
      int $$11 = 6 + $$10;
      boolean $$12 = $$4 + $$1 + this.A + this.u + 26 >= this.q.f().n;
      xa $$13 = this.z == null ? null : this.z.d();
      int $$14 = $$13 == null ? 0 : $$6.a($$13);
      boolean $$15 = $$9 + $$11 >= 113;
      float $$16 = this.z == null ? 0.0F : this.z.c();
      int $$17 = azo.d($$16 * (float)this.u);
      gam $$18;
      gam $$19;
      gam $$20;
      if ($$16 >= 1.0F) {
         $$17 = this.u / 2;
         $$18 = gam.a;
         $$19 = gam.a;
         $$20 = gam.a;
      } else if ($$17 < 2) {
         $$17 = this.u / 2;
         $$18 = gam.b;
         $$19 = gam.b;
         $$20 = gam.b;
      } else if ($$17 > this.u - 2) {
         $$17 = this.u / 2;
         $$18 = gam.a;
         $$19 = gam.a;
         $$20 = gam.b;
      } else {
         $$18 = gam.a;
         $$19 = gam.b;
         $$20 = gam.b;
      }

      int $$30 = this.u - $$17;
      int $$31;
      if ($$12) {
         $$31 = $$1 + this.A - this.u + 26 + 6;
      } else {
         $$31 = $$1 + this.A;
      }

      int $$33 = $$7 + $$11;
      if (!this.v.isEmpty()) {
         if ($$15) {
            $$0.a(gsl::H, a, $$31, $$9 - $$33, this.u, $$33);
         } else {
            $$0.a(gsl::H, a, $$31, $$8, this.u, $$33);
         }
      }

      if ($$18 != $$19) {
         $$0.a(gsl::H, $$18.a(), 200, $$7, 0, 0, $$31, $$8, $$17, $$7);
         $$0.a(gsl::H, $$19.a(), 200, $$7, 200 - $$30, 0, $$31 + $$17, $$8, $$30, $$7);
      } else {
         $$0.a(gsl::H, $$18.a(), $$31, $$8, this.u, $$7);
      }

      $$0.a(gsl::H, $$20.a(this.s.e()), $$1 + this.A + 3, $$2 + this.B, 26, 26);
      int $$34 = $$31 + 5;
      if ($$12) {
         this.a($$0, this.t, $$34, $$8 + 9, -1);
         if ($$13 != null) {
            $$0.b($$6, $$13, $$1 + this.A - $$14, $$8 + 9, -1);
         }
      } else {
         this.a($$0, this.t, $$1 + this.A + 32, $$8 + 9, -1);
         if ($$13 != null) {
            $$0.b($$6, $$13, $$1 + this.A + this.u - $$14 - 5, $$8 + 9, -1);
         }
      }

      if ($$15) {
         this.a($$0, this.v, $$34, $$8 - $$10 + 1, -16711936);
      } else {
         this.a($$0, this.v, $$34, $$9, -16711936);
      }

      $$0.b(this.s.c(), $$1 + this.A + 8, $$2 + this.B + 5);
   }

   private void a(ftx $$0, List<aza> $$1, int $$2, int $$3, int $$4) {
      ftv $$5 = this.w.h;

      for (int $$6 = 0; $$6 < $$1.size(); $$6++) {
         $$0.b($$5, $$1.get($$6), $$2, $$3 + $$6 * 9, $$4);
      }
   }

   public boolean a(int $$0, int $$1, int $$2, int $$3) {
      if (!this.s.j() || this.z != null && this.z.a()) {
         int $$4 = $$0 + this.A;
         int $$5 = $$4 + 26;
         int $$6 = $$1 + this.B;
         int $$7 = $$6 + 26;
         return $$2 >= $$4 && $$2 <= $$5 && $$3 >= $$6 && $$3 <= $$7;
      } else {
         return false;
      }
   }

   public void b() {
      if (this.x == null && this.r.c() != null) {
         this.x = this.a(this.r);
         if (this.x != null) {
            this.x.a(this);
         }
      }
   }

   public int c() {
      return this.B;
   }

   public int d() {
      return this.A;
   }
}
