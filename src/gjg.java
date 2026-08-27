public class gjg extends giz<ceu, ftw> {
   private static final akm a = new akm("textures/entity/parrot/parrot_red_blue.png");
   private static final akm i = new akm("textures/entity/parrot/parrot_blue.png");
   private static final akm j = new akm("textures/entity/parrot/parrot_green.png");
   private static final akm k = new akm("textures/entity/parrot/parrot_yellow_blue.png");
   private static final akm l = new akm("textures/entity/parrot/parrot_grey.png");

   public gjg(ght.a $$0) {
      super($$0, new ftw($$0.a(fvv.aG)), 0.3F);
   }

   public akm a(ceu $$0) {
      return a($$0.gx());
   }

   public static akm a(ceu.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(ceu $$0, float $$1) {
      float $$2 = ayd.i($$1, $$0.ce, $$0.cb);
      float $$3 = ayd.i($$1, $$0.cd, $$0.cc);
      return (ayd.a($$2) + 1.0F) * $$3;
   }
}
