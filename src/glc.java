public class glc extends gli<cfw, fsu<cfw>> {
   private static final akh[] a = new akh[]{
      new akh("textures/entity/llama/decor/white.png"),
      new akh("textures/entity/llama/decor/orange.png"),
      new akh("textures/entity/llama/decor/magenta.png"),
      new akh("textures/entity/llama/decor/light_blue.png"),
      new akh("textures/entity/llama/decor/yellow.png"),
      new akh("textures/entity/llama/decor/lime.png"),
      new akh("textures/entity/llama/decor/pink.png"),
      new akh("textures/entity/llama/decor/gray.png"),
      new akh("textures/entity/llama/decor/light_gray.png"),
      new akh("textures/entity/llama/decor/cyan.png"),
      new akh("textures/entity/llama/decor/purple.png"),
      new akh("textures/entity/llama/decor/blue.png"),
      new akh("textures/entity/llama/decor/brown.png"),
      new akh("textures/entity/llama/decor/green.png"),
      new akh("textures/entity/llama/decor/red.png"),
      new akh("textures/entity/llama/decor/black.png")
   };
   private static final akh b = new akh("textures/entity/llama/decor/trader_llama.png");
   private final fsu<cfw> c;

   public glc(gis<cfw, fsu<cfw>> $$0, fux $$1) {
      super($$0);
      this.c = new fsu<>($$1.a(fva.ay));
   }

   public void a(exx $$0, gbo $$1, int $$2, cfw $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      crs $$10 = $$3.gC();
      akh $$11;
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
      eyb $$14 = $$1.getBuffer(gbw.e($$11));
      this.c.a($$0, $$14, $$2, gmp.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
