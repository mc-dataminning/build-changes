public class gns extends gny<cgy, fvh<cgy>> {
   private static final akk[] a = new akk[]{
      new akk("textures/entity/llama/decor/white.png"),
      new akk("textures/entity/llama/decor/orange.png"),
      new akk("textures/entity/llama/decor/magenta.png"),
      new akk("textures/entity/llama/decor/light_blue.png"),
      new akk("textures/entity/llama/decor/yellow.png"),
      new akk("textures/entity/llama/decor/lime.png"),
      new akk("textures/entity/llama/decor/pink.png"),
      new akk("textures/entity/llama/decor/gray.png"),
      new akk("textures/entity/llama/decor/light_gray.png"),
      new akk("textures/entity/llama/decor/cyan.png"),
      new akk("textures/entity/llama/decor/purple.png"),
      new akk("textures/entity/llama/decor/blue.png"),
      new akk("textures/entity/llama/decor/brown.png"),
      new akk("textures/entity/llama/decor/green.png"),
      new akk("textures/entity/llama/decor/red.png"),
      new akk("textures/entity/llama/decor/black.png")
   };
   private static final akk b = new akk("textures/entity/llama/decor/trader_llama.png");
   private final fvh<cgy> c;

   public gns(gli<cgy, fvh<cgy>> $$0, fxk $$1) {
      super($$0);
      this.c = new fvh<>($$1.a(fxn.ay));
   }

   public void a(fam $$0, ged $$1, int $$2, cgy $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      csv $$10 = $$3.gB();
      akk $$11;
      if ($$10 != null) {
         $$11 = a[$$10.a()];
      } else {
         if (!$$3.gx()) {
            return;
         }

         $$11 = b;
      }

      this.c().a(this.c);
      this.c.a($$3, $$4, $$5, $$7, $$8, $$9);
      faq $$14 = $$1.getBuffer(gel.e($$11));
      this.c.a($$0, $$14, $$2, gpf.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
