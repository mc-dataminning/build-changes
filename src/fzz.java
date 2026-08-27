public class fzz extends fzt<byo, fkx> {
   private static final ahg a = new ahg("textures/entity/parrot/parrot_red_blue.png");
   private static final ahg i = new ahg("textures/entity/parrot/parrot_blue.png");
   private static final ahg j = new ahg("textures/entity/parrot/parrot_green.png");
   private static final ahg k = new ahg("textures/entity/parrot/parrot_yellow_blue.png");
   private static final ahg l = new ahg("textures/entity/parrot/parrot_grey.png");

   public fzz(fyn.a $$0) {
      super($$0, new fkx($$0.a(fmw.aD)), 0.3F);
   }

   public ahg a(byo $$0) {
      return a($$0.gm());
   }

   public static ahg a(byo.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(byo $$0, float $$1) {
      float $$2 = auo.i($$1, $$0.bZ, $$0.bW);
      float $$3 = auo.i($$1, $$0.bY, $$0.bX);
      return (auo.a($$2) + 1.0F) * $$3;
   }
}
