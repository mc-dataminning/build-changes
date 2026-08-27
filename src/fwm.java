public class fwm extends fwq<byl, fhv<byl>> {
   private static final agg a = new agg("textures/entity/llama/creamy.png");
   private static final agg i = new agg("textures/entity/llama/white.png");
   private static final agg j = new agg("textures/entity/llama/brown.png");
   private static final agg k = new agg("textures/entity/llama/gray.png");

   public fwm(fvk.a $$0, fjz $$1) {
      super($$0, new fhv<>($$0.a($$1)), 0.7F);
      this.a(new fzm(this, $$0.f()));
   }

   public agg a(byl $$0) {
      return switch ($$0.gq()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
