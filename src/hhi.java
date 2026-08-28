import javax.annotation.Nullable;

public class hhi {
   private final flz a;
   @Nullable
   private hhj b;

   public hhi(flz $$0, fmd $$1) {
      this.a = $$0;
   }

   public void a(gjy $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable gfd $$0, @Nullable fbq $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(gfd $$0, jh $$1, dxn $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cxk $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void b() {
      if (this.b != null) {
         this.b.b();
         this.b = null;
      }
   }

   public void c() {
      if (this.b != null) {
         this.b();
      }

      this.b = this.a.n.r.a(this);
   }

   public void d() {
      if (this.b != null) {
         if (this.a.s != null) {
            this.b.a();
         } else {
            this.b();
         }
      } else if (this.a.s != null) {
         this.c();
      }
   }

   public void a(hhk $$0) {
      this.a.n.r = $$0;
      this.a.n.az();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public flz e() {
      return this.a;
   }

   public boolean f() {
      return this.a.r == null ? false : this.a.r.j() == dgx.a;
   }

   public static xv a(String $$0) {
      return xv.d("key." + $$0).a(n.r);
   }

   public void a(cxk $$0, cxk $$1, cth $$2) {
   }
}
