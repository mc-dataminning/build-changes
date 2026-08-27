public class gjn extends gjt<cei, frf<cei>> {
   private static final ajt[] a = new ajt[]{
      new ajt("textures/entity/llama/decor/white.png"),
      new ajt("textures/entity/llama/decor/orange.png"),
      new ajt("textures/entity/llama/decor/magenta.png"),
      new ajt("textures/entity/llama/decor/light_blue.png"),
      new ajt("textures/entity/llama/decor/yellow.png"),
      new ajt("textures/entity/llama/decor/lime.png"),
      new ajt("textures/entity/llama/decor/pink.png"),
      new ajt("textures/entity/llama/decor/gray.png"),
      new ajt("textures/entity/llama/decor/light_gray.png"),
      new ajt("textures/entity/llama/decor/cyan.png"),
      new ajt("textures/entity/llama/decor/purple.png"),
      new ajt("textures/entity/llama/decor/blue.png"),
      new ajt("textures/entity/llama/decor/brown.png"),
      new ajt("textures/entity/llama/decor/green.png"),
      new ajt("textures/entity/llama/decor/red.png"),
      new ajt("textures/entity/llama/decor/black.png")
   };
   private static final ajt b = new ajt("textures/entity/llama/decor/trader_llama.png");
   private final frf<cei> c;

   public gjn(ghd<cei, frf<cei>> $$0, fti $$1) {
      super($$0);
      this.c = new frf<>($$1.a(ftl.ay));
   }

   public void a(ewi $$0, fzz $$1, int $$2, cei $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cqc $$10 = $$3.gA();
      ajt $$11;
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
      ewm $$14 = $$1.getBuffer(gah.e($$11));
      this.c.a($$0, $$14, $$2, gla.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
