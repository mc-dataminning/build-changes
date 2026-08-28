public class grz extends goj<cpd, gxr> {
   public static final alj a = alj.b("textures/entity/projectiles/arrow.png");
   public static final alj b = alj.b("textures/entity/projectiles/tipped_arrow.png");

   public grz(gpk.a $$0) {
      super($$0);
   }

   protected alj a(gxr $$0) {
      return $$0.d ? b : a;
   }

   public gxr a() {
      return new gxr();
   }

   public void a(cpd $$0, gxr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.d = $$0.A() > 0;
   }
}
