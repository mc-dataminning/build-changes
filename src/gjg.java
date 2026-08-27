public class gjg extends giz<cew, ftw> {
   private static final akn a = new akn("textures/entity/parrot/parrot_red_blue.png");
   private static final akn i = new akn("textures/entity/parrot/parrot_blue.png");
   private static final akn j = new akn("textures/entity/parrot/parrot_green.png");
   private static final akn k = new akn("textures/entity/parrot/parrot_yellow_blue.png");
   private static final akn l = new akn("textures/entity/parrot/parrot_grey.png");

   public gjg(ght.a $$0) {
      super($$0, new ftw($$0.a(fvv.aG)), 0.3F);
   }

   public akn a(cew $$0) {
      return a($$0.gx());
   }

   public static akn a(cew.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(cew $$0, float $$1) {
      float $$2 = ayf.i($$1, $$0.ce, $$0.cb);
      float $$3 = ayf.i($$1, $$0.cd, $$0.cc);
      return (ayf.a($$2) + 1.0F) * $$3;
   }
}
