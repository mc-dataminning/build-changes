public class fyq extends fyu<bzk, fjr<bzk>> {
   private static final agt a = new agt("textures/entity/llama/creamy.png");
   private static final agt i = new agt("textures/entity/llama/white.png");
   private static final agt j = new agt("textures/entity/llama/brown.png");
   private static final agt k = new agt("textures/entity/llama/gray.png");

   public fyq(fxo.a $$0, flw $$1) {
      super($$0, new fjr<>($$0.a($$1)), 0.7F);
      this.a(new gbt(this, $$0.f()));
   }

   public agt a(bzk $$0) {
      return switch ($$0.gq()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
