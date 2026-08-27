public class fzh extends fyu<byc, fkj<byc>> {
   private static final agt a = new agt("textures/entity/rabbit/brown.png");
   private static final agt i = new agt("textures/entity/rabbit/white.png");
   private static final agt j = new agt("textures/entity/rabbit/black.png");
   private static final agt k = new agt("textures/entity/rabbit/gold.png");
   private static final agt l = new agt("textures/entity/rabbit/salt.png");
   private static final agt m = new agt("textures/entity/rabbit/white_splotched.png");
   private static final agt n = new agt("textures/entity/rabbit/toast.png");
   private static final agt o = new agt("textures/entity/rabbit/caerbannog.png");

   public fzh(fxo.a $$0) {
      super($$0, new fkj<>($$0.a(flx.bb)), 0.3F);
   }

   public agt a(byc $$0) {
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
