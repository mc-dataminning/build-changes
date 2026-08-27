public class fxo extends fxi<bxm, fiu> {
   private static final agm a = new agm("textures/entity/parrot/parrot_red_blue.png");
   private static final agm i = new agm("textures/entity/parrot/parrot_blue.png");
   private static final agm j = new agm("textures/entity/parrot/parrot_green.png");
   private static final agm k = new agm("textures/entity/parrot/parrot_yellow_blue.png");
   private static final agm l = new agm("textures/entity/parrot/parrot_grey.png");

   public fxo(fwc.a $$0) {
      super($$0, new fiu($$0.a(fks.aA)), 0.3F);
   }

   public agm a(bxm $$0) {
      return a($$0.gn());
   }

   public static agm a(bxm.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(bxm $$0, float $$1) {
      float $$2 = atq.i($$1, $$0.bZ, $$0.bW);
      float $$3 = atq.i($$1, $$0.bY, $$0.bX);
      return (atq.a($$2) + 1.0F) * $$3;
   }
}
