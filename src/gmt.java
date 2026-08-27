public class gmt extends glq<chu, fvm<chu>> {
   private static final akm a = new akm("textures/entity/wither/wither_armor.png");
   private final fvm<chu> b;

   public gmt(gjp<chu, fvm<chu>> $$0, fvs $$1) {
      super($$0);
      this.b = new fvm<>($$1.a(fvv.bW));
   }

   @Override
   protected float a(float $$0) {
      return ayd.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected akm a() {
      return a;
   }

   @Override
   protected fsw<chu> b() {
      return this.b;
   }
}
