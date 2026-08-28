public class grx<T extends bul & cpk> extends gpj<T, gxp> {
   private final gqi a;
   private final float b;
   private final boolean h;

   public grx(gpk.a $$0, float $$1, boolean $$2) {
      super($$0);
      this.a = $$0.b();
      this.b = $$1;
      this.h = $$2;
   }

   public grx(gpk.a $$0) {
      this($$0, 1.0F, false);
   }

   @Override
   protected int a(T $$0, jh $$1) {
      return this.h ? 15 : super.a($$0, $$1);
   }

   public void a(gxp $$0, fer $$1, gjg $$2, int $$3) {
      $$1.a();
      $$1.b(this.b, this.b, this.b);
      $$1.a(this.e.b());
      if ($$0.a != null) {
         this.a.a($$0.b, cwk.h, false, $$1, $$2, $$3, gyv.d, $$0.a);
      }

      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gxp a() {
      return new gxp();
   }

   public void a(T $$0, gxp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      cwm $$3 = $$0.j();
      $$1.a = !$$3.f() ? this.a.a($$3, $$0.dV(), null, $$0.ar()) : null;
      $$1.b = $$3.v();
   }
}
