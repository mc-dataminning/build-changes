public class guz extends gtk<cmm, hat, gel> {
   private static final akv a = akv.b("textures/entity/illager/vex.png");
   private static final akv b = akv.b("textures/entity/illager/vex_charging.png");

   public guz(gse.a $$0) {
      super($$0, new gel($$0.a(gfc.ds)), 0.3F);
      this.a(new gwl<>(this));
   }

   protected int a(cmm $$0, ji $$1) {
      return 15;
   }

   public akv a(hat $$0) {
      return $$0.a ? b : a;
   }

   public hat b() {
      return new hat();
   }

   public void a(cmm $$0, hat $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gxp.a($$0, $$1, this.i);
      $$1.a = $$0.gs();
   }
}
