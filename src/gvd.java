public class gvd extends gwf<gxj, gaw> {
   private static final alz a = alz.b("textures/entity/breeze/breeze_wind.png");
   private final gaw b;

   public gvd(grq.a $$0, gtn<gxj, gaw> $$1) {
      super($$1);
      this.b = new gaw($$0.a(gen.I));
   }

   public void a(fgs $$0, gll $$1, int $$2, gxj $$3, float $$4, float $$5) {
      fgw $$6 = $$1.getBuffer(glv.a(a, this.a($$3.p) % 1.0F, 0.0F));
      this.b.a($$3);
      gqv.a(this.b, this.b.d()).a($$0, $$6, $$2, hbc.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
