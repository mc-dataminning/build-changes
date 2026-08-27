public class gij extends gid<cef, ftb> {
   private static final akh a = new akh("textures/entity/parrot/parrot_red_blue.png");
   private static final akh i = new akh("textures/entity/parrot/parrot_blue.png");
   private static final akh j = new akh("textures/entity/parrot/parrot_green.png");
   private static final akh k = new akh("textures/entity/parrot/parrot_yellow_blue.png");
   private static final akh l = new akh("textures/entity/parrot/parrot_grey.png");

   public gij(ggx.a $$0) {
      super($$0, new ftb($$0.a(fva.aG)), 0.3F);
   }

   public akh a(cef $$0) {
      return a($$0.gx());
   }

   public static akh a(cef.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(cef $$0, float $$1) {
      float $$2 = axz.i($$1, $$0.ce, $$0.cb);
      float $$3 = axz.i($$1, $$0.cd, $$0.cc);
      return (axz.a($$2) + 1.0F) * $$3;
   }
}
