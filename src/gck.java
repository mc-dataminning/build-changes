public class gck extends gcq<bzu, fki<bzu>> {
   private static final ahd[] a = new ahd[]{
      new ahd("textures/entity/llama/decor/white.png"),
      new ahd("textures/entity/llama/decor/orange.png"),
      new ahd("textures/entity/llama/decor/magenta.png"),
      new ahd("textures/entity/llama/decor/light_blue.png"),
      new ahd("textures/entity/llama/decor/yellow.png"),
      new ahd("textures/entity/llama/decor/lime.png"),
      new ahd("textures/entity/llama/decor/pink.png"),
      new ahd("textures/entity/llama/decor/gray.png"),
      new ahd("textures/entity/llama/decor/light_gray.png"),
      new ahd("textures/entity/llama/decor/cyan.png"),
      new ahd("textures/entity/llama/decor/purple.png"),
      new ahd("textures/entity/llama/decor/blue.png"),
      new ahd("textures/entity/llama/decor/brown.png"),
      new ahd("textures/entity/llama/decor/green.png"),
      new ahd("textures/entity/llama/decor/red.png"),
      new ahd("textures/entity/llama/decor/black.png")
   };
   private static final ahd b = new ahd("textures/entity/llama/decor/trader_llama.png");
   private final fki<bzu> c;

   public gck(gaa<bzu, fki<bzu>> $$0, fml $$1) {
      super($$0);
      this.c = new fki<>($$1.a(fmo.av));
   }

   public void a(ept $$0, fsz $$1, int $$2, bzu $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      clf $$10 = $$3.gr();
      ahd $$11;
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
      epx $$14 = $$1.getBuffer(fth.e($$11));
      this.c.a($$0, $$14, $$2, gdw.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
