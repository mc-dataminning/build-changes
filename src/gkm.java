public class gkm extends gjy<cfu, fvg<cfu>> {
   private static final alb a = new alb("textures/entity/rabbit/brown.png");
   private static final alb i = new alb("textures/entity/rabbit/white.png");
   private static final alb j = new alb("textures/entity/rabbit/black.png");
   private static final alb k = new alb("textures/entity/rabbit/gold.png");
   private static final alb l = new alb("textures/entity/rabbit/salt.png");
   private static final alb m = new alb("textures/entity/rabbit/white_splotched.png");
   private static final alb n = new alb("textures/entity/rabbit/toast.png");
   private static final alb o = new alb("textures/entity/rabbit/caerbannog.png");

   public gkm(gis.a $$0) {
      super($$0, new fvg<>($$0.a(fwu.be)), 0.3F);
   }

   public alb a(cfu $$0) {
      String $$1 = n.a($$0.af().getString());
      if ("Toast".equals($$1)) {
         return n;
      } else {
         return switch ($$0.gq()) {
            case a -> a;
            case b -> i;
            case c -> j;
            case e -> k;
            case f -> l;
            case d -> m;
            case g -> o;
         };
      }
   }
}
