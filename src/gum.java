public class gum extends gsr<cne, hab, gdw> {
   private static final alp a = alp.b("textures/entity/witch.png");

   public gum(grl.a $$0) {
      super($$0, new gdw($$0.a(gei.dz)), 0.5F);
      this.a(new gwm(this, $$0.b()));
   }

   public alp a(hab $$0) {
      return a;
   }

   public hab b() {
      return new hab();
   }

   public void a(cne $$0, hab $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.ar();
      $$1.b = !$$0.eZ().f();
   }
}
