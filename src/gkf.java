public class gkf extends gjf<cil> {
   private static final akk a = new akk("textures/entity/lead_knot.png");
   private final fuz<cil> f;

   public gkf(gjg.a $$0) {
      super($$0);
      this.f = new fuz<>($$0.a(fxh.aw));
   }

   public void a(cil $$0, float $$1, float $$2, fag $$3, gdx $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      fak $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, goz.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akk a(cil $$0) {
      return a;
   }
}
