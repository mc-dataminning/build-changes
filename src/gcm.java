public class gcm extends gcg<can, fni> {
   private static final aiy a = new aiy("textures/entity/parrot/parrot_red_blue.png");
   private static final aiy i = new aiy("textures/entity/parrot/parrot_blue.png");
   private static final aiy j = new aiy("textures/entity/parrot/parrot_green.png");
   private static final aiy k = new aiy("textures/entity/parrot/parrot_yellow_blue.png");
   private static final aiy l = new aiy("textures/entity/parrot/parrot_grey.png");

   public gcm(gba.a $$0) {
      super($$0, new fni($$0.a(fpi.aC)), 0.3F);
   }

   public aiy a(can $$0) {
      return a($$0.go());
   }

   public static aiy a(can.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(can $$0, float $$1) {
      float $$2 = awi.i($$1, $$0.bZ, $$0.bW);
      float $$3 = awi.i($$1, $$0.bY, $$0.bX);
      return (awi.a($$2) + 1.0F) * $$3;
   }
}
