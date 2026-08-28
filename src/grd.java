public class grd extends gqq<chr, gxb, fzj<gvo>> {
   private static final alj a = alj.b("textures/entity/fish/pufferfish.png");
   private final fzj<gvo> b;
   private final fzj<gvo> k;
   private final fzj<gvo> l = this.c();

   public grd(gpk.a $$0) {
      super($$0, new gaq($$0.a(gck.ck)), 0.2F);
      this.k = new gar($$0.a(gck.cl));
      this.b = new gas($$0.a(gck.cm));
   }

   public alj a(gxb $$0) {
      return a;
   }

   public gxb b() {
      return new gxb();
   }

   public void a(gxb $$0, fer $$1, gjg $$2, int $$3) {
      this.h = switch ($$0.a) {
         case 0 -> this.b;
         case 1 -> this.k;
         default -> this.l;
      };
      this.f = 0.1F + 0.1F * (float)$$0.a;
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(chr $$0, gxb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.go();
   }

   protected void a(gxb $$0, fer $$1, float $$2, float $$3) {
      $$1.a(0.0F, azm.b($$0.p * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3);
   }
}
