public class gag extends fzt<bys, fli<bys>> {
   private static final ahg a = new ahg("textures/entity/rabbit/brown.png");
   private static final ahg i = new ahg("textures/entity/rabbit/white.png");
   private static final ahg j = new ahg("textures/entity/rabbit/black.png");
   private static final ahg k = new ahg("textures/entity/rabbit/gold.png");
   private static final ahg l = new ahg("textures/entity/rabbit/salt.png");
   private static final ahg m = new ahg("textures/entity/rabbit/white_splotched.png");
   private static final ahg n = new ahg("textures/entity/rabbit/toast.png");
   private static final ahg o = new ahg("textures/entity/rabbit/caerbannog.png");

   public gag(fyn.a $$0) {
      super($$0, new fli<>($$0.a(fmw.bb)), 0.3F);
   }

   public ahg a(bys $$0) {
      String $$1 = n.a($$0.ad().getString());
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
