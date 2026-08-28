import javax.annotation.Nullable;

public class hjr {
   private static final int a = 100;
   private final azh b = azh.a();
   private final flk c;
   @Nullable
   private hiq d;
   private float e = 1.0F;
   private int f = 100;

   public hjr(flk $$0) {
      this.c = $$0;
   }

   public void a() {
      hjq $$0 = this.c.al();
      float $$1 = $$0.b();
      if (this.d != null && this.e != $$1) {
         boolean $$2 = this.a($$1);
         if (!$$2) {
            return;
         }
      }

      avx $$3 = $$0.a();
      if ($$3 == null) {
         this.f = Math.max(this.f, 100);
      } else {
         if (this.d != null) {
            if ($$0.a(this.d)) {
               this.c.ak().b(this.d);
               this.f = ayz.a(this.b, 0, $$3.b() / 2);
            }

            if (!this.c.ak().c(this.d)) {
               this.d = null;
               this.f = Math.min(this.f, ayz.a(this.b, $$3.b(), $$3.c()));
            }
         }

         this.f = Math.min(this.f, $$3.c());
         if (this.d == null && this.f-- <= 0) {
            this.a($$0);
         }
      }
   }

   public void a(hjq $$0) {
      this.d = hil.a($$0.a().a().a());
      if (this.d.b() != hjw.b) {
         this.c.ak().a(this.d);
         this.c.ak().a(this.d, $$0.b());
      }

      this.f = Integer.MAX_VALUE;
      this.e = $$0.b();
   }

   public void a(avx $$0) {
      if (this.b($$0)) {
         this.b();
      }
   }

   public void b() {
      if (this.d != null) {
         this.c.ak().b(this.d);
         this.d = null;
      }

      this.f += 100;
   }

   private boolean a(float $$0) {
      if (this.d == null) {
         return false;
      } else if (this.e == $$0) {
         return true;
      } else {
         if (this.e < $$0) {
            this.e = this.e + ayz.a(this.e, 5.0E-4F, 0.005F);
            if (this.e > $$0) {
               this.e = $$0;
            }
         } else {
            this.e = 0.03F * $$0 + 0.97F * this.e;
            if (Math.abs(this.e - $$0) < 1.0E-4F || this.e < $$0) {
               this.e = $$0;
            }
         }

         this.e = ayz.a(this.e, 0.0F, 1.0F);
         if (this.e <= 1.0E-4F) {
            this.b();
            return false;
         } else {
            this.c.ak().a(this.d, this.e);
            return true;
         }
      }
   }

   public boolean b(avx $$0) {
      return this.d == null ? false : $$0.a().a().a().equals(this.d.a());
   }
}
