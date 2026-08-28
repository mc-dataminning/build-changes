import javax.annotation.Nullable;

public class hpc {
   private final foz a;
   @Nullable
   private hpd b;

   public hpc(foz $$0, fpd $$1) {
      this.a = $$0;
   }

   public void a(gov $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable gjz $$0, @Nullable feo $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(gjz $$0, iu $$1, eah $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(czd $$0) {
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

   public void a(hpe $$0) {
      this.a.n.r = $$0;
      this.a.n.az();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public foz e() {
      return this.a;
   }

   public boolean f() {
      return this.a.r == null ? false : this.a.r.i() == dix.a;
   }

   public static wy a(String $$0) {
      return wy.d("key." + $$0).a(n.r);
   }

   public void a(czd $$0, czd $$1, cvf $$2) {
   }
}
