public class giq extends gid<cej, ftm<cej>> {
   private static final akh a = new akh("textures/entity/rabbit/brown.png");
   private static final akh i = new akh("textures/entity/rabbit/white.png");
   private static final akh j = new akh("textures/entity/rabbit/black.png");
   private static final akh k = new akh("textures/entity/rabbit/gold.png");
   private static final akh l = new akh("textures/entity/rabbit/salt.png");
   private static final akh m = new akh("textures/entity/rabbit/white_splotched.png");
   private static final akh n = new akh("textures/entity/rabbit/toast.png");
   private static final akh o = new akh("textures/entity/rabbit/caerbannog.png");

   public giq(ggx.a $$0) {
      super($$0, new ftm<>($$0.a(fva.be)), 0.3F);
   }

   public akh a(cej $$0) {
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
