public class gns extends gmp<ciq, fwl<ciq>> {
   private static final alb a = new alb("textures/entity/wither/wither_armor.png");
   private final fwl<ciq> b;

   public gns(gko<ciq, fwl<ciq>> $$0, fwr $$1) {
      super($$0);
      this.b = new fwl<>($$1.a(fwu.bW));
   }

   @Override
   protected float a(float $$0) {
      return ayu.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected alb a() {
      return a;
   }

   @Override
   protected ftv<ciq> b() {
      return this.b;
   }
}
