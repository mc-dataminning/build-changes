public class gat extends gag<byw, flu<byw>> {
   private static final ahh a = new ahh("textures/entity/rabbit/brown.png");
   private static final ahh i = new ahh("textures/entity/rabbit/white.png");
   private static final ahh j = new ahh("textures/entity/rabbit/black.png");
   private static final ahh k = new ahh("textures/entity/rabbit/gold.png");
   private static final ahh l = new ahh("textures/entity/rabbit/salt.png");
   private static final ahh m = new ahh("textures/entity/rabbit/white_splotched.png");
   private static final ahh n = new ahh("textures/entity/rabbit/toast.png");
   private static final ahh o = new ahh("textures/entity/rabbit/caerbannog.png");

   public gat(fza.a $$0) {
      super($$0, new flu<>($$0.a(fni.ba)), 0.3F);
   }

   public ahh a(byw $$0) {
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
