public class gnm extends gns<cgv, fvb<cgv>> {
   private static final akk[] a = new akk[]{
      new akk("textures/entity/llama/decor/white.png"),
      new akk("textures/entity/llama/decor/orange.png"),
      new akk("textures/entity/llama/decor/magenta.png"),
      new akk("textures/entity/llama/decor/light_blue.png"),
      new akk("textures/entity/llama/decor/yellow.png"),
      new akk("textures/entity/llama/decor/lime.png"),
      new akk("textures/entity/llama/decor/pink.png"),
      new akk("textures/entity/llama/decor/gray.png"),
      new akk("textures/entity/llama/decor/light_gray.png"),
      new akk("textures/entity/llama/decor/cyan.png"),
      new akk("textures/entity/llama/decor/purple.png"),
      new akk("textures/entity/llama/decor/blue.png"),
      new akk("textures/entity/llama/decor/brown.png"),
      new akk("textures/entity/llama/decor/green.png"),
      new akk("textures/entity/llama/decor/red.png"),
      new akk("textures/entity/llama/decor/black.png")
   };
   private static final akk b = new akk("textures/entity/llama/decor/trader_llama.png");
   private final fvb<cgv> c;

   public gnm(glc<cgv, fvb<cgv>> $$0, fxe $$1) {
      super($$0);
      this.c = new fvb<>($$1.a(fxh.ay));
   }

   public void a(fag $$0, gdx $$1, int $$2, cgv $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cst $$10 = $$3.gA();
      akk $$11;
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
      fak $$14 = $$1.getBuffer(gef.e($$11));
      this.c.a($$0, $$14, $$2, goz.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
