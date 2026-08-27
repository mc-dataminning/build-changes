public class fup extends fuj<bvn, ffy> {
   private static final aez a = new aez("textures/entity/parrot/parrot_red_blue.png");
   private static final aez i = new aez("textures/entity/parrot/parrot_blue.png");
   private static final aez j = new aez("textures/entity/parrot/parrot_green.png");
   private static final aez k = new aez("textures/entity/parrot/parrot_yellow_blue.png");
   private static final aez l = new aez("textures/entity/parrot/parrot_grey.png");

   public fup(ftd.a $$0) {
      super($$0, new ffy($$0.a(fhw.aA)), 0.3F);
   }

   public aez a(bvn $$0) {
      return a($$0.gm());
   }

   public static aez a(bvn.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(bvn $$0, float $$1) {
      float $$2 = asb.i($$1, $$0.bZ, $$0.bW);
      float $$3 = asb.i($$1, $$0.bY, $$0.bX);
      return (asb.a($$2) + 1.0F) * $$3;
   }
}
