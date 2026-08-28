public class grq extends grw<guk, fyc> {
   private static final alc[] a = new alc[]{
      alc.b("textures/entity/llama/decor/white.png"),
      alc.b("textures/entity/llama/decor/orange.png"),
      alc.b("textures/entity/llama/decor/magenta.png"),
      alc.b("textures/entity/llama/decor/light_blue.png"),
      alc.b("textures/entity/llama/decor/yellow.png"),
      alc.b("textures/entity/llama/decor/lime.png"),
      alc.b("textures/entity/llama/decor/pink.png"),
      alc.b("textures/entity/llama/decor/gray.png"),
      alc.b("textures/entity/llama/decor/light_gray.png"),
      alc.b("textures/entity/llama/decor/cyan.png"),
      alc.b("textures/entity/llama/decor/purple.png"),
      alc.b("textures/entity/llama/decor/blue.png"),
      alc.b("textures/entity/llama/decor/brown.png"),
      alc.b("textures/entity/llama/decor/green.png"),
      alc.b("textures/entity/llama/decor/red.png"),
      alc.b("textures/entity/llama/decor/black.png")
   };
   private static final alc b = alc.b("textures/entity/llama/decor/trader_llama.png");
   private final fyc c;
   private final fyc d;

   public grq(gpf<guk, fyc> $$0, gah $$1) {
      super($$0);
      this.c = new fyc($$1.a(gak.be));
      this.d = new fyc($$1.a(gak.bf));
   }

   public void a(fde $$0, ghg $$1, int $$2, guk $$3, float $$4, float $$5) {
      alc $$6;
      if ($$3.c != null) {
         $$6 = a[$$3.c.a()];
      } else {
         if (!$$3.d) {
            return;
         }

         $$6 = b;
      }

      fyc $$9 = $$3.ae ? this.d : this.c;
      $$9.a($$3);
      fdi $$10 = $$1.getBuffer(ghq.f($$6));
      $$9.a($$0, $$10, $$2, gws.d);
   }
}
