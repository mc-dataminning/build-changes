public class grt extends gqy<chg, gyf, gbu> {
   private static final akv a = akv.b("textures/entity/dolphin.png");

   public grt(gse.a $$0) {
      super($$0, new gbu($$0.a(gfc.ap)), new gbu($$0.a(gfc.aq)), 0.7F);
      this.a(new gvz(this));
   }

   public akv a(gyf $$0) {
      return a;
   }

   public gyf a() {
      return new gyf();
   }

   public void a(chg $$0, gyf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gyz.a($$0, $$1, this.i);
      $$1.a = $$0.dy().j() > 1.0E-7;
   }
}
