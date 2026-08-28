public class gra extends gqf<chw, gxl, gba> {
   private static final alp a = alp.b("textures/entity/dolphin.png");

   public gra(grl.a $$0) {
      super($$0, new gba($$0.a(gei.ap)), new gba($$0.a(gei.aq)), 0.7F);
      this.a(new gvg(this, $$0.b()));
   }

   public alp a(gxl $$0) {
      return a;
   }

   public gxl a() {
      return new gxl();
   }

   public void a(chw $$0, gxl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dz().j() > 1.0E-7;
   }
}
