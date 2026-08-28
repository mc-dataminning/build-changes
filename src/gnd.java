public class gnd extends gmj<cgl, gtl, fxh> {
   private static final ale a = ale.b("textures/entity/dolphin.png");

   public gnd(gno.a $$0) {
      super($$0, new fxh($$0.a(gap.ab)), new fxh($$0.a(gap.ac)), 0.7F);
      this.a(new gri(this, $$0.b()));
   }

   public ale a(gtl $$0) {
      return a;
   }

   public gtl a() {
      return new gtl();
   }

   public void a(cgl $$0, gtl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dv().j() > 1.0E-7;
   }
}
