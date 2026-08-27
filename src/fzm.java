public class fzm extends fzs<byl, fhv<byl>> {
   private static final agg[] a = new agg[]{
      new agg("textures/entity/llama/decor/white.png"),
      new agg("textures/entity/llama/decor/orange.png"),
      new agg("textures/entity/llama/decor/magenta.png"),
      new agg("textures/entity/llama/decor/light_blue.png"),
      new agg("textures/entity/llama/decor/yellow.png"),
      new agg("textures/entity/llama/decor/lime.png"),
      new agg("textures/entity/llama/decor/pink.png"),
      new agg("textures/entity/llama/decor/gray.png"),
      new agg("textures/entity/llama/decor/light_gray.png"),
      new agg("textures/entity/llama/decor/cyan.png"),
      new agg("textures/entity/llama/decor/purple.png"),
      new agg("textures/entity/llama/decor/blue.png"),
      new agg("textures/entity/llama/decor/brown.png"),
      new agg("textures/entity/llama/decor/green.png"),
      new agg("textures/entity/llama/decor/red.png"),
      new agg("textures/entity/llama/decor/black.png")
   };
   private static final agg b = new agg("textures/entity/llama/decor/trader_llama.png");
   private final fhv<byl> c;

   public fzm(fxf<byl, fhv<byl>> $$0, fjx $$1) {
      super($$0);
      this.c = new fhv<>($$1.a(fka.as));
   }

   public void a(enk $$0, fqh $$1, int $$2, byl $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cjp $$10 = $$3.gr();
      agg $$11;
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
      eno $$14 = $$1.getBuffer(fqp.e($$11));
      this.c.a($$0, $$14, $$2, gay.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
