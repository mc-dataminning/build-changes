public class fza extends fyu<bxy, fjy> {
   private static final agt a = new agt("textures/entity/parrot/parrot_red_blue.png");
   private static final agt i = new agt("textures/entity/parrot/parrot_blue.png");
   private static final agt j = new agt("textures/entity/parrot/parrot_green.png");
   private static final agt k = new agt("textures/entity/parrot/parrot_yellow_blue.png");
   private static final agt l = new agt("textures/entity/parrot/parrot_grey.png");

   public fza(fxo.a $$0) {
      super($$0, new fjy($$0.a(flx.aD)), 0.3F);
   }

   public agt a(bxy $$0) {
      return a($$0.gm());
   }

   public static agt a(bxy.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(bxy $$0, float $$1) {
      float $$2 = aty.i($$1, $$0.bZ, $$0.bW);
      float $$3 = aty.i($$1, $$0.bY, $$0.bX);
      return (aty.a($$2) + 1.0F) * $$3;
   }
}
