public class gmy extends gne<chh, fuo<chh>> {
   private static final alb[] a = new alb[]{
      new alb("textures/entity/llama/decor/white.png"),
      new alb("textures/entity/llama/decor/orange.png"),
      new alb("textures/entity/llama/decor/magenta.png"),
      new alb("textures/entity/llama/decor/light_blue.png"),
      new alb("textures/entity/llama/decor/yellow.png"),
      new alb("textures/entity/llama/decor/lime.png"),
      new alb("textures/entity/llama/decor/pink.png"),
      new alb("textures/entity/llama/decor/gray.png"),
      new alb("textures/entity/llama/decor/light_gray.png"),
      new alb("textures/entity/llama/decor/cyan.png"),
      new alb("textures/entity/llama/decor/purple.png"),
      new alb("textures/entity/llama/decor/blue.png"),
      new alb("textures/entity/llama/decor/brown.png"),
      new alb("textures/entity/llama/decor/green.png"),
      new alb("textures/entity/llama/decor/red.png"),
      new alb("textures/entity/llama/decor/black.png")
   };
   private static final alb b = new alb("textures/entity/llama/decor/trader_llama.png");
   private final fuo<chh> c;

   public gmy(gko<chh, fuo<chh>> $$0, fwr $$1) {
      super($$0);
      this.c = new fuo<>($$1.a(fwu.ay));
   }

   public void a(ezt $$0, gdj $$1, int $$2, chh $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ctd $$10 = $$3.gD();
      alb $$11;
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
      ezx $$14 = $$1.getBuffer(gdr.e($$11));
      this.c.a($$0, $$14, $$2, gol.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
