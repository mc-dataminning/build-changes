public class fzx extends fzr<byn, fkv> {
   private static final ahg a = new ahg("textures/entity/parrot/parrot_red_blue.png");
   private static final ahg i = new ahg("textures/entity/parrot/parrot_blue.png");
   private static final ahg j = new ahg("textures/entity/parrot/parrot_green.png");
   private static final ahg k = new ahg("textures/entity/parrot/parrot_yellow_blue.png");
   private static final ahg l = new ahg("textures/entity/parrot/parrot_grey.png");

   public fzx(fyl.a $$0) {
      super($$0, new fkv($$0.a(fmu.aD)), 0.3F);
   }

   public ahg a(byn $$0) {
      return a($$0.gm());
   }

   public static ahg a(byn.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(byn $$0, float $$1) {
      float $$2 = aun.i($$1, $$0.bZ, $$0.bW);
      float $$3 = aun.i($$1, $$0.bY, $$0.bX);
      return (aun.a($$2) + 1.0F) * $$3;
   }
}
