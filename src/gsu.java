public class gsu extends gqu<cng> {
   private static final akv a = akv.b("textures/entity/hoglin/hoglin.png");

   public gsu(gsf.a $$0) {
      super($$0, gfd.ba, gfd.bb, 0.7F);
   }

   public akv a(gyz $$0) {
      return a;
   }

   public void a(cng $$0, gyz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gs();
   }

   protected boolean b(gyz $$0) {
      return super.a($$0) || $$0.b;
   }
}
