public class goz extends gpi<cgl, fwj<cgl>> {
   private static final akt[] a = new akt[]{
      new akt("textures/entity/llama/decor/white.png"),
      new akt("textures/entity/llama/decor/orange.png"),
      new akt("textures/entity/llama/decor/magenta.png"),
      new akt("textures/entity/llama/decor/light_blue.png"),
      new akt("textures/entity/llama/decor/yellow.png"),
      new akt("textures/entity/llama/decor/lime.png"),
      new akt("textures/entity/llama/decor/pink.png"),
      new akt("textures/entity/llama/decor/gray.png"),
      new akt("textures/entity/llama/decor/light_gray.png"),
      new akt("textures/entity/llama/decor/cyan.png"),
      new akt("textures/entity/llama/decor/purple.png"),
      new akt("textures/entity/llama/decor/blue.png"),
      new akt("textures/entity/llama/decor/brown.png"),
      new akt("textures/entity/llama/decor/green.png"),
      new akt("textures/entity/llama/decor/red.png"),
      new akt("textures/entity/llama/decor/black.png")
   };
   private static final akt b = new akt("textures/entity/llama/decor/trader_llama.png");
   private final fwj<cgl> c;

   public goz(gmp<cgl, fwj<cgl>> $$0, fyo $$1) {
      super($$0);
      this.c = new fwj<>($$1.a(fyr.aC));
   }

   public void a(fbc $$0, gfg $$1, int $$2, cgl $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      csy $$10 = $$3.gL();
      akt $$11;
      if ($$10 != null) {
         $$11 = a[$$10.a()];
      } else {
         if (!$$3.gH()) {
            return;
         }

         $$11 = b;
      }

      this.c().a(this.c);
      this.c.a($$3, $$4, $$5, $$7, $$8, $$9);
      fbg $$14 = $$1.getBuffer(gfo.e($$11));
      this.c.a($$0, $$14, $$2, gqp.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
