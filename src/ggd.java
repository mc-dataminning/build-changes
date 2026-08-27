public class ggd extends ggj<ccr, fnx<ccr>> {
   private static final ajc[] a = new ajc[]{
      new ajc("textures/entity/llama/decor/white.png"),
      new ajc("textures/entity/llama/decor/orange.png"),
      new ajc("textures/entity/llama/decor/magenta.png"),
      new ajc("textures/entity/llama/decor/light_blue.png"),
      new ajc("textures/entity/llama/decor/yellow.png"),
      new ajc("textures/entity/llama/decor/lime.png"),
      new ajc("textures/entity/llama/decor/pink.png"),
      new ajc("textures/entity/llama/decor/gray.png"),
      new ajc("textures/entity/llama/decor/light_gray.png"),
      new ajc("textures/entity/llama/decor/cyan.png"),
      new ajc("textures/entity/llama/decor/purple.png"),
      new ajc("textures/entity/llama/decor/blue.png"),
      new ajc("textures/entity/llama/decor/brown.png"),
      new ajc("textures/entity/llama/decor/green.png"),
      new ajc("textures/entity/llama/decor/red.png"),
      new ajc("textures/entity/llama/decor/black.png")
   };
   private static final ajc b = new ajc("textures/entity/llama/decor/trader_llama.png");
   private final fnx<ccr> c;

   public ggd(gdt<ccr, fnx<ccr>> $$0, fqb $$1) {
      super($$0);
      this.c = new fnx<>($$1.a(fqe.au));
   }

   public void a(etd $$0, fwq $$1, int $$2, ccr $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cog $$10 = $$3.gy();
      ajc $$11;
      if ($$10 != null) {
         $$11 = a[$$10.a()];
      } else {
         if (!$$3.gu()) {
            return;
         }

         $$11 = b;
      }

      this.c().a(this.c);
      this.c.a($$3, $$4, $$5, $$7, $$8, $$9);
      eth $$14 = $$1.getBuffer(fwy.e($$11));
      this.c.a($$0, $$14, $$2, ghq.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
