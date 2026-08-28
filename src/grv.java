public class grv extends gsb<gup, fyg> {
   private static final ale[] a = new ale[]{
      ale.b("textures/entity/llama/decor/white.png"),
      ale.b("textures/entity/llama/decor/orange.png"),
      ale.b("textures/entity/llama/decor/magenta.png"),
      ale.b("textures/entity/llama/decor/light_blue.png"),
      ale.b("textures/entity/llama/decor/yellow.png"),
      ale.b("textures/entity/llama/decor/lime.png"),
      ale.b("textures/entity/llama/decor/pink.png"),
      ale.b("textures/entity/llama/decor/gray.png"),
      ale.b("textures/entity/llama/decor/light_gray.png"),
      ale.b("textures/entity/llama/decor/cyan.png"),
      ale.b("textures/entity/llama/decor/purple.png"),
      ale.b("textures/entity/llama/decor/blue.png"),
      ale.b("textures/entity/llama/decor/brown.png"),
      ale.b("textures/entity/llama/decor/green.png"),
      ale.b("textures/entity/llama/decor/red.png"),
      ale.b("textures/entity/llama/decor/black.png")
   };
   private static final ale b = ale.b("textures/entity/llama/decor/trader_llama.png");
   private final fyg c;
   private final fyg d;

   public grv(gpk<gup, fyg> $$0, gam $$1) {
      super($$0);
      this.c = new fyg($$1.a(gap.be));
      this.d = new fyg($$1.a(gap.bf));
   }

   public void a(fdi $$0, ghl $$1, int $$2, gup $$3, float $$4, float $$5) {
      ale $$6;
      if ($$3.c != null) {
         $$6 = a[$$3.c.a()];
      } else {
         if (!$$3.d) {
            return;
         }

         $$6 = b;
      }

      fyg $$9 = $$3.ae ? this.d : this.c;
      $$9.a($$3);
      fdm $$10 = $$1.getBuffer(ghv.f($$6));
      $$9.a($$0, $$10, $$2, gwx.d);
   }
}
