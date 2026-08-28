public class gkn extends gjn<cip> {
   private static final akk a = new akk("textures/entity/lead_knot.png");
   private final fvh<cip> f;

   public gkn(gjo.a $$0) {
      super($$0);
      this.f = new fvh<>($$0.a(fxp.aw));
   }

   public void a(cip $$0, float $$1, float $$2, fao $$3, gef $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      fas $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gph.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akk a(cip $$0) {
      return a;
   }
}
