public class gdm extends gaz<ciq> {
   public static final aiy a = new aiy("textures/entity/trident.png");
   private final fon f;

   public gdm(gba.a $$0) {
      super($$0);
      this.f = new fon($$0.a(fpi.bE));
   }

   public void a(ciq $$0, float $$1, float $$2, esh $$3, fvt $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(awi.i($$2, $$0.M, $$0.dC()) - 90.0F));
      $$3.a(a.f.rotationDegrees(awi.i($$2, $$0.N, $$0.dE()) + 90.0F));
      esl $$6 = gby.c($$4, this.f.a(this.a($$0)), false, $$0.H());
      this.f.a($$3, $$6, $$5, ggs.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aiy a(ciq $$0) {
      return a;
   }
}
