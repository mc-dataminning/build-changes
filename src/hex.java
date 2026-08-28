import javax.annotation.Nullable;

public class hex {
   private final fjx a;
   @Nullable
   private hey b;

   public hex(fjx $$0, fkb $$1) {
      this.a = $$0;
   }

   public void a(ghr $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable gcy $$0, @Nullable ezp $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(gcy $$0, jh $$1, dvo $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cwf $$0) {
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

   public void a(hez $$0) {
      this.a.n.r = $$0;
      this.a.n.ay();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public fjx e() {
      return this.a;
   }

   public boolean f() {
      return this.a.r == null ? false : this.a.r.j() == dfc.a;
   }

   public static xl a(String $$0) {
      return xl.d("key." + $$0).a(n.r);
   }

   public void a(cwf $$0, cwf $$1, csc $$2) {
   }
}
