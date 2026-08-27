public class fxj extends fxd<bxh, fip> {
   private static final agi a = new agi("textures/entity/parrot/parrot_red_blue.png");
   private static final agi i = new agi("textures/entity/parrot/parrot_blue.png");
   private static final agi j = new agi("textures/entity/parrot/parrot_green.png");
   private static final agi k = new agi("textures/entity/parrot/parrot_yellow_blue.png");
   private static final agi l = new agi("textures/entity/parrot/parrot_grey.png");

   public fxj(fvx.a $$0) {
      super($$0, new fip($$0.a(fkn.aA)), 0.3F);
   }

   public agi a(bxh $$0) {
      return a($$0.gn());
   }

   public static agi a(bxh.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(bxh $$0, float $$1) {
      float $$2 = atm.i($$1, $$0.bZ, $$0.bW);
      float $$3 = atm.i($$1, $$0.bY, $$0.bX);
      return (atm.a($$2) + 1.0F) * $$3;
   }
}
