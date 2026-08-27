public class ggt extends ggx<cep, fro<cep>> {
   private static final ajv a = new ajv("textures/entity/llama/creamy.png");
   private static final ajv i = new ajv("textures/entity/llama/white.png");
   private static final ajv j = new ajv("textures/entity/llama/brown.png");
   private static final ajv k = new ajv("textures/entity/llama/gray.png");

   public ggt(gfr.a $$0, ftt $$1) {
      super($$0, new fro<>($$0.a($$1)), 0.7F);
      this.a(new gjw(this, $$0.f()));
   }

   public ajv a(cep $$0) {
      return switch ($$0.gz()) {
         case a -> a;
         case b -> i;
         case c -> j;
         case d -> k;
      };
   }
}
