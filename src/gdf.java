public class gdf extends gdl<cah, flc<cah>> {
   private static final ahh[] a = new ahh[]{
      new ahh("textures/entity/llama/decor/white.png"),
      new ahh("textures/entity/llama/decor/orange.png"),
      new ahh("textures/entity/llama/decor/magenta.png"),
      new ahh("textures/entity/llama/decor/light_blue.png"),
      new ahh("textures/entity/llama/decor/yellow.png"),
      new ahh("textures/entity/llama/decor/lime.png"),
      new ahh("textures/entity/llama/decor/pink.png"),
      new ahh("textures/entity/llama/decor/gray.png"),
      new ahh("textures/entity/llama/decor/light_gray.png"),
      new ahh("textures/entity/llama/decor/cyan.png"),
      new ahh("textures/entity/llama/decor/purple.png"),
      new ahh("textures/entity/llama/decor/blue.png"),
      new ahh("textures/entity/llama/decor/brown.png"),
      new ahh("textures/entity/llama/decor/green.png"),
      new ahh("textures/entity/llama/decor/red.png"),
      new ahh("textures/entity/llama/decor/black.png")
   };
   private static final ahh b = new ahh("textures/entity/llama/decor/trader_llama.png");
   private final flc<cah> c;

   public gdf(gav<cah, flc<cah>> $$0, fnf $$1) {
      super($$0);
      this.c = new flc<>($$1.a(fni.au));
   }

   public void a(eqk $$0, ftt $$1, int $$2, cah $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      clv $$10 = $$3.gs();
      ahh $$11;
      if ($$10 != null) {
         $$11 = a[$$10.a()];
      } else {
         if (!$$3.go()) {
            return;
         }

         $$11 = b;
      }

      this.c().a(this.c);
      this.c.a($$3, $$4, $$5, $$7, $$8, $$9);
      eqo $$14 = $$1.getBuffer(fub.e($$11));
      this.c.a($$0, $$14, $$2, ges.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
