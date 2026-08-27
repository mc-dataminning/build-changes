public class fut extends fun<bvh, fgd> {
   private static final aew a = new aew("textures/entity/parrot/parrot_red_blue.png");
   private static final aew i = new aew("textures/entity/parrot/parrot_blue.png");
   private static final aew j = new aew("textures/entity/parrot/parrot_green.png");
   private static final aew k = new aew("textures/entity/parrot/parrot_yellow_blue.png");
   private static final aew l = new aew("textures/entity/parrot/parrot_grey.png");

   public fut(fth.a $$0) {
      super($$0, new fgd($$0.a(fib.aA)), 0.3F);
   }

   public aew a(bvh $$0) {
      return a($$0.gl());
   }

   public static aew a(bvh.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(bvh $$0, float $$1) {
      float $$2 = arw.i($$1, $$0.bZ, $$0.bW);
      float $$3 = arw.i($$1, $$0.bY, $$0.bX);
      return (arw.a($$2) + 1.0F) * $$3;
   }
}
