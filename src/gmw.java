import javax.annotation.Nullable;

public class gmw {
   protected final glt a;
   protected final dgi b;
   protected int c;
   protected int d;
   protected int e;
   private int g;
   private kk h;
   public gpk.b[] f;

   public gmw(gpk $$0, dgi $$1, int $$2, glt $$3) {
      this.a = $$3;
      this.b = $$1;
      this.a($$2);
      this.a($$0);
      this.h = kk.a(this.g + 1, 0, this.g + 1);
   }

   protected void a(gpk $$0) {
      if (!flj.Q().bx()) {
         throw new IllegalStateException("createSections called from wrong thread: " + Thread.currentThread().getName());
      } else {
         int $$1 = this.d * this.c * this.e;
         this.f = new gpk.b[$$1];

         for (int $$2 = 0; $$2 < this.d; $$2++) {
            for (int $$3 = 0; $$3 < this.c; $$3++) {
               for (int $$4 = 0; $$4 < this.e; $$4++) {
                  int $$5 = this.a($$2, $$3, $$4);
                  this.f[$$5] = $$0.new b($$5, kk.b($$2, $$3 + this.b.ap(), $$4));
               }
            }
         }
      }
   }

   public void a() {
      for (gpk.b $$0 : this.f) {
         $$0.e();
      }
   }

   private int a(int $$0, int $$1, int $$2) {
      return ($$2 * this.c + $$1) * this.d + $$0;
   }

   protected void a(int $$0) {
      int $$1 = $$0 * 2 + 1;
      this.d = $$1;
      this.c = this.b.ao();
      this.e = $$1;
      this.g = $$0;
   }

   public int b() {
      return this.g;
   }

   public dgk c() {
      return this.b;
   }

   public void a(kk $$0) {
      for (int $$1 = 0; $$1 < this.d; $$1++) {
         int $$2 = $$0.a() - this.g;
         int $$3 = $$2 + Math.floorMod($$1 - $$2, this.d);

         for (int $$4 = 0; $$4 < this.e; $$4++) {
            int $$5 = $$0.c() - this.g;
            int $$6 = $$5 + Math.floorMod($$4 - $$5, this.e);

            for (int $$7 = 0; $$7 < this.c; $$7++) {
               int $$8 = this.b.ap() + $$7;
               gpk.b $$9 = this.f[this.a($$1, $$7, $$4)];
               long $$10 = $$9.g();
               if ($$10 != kk.b($$3, $$8, $$6)) {
                  $$9.a(kk.b($$3, $$8, $$6));
               }
            }
         }
      }

      this.h = $$0;
      this.a.x().a();
   }

   public kk d() {
      return this.h;
   }

   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      gpk.b $$4 = this.b($$0, $$1, $$2);
      if ($$4 != null) {
         $$4.a($$3);
      }
   }

   @Nullable
   protected gpk.b a(ji $$0) {
      return this.a(kk.c($$0));
   }

   @Nullable
   protected gpk.b a(long $$0) {
      int $$1 = kk.b($$0);
      int $$2 = kk.c($$0);
      int $$3 = kk.d($$0);
      return this.b($$1, $$2, $$3);
   }

   @Nullable
   private gpk.b b(int $$0, int $$1, int $$2) {
      if (!this.c($$0, $$1, $$2)) {
         return null;
      } else {
         int $$3 = $$1 - this.b.ap();
         int $$4 = Math.floorMod($$0, this.d);
         int $$5 = Math.floorMod($$2, this.e);
         return this.f[this.a($$4, $$3, $$5)];
      }
   }

   private boolean c(int $$0, int $$1, int $$2) {
      if ($$1 >= this.b.ap() && $$1 <= this.b.aq()) {
         return $$0 < this.h.a() - this.g || $$0 > this.h.a() + this.g ? false : $$2 >= this.h.c() - this.g && $$2 <= this.h.c() + this.g;
      } else {
         return false;
      }
   }
}
