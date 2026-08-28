public class grz extends goz<cqa, gvd> {
   private static final all a = all.b("textures/entity/projectiles/wind_charge.png");
   private final gbo b;

   public grz(gpa.a $$0) {
      super($$0);
      this.b = new gbo($$0.a(gcb.cX));
   }

   @Override
   public void a(gvd $$0, fek $$1, gix $$2, int $$3) {
      feo $$4 = $$2.getBuffer(gjh.a(a, this.a($$0.p) % 1.0F, 0.0F));
      this.b.a($$0);
      this.b.a($$1, $$4, $$3, gyk.d);
      super.a($$0, $$1, $$2, $$3);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   @Override
   public gvd b() {
      return new gvd();
   }
}
