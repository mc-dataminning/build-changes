public class gsm extends gtn<gus, fyl> {
   private static final all a = all.b("textures/entity/breeze/breeze_wind.png");
   private final fyl b;

   public gsm(gpa.a $$0, gqw<gus, fyl> $$1) {
      super($$1);
      this.b = new fyl($$0.a(gcb.C));
   }

   public void a(fek $$0, gix $$1, int $$2, gus $$3, float $$4, float $$5) {
      feo $$6 = $$1.getBuffer(gjh.a(a, this.a($$3.p) % 1.0F, 0.0F));
      this.b.a($$3);
      gog.a(this.b, this.b.d()).a($$0, $$6, $$2, gyk.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
