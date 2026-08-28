import javax.annotation.Nullable;

public class hdw {
   private final fja a;
   @Nullable
   private hdx b;

   public hdw(fja $$0, fje $$1) {
      this.a = $$0;
   }

   public void a(ggq $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable gbx $$0, @Nullable ezf $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(gbx $$0, jg $$1, dvd $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cvx $$0) {
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

   public void a(hdy $$0) {
      this.a.n.r = $$0;
      this.a.n.ay();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public fja e() {
      return this.a;
   }

   public boolean f() {
      return this.a.r == null ? false : this.a.r.j() == des.a;
   }

   public static xh a(String $$0) {
      return xh.d("key." + $$0).a(n.r);
   }

   public void a(cvx $$0, cvx $$1, crt $$2) {
   }
}
