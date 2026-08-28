public class goj extends gop<chj, fvx<chj>> {
   private static final akq[] a = new akq[]{
      akq.b("textures/entity/llama/decor/white.png"),
      akq.b("textures/entity/llama/decor/orange.png"),
      akq.b("textures/entity/llama/decor/magenta.png"),
      akq.b("textures/entity/llama/decor/light_blue.png"),
      akq.b("textures/entity/llama/decor/yellow.png"),
      akq.b("textures/entity/llama/decor/lime.png"),
      akq.b("textures/entity/llama/decor/pink.png"),
      akq.b("textures/entity/llama/decor/gray.png"),
      akq.b("textures/entity/llama/decor/light_gray.png"),
      akq.b("textures/entity/llama/decor/cyan.png"),
      akq.b("textures/entity/llama/decor/purple.png"),
      akq.b("textures/entity/llama/decor/blue.png"),
      akq.b("textures/entity/llama/decor/brown.png"),
      akq.b("textures/entity/llama/decor/green.png"),
      akq.b("textures/entity/llama/decor/red.png"),
      akq.b("textures/entity/llama/decor/black.png")
   };
   private static final akq b = akq.b("textures/entity/llama/decor/trader_llama.png");
   private final fvx<chj> c;

   public goj(glz<chj, fvx<chj>> $$0, fya $$1) {
      super($$0);
      this.c = new fvx<>($$1.a(fyd.az));
   }

   public void a(fbc $$0, get $$1, int $$2, chj $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ctg $$10 = $$3.gz();
      akq $$11;
      if ($$10 != null) {
         $$11 = a[$$10.a()];
      } else {
         if (!$$3.gq()) {
            return;
         }

         $$11 = b;
      }

      this.c().a(this.c);
      this.c.a($$3, $$4, $$5, $$7, $$8, $$9);
      fbg $$14 = $$1.getBuffer(gfb.e($$11));
      this.c.a($$0, $$14, $$2, gpw.d);
   }
}
