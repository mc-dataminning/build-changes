public class ghg extends ghm<cdj, foy<cdj>> {
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
   private final foy<cdj> c;

   public ghg(gew<cdj, foy<cdj>> $$0, frb $$1) {
      super($$0);
      this.c = new foy<>($$1.a(fre.ay));
   }

   public void a(eub $$0, fxs $$1, int $$2, cdj $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cpd $$10 = $$3.gA();
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
      euf $$14 = $$1.getBuffer(fya.e($$11));
      this.c.a($$0, $$14, $$2, git.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
