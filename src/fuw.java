public class fuw extends fuj<bvr, fgj<bvr>> {
   private static final aez a = new aez("textures/entity/rabbit/brown.png");
   private static final aez i = new aez("textures/entity/rabbit/white.png");
   private static final aez j = new aez("textures/entity/rabbit/black.png");
   private static final aez k = new aez("textures/entity/rabbit/gold.png");
   private static final aez l = new aez("textures/entity/rabbit/salt.png");
   private static final aez m = new aez("textures/entity/rabbit/white_splotched.png");
   private static final aez n = new aez("textures/entity/rabbit/toast.png");
   private static final aez o = new aez("textures/entity/rabbit/caerbannog.png");

   public fuw(ftd.a $$0) {
      super($$0, new fgj<>($$0.a(fhw.aY)), 0.3F);
   }

   public aez a(bvr $$0) {
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
