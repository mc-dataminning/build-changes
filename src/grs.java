public class grs extends gqx<chf, gye, gbt> {
   private static final akv a = akv.b("textures/entity/dolphin.png");

   public grs(gsd.a $$0) {
      super($$0, new gbt($$0.a(gfb.ap)), new gbt($$0.a(gfb.aq)), 0.7F);
      this.a(new gvy(this));
   }

   public akv a(gye $$0) {
      return a;
   }

   public gye a() {
      return new gye();
   }

   public void a(chf $$0, gye $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gyy.a($$0, $$1, this.i);
      $$1.a = $$0.dy().j() > 1.0E-7;
   }
}
