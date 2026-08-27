public class gig extends ght<cdn, ftc<cdn>> {
   private static final akf a = new akf("textures/entity/rabbit/brown.png");
   private static final akf i = new akf("textures/entity/rabbit/white.png");
   private static final akf j = new akf("textures/entity/rabbit/black.png");
   private static final akf k = new akf("textures/entity/rabbit/gold.png");
   private static final akf l = new akf("textures/entity/rabbit/salt.png");
   private static final akf m = new akf("textures/entity/rabbit/white_splotched.png");
   private static final akf n = new akf("textures/entity/rabbit/toast.png");
   private static final akf o = new akf("textures/entity/rabbit/caerbannog.png");

   public gig(ggn.a $$0) {
      super($$0, new ftc<>($$0.a(fuq.be)), 0.3F);
   }

   public akf a(cdn $$0) {
      String $$1 = n.a($$0.ad().getString());
      if ("Toast".equals($$1)) {
         return n;
      } else {
         return switch ($$0.gp()) {
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
