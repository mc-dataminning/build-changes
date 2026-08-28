public class gmd extends gne<cku, fte<cku>> {
   private static final alb a = new alb("textures/entity/breeze/breeze_wind.png");
   private static final fte<cku> b = new fte<>(fte.a(128, 128).a());

   public gmd(gko<cku, fte<cku>> $$0) {
      super($$0);
   }

   public void a(ezt $$0, gdj $$1, int $$2, cku $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      float $$10 = (float)$$3.ai + $$6;
      ezx $$11 = $$1.getBuffer(gdr.a(a, this.a($$10) % 1.0F, 0.0F));
      b.a($$3, $$4, $$5, $$7, $$8, $$9);
      ghy.a(b, b.e()).a($$0, $$11, $$2, gol.d, 1.0F, 1.0F, 1.0F, 1.0F);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
