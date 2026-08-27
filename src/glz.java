public class glz extends gmf<cgl, ftp<cgl>> {
   private static final akm[] a = new akm[]{
      new akm("textures/entity/llama/decor/white.png"),
      new akm("textures/entity/llama/decor/orange.png"),
      new akm("textures/entity/llama/decor/magenta.png"),
      new akm("textures/entity/llama/decor/light_blue.png"),
      new akm("textures/entity/llama/decor/yellow.png"),
      new akm("textures/entity/llama/decor/lime.png"),
      new akm("textures/entity/llama/decor/pink.png"),
      new akm("textures/entity/llama/decor/gray.png"),
      new akm("textures/entity/llama/decor/light_gray.png"),
      new akm("textures/entity/llama/decor/cyan.png"),
      new akm("textures/entity/llama/decor/purple.png"),
      new akm("textures/entity/llama/decor/blue.png"),
      new akm("textures/entity/llama/decor/brown.png"),
      new akm("textures/entity/llama/decor/green.png"),
      new akm("textures/entity/llama/decor/red.png"),
      new akm("textures/entity/llama/decor/black.png")
   };
   private static final akm b = new akm("textures/entity/llama/decor/trader_llama.png");
   private final ftp<cgl> c;

   public glz(gjp<cgl, ftp<cgl>> $$0, fvs $$1) {
      super($$0);
      this.c = new ftp<>($$1.a(fvv.ay));
   }

   public void a(eys $$0, gck $$1, int $$2, cgl $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      csh $$10 = $$3.gC();
      akm $$11;
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
      eyw $$14 = $$1.getBuffer(gcs.e($$11));
      this.c.a($$0, $$14, $$2, gnm.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
