public class gjz extends gkd<chm, fut<chm>> {
   private static final alf a = new alf("textures/entity/llama/creamy.png");
   private static final alf i = new alf("textures/entity/llama/white.png");
   private static final alf j = new alf("textures/entity/llama/brown.png");
   private static final alf k = new alf("textures/entity/llama/gray.png");

   public gjz(gix.a $$0, fwy $$1) {
      super($$0, new fut<>($$0.a($$1)), 0.7F);
      this.a(new gnd(this, $$0.f()));
   }

   public alf a(chm $$0) {
      return switch ($$0.gC()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
