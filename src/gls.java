public class gls extends gke<cks, fwk> {
   private static final alf a = new alf("textures/entity/illager/vex.png");
   private static final alf i = new alf("textures/entity/illager/vex_charging.png");

   public gls(giy.a $$0) {
      super($$0, new fwk($$0.a(fxa.bO)), 0.3F);
      this.a(new gnd<>(this, $$0.d()));
   }

   protected int a(cks $$0, iz $$1) {
      return 15;
   }

   public alf a(cks $$0) {
      return $$0.gr() ? i : a;
   }
}
