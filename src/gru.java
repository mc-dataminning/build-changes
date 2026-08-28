public class gru extends gqz<chh, gyg, gbv> {
   private static final akv a = akv.b("textures/entity/dolphin.png");

   public gru(gsf.a $$0) {
      super($$0, new gbv($$0.a(gfd.ap)), new gbv($$0.a(gfd.aq)), 0.7F);
      this.a(new gwa(this));
   }

   public akv a(gyg $$0) {
      return a;
   }

   public gyg a() {
      return new gyg();
   }

   public void a(chh $$0, gyg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gza.a($$0, $$1, this.i);
      $$1.a = $$0.dy().j() > 1.0E-7;
   }
}
