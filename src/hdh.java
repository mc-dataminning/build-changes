import javax.annotation.Nullable;

public class hdh {
   private final fip a;
   @Nullable
   private hdi b;

   public hdh(fip $$0, fit $$1) {
      this.a = $$0;
   }

   public void a(ggf $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable gbm $$0, @Nullable eyu $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(gbm $$0, jf $$1, dus $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cvs $$0) {
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

   public void a(hdj $$0) {
      this.a.n.r = $$0;
      this.a.n.ay();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public fip e() {
      return this.a;
   }

   public boolean f() {
      return this.a.r == null ? false : this.a.r.j() == deg.a;
   }

   public static xe a(String $$0) {
      return xe.d("key." + $$0).a(n.r);
   }

   public void a(cvs $$0, cvs $$1, crj $$2) {
   }
}
