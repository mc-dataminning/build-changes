public class gnt extends gop<cku, gtw, fxp> {
   private static final alc a = alc.b("textures/entity/ghast/ghast.png");
   private static final alc b = alc.b("textures/entity/ghast/ghast_shooting.png");

   public gnt(gnj.a $$0) {
      super($$0, new fxp($$0.a(gak.aD)), 1.5F);
   }

   public alc a(gtw $$0) {
      return $$0.a ? b : a;
   }

   public gtw c() {
      return new gtw();
   }

   public void a(cku $$0, gtw $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q();
   }
}
