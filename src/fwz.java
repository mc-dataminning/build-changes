public class fwz extends fxf<bwl, ffm<bwl>> {
   private static final aer[] a = new aer[]{
      new aer("textures/entity/llama/decor/white.png"),
      new aer("textures/entity/llama/decor/orange.png"),
      new aer("textures/entity/llama/decor/magenta.png"),
      new aer("textures/entity/llama/decor/light_blue.png"),
      new aer("textures/entity/llama/decor/yellow.png"),
      new aer("textures/entity/llama/decor/lime.png"),
      new aer("textures/entity/llama/decor/pink.png"),
      new aer("textures/entity/llama/decor/gray.png"),
      new aer("textures/entity/llama/decor/light_gray.png"),
      new aer("textures/entity/llama/decor/cyan.png"),
      new aer("textures/entity/llama/decor/purple.png"),
      new aer("textures/entity/llama/decor/blue.png"),
      new aer("textures/entity/llama/decor/brown.png"),
      new aer("textures/entity/llama/decor/green.png"),
      new aer("textures/entity/llama/decor/red.png"),
      new aer("textures/entity/llama/decor/black.png")
   };
   private static final aer b = new aer("textures/entity/llama/decor/trader_llama.png");
   private final ffm<bwl> c;

   public fwz(fus<bwl, ffm<bwl>> $$0, fho $$1) {
      super($$0);
      this.c = new ffm<>($$1.a(fhr.as));
   }

   public void a(elf $$0, fnu $$1, int $$2, bwl $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      chl $$10 = $$3.gn();
      aer $$11;
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
      elj $$14 = $$1.getBuffer(foc.e($$11));
      this.c.a($$0, $$14, $$2, fyl.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
