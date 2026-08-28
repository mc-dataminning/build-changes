public class gkr extends gkd<cfz, fvl<cfz>> {
   private static final alf a = new alf("textures/entity/rabbit/brown.png");
   private static final alf i = new alf("textures/entity/rabbit/white.png");
   private static final alf j = new alf("textures/entity/rabbit/black.png");
   private static final alf k = new alf("textures/entity/rabbit/gold.png");
   private static final alf l = new alf("textures/entity/rabbit/salt.png");
   private static final alf m = new alf("textures/entity/rabbit/white_splotched.png");
   private static final alf n = new alf("textures/entity/rabbit/toast.png");
   private static final alf o = new alf("textures/entity/rabbit/caerbannog.png");

   public gkr(gix.a $$0) {
      super($$0, new fvl<>($$0.a(fwz.be)), 0.3F);
   }

   public alf a(cfz $$0) {
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
