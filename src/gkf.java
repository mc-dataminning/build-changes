public class gkf extends gjy<cfq, fuv> {
   private static final alb a = new alb("textures/entity/parrot/parrot_red_blue.png");
   private static final alb i = new alb("textures/entity/parrot/parrot_blue.png");
   private static final alb j = new alb("textures/entity/parrot/parrot_green.png");
   private static final alb k = new alb("textures/entity/parrot/parrot_yellow_blue.png");
   private static final alb l = new alb("textures/entity/parrot/parrot_grey.png");

   public gkf(gis.a $$0) {
      super($$0, new fuv($$0.a(fwu.aG)), 0.3F);
   }

   public alb a(cfq $$0) {
      return a($$0.gy());
   }

   public static alb a(cfq.b $$0) {
      return switch ($$0) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
         case e -> l;
      };
   }

   public float a(cfq $$0, float $$1) {
      float $$2 = ayu.i($$1, $$0.ce, $$0.cb);
      float $$3 = ayu.i($$1, $$0.cd, $$0.cc);
      return (ayu.a($$2) + 1.0F) * $$3;
   }
}
