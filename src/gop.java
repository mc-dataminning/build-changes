public class gop extends gov<chl, fwd<chl>> {
   private static final akr[] a = new akr[]{
      akr.b("textures/entity/llama/decor/white.png"),
      akr.b("textures/entity/llama/decor/orange.png"),
      akr.b("textures/entity/llama/decor/magenta.png"),
      akr.b("textures/entity/llama/decor/light_blue.png"),
      akr.b("textures/entity/llama/decor/yellow.png"),
      akr.b("textures/entity/llama/decor/lime.png"),
      akr.b("textures/entity/llama/decor/pink.png"),
      akr.b("textures/entity/llama/decor/gray.png"),
      akr.b("textures/entity/llama/decor/light_gray.png"),
      akr.b("textures/entity/llama/decor/cyan.png"),
      akr.b("textures/entity/llama/decor/purple.png"),
      akr.b("textures/entity/llama/decor/blue.png"),
      akr.b("textures/entity/llama/decor/brown.png"),
      akr.b("textures/entity/llama/decor/green.png"),
      akr.b("textures/entity/llama/decor/red.png"),
      akr.b("textures/entity/llama/decor/black.png")
   };
   private static final akr b = akr.b("textures/entity/llama/decor/trader_llama.png");
   private final fwd<chl> c;

   public gop(gmf<chl, fwd<chl>> $$0, fyg $$1) {
      super($$0);
      this.c = new fwd<>($$1.a(fyj.az));
   }

   public void a(fbi $$0, gez $$1, int $$2, chl $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cti $$10 = $$3.gw();
      akr $$11;
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
      fbm $$14 = $$1.getBuffer(gfh.e($$11));
      this.c.a($$0, $$14, $$2, gqc.d);
   }
}
