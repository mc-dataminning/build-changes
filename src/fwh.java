public class fwh extends fup<caa, fht<caa>> {
   private static final aey a = new aey("textures/entity/witch.png");

   public fwh(ftj.a $$0) {
      super($$0, new fht<>($$0.a(fid.bN)), 0.5F);
      this.a(new fye<>(this, $$0.d()));
   }

   public void a(caa $$0, float $$1, float $$2, elr $$3, fog $$4, int $$5) {
      this.f.b(!$$0.eS().b());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aey a(caa $$0) {
      return a;
   }

   protected void a(caa $$0, elr $$1, float $$2) {
      float $$3 = 0.9375F;
      $$1.b(0.9375F, 0.9375F, 0.9375F);
   }
}
