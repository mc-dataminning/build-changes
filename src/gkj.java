public class gkj extends gkc<cfu, fuz> {
   private static final ale a = new ale("textures/entity/parrot/parrot_red_blue.png");
   private static final ale i = new ale("textures/entity/parrot/parrot_blue.png");
   private static final ale j = new ale("textures/entity/parrot/parrot_green.png");
   private static final ale k = new ale("textures/entity/parrot/parrot_yellow_blue.png");
   private static final ale l = new ale("textures/entity/parrot/parrot_grey.png");

   public gkj(giw.a $$0) {
      super($$0, new fuz($$0.a(fwy.aG)), 0.3F);
   }

   public ale a(cfu $$0) {
      return a($$0.gy());
   }

   public static ale a(cfu.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(cfu $$0, float $$1) {
      float $$2 = ayy.i($$1, $$0.ce, $$0.cb);
      float $$3 = ayy.i($$1, $$0.cd, $$0.cc);
      return (ayy.a($$2) + 1.0F) * $$3;
   }
}
