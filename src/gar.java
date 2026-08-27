public class gar extends fye<cgf> {
   public static final ahd a = new ahd("textures/entity/trident.png");
   private final flu f;

   public gar(fyf.a $$0) {
      super($$0);
      this.f = new flu($$0.a(fmo.bF));
   }

   public void a(cgf $$0, float $$1, float $$2, ept $$3, fsz $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(aui.i($$2, $$0.N, $$0.dC()) - 90.0F));
      $$3.a(a.f.rotationDegrees(aui.i($$2, $$0.O, $$0.dE()) + 90.0F));
      epx $$6 = fzd.c($$4, this.f.a(this.a($$0)), false, $$0.I());
      this.f.a($$3, $$6, $$5, gdw.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ahd a(cgf $$0) {
      return a;
   }
}
