public class fum extends fti<ccn> {
   private static final aey a = new aey("textures/entity/llama/spit.png");
   private final ffz<ccn> f;

   public fum(ftj.a $$0) {
      super($$0);
      this.f = new ffz<>($$0.a(fid.at));
   }

   public void a(ccn $$0, float $$1, float $$2, elr $$3, fog $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(ary.i($$2, $$0.N, $$0.dB()) - 90.0F));
      $$3.a(a.f.rotationDegrees(ary.i($$2, $$0.O, $$0.dD())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      elv $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, fyx.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aey a(ccn $$0) {
      return a;
   }
}
