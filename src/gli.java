public class gli extends giu<coa> {
   public static final ale a = new ale("textures/entity/trident.png");
   private final fwd f;

   public gli(giv.a $$0) {
      super($$0);
      this.f = new fwd($$0.a(fwx.bI));
   }

   public void a(coa $$0, float $$1, float $$2, ezw $$3, gdm $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(ayx.i($$2, $$0.O, $$0.dF()) - 90.0F));
      $$3.a(a.f.rotationDegrees(ayx.i($$2, $$0.P, $$0.dH()) + 90.0F));
      faa $$6 = gjt.c($$4, this.f.a(this.a($$0)), false, $$0.H());
      this.f.a($$3, $$6, $$5, goo.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ale a(coa $$0) {
      return a;
   }
}
