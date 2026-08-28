public class gtj extends gsw<ciq, gzi, gbm<gxv>> {
   private static final alz a = alz.b("textures/entity/fish/pufferfish.png");
   private final gbm<gxv> b;
   private final gbm<gxv> k;
   private final gbm<gxv> l = this.c();

   public gtj(grq.a $$0) {
      super($$0, new gct($$0.a(gen.cn)), 0.2F);
      this.k = new gcu($$0.a(gen.co));
      this.b = new gcv($$0.a(gen.cp));
   }

   public alz a(gzi $$0) {
      return a;
   }

   public gzi b() {
      return new gzi();
   }

   public void a(gzi $$0, fgs $$1, gll $$2, int $$3) {
      this.h = switch ($$0.a) {
         case 0 -> this.b;
         case 1 -> this.k;
         default -> this.l;
      };
      this.f = 0.1F + 0.1F * (float)$$0.a;
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(ciq $$0, gzi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gp();
   }

   protected void a(gzi $$0, fgs $$1, float $$2, float $$3) {
      $$1.a(0.0F, bae.b($$0.p * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3);
   }
}
