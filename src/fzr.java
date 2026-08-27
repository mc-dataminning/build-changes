public class fzr extends fzl<byi, fkp> {
   private static final ahd a = new ahd("textures/entity/parrot/parrot_red_blue.png");
   private static final ahd i = new ahd("textures/entity/parrot/parrot_blue.png");
   private static final ahd j = new ahd("textures/entity/parrot/parrot_green.png");
   private static final ahd k = new ahd("textures/entity/parrot/parrot_yellow_blue.png");
   private static final ahd l = new ahd("textures/entity/parrot/parrot_grey.png");

   public fzr(fyf.a $$0) {
      super($$0, new fkp($$0.a(fmo.aD)), 0.3F);
   }

   public ahd a(byi $$0) {
      return a($$0.gm());
   }

   public static ahd a(byi.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(byi $$0, float $$1) {
      float $$2 = aui.i($$1, $$0.bZ, $$0.bW);
      float $$3 = aui.i($$1, $$0.bY, $$0.bX);
      return (aui.a($$2) + 1.0F) * $$3;
   }
}
