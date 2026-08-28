import javax.annotation.Nullable;

public class gsd {
   private final gsd.b a;
   final iw b;

   public gsd(jz $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$1 * 2 + 1;
      int $$5 = azq.c($$4);
      int $$6 = $$1 * 16;
      iw $$7 = $$0.j();
      this.b = $$0.k();
      int $$8 = $$7.u() - $$6;
      int $$9 = $$8 + $$5 * 16 - 1;
      int $$10 = $$5 >= $$2 ? $$3 : $$7.v() - $$6;
      int $$11 = $$10 + $$5 * 16 - 1;
      int $$12 = $$7.w() - $$6;
      int $$13 = $$12 + $$5 * 16 - 1;
      this.a = new gsd.b(new erv($$8, $$10, $$12, $$9, $$11, $$13));
   }

   public boolean a(gvs.b $$0) {
      return this.a.a($$0);
   }

   public void a(gsd.e $$0, gvw $$1, int $$2) {
      this.a.a($$0, false, $$1, 0, $$2, true);
   }

   boolean a(double $$0, double $$1, double $$2, double $$3, double $$4, double $$5, int $$6) {
      int $$7 = this.b.u();
      int $$8 = this.b.v();
      int $$9 = this.b.w();
      return (double)$$7 > $$0 - (double)$$6
         && (double)$$7 < $$3 + (double)$$6
         && (double)$$8 > $$1 - (double)$$6
         && (double)$$8 < $$4 + (double)$$6
         && (double)$$9 > $$2 - (double)$$6
         && (double)$$9 < $$5 + (double)$$6;
   }

   static enum a {
      a(4, 2, 1),
      b(4, 1, 2),
      c(2, 4, 1),
      d(1, 4, 2),
      e(2, 1, 4),
      f(1, 2, 4);

      final int g;
      final int h;
      final int i;

      private a(final int $$0, final int $$1, final int $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      public static gsd.a a(int $$0, int $$1, int $$2) {
         if ($$0 > $$1 && $$0 > $$2) {
            return $$1 > $$2 ? a : b;
         } else if ($$1 > $$0 && $$1 > $$2) {
            return $$0 > $$2 ? c : d;
         } else {
            return $$0 > $$1 ? e : f;
         }
      }
   }

   class b implements gsd.d {
      private final gsd.d[] b = new gsd.d[8];
      private final erv c;
      private final int d;
      private final int e;
      private final int f;
      private final gsd.a g;
      private final boolean h;
      private final boolean i;
      private final boolean j;

      public b(final erv $$0) {
         this.c = $$0;
         this.d = this.c.h() + this.c.d() / 2;
         this.e = this.c.i() + this.c.e() / 2;
         this.f = this.c.j() + this.c.f() / 2;
         int $$1 = gsd.this.b.u() - this.d;
         int $$2 = gsd.this.b.v() - this.e;
         int $$3 = gsd.this.b.w() - this.f;
         this.g = gsd.a.a(Math.abs($$1), Math.abs($$2), Math.abs($$3));
         this.h = $$1 < 0;
         this.i = $$2 < 0;
         this.j = $$3 < 0;
      }

      public boolean a(gvs.b $$0) {
         long $$1 = $$0.g();
         boolean $$2 = jz.c(jz.b($$1)) - this.d < 0;
         boolean $$3 = jz.c(jz.c($$1)) - this.e < 0;
         boolean $$4 = jz.c(jz.d($$1)) - this.f < 0;
         boolean $$5 = $$2 != this.h;
         boolean $$6 = $$3 != this.i;
         boolean $$7 = $$4 != this.j;
         int $$8 = a(this.g, $$5, $$6, $$7);
         if (this.c()) {
            boolean $$9 = this.b[$$8] != null;
            this.b[$$8] = gsd.this.new c($$0);
            return !$$9;
         } else if (this.b[$$8] != null) {
            gsd.b $$10 = (gsd.b)this.b[$$8];
            return $$10.a($$0);
         } else {
            erv $$11 = this.a($$2, $$3, $$4);
            gsd.b $$12 = gsd.this.new b($$11);
            this.b[$$8] = $$12;
            return $$12.a($$0);
         }
      }

      private static int a(gsd.a $$0, boolean $$1, boolean $$2, boolean $$3) {
         int $$4 = 0;
         if ($$1) {
            $$4 += $$0.g;
         }

         if ($$2) {
            $$4 += $$0.h;
         }

         if ($$3) {
            $$4 += $$0.i;
         }

         return $$4;
      }

      private boolean c() {
         return this.c.d() == 32;
      }

      private erv a(boolean $$0, boolean $$1, boolean $$2) {
         int $$3;
         int $$4;
         if ($$0) {
            $$3 = this.c.h();
            $$4 = this.d - 1;
         } else {
            $$3 = this.d;
            $$4 = this.c.k();
         }

         int $$7;
         int $$8;
         if ($$1) {
            $$7 = this.c.i();
            $$8 = this.e - 1;
         } else {
            $$7 = this.e;
            $$8 = this.c.l();
         }

         int $$11;
         int $$12;
         if ($$2) {
            $$11 = this.c.j();
            $$12 = this.f - 1;
         } else {
            $$11 = this.f;
            $$12 = this.c.m();
         }

         return new erv($$3, $$7, $$11, $$4, $$8, $$12);
      }

      @Override
      public void a(gsd.e $$0, boolean $$1, gvw $$2, int $$3, int $$4, boolean $$5) {
         boolean $$6 = $$1;
         if (!$$1) {
            int $$7 = $$2.a(this.c);
            $$1 = $$7 == -2;
            $$6 = $$7 == -2 || $$7 == -1;
         }

         if ($$6) {
            $$5 = $$5
               && gsd.this.a((double)this.c.h(), (double)this.c.i(), (double)this.c.j(), (double)this.c.k(), (double)this.c.l(), (double)this.c.m(), $$4);
            $$0.visit(this, $$1, $$3, $$5);

            for (gsd.d $$8 : this.b) {
               if ($$8 != null) {
                  $$8.a($$0, $$1, $$2, $$3 + 1, $$4, $$5);
               }
            }
         }
      }

      @Nullable
      @Override
      public gvs.b a() {
         return null;
      }

      @Override
      public ffn b() {
         return new ffn(
            (double)this.c.h(), (double)this.c.i(), (double)this.c.j(), (double)(this.c.k() + 1), (double)(this.c.l() + 1), (double)(this.c.m() + 1)
         );
      }
   }

   final class c implements gsd.d {
      private final gvs.b b;

      c(final gvs.b $$0) {
         this.b = $$0;
      }

      @Override
      public void a(gsd.e $$0, boolean $$1, gvw $$2, int $$3, int $$4, boolean $$5) {
         ffn $$6 = this.b.b();
         if ($$1 || $$2.a(this.a().b())) {
            $$5 = $$5 && gsd.this.a($$6.a, $$6.b, $$6.c, $$6.d, $$6.e, $$6.f, $$4);
            $$0.visit(this, $$1, $$3, $$5);
         }
      }

      @Override
      public gvs.b a() {
         return this.b;
      }

      @Override
      public ffn b() {
         return this.b.b();
      }
   }

   public interface d {
      void a(gsd.e var1, boolean var2, gvw var3, int var4, int var5, boolean var6);

      @Nullable
      gvs.b a();

      ffn b();
   }

   @FunctionalInterface
   public interface e {
      void visit(gsd.d var1, boolean var2, int var3, boolean var4);
   }
}
