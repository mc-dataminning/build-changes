public class gex extends gfd<cby, fmu<cby>> {
   private static final aiy[] a = new aiy[]{
      new aiy("textures/entity/llama/decor/white.png"),
      new aiy("textures/entity/llama/decor/orange.png"),
      new aiy("textures/entity/llama/decor/magenta.png"),
      new aiy("textures/entity/llama/decor/light_blue.png"),
      new aiy("textures/entity/llama/decor/yellow.png"),
      new aiy("textures/entity/llama/decor/lime.png"),
      new aiy("textures/entity/llama/decor/pink.png"),
      new aiy("textures/entity/llama/decor/gray.png"),
      new aiy("textures/entity/llama/decor/light_gray.png"),
      new aiy("textures/entity/llama/decor/cyan.png"),
      new aiy("textures/entity/llama/decor/purple.png"),
      new aiy("textures/entity/llama/decor/blue.png"),
      new aiy("textures/entity/llama/decor/brown.png"),
      new aiy("textures/entity/llama/decor/green.png"),
      new aiy("textures/entity/llama/decor/red.png"),
      new aiy("textures/entity/llama/decor/black.png")
   };
   private static final aiy b = new aiy("textures/entity/llama/decor/trader_llama.png");
   private final fmu<cby> c;

   public gex(gcn<cby, fmu<cby>> $$0, foy $$1) {
      super($$0);
      this.c = new fmu<>($$1.a(fpb.au));
   }

   public void a(esa $$0, fvl $$1, int $$2, cby $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cnn $$10 = $$3.gt();
      aiy $$11;
      if ($$10 != null) {
         $$11 = a[$$10.a()];
      } else {
         if (!$$3.gp()) {
            return;
         }

         $$11 = b;
      }

      this.c().a(this.c);
      this.c.a($$3, $$4, $$5, $$7, $$8, $$9);
      ese $$14 = $$1.getBuffer(fvt.e($$11));
      this.c.a($$0, $$14, $$2, ggk.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
