public class fxe extends fxk<bwo, ffr<bwo>> {
   private static final aeu[] a = new aeu[]{
      new aeu("textures/entity/llama/decor/white.png"),
      new aeu("textures/entity/llama/decor/orange.png"),
      new aeu("textures/entity/llama/decor/magenta.png"),
      new aeu("textures/entity/llama/decor/light_blue.png"),
      new aeu("textures/entity/llama/decor/yellow.png"),
      new aeu("textures/entity/llama/decor/lime.png"),
      new aeu("textures/entity/llama/decor/pink.png"),
      new aeu("textures/entity/llama/decor/gray.png"),
      new aeu("textures/entity/llama/decor/light_gray.png"),
      new aeu("textures/entity/llama/decor/cyan.png"),
      new aeu("textures/entity/llama/decor/purple.png"),
      new aeu("textures/entity/llama/decor/blue.png"),
      new aeu("textures/entity/llama/decor/brown.png"),
      new aeu("textures/entity/llama/decor/green.png"),
      new aeu("textures/entity/llama/decor/red.png"),
      new aeu("textures/entity/llama/decor/black.png")
   };
   private static final aeu b = new aeu("textures/entity/llama/decor/trader_llama.png");
   private final ffr<bwo> c;

   public fxe(fux<bwo, ffr<bwo>> $$0, fht $$1) {
      super($$0);
      this.c = new ffr<>($$1.a(fhw.as));
   }

   public void a(elk $$0, fnz $$1, int $$2, bwo $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cho $$10 = $$3.gn();
      aeu $$11;
      if ($$10 != null) {
         $$11 = a[$$10.a()];
      } else {
         if (!$$3.gj()) {
            return;
         }

         $$11 = b;
      }

      this.c().a(this.c);
      this.c.a($$3, $$4, $$5, $$7, $$8, $$9);
      elo $$14 = $$1.getBuffer(foh.e($$11));
      this.c.a($$0, $$14, $$2, fyq.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
