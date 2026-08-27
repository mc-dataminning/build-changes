public class glu extends glz<cgl, fwj<cgl>> {
   private static final akt a = new akt("textures/entity/llama/creamy.png");
   private static final akt b = new akt("textures/entity/llama/white.png");
   private static final akt g = new akt("textures/entity/llama/brown.png");
   private static final akt k = new akt("textures/entity/llama/gray.png");

   public glu(gkq.a $$0, fyq $$1) {
      super($$0, new fwj<>($$0.a($$1)), 0.7F);
      this.a(new goz(this, $$0.f()));
   }

   public akt a(cgl $$0) {
      return switch ($$0.gK()) {
         case a -> a;
         case b -> b;
         case c -> g;
         case d -> k;
      };
   }
}
