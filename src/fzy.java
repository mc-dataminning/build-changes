public class fzy extends fzl<bym, fla<bym>> {
   private static final ahd a = new ahd("textures/entity/rabbit/brown.png");
   private static final ahd i = new ahd("textures/entity/rabbit/white.png");
   private static final ahd j = new ahd("textures/entity/rabbit/black.png");
   private static final ahd k = new ahd("textures/entity/rabbit/gold.png");
   private static final ahd l = new ahd("textures/entity/rabbit/salt.png");
   private static final ahd m = new ahd("textures/entity/rabbit/white_splotched.png");
   private static final ahd n = new ahd("textures/entity/rabbit/toast.png");
   private static final ahd o = new ahd("textures/entity/rabbit/caerbannog.png");

   public fzy(fyf.a $$0) {
      super($$0, new fla<>($$0.a(fmo.bb)), 0.3F);
   }

   public ahd a(bym $$0) {
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
