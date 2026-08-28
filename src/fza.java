import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class fza {
   private static final alg a = alg.b("advancements/title_box");
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
   private final fyy q;
   private final ak r;
   private final av s;
   private final List<ayy> t;
   private final int u;
   private final List<ayy> v;
   private final fpt w;
   @Nullable
   private fza x;
   private final List<fza> y = Lists.newArrayList();
   @Nullable
   private al z;
   private final int A;
   private final int B;

   public fza(fyy $$0, fpt $$1, ak $$2, av $$3) {
      this.q = $$0;
      this.r = $$2;
      this.s = $$3;
      this.w = $$1;
      this.t = $$1.h.c($$3.a(), 163);
      this.A = azm.d($$3.f() * 28.0F);
      this.B = azm.d($$3.g() * 27.0F);
      int $$4 = Math.max(this.t.stream().mapToInt($$1.h::a).max().orElse(0), 80);
      int $$5 = this.e();
      int $$6 = 29 + $$4 + $$5;
      this.v = tu.a().a(this.a(xb.a($$3.b().f(), xv.a.a($$3.e().a())), $$6));

      for (ayy $$7 : this.v) {
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
         wy $$2 = wy.a("advancements.progress", $$0, $$0);
         return this.w.h.a($$2) + 8;
      }
   }

   private static float a(fqd $$0, List<xd> $$1) {
      return (float)$$1.stream().mapToDouble($$0::a).max().orElse(0.0);
   }

   private List<xd> a(wy $$0, int $$1) {
      fqd $$2 = this.w.h.b();
      List<xd> $$3 = null;
      float $$4 = Float.MAX_VALUE;

      for (int $$5 : p) {
         List<xd> $$6 = $$2.b($$0, $$1 - $$5, xv.a);
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
   private fza a(ak $$0) {
      do {
         $$0 = $$0.c();
      } while ($$0 != null && $$0.a().c().isEmpty());

      return $$0 != null && !$$0.a().c().isEmpty() ? this.q.a($$0.b()) : null;
   }

   public void a(fsm $$0, int $$1, int $$2, boolean $$3) {
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

      for (fza $$10 : this.y) {
         $$10.a($$0, $$1, $$2, $$3);
      }
   }

   public void a(fsm $$0, int $$1, int $$2) {
      if (!this.s.j() || this.z != null && this.z.a()) {
         float $$3 = this.z == null ? 0.0F : this.z.c();
         fzb $$4;
         if ($$3 >= 1.0F) {
            $$4 = fzb.a;
         } else {
            $$4 = fzb.b;
         }

         $$0.a(grc::H, $$4.a(this.s.e()), $$1 + this.A + 3, $$2 + this.B, 26, 26);
         $$0.b(this.s.c(), $$1 + this.A + 8, $$2 + this.B + 5);
      }

      for (fza $$6 : this.y) {
         $$6.a($$0, $$1, $$2);
      }
   }

   public int a() {
      return this.u;
   }

   public void a(al $$0) {
      this.z = $$0;
   }

   public void a(fza $$0) {
      this.y.add($$0);
   }

   public void a(fsm $$0, int $$1, int $$2, float $$3, int $$4, int $$5) {
      fsk $$6 = this.w.h;
      int $$7 = 9 * this.t.size() + 9 + 8;
      int $$8 = $$2 + this.B + (26 - $$7) / 2;
      int $$9 = $$8 + $$7;
      int $$10 = this.v.size() * 9;
      int $$11 = 6 + $$10;
      boolean $$12 = $$4 + $$1 + this.A + this.u + 26 >= this.q.f().n;
      wy $$13 = this.z == null ? null : this.z.d();
      int $$14 = $$13 == null ? 0 : $$6.a($$13);
      boolean $$15 = $$9 + $$11 >= 113;
      float $$16 = this.z == null ? 0.0F : this.z.c();
      int $$17 = azm.d($$16 * (float)this.u);
      fzb $$18;
      fzb $$19;
      fzb $$20;
      if ($$16 >= 1.0F) {
         $$17 = this.u / 2;
         $$18 = fzb.a;
         $$19 = fzb.a;
         $$20 = fzb.a;
      } else if ($$17 < 2) {
         $$17 = this.u / 2;
         $$18 = fzb.b;
         $$19 = fzb.b;
         $$20 = fzb.b;
      } else if ($$17 > this.u - 2) {
         $$17 = this.u / 2;
         $$18 = fzb.a;
         $$19 = fzb.a;
         $$20 = fzb.b;
      } else {
         $$18 = fzb.a;
         $$19 = fzb.b;
         $$20 = fzb.b;
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
            $$0.a(grc::H, a, $$31, $$9 - $$33, this.u, $$33);
         } else {
            $$0.a(grc::H, a, $$31, $$8, this.u, $$33);
         }
      }

      if ($$18 != $$19) {
         $$0.a(grc::H, $$18.a(), 200, $$7, 0, 0, $$31, $$8, $$17, $$7);
         $$0.a(grc::H, $$19.a(), 200, $$7, 200 - $$30, 0, $$31 + $$17, $$8, $$30, $$7);
      } else {
         $$0.a(grc::H, $$18.a(), $$31, $$8, this.u, $$7);
      }

      $$0.a(grc::H, $$20.a(this.s.e()), $$1 + this.A + 3, $$2 + this.B, 26, 26);
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

   private void a(fsm $$0, List<ayy> $$1, int $$2, int $$3, int $$4) {
      fsk $$5 = this.w.h;

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
