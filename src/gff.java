public class gff extends gfl<ccc, fnb<ccc>> {
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
   private final fnb<ccc> c;

   public gff(gcv<ccc, fnb<ccc>> $$0, fpf $$1) {
      super($$0);
      this.c = new fnb<>($$1.a(fpi.au));
   }

   public void a(esh $$0, fvt $$1, int $$2, ccc $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cnr $$10 = $$3.gt();
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
      esl $$14 = $$1.getBuffer(fwb.e($$11));
      this.c.a($$0, $$14, $$2, ggs.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
