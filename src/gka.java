public class gka extends gke<chn, fuu<chn>> {
   private static final alf a = new alf("textures/entity/llama/creamy.png");
   private static final alf i = new alf("textures/entity/llama/white.png");
   private static final alf j = new alf("textures/entity/llama/brown.png");
   private static final alf k = new alf("textures/entity/llama/gray.png");

   public gka(giy.a $$0, fwz $$1) {
      super($$0, new fuu<>($$0.a($$1)), 0.7F);
      this.a(new gne(this, $$0.f()));
   }

   public alf a(chn $$0) {
      return switch ($$0.gC()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
