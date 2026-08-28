import javax.annotation.Nullable;

public class hlw {
   private final fmg a;
   @Nullable
   private hlx b;

   public hlw(fmg $$0, fmk $$1) {
      this.a = $$0;
   }

   public void a(glt $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable ggy $$0, @Nullable fbv $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(ggy $$0, ji $$1, dxq $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cxh $$0) {
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

   public void a(hly $$0) {
      this.a.n.r = $$0;
      this.a.n.az();
      if (this.b != null) {
         this.b.b();
         this.b = $$0.a(this);
      }
   }

   public fmg e() {
      return this.a;
   }

   public boolean f() {
      return this.a.r == null ? false : this.a.r.i() == dgw.a;
   }

   public static wp a(String $$0) {
      return wp.d("key." + $$0).a(n.r);
   }

   public void a(cxh $$0, cxh $$1, ctg $$2) {
   }
}
