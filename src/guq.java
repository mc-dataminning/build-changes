public class guq extends gqz<cmm, ham, geg> {
   private static final akv a = akv.b("textures/entity/strider/strider.png");
   private static final akv b = akv.b("textures/entity/strider/strider_cold.png");
   private static final float k = 0.5F;

   public guq(gsf.a $$0) {
      super($$0, new geg($$0.a(gfd.dd)), new geg($$0.a(gfd.df)), 0.5F);
      this.a(new gwv<>(this, new geg($$0.a(gfd.de)), new geg($$0.a(gfd.dg)), akv.b("textures/entity/strider/strider_saddle.png")));
   }

   public akv a(ham $$0) {
      return $$0.b ? b : a;
   }

   protected float b(ham $$0) {
      float $$1 = super.g($$0);
      return $$0.aj ? $$1 * 0.5F : $$1;
   }

   public ham b() {
      return new ham();
   }

   public void a(cmm $$0, ham $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.j();
      $$1.b = $$0.p();
      $$1.c = $$0.ca();
   }

   protected boolean c(ham $$0) {
      return super.a($$0) || $$0.b;
   }
}
