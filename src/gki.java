public class gki extends gkb<cft, fuy> {
   private static final ale a = new ale("textures/entity/parrot/parrot_red_blue.png");
   private static final ale i = new ale("textures/entity/parrot/parrot_blue.png");
   private static final ale j = new ale("textures/entity/parrot/parrot_green.png");
   private static final ale k = new ale("textures/entity/parrot/parrot_yellow_blue.png");
   private static final ale l = new ale("textures/entity/parrot/parrot_grey.png");

   public gki(giv.a $$0) {
      super($$0, new fuy($$0.a(fwx.aG)), 0.3F);
   }

   public ale a(cft $$0) {
      return a($$0.gy());
   }

   public static ale a(cft.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(cft $$0, float $$1) {
      float $$2 = ayx.i($$1, $$0.ce, $$0.cb);
      float $$3 = ayx.i($$1, $$0.cd, $$0.cc);
      return (ayx.a($$2) + 1.0F) * $$3;
   }
}
