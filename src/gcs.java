public class gcs extends gcy<caa, fkq<caa>> {
   private static final ahg[] a = new ahg[]{
      new ahg("textures/entity/llama/decor/white.png"),
      new ahg("textures/entity/llama/decor/orange.png"),
      new ahg("textures/entity/llama/decor/magenta.png"),
      new ahg("textures/entity/llama/decor/light_blue.png"),
      new ahg("textures/entity/llama/decor/yellow.png"),
      new ahg("textures/entity/llama/decor/lime.png"),
      new ahg("textures/entity/llama/decor/pink.png"),
      new ahg("textures/entity/llama/decor/gray.png"),
      new ahg("textures/entity/llama/decor/light_gray.png"),
      new ahg("textures/entity/llama/decor/cyan.png"),
      new ahg("textures/entity/llama/decor/purple.png"),
      new ahg("textures/entity/llama/decor/blue.png"),
      new ahg("textures/entity/llama/decor/brown.png"),
      new ahg("textures/entity/llama/decor/green.png"),
      new ahg("textures/entity/llama/decor/red.png"),
      new ahg("textures/entity/llama/decor/black.png")
   };
   private static final ahg b = new ahg("textures/entity/llama/decor/trader_llama.png");
   private final fkq<caa> c;

   public gcs(gai<caa, fkq<caa>> $$0, fmt $$1) {
      super($$0);
      this.c = new fkq<>($$1.a(fmw.av));
   }

   public void a(eqb $$0, fth $$1, int $$2, caa $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      clm $$10 = $$3.gr();
      ahg $$11;
      if ($$10 != null) {
         $$11 = a[$$10.a()];
      } else {
         if (!$$3.gn()) {
            return;
         }

         $$11 = b;
      }

      this.c().a(this.c);
      this.c.a($$3, $$4, $$5, $$7, $$8, $$9);
      eqf $$14 = $$1.getBuffer(ftp.e($$11));
      this.c.a($$0, $$14, $$2, gee.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
