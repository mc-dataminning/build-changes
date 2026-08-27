public class fwl extends fwr<bwk, ffd<bwk>> {
   private static final aep[] a = new aep[]{
      new aep("textures/entity/llama/decor/white.png"),
      new aep("textures/entity/llama/decor/orange.png"),
      new aep("textures/entity/llama/decor/magenta.png"),
      new aep("textures/entity/llama/decor/light_blue.png"),
      new aep("textures/entity/llama/decor/yellow.png"),
      new aep("textures/entity/llama/decor/lime.png"),
      new aep("textures/entity/llama/decor/pink.png"),
      new aep("textures/entity/llama/decor/gray.png"),
      new aep("textures/entity/llama/decor/light_gray.png"),
      new aep("textures/entity/llama/decor/cyan.png"),
      new aep("textures/entity/llama/decor/purple.png"),
      new aep("textures/entity/llama/decor/blue.png"),
      new aep("textures/entity/llama/decor/brown.png"),
      new aep("textures/entity/llama/decor/green.png"),
      new aep("textures/entity/llama/decor/red.png"),
      new aep("textures/entity/llama/decor/black.png")
   };
   private static final aep b = new aep("textures/entity/llama/decor/trader_llama.png");
   private final ffd<bwk> c;

   public fwl(fue<bwk, ffd<bwk>> $$0, fhf $$1) {
      super($$0);
      this.c = new ffd<>($$1.a(fhi.as));
   }

   public void a(elh $$0, fng $$1, int $$2, bwk $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      chk $$10 = $$3.gm();
      aep $$11;
      if ($$10 != null) {
         $$11 = a[$$10.a()];
      } else {
         if (!$$3.gi()) {
            return;
         }

         $$11 = b;
      }

      this.c().a(this.c);
      this.c.a($$3, $$4, $$5, $$7, $$8, $$9);
      ell $$14 = $$1.getBuffer(fno.d($$11));
      this.c.a($$0, $$14, $$2, fxx.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
