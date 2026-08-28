import javax.annotation.Nullable;

public class hqv {
   private final fqq a;
   @Nullable
   private hqw b;

   public hqv(fqq $$0, fqu $$1) {
      this.a = $$0;
   }

   public void a(gqk $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable glo $$0, @Nullable fga $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(glo $$0, iw $$1, ebq $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(dak $$0) {
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

   public void a(hqx $$0) {
      this.a.n.r = $$0;
      this.a.n.az();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public fqq e() {
      return this.a;
   }

   public boolean f() {
      return this.a.r == null ? false : this.a.r.i() == dkg.a;
   }

   public static xg a(String $$0) {
      return xg.d("key." + $$0).a(o.r);
   }

   public void a(dak $$0, dak $$1, cwl $$2) {
   }
}
