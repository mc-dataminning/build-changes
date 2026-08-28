public class gqz extends grf<gtt, fxs> {
   private static final alb[] a = new alb[]{
      alb.b("textures/entity/llama/decor/white.png"),
      alb.b("textures/entity/llama/decor/orange.png"),
      alb.b("textures/entity/llama/decor/magenta.png"),
      alb.b("textures/entity/llama/decor/light_blue.png"),
      alb.b("textures/entity/llama/decor/yellow.png"),
      alb.b("textures/entity/llama/decor/lime.png"),
      alb.b("textures/entity/llama/decor/pink.png"),
      alb.b("textures/entity/llama/decor/gray.png"),
      alb.b("textures/entity/llama/decor/light_gray.png"),
      alb.b("textures/entity/llama/decor/cyan.png"),
      alb.b("textures/entity/llama/decor/purple.png"),
      alb.b("textures/entity/llama/decor/blue.png"),
      alb.b("textures/entity/llama/decor/brown.png"),
      alb.b("textures/entity/llama/decor/green.png"),
      alb.b("textures/entity/llama/decor/red.png"),
      alb.b("textures/entity/llama/decor/black.png")
   };
   private static final alb b = alb.b("textures/entity/llama/decor/trader_llama.png");
   private final fxs c;
   private final fxs d;

   public gqz(goo<gtt, fxs> $$0, fzx $$1) {
      super($$0);
      this.c = new fxs($$1.a(gaa.be));
      this.d = new fxs($$1.a(gaa.bf));
   }

   public void a(fcu $$0, ggv $$1, int $$2, gtt $$3, float $$4, float $$5) {
      alb $$6;
      if ($$3.c != null) {
         $$6 = a[$$3.c.a()];
      } else {
         if (!$$3.d) {
            return;
         }

         $$6 = b;
      }

      fxs $$9 = $$3.ae ? this.d : this.c;
      $$9.a($$3);
      fcy $$10 = $$1.getBuffer(ghe.f($$6));
      $$9.a($$0, $$10, $$2, gwb.d);
   }
}
