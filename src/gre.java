public class gre extends gqj<cie, gxp, gbe> {
   private static final alz a = alz.b("textures/entity/dolphin.png");

   public gre(grp.a $$0) {
      super($$0, new gbe($$0.a(gem.am)), new gbe($$0.a(gem.an)), 0.7F);
      this.a(new gvk(this, $$0.b()));
   }

   public alz a(gxp $$0) {
      return a;
   }

   public gxp a() {
      return new gxp();
   }

   public void a(cie $$0, gxp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dz().j() > 1.0E-7;
   }
}
