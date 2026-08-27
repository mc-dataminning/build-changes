public class gks extends gky<cfa, fsk<cfa>> {
   private static final akf[] a = new akf[]{
      new akf("textures/entity/llama/decor/white.png"),
      new akf("textures/entity/llama/decor/orange.png"),
      new akf("textures/entity/llama/decor/magenta.png"),
      new akf("textures/entity/llama/decor/light_blue.png"),
      new akf("textures/entity/llama/decor/yellow.png"),
      new akf("textures/entity/llama/decor/lime.png"),
      new akf("textures/entity/llama/decor/pink.png"),
      new akf("textures/entity/llama/decor/gray.png"),
      new akf("textures/entity/llama/decor/light_gray.png"),
      new akf("textures/entity/llama/decor/cyan.png"),
      new akf("textures/entity/llama/decor/purple.png"),
      new akf("textures/entity/llama/decor/blue.png"),
      new akf("textures/entity/llama/decor/brown.png"),
      new akf("textures/entity/llama/decor/green.png"),
      new akf("textures/entity/llama/decor/red.png"),
      new akf("textures/entity/llama/decor/black.png")
   };
   private static final akf b = new akf("textures/entity/llama/decor/trader_llama.png");
   private final fsk<cfa> c;

   public gks(gii<cfa, fsk<cfa>> $$0, fun $$1) {
      super($$0);
      this.c = new fsk<>($$1.a(fuq.ay));
   }

   public void a(exn $$0, gbe $$1, int $$2, cfa $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cqw $$10 = $$3.gC();
      akf $$11;
      if ($$10 != null) {
         $$11 = a[$$10.a()];
      } else {
         if (!$$3.gy()) {
            return;
         }

         $$11 = b;
      }

      this.c().a(this.c);
      this.c.a($$3, $$4, $$5, $$7, $$8, $$9);
      exr $$14 = $$1.getBuffer(gbm.e($$11));
      this.c.a($$0, $$14, $$2, gmf.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
