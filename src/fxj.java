public class fxj extends fxp<bwt, ffw<bwt>> {
   private static final aew[] a = new aew[]{
      new aew("textures/entity/llama/decor/white.png"),
      new aew("textures/entity/llama/decor/orange.png"),
      new aew("textures/entity/llama/decor/magenta.png"),
      new aew("textures/entity/llama/decor/light_blue.png"),
      new aew("textures/entity/llama/decor/yellow.png"),
      new aew("textures/entity/llama/decor/lime.png"),
      new aew("textures/entity/llama/decor/pink.png"),
      new aew("textures/entity/llama/decor/gray.png"),
      new aew("textures/entity/llama/decor/light_gray.png"),
      new aew("textures/entity/llama/decor/cyan.png"),
      new aew("textures/entity/llama/decor/purple.png"),
      new aew("textures/entity/llama/decor/blue.png"),
      new aew("textures/entity/llama/decor/brown.png"),
      new aew("textures/entity/llama/decor/green.png"),
      new aew("textures/entity/llama/decor/red.png"),
      new aew("textures/entity/llama/decor/black.png")
   };
   private static final aew b = new aew("textures/entity/llama/decor/trader_llama.png");
   private final ffw<bwt> c;

   public fxj(fvc<bwt, ffw<bwt>> $$0, fhy $$1) {
      super($$0);
      this.c = new ffw<>($$1.a(fib.as));
   }

   public void a(elp $$0, foe $$1, int $$2, bwt $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cht $$10 = $$3.gq();
      aew $$11;
      if ($$10 != null) {
         $$11 = a[$$10.a()];
      } else {
         if (!$$3.gm()) {
            return;
         }

         $$11 = b;
      }

      this.c().a(this.c);
      this.c.a($$3, $$4, $$5, $$7, $$8, $$9);
      elt $$14 = $$1.getBuffer(fom.e($$11));
      this.c.a($$0, $$14, $$2, fyv.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
