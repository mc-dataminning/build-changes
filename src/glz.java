public class glz extends gmf<cgn, ftp<cgn>> {
   private static final akn[] a = new akn[]{
      new akn("textures/entity/llama/decor/white.png"),
      new akn("textures/entity/llama/decor/orange.png"),
      new akn("textures/entity/llama/decor/magenta.png"),
      new akn("textures/entity/llama/decor/light_blue.png"),
      new akn("textures/entity/llama/decor/yellow.png"),
      new akn("textures/entity/llama/decor/lime.png"),
      new akn("textures/entity/llama/decor/pink.png"),
      new akn("textures/entity/llama/decor/gray.png"),
      new akn("textures/entity/llama/decor/light_gray.png"),
      new akn("textures/entity/llama/decor/cyan.png"),
      new akn("textures/entity/llama/decor/purple.png"),
      new akn("textures/entity/llama/decor/blue.png"),
      new akn("textures/entity/llama/decor/brown.png"),
      new akn("textures/entity/llama/decor/green.png"),
      new akn("textures/entity/llama/decor/red.png"),
      new akn("textures/entity/llama/decor/black.png")
   };
   private static final akn b = new akn("textures/entity/llama/decor/trader_llama.png");
   private final ftp<cgn> c;

   public glz(gjp<cgn, ftp<cgn>> $$0, fvs $$1) {
      super($$0);
      this.c = new ftp<>($$1.a(fvv.ay));
   }

   public void a(eyu $$0, gck $$1, int $$2, cgn $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      csj $$10 = $$3.gC();
      akn $$11;
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
      eyy $$14 = $$1.getBuffer(gcs.e($$11));
      this.c.a($$0, $$14, $$2, gnm.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
