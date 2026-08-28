import javax.annotation.Nullable;

public class hrf {
   private final frd a;
   @Nullable
   private hrg b;

   public hrf(frd $$0, frh $$1) {
      this.a = $$0;
   }

   public void a(gqx $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable gmb $$0, @Nullable ffo $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(gmb $$0, iv $$1, ebe $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(czy $$0) {
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

   public void a(hrh $$0) {
      this.a.n.r = $$0;
      this.a.n.az();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public frd e() {
      return this.a;
   }

   public boolean f() {
      return this.a.r == null ? false : this.a.r.i() == dju.a;
   }

   public static xa a(String $$0) {
      return xa.d("key." + $$0).a(o.r);
   }

   public void a(czy $$0, czy $$1, cwa $$2) {
   }
}
