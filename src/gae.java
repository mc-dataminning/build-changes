public class gae extends gak<byy, fin<byy>> {
   private static final agm[] a = new agm[]{
      new agm("textures/entity/llama/decor/white.png"),
      new agm("textures/entity/llama/decor/orange.png"),
      new agm("textures/entity/llama/decor/magenta.png"),
      new agm("textures/entity/llama/decor/light_blue.png"),
      new agm("textures/entity/llama/decor/yellow.png"),
      new agm("textures/entity/llama/decor/lime.png"),
      new agm("textures/entity/llama/decor/pink.png"),
      new agm("textures/entity/llama/decor/gray.png"),
      new agm("textures/entity/llama/decor/light_gray.png"),
      new agm("textures/entity/llama/decor/cyan.png"),
      new agm("textures/entity/llama/decor/purple.png"),
      new agm("textures/entity/llama/decor/blue.png"),
      new agm("textures/entity/llama/decor/brown.png"),
      new agm("textures/entity/llama/decor/green.png"),
      new agm("textures/entity/llama/decor/red.png"),
      new agm("textures/entity/llama/decor/black.png")
   };
   private static final agm b = new agm("textures/entity/llama/decor/trader_llama.png");
   private final fin<byy> c;

   public gae(fxx<byy, fin<byy>> $$0, fkp $$1) {
      super($$0);
      this.c = new fin<>($$1.a(fks.as));
   }

   public void a(eob $$0, fqz $$1, int $$2, byy $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      ckc $$10 = $$3.gs();
      agm $$11;
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
      eof $$14 = $$1.getBuffer(frh.e($$11));
      this.c.a($$0, $$14, $$2, gbq.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }
}
