public class hbv extends hcw<hec, ghg> {
   private static final ali a = ali.b("textures/entity/breeze/breeze_wind.png");
   private final ghg b;

   public hbv(gyi.a $$0, haf<hec, ghg> $$1) {
      super($$1);
      this.b = new ghg($$0.a(gld.L));
   }

   public void a(flo $$0, gsa $$1, int $$2, hec $$3, float $$4, float $$5) {
      flr $$6 = $$1.getBuffer(gsl.a(a, this.a($$3.u) % 1.0F, 0.0F));
      this.b.a($$3);
      gxn.a(this.b, this.b.d()).a($$0, $$6, $$2, hkq.d);
   }

   private float a(float $$0) {
      return $$0 * 0.02F;
   }
}
