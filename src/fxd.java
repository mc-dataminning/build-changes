public class fxd extends fwq<bxd, fin<bxd>> {
   private static final agg a = new agg("textures/entity/rabbit/brown.png");
   private static final agg i = new agg("textures/entity/rabbit/white.png");
   private static final agg j = new agg("textures/entity/rabbit/black.png");
   private static final agg k = new agg("textures/entity/rabbit/gold.png");
   private static final agg l = new agg("textures/entity/rabbit/salt.png");
   private static final agg m = new agg("textures/entity/rabbit/white_splotched.png");
   private static final agg n = new agg("textures/entity/rabbit/toast.png");
   private static final agg o = new agg("textures/entity/rabbit/caerbannog.png");

   public fxd(fvk.a $$0) {
      super($$0, new fin<>($$0.a(fka.aY)), 0.3F);
   }

   public agg a(bxd $$0) {
      String $$1 = n.a($$0.ab().getString());
      if ("Toast".equals($$1)) {
         return n;
      } else {
         return switch ($$0.ge()) {
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
