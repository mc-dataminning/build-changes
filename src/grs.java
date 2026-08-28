public class grs extends gnv<chw, gxj, gbj> {
   private static final all a = all.b("textures/entity/turtle/big_sea_turtle.png");

   public grs(gpa.a $$0) {
      super($$0, new gbj($$0.a(gcb.cQ)), new gbj($$0.a(gcb.cR)), 0.7F);
   }

   protected float a(gxj $$0) {
      float $$1 = super.g($$0);
      return $$0.ae ? $$1 * 0.83F : $$1;
   }

   public gxj c() {
      return new gxj();
   }

   public void a(chw $$0, gxj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = !$$0.bl() && $$0.aL();
      $$1.b = $$0.t();
      $$1.c = !$$0.p_() && $$0.q();
   }

   public all b(gxj $$0) {
      return a;
   }
}
