public class fzz extends gaf<byt, fii<byt>> {
   private static final agi[] a = new agi[]{
      new agi("textures/entity/llama/decor/white.png"),
      new agi("textures/entity/llama/decor/orange.png"),
      new agi("textures/entity/llama/decor/magenta.png"),
      new agi("textures/entity/llama/decor/light_blue.png"),
      new agi("textures/entity/llama/decor/yellow.png"),
      new agi("textures/entity/llama/decor/lime.png"),
      new agi("textures/entity/llama/decor/pink.png"),
      new agi("textures/entity/llama/decor/gray.png"),
      new agi("textures/entity/llama/decor/light_gray.png"),
      new agi("textures/entity/llama/decor/cyan.png"),
      new agi("textures/entity/llama/decor/purple.png"),
      new agi("textures/entity/llama/decor/blue.png"),
      new agi("textures/entity/llama/decor/brown.png"),
      new agi("textures/entity/llama/decor/green.png"),
      new agi("textures/entity/llama/decor/red.png"),
      new agi("textures/entity/llama/decor/black.png")
   };
   private static final agi b = new agi("textures/entity/llama/decor/trader_llama.png");
   private final fii<byt> c;

   public fzz(fxs<byt, fii<byt>> $$0, fkk $$1) {
      super($$0);
      this.c = new fii<>($$1.a(fkn.as));
   }

   public void a(enw $$0, fqu $$1, int $$2, byt $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cjx $$10 = $$3.gs();
      agi $$11;
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
      eoa $$14 = $$1.getBuffer(frc.e($$11));
      this.c.a($$0, $$14, $$2, gbl.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
