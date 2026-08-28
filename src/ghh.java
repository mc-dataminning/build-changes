import javax.annotation.Nullable;

public class ghh {
   private final ghh.b a;
   final je b;

   public ghh(kg $$0, int $$1, int $$2, int $$3) {
      int $$4 = $$1 * 2 + 1;
      int $$5 = azd.c($$4);
      int $$6 = $$1 * 16;
      je $$7 = $$0.j();
      this.b = $$0.k();
      int $$8 = $$7.u() - $$6;
      int $$9 = $$8 + $$5 * 16 - 1;
      int $$10 = $$5 >= $$2 ? $$3 : $$7.v() - $$6;
      int $$11 = $$10 + $$5 * 16 - 1;
      int $$12 = $$7.w() - $$6;
      int $$13 = $$12 + $$5 * 16 - 1;
      this.a = new ghh.b(new eku($$8, $$10, $$12, $$9, $$11, $$13));
   }

   public boolean a(gkt.b $$0) {
      return this.a.a($$0);
   }

   public void a(ghh.e $$0, gkx $$1) {
      this.a.a($$0, false, $$1, 0);
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

      public static ghh.a a(int $$0, int $$1, int $$2) {
         if ($$0 > $$1 && $$0 > $$2) {
            return $$1 > $$2 ? a : b;
         } else if ($$1 > $$0 && $$1 > $$2) {
            return $$0 > $$2 ? c : d;
         } else {
            return $$0 > $$1 ? e : f;
         }
      }
   }

   class b implements ghh.d {
      private final ghh.d[] b = new ghh.d[8];
      private final eku c;
      private final int d;
      private final int e;
      private final int f;
      private final ghh.a g;
      private final boolean h;
      private final boolean i;
      private final boolean j;

      public b(final eku $$0) {
         this.c = $$0;
         this.d = this.c.h() + this.c.d() / 2;
         this.e = this.c.i() + this.c.e() / 2;
         this.f = this.c.j() + this.c.f() / 2;
         int $$1 = ghh.this.b.u() - this.d;
         int $$2 = ghh.this.b.v() - this.e;
         int $$3 = ghh.this.b.w() - this.f;
         this.g = ghh.a.a(Math.abs($$1), Math.abs($$2), Math.abs($$3));
         this.h = $$1 < 0;
         this.i = $$2 < 0;
         this.j = $$3 < 0;
      }

      public boolean a(gkt.b $$0) {
         boolean $$1 = $$0.f().u() - this.d < 0;
         boolean $$2 = $$0.f().v() - this.e < 0;
         boolean $$3 = $$0.f().w() - this.f < 0;
         boolean $$4 = $$1 != this.h;
         boolean $$5 = $$2 != this.i;
         boolean $$6 = $$3 != this.j;
         int $$7 = a(this.g, $$4, $$5, $$6);
         if (this.c()) {
            boolean $$8 = this.b[$$7] != null;
            this.b[$$7] = new ghh.c($$0);
            return !$$8;
         } else if (this.b[$$7] != null) {
            ghh.b $$9 = (ghh.b)this.b[$$7];
            return $$9.a($$0);
         } else {
            eku $$10 = this.a($$1, $$2, $$3);
            ghh.b $$11 = ghh.this.new b($$10);
            this.b[$$7] = $$11;
            return $$11.a($$0);
         }
      }

      private static int a(ghh.a $$0, boolean $$1, boolean $$2, boolean $$3) {
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

      private eku a(boolean $$0, boolean $$1, boolean $$2) {
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

         return new eku($$3, $$7, $$11, $$4, $$8, $$12);
      }

      @Override
      public void a(ghh.e $$0, boolean $$1, gkx $$2, int $$3) {
         boolean $$4 = $$1;
         if (!$$1) {
            int $$5 = $$2.a(this.c);
            $$1 = $$5 == -2;
            $$4 = $$5 == -2 || $$5 == -1;
         }

         if ($$4) {
            $$0.visit(this, $$1, $$3);

            for (ghh.d $$6 : this.b) {
               if ($$6 != null) {
                  $$6.a($$0, $$1, $$2, $$3 + 1);
               }
            }
         }
      }

      @Nullable
      @Override
      public gkt.b a() {
         return null;
      }

      @Override
      public eyn b() {
         return new eyn(
            (double)this.c.h(), (double)this.c.i(), (double)this.c.j(), (double)(this.c.k() + 1), (double)(this.c.l() + 1), (double)(this.c.m() + 1)
         );
      }
   }

   static record c(gkt.b a) implements ghh.d {
      @Override
      public void a(ghh.e $$0, boolean $$1, gkx $$2, int $$3) {
         if ($$1 || $$2.a(this.a().b())) {
            $$0.visit(this, $$1, $$3);
         }
      }

      @Override
      public eyn b() {
         return this.a.b();
      }

      public gkt.b c() {
         return this.a;
      }
   }

   public interface d {
      void a(ghh.e var1, boolean var2, gkx var3, int var4);

      @Nullable
      gkt.b a();

      eyn b();
   }

   @FunctionalInterface
   public interface e {
      void visit(ghh.d var1, boolean var2, int var3);
   }
}
