public class gsf extends gqq<cmm, gxv, gbt> {
   private static final alj a = alj.b("textures/entity/illager/vex.png");
   private static final alj b = alj.b("textures/entity/illager/vex_charging.png");

   public gsf(gpk.a $$0) {
      super($$0, new gbt($$0.a(gck.dk)), 0.3F);
      this.a(new gtr<>(this, $$0.b()));
   }

   protected int a(cmm $$0, jh $$1) {
      return 15;
   }

   public alj a(gxv $$0) {
      return $$0.a ? b : a;
   }

   public gxv b() {
      return new gxv();
   }

   public void a(cmm $$0, gxv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gm();
   }
}
