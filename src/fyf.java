public class fyf extends fyl<bxw, fgq<bxw>> {
   private static final afw[] a = new afw[]{
      new afw("textures/entity/llama/decor/white.png"),
      new afw("textures/entity/llama/decor/orange.png"),
      new afw("textures/entity/llama/decor/magenta.png"),
      new afw("textures/entity/llama/decor/light_blue.png"),
      new afw("textures/entity/llama/decor/yellow.png"),
      new afw("textures/entity/llama/decor/lime.png"),
      new afw("textures/entity/llama/decor/pink.png"),
      new afw("textures/entity/llama/decor/gray.png"),
      new afw("textures/entity/llama/decor/light_gray.png"),
      new afw("textures/entity/llama/decor/cyan.png"),
      new afw("textures/entity/llama/decor/purple.png"),
      new afw("textures/entity/llama/decor/blue.png"),
      new afw("textures/entity/llama/decor/brown.png"),
      new afw("textures/entity/llama/decor/green.png"),
      new afw("textures/entity/llama/decor/red.png"),
      new afw("textures/entity/llama/decor/black.png")
   };
   private static final afw b = new afw("textures/entity/llama/decor/trader_llama.png");
   private final fgq<bxw> c;

   public fyf(fvy<bxw, fgq<bxw>> $$0, fis $$1) {
      super($$0);
      this.c = new fgq<>($$1.a(fiv.as));
   }

   public void a(emh $$0, fpb $$1, int $$2, bxw $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cix $$10 = $$3.gr();
      afw $$11;
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
      eml $$14 = $$1.getBuffer(fpj.e($$11));
      this.c.a($$0, $$14, $$2, fzr.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
