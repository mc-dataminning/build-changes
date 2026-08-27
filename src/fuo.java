public class fuo extends fui<bvc, ffy> {
   private static final aeu a = new aeu("textures/entity/parrot/parrot_red_blue.png");
   private static final aeu i = new aeu("textures/entity/parrot/parrot_blue.png");
   private static final aeu j = new aeu("textures/entity/parrot/parrot_green.png");
   private static final aeu k = new aeu("textures/entity/parrot/parrot_yellow_blue.png");
   private static final aeu l = new aeu("textures/entity/parrot/parrot_grey.png");

   public fuo(ftc.a $$0) {
      super($$0, new ffy($$0.a(fhw.aA)), 0.3F);
   }

   public aeu a(bvc $$0) {
      return a($$0.gi());
   }

   public static aeu a(bvc.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(bvc $$0, float $$1) {
      float $$2 = ars.i($$1, $$0.bZ, $$0.bW);
      float $$3 = ars.i($$1, $$0.bY, $$0.bX);
      return (ars.a($$2) + 1.0F) * $$3;
   }
}
