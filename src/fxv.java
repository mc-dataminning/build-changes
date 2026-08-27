public class fxv extends fxi<bxq, fjf<bxq>> {
   private static final agm a = new agm("textures/entity/rabbit/brown.png");
   private static final agm i = new agm("textures/entity/rabbit/white.png");
   private static final agm j = new agm("textures/entity/rabbit/black.png");
   private static final agm k = new agm("textures/entity/rabbit/gold.png");
   private static final agm l = new agm("textures/entity/rabbit/salt.png");
   private static final agm m = new agm("textures/entity/rabbit/white_splotched.png");
   private static final agm n = new agm("textures/entity/rabbit/toast.png");
   private static final agm o = new agm("textures/entity/rabbit/caerbannog.png");

   public fxv(fwc.a $$0) {
      super($$0, new fjf<>($$0.a(fks.aY)), 0.3F);
   }

   public agm a(bxq $$0) {
      String $$1 = n.a($$0.ad().getString());
      if ("Toast".equals($$1)) {
         return n;
      } else {
         return switch ($$0.gf()) {
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
