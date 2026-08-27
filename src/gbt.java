public class gbt extends gag<cdk, fms> {
   private static final ahh a = new ahh("textures/entity/illager/vex.png");
   private static final ahh i = new ahh("textures/entity/illager/vex_charging.png");

   public gbt(fza.a $$0) {
      super($$0, new fms($$0.a(fni.bK)), 0.3F);
      this.a(new gde<>(this, $$0.d()));
   }

   protected int a(cdk $$0, hx $$1) {
      return 15;
   }

   public ahh a(cdk $$0) {
      return $$0.gg() ? i : a;
   }
}
