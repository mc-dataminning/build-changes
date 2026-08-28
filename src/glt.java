public class glt extends gjf<cnm> {
   public static final akk a = new akk("textures/entity/trident.png");
   private final fwn f;

   public glt(gjg.a $$0) {
      super($$0);
      this.f = new fwn($$0.a(fxh.bI));
   }

   public void a(cnm $$0, float $$1, float $$2, fag $$3, gdx $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(aye.i($$2, $$0.O, $$0.dF()) - 90.0F));
      $$3.a(a.f.rotationDegrees(aye.i($$2, $$0.P, $$0.dH()) + 90.0F));
      fak $$6 = gke.c($$4, this.f.a(this.a($$0)), false, $$0.H());
      this.f.a($$3, $$6, $$5, goz.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akk a(cnm $$0) {
      return a;
   }
}
