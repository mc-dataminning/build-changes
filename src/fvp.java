public class fvp extends fvj<bwk, fgx> {
   private static final afw a = new afw("textures/entity/parrot/parrot_red_blue.png");
   private static final afw i = new afw("textures/entity/parrot/parrot_blue.png");
   private static final afw j = new afw("textures/entity/parrot/parrot_green.png");
   private static final afw k = new afw("textures/entity/parrot/parrot_yellow_blue.png");
   private static final afw l = new afw("textures/entity/parrot/parrot_grey.png");

   public fvp(fud.a $$0) {
      super($$0, new fgx($$0.a(fiv.aA)), 0.3F);
   }

   public afw a(bwk $$0) {
      return a($$0.gm());
   }

   public static afw a(bwk.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(bwk $$0, float $$1) {
      float $$2 = asy.i($$1, $$0.bZ, $$0.bW);
      float $$3 = asy.i($$1, $$0.bY, $$0.bX);
      return (asy.a($$2) + 1.0F) * $$3;
   }
}
