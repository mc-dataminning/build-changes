public class grd extends gqi<cie, gxo, gbd> {
   private static final alz a = alz.b("textures/entity/dolphin.png");

   public grd(gro.a $$0) {
      super($$0, new gbd($$0.a(gel.am)), new gbd($$0.a(gel.an)), 0.7F);
      this.a(new gvj(this, $$0.b()));
   }

   public alz a(gxo $$0) {
      return a;
   }

   public gxo a() {
      return new gxo();
   }

   public void a(cie $$0, gxo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.dy().j() > 1.0E-7;
   }
}
