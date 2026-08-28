public class glj extends giv<cob> {
   public static final ale a = new ale("textures/entity/trident.png");
   private final fwe f;

   public glj(giw.a $$0) {
      super($$0);
      this.f = new fwe($$0.a(fwy.bI));
   }

   public void a(cob $$0, float $$1, float $$2, ezx $$3, gdn $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(ayy.i($$2, $$0.O, $$0.dF()) - 90.0F));
      $$3.a(a.f.rotationDegrees(ayy.i($$2, $$0.P, $$0.dH()) + 90.0F));
      fab $$6 = gju.c($$4, this.f.a(this.a($$0)), false, $$0.H());
      this.f.a($$3, $$6, $$5, gop.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ale a(cob $$0) {
      return a;
   }
}
