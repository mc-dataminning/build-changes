public class gnb extends gnh<chk, fur<chk>> {
   private static final ale[] a = new ale[]{
      new ale("textures/entity/llama/decor/white.png"),
      new ale("textures/entity/llama/decor/orange.png"),
      new ale("textures/entity/llama/decor/magenta.png"),
      new ale("textures/entity/llama/decor/light_blue.png"),
      new ale("textures/entity/llama/decor/yellow.png"),
      new ale("textures/entity/llama/decor/lime.png"),
      new ale("textures/entity/llama/decor/pink.png"),
      new ale("textures/entity/llama/decor/gray.png"),
      new ale("textures/entity/llama/decor/light_gray.png"),
      new ale("textures/entity/llama/decor/cyan.png"),
      new ale("textures/entity/llama/decor/purple.png"),
      new ale("textures/entity/llama/decor/blue.png"),
      new ale("textures/entity/llama/decor/brown.png"),
      new ale("textures/entity/llama/decor/green.png"),
      new ale("textures/entity/llama/decor/red.png"),
      new ale("textures/entity/llama/decor/black.png")
   };
   private static final ale b = new ale("textures/entity/llama/decor/trader_llama.png");
   private final fur<chk> c;

   public gnb(gkr<chk, fur<chk>> $$0, fwu $$1) {
      super($$0);
      this.c = new fur<>($$1.a(fwx.ay));
   }

   public void a(ezw $$0, gdm $$1, int $$2, chk $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ctg $$10 = $$3.gD();
      ale $$11;
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
      faa $$14 = $$1.getBuffer(gdu.e($$11));
      this.c.a($$0, $$14, $$2, goo.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
