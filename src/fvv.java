public class fvv extends fti<cda> {
   public static final aey a = new aey("textures/entity/trident.png");
   private final fhk f;

   public fvv(ftj.a $$0) {
      super($$0);
      this.f = new fhk($$0.a(fid.bC));
   }

   public void a(cda $$0, float $$1, float $$2, elr $$3, fog $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(ary.i($$2, $$0.N, $$0.dB()) - 90.0F));
      $$3.a(a.f.rotationDegrees(ary.i($$2, $$0.O, $$0.dD()) + 90.0F));
      elv $$6 = fuh.c($$4, this.f.a(this.a($$0)), false, $$0.F());
      this.f.a($$3, $$6, $$5, fyx.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aey a(cda $$0) {
      return a;
   }
}
