public class glf extends glj<chj, fvx<chj>> {
   private static final akq a = akq.b("textures/entity/llama/creamy.png");
   private static final akq i = akq.b("textures/entity/llama/white.png");
   private static final akq j = akq.b("textures/entity/llama/brown.png");
   private static final akq k = akq.b("textures/entity/llama/gray.png");

   public glf(gkd.a $$0, fyc $$1) {
      super($$0, new fvx<>($$0.a($$1)), 0.7F);
      this.a(new goj(this, $$0.f()));
   }

   public akq a(chj $$0) {
      return switch ($$0.gy()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
