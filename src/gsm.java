public class gsm extends gti<clr, gyt, gcf> {
   private static final aku a = aku.b("textures/entity/ghast/ghast.png");
   private static final aku b = aku.b("textures/entity/ghast/ghast_shooting.png");

   public gsm(gsc.a $$0) {
      super($$0, new gcf($$0.a(gfb.aR)), 1.5F);
   }

   public aku a(gyt $$0) {
      return $$0.a ? b : a;
   }

   public gyt b() {
      return new gyt();
   }

   public void a(clr $$0, gyt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.m();
   }
}
