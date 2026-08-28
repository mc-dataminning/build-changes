import javax.annotation.Nullable;

public class hkq {
   private final flj a;
   @Nullable
   private hkr b;

   public hkq(flj $$0, fln $$1) {
      this.a = $$0;
   }

   public void a(gkt $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable gfy $$0, @Nullable fay $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(gfy $$0, ji $$1, dwx $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cwp $$0) {
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

   public void a(hks $$0) {
      this.a.n.r = $$0;
      this.a.n.az();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public flj e() {
      return this.a;
   }

   public boolean f() {
      return this.a.r == null ? false : this.a.r.j() == dgf.a;
   }

   public static wo a(String $$0) {
      return wo.d("key." + $$0).a(n.r);
   }

   public void a(cwp $$0, cwp $$1, csm $$2) {
   }
}
