import javax.annotation.Nullable;

public class hdc {
   private final fil a;
   @Nullable
   private hdd b;

   public hdc(fil $$0, fip $$1) {
      this.a = $$0;
   }

   public void a(gga $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable gbh $$0, @Nullable eyq $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(gbh $$0, je $$1, duo $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cvp $$0) {
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

   public void a(hde $$0) {
      this.a.n.r = $$0;
      this.a.n.ay();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public fil e() {
      return this.a;
   }

   public boolean f() {
      return this.a.r == null ? false : this.a.r.j() == ded.a;
   }

   public static xd a(String $$0) {
      return xd.d("key." + $$0).a(n.r);
   }

   public void a(cvp $$0, cvp $$1, crg $$2) {
   }
}
