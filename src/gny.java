public class gny extends gou<ckx, gub, fxt> {
   private static final ale a = ale.b("textures/entity/ghast/ghast.png");
   private static final ale b = ale.b("textures/entity/ghast/ghast_shooting.png");

   public gny(gno.a $$0) {
      super($$0, new fxt($$0.a(gap.aD)), 1.5F);
   }

   public ale a(gub $$0) {
      return $$0.a ? b : a;
   }

   public gub c() {
      return new gub();
   }

   public void a(ckx $$0, gub $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q();
   }
}
