import javax.annotation.Nullable;

public class gfo {
   protected final gev a;
   protected final dcw b;
   protected int c;
   protected int d;
   protected int e;
   private int g;
   public ghy.b[] f;

   public gfo(ghy $$0, dcw $$1, int $$2, gev $$3) {
      this.a = $$3;
      this.b = $$1;
      this.a($$2);
      this.a($$0);
   }

   protected void a(ghy $$0) {
      if (!fgm.Q().bx()) {
         throw new IllegalStateException("createSections called from wrong thread: " + Thread.currentThread().getName());
      } else {
         int $$1 = this.d * this.c * this.e;
         this.f = new ghy.b[$$1];

         for (int $$2 = 0; $$2 < this.d; $$2++) {
            for (int $$3 = 0; $$3 < this.c; $$3++) {
               for (int $$4 = 0; $$4 < this.e; $$4++) {
                  int $$5 = this.a($$2, $$3, $$4);
                  this.f[$$5] = $$0.new b($$5, $$2 * 16, this.b.I_() + $$3 * 16, $$4 * 16);
               }
            }
         }
      }
   }

   public void a() {
      for (ghy.b $$0 : this.f) {
         $$0.e();
      }
   }

   private int a(int $$0, int $$1, int $$2) {
      return ($$2 * this.c + $$1) * this.d + $$0;
   }

   protected void a(int $$0) {
      int $$1 = $$0 * 2 + 1;
      this.d = $$1;
      this.c = this.b.an();
      this.e = $$1;
      this.g = $$0;
   }

   public int b() {
      return this.g;
   }

   public dcy c() {
      return this.b;
   }

   public void a(double $$0, double $$1) {
      int $$2 = ayo.c($$0);
      int $$3 = ayo.c($$1);

      for (int $$4 = 0; $$4 < this.d; $$4++) {
         int $$5 = this.d * 16;
         int $$6 = $$2 - 8 - $$5 / 2;
         int $$7 = $$6 + Math.floorMod($$4 * 16 - $$6, $$5);

         for (int $$8 = 0; $$8 < this.e; $$8++) {
            int $$9 = this.e * 16;
            int $$10 = $$3 - 8 - $$9 / 2;
            int $$11 = $$10 + Math.floorMod($$8 * 16 - $$10, $$9);

            for (int $$12 = 0; $$12 < this.c; $$12++) {
               int $$13 = this.b.I_() + $$12 * 16;
               ghy.b $$14 = this.f[this.a($$4, $$12, $$8)];
               jd $$15 = $$14.f();
               if ($$7 != $$15.u() || $$13 != $$15.v() || $$11 != $$15.w()) {
                  $$14.a($$7, $$13, $$11);
               }
            }
         }
      }
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      int $$4 = Math.floorMod($$0, this.d);
      int $$5 = Math.floorMod($$1 - this.b.ao(), this.c);
      int $$6 = Math.floorMod($$2, this.e);
      ghy.b $$7 = this.f[this.a($$4, $$5, $$6)];
      $$7.a($$3);
   }

   @Nullable
   protected ghy.b a(jd $$0) {
      int $$1 = ayo.a($$0.v() - this.b.I_(), 16);
      if ($$1 >= 0 && $$1 < this.c) {
         int $$2 = ayo.b(ayo.a($$0.u(), 16), this.d);
         int $$3 = ayo.b(ayo.a($$0.w(), 16), this.e);
         return this.f[this.a($$2, $$1, $$3)];
      } else {
         return null;
      }
   }
}
