public class gcf extends gbz<caj, fnb> {
   private static final aiy a = new aiy("textures/entity/parrot/parrot_red_blue.png");
   private static final aiy i = new aiy("textures/entity/parrot/parrot_blue.png");
   private static final aiy j = new aiy("textures/entity/parrot/parrot_green.png");
   private static final aiy k = new aiy("textures/entity/parrot/parrot_yellow_blue.png");
   private static final aiy l = new aiy("textures/entity/parrot/parrot_grey.png");

   public gcf(gat.a $$0) {
      super($$0, new fnb($$0.a(fpb.aC)), 0.3F);
   }

   public aiy a(caj $$0) {
      return a($$0.go());
   }

   public static aiy a(caj.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(caj $$0, float $$1) {
      float $$2 = awh.i($$1, $$0.bZ, $$0.bW);
      float $$3 = awh.i($$1, $$0.bY, $$0.bX);
      return (awh.a($$2) + 1.0F) * $$3;
   }
}
