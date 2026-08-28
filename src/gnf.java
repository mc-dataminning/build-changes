public class gnf extends gnl<cho, fuv<cho>> {
   private static final alf[] a = new alf[]{
      new alf("textures/entity/llama/decor/white.png"),
      new alf("textures/entity/llama/decor/orange.png"),
      new alf("textures/entity/llama/decor/magenta.png"),
      new alf("textures/entity/llama/decor/light_blue.png"),
      new alf("textures/entity/llama/decor/yellow.png"),
      new alf("textures/entity/llama/decor/lime.png"),
      new alf("textures/entity/llama/decor/pink.png"),
      new alf("textures/entity/llama/decor/gray.png"),
      new alf("textures/entity/llama/decor/light_gray.png"),
      new alf("textures/entity/llama/decor/cyan.png"),
      new alf("textures/entity/llama/decor/purple.png"),
      new alf("textures/entity/llama/decor/blue.png"),
      new alf("textures/entity/llama/decor/brown.png"),
      new alf("textures/entity/llama/decor/green.png"),
      new alf("textures/entity/llama/decor/red.png"),
      new alf("textures/entity/llama/decor/black.png")
   };
   private static final alf b = new alf("textures/entity/llama/decor/trader_llama.png");
   private final fuv<cho> c;

   public gnf(gkv<cho, fuv<cho>> $$0, fwy $$1) {
      super($$0);
      this.c = new fuv<>($$1.a(fxb.ay));
   }

   public void a(faa $$0, gdq $$1, int $$2, cho $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ctk $$10 = $$3.gD();
      alf $$11;
      if ($$10 != null) {
         $$11 = a[$$10.a()];
      } else {
         if (!$$3.gz()) {
            return;
         }

         $$11 = b;
      }

      this.c().a(this.c);
      this.c.a($$3, $$4, $$5, $$7, $$8, $$9);
      fae $$14 = $$1.getBuffer(gdy.e($$11));
      this.c.a($$0, $$14, $$2, gos.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
