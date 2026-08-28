public class gxx extends gwx<cnl, hdf> {
   private static final alg a = alg.b("textures/entity/lead_knot.png");
   private final ghh g;

   public gxx(gwy.a $$0) {
      super($$0);
      this.g = new ghh($$0.a(gjs.bD));
   }

   @Override
   public void a(hdf $$0, fkd $$1, gqr $$2, int $$3) {
      $$1.a();
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.g.a($$0);
      fkh $$4 = $$2.getBuffer(this.g.a(a));
      this.g.a($$1, $$4, $$3, hjg.d);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public hdf d() {
      return new hdf();
   }
}
