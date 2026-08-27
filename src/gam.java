public class gam extends gag<bys, flj> {
   private static final ahh a = new ahh("textures/entity/parrot/parrot_red_blue.png");
   private static final ahh i = new ahh("textures/entity/parrot/parrot_blue.png");
   private static final ahh j = new ahh("textures/entity/parrot/parrot_green.png");
   private static final ahh k = new ahh("textures/entity/parrot/parrot_yellow_blue.png");
   private static final ahh l = new ahh("textures/entity/parrot/parrot_grey.png");

   public gam(fza.a $$0) {
      super($$0, new flj($$0.a(fni.aC)), 0.3F);
   }

   public ahh a(bys $$0) {
      return a($$0.gn());
   }

   public static ahh a(bys.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(bys $$0, float $$1) {
      float $$2 = aup.i($$1, $$0.ca, $$0.bX);
      float $$3 = aup.i($$1, $$0.bZ, $$0.bY);
      return (aup.a($$2) + 1.0F) * $$3;
   }
}
