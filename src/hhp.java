import javax.annotation.Nullable;

public class hhp {
   private final fmg a;
   @Nullable
   private hhq b;

   public hhp(fmg $$0, fmk $$1) {
      this.a = $$0;
   }

   public void a(gkf $$0) {
      if (this.b != null) {
         this.b.a($$0);
      }
   }

   public void a(double $$0, double $$1) {
      if (this.b != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(@Nullable gfk $$0, @Nullable fbw $$1) {
      if (this.b != null && $$1 != null && $$0 != null) {
         this.b.a($$0, $$1);
      }
   }

   public void a(gfk $$0, jh $$1, dxv $$2, float $$3) {
      if (this.b != null) {
         this.b.a($$0, $$1, $$2, $$3);
      }
   }

   public void a() {
      if (this.b != null) {
         this.b.c();
      }
   }

   public void a(cxp $$0) {
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

   public void a(hhr $$0) {
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
      return this.a.r == null ? false : this.a.r.j() == dhf.a;
   }

   public static xv a(String $$0) {
      return xv.d("key." + $$0).a(n.r);
   }

   public void a(cxp $$0, cxp $$1, ctm $$2) {
   }
}
