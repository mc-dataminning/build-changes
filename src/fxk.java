public class fxk extends fwh<bxu, fhd<bxu>> {
   private static final aer a = new aer("textures/entity/wither/wither_armor.png");
   private final fhd<bxu> b;

   public fxk(fuj<bxu, fhd<bxu>> $$0, fhj $$1) {
      super($$0);
      this.b = new fhd<>($$1.a(fhm.bP));
   }

   @Override
   protected float a(float $$0) {
      return arp.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected aer a() {
      return a;
   }

   @Override
   protected feo<bxu> b() {
      return this.b;
   }
}
