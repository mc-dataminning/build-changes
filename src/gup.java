public class gup extends gqy<cml, hal, gef> {
   private static final akv a = akv.b("textures/entity/strider/strider.png");
   private static final akv b = akv.b("textures/entity/strider/strider_cold.png");
   private static final float k = 0.5F;

   public gup(gse.a $$0) {
      super($$0, new gef($$0.a(gfc.dd)), new gef($$0.a(gfc.df)), 0.5F);
      this.a(new gwu<>(this, new gef($$0.a(gfc.de)), new gef($$0.a(gfc.dg)), akv.b("textures/entity/strider/strider_saddle.png")));
   }

   public akv a(hal $$0) {
      return $$0.b ? b : a;
   }

   protected float b(hal $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.5F : $$1;
   }

   public hal b() {
      return new hal();
   }

   public void a(cml $$0, hal $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j();
      $$1.b = $$0.p();
      $$1.c = $$0.ca();
   }

   protected boolean c(hal $$0) {
      return super.a($$0) || $$0.b;
   }
}
