public class gjw extends gkc<cep, fro<cep>> {
   private static final ajv[] a = new ajv[]{
      new ajv("textures/entity/llama/decor/white.png"),
      new ajv("textures/entity/llama/decor/orange.png"),
      new ajv("textures/entity/llama/decor/magenta.png"),
      new ajv("textures/entity/llama/decor/light_blue.png"),
      new ajv("textures/entity/llama/decor/yellow.png"),
      new ajv("textures/entity/llama/decor/lime.png"),
      new ajv("textures/entity/llama/decor/pink.png"),
      new ajv("textures/entity/llama/decor/gray.png"),
      new ajv("textures/entity/llama/decor/light_gray.png"),
      new ajv("textures/entity/llama/decor/cyan.png"),
      new ajv("textures/entity/llama/decor/purple.png"),
      new ajv("textures/entity/llama/decor/blue.png"),
      new ajv("textures/entity/llama/decor/brown.png"),
      new ajv("textures/entity/llama/decor/green.png"),
      new ajv("textures/entity/llama/decor/red.png"),
      new ajv("textures/entity/llama/decor/black.png")
   };
   private static final ajv b = new ajv("textures/entity/llama/decor/trader_llama.png");
   private final fro<cep> c;

   public gjw(ghm<cep, fro<cep>> $$0, ftr $$1) {
      super($$0);
      this.c = new fro<>($$1.a(ftu.ay));
   }

   public void a(ewr $$0, gai $$1, int $$2, cep $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cql $$10 = $$3.gA();
      ajv $$11;
      if ($$10 != null) {
         $$11 = a[$$10.a()];
      } else {
         if (!$$3.gw()) {
            return;
         }

         $$11 = b;
      }

      this.c().a(this.c);
      this.c.a($$3, $$4, $$5, $$7, $$8, $$9);
      ewv $$14 = $$1.getBuffer(gaq.e($$11));
      this.c.a($$0, $$14, $$2, glj.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
