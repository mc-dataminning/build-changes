public class ghd extends ghj<cdi, fow<cdi>> {
   private static final ajh[] a = new ajh[]{
      new ajh("textures/entity/llama/decor/white.png"),
      new ajh("textures/entity/llama/decor/orange.png"),
      new ajh("textures/entity/llama/decor/magenta.png"),
      new ajh("textures/entity/llama/decor/light_blue.png"),
      new ajh("textures/entity/llama/decor/yellow.png"),
      new ajh("textures/entity/llama/decor/lime.png"),
      new ajh("textures/entity/llama/decor/pink.png"),
      new ajh("textures/entity/llama/decor/gray.png"),
      new ajh("textures/entity/llama/decor/light_gray.png"),
      new ajh("textures/entity/llama/decor/cyan.png"),
      new ajh("textures/entity/llama/decor/purple.png"),
      new ajh("textures/entity/llama/decor/blue.png"),
      new ajh("textures/entity/llama/decor/brown.png"),
      new ajh("textures/entity/llama/decor/green.png"),
      new ajh("textures/entity/llama/decor/red.png"),
      new ajh("textures/entity/llama/decor/black.png")
   };
   private static final ajh b = new ajh("textures/entity/llama/decor/trader_llama.png");
   private final fow<cdi> c;

   public ghd(get<cdi, fow<cdi>> $$0, fqz $$1) {
      super($$0);
      this.c = new fow<>($$1.a(frc.au));
   }

   public void a(etz $$0, fxq $$1, int $$2, cdi $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cpb $$10 = $$3.gA();
      ajh $$11;
      if ($$10 != null) {
         $$11 = a[$$10.a()];
      } else {
         if (!$$3.gw()) {
            return;
         }

         $$11 = b;
      }

      this.c().a(this.c);
      this.c.a($$3, $$4, $$5, $$7, $$8, $$9);
      eud $$14 = $$1.getBuffer(fxy.e($$11));
      this.c.a($$0, $$14, $$2, giq.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
