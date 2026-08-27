public class fww extends fwq<bwz, fic> {
   private static final agg a = new agg("textures/entity/parrot/parrot_red_blue.png");
   private static final agg i = new agg("textures/entity/parrot/parrot_blue.png");
   private static final agg j = new agg("textures/entity/parrot/parrot_green.png");
   private static final agg k = new agg("textures/entity/parrot/parrot_yellow_blue.png");
   private static final agg l = new agg("textures/entity/parrot/parrot_grey.png");

   public fww(fvk.a $$0) {
      super($$0, new fic($$0.a(fka.aA)), 0.3F);
   }

   public agg a(bwz $$0) {
      return a($$0.gm());
   }

   public static agg a(bwz.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(bwz $$0, float $$1) {
      float $$2 = ati.i($$1, $$0.bZ, $$0.bW);
      float $$3 = ati.i($$1, $$0.bY, $$0.bX);
      return (ati.a($$2) + 1.0F) * $$3;
   }
}
