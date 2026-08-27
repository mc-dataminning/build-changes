public class gbt extends gbz<bzk, fjr<bzk>> {
   private static final agt[] a = new agt[]{
      new agt("textures/entity/llama/decor/white.png"),
      new agt("textures/entity/llama/decor/orange.png"),
      new agt("textures/entity/llama/decor/magenta.png"),
      new agt("textures/entity/llama/decor/light_blue.png"),
      new agt("textures/entity/llama/decor/yellow.png"),
      new agt("textures/entity/llama/decor/lime.png"),
      new agt("textures/entity/llama/decor/pink.png"),
      new agt("textures/entity/llama/decor/gray.png"),
      new agt("textures/entity/llama/decor/light_gray.png"),
      new agt("textures/entity/llama/decor/cyan.png"),
      new agt("textures/entity/llama/decor/purple.png"),
      new agt("textures/entity/llama/decor/blue.png"),
      new agt("textures/entity/llama/decor/brown.png"),
      new agt("textures/entity/llama/decor/green.png"),
      new agt("textures/entity/llama/decor/red.png"),
      new agt("textures/entity/llama/decor/black.png")
   };
   private static final agt b = new agt("textures/entity/llama/decor/trader_llama.png");
   private final fjr<bzk> c;

   public gbt(fzj<bzk, fjr<bzk>> $$0, flu $$1) {
      super($$0);
      this.c = new fjr<>($$1.a(flx.av));
   }

   public void a(epd $$0, fsi $$1, int $$2, bzk $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ckv $$10 = $$3.gr();
      agt $$11;
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
      eph $$14 = $$1.getBuffer(fsq.e($$11));
      this.c.a($$0, $$14, $$2, gdf.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
