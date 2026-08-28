public class gpc extends gop<cgt, guy, fxk<gtl>> {
   private static final alc a = alc.b("textures/entity/fish/pufferfish.png");
   private final fxk<gtl> b;
   private final fxk<gtl> k;
   private final fxk<gtl> l = this.e();

   public gpc(gnj.a $$0) {
      super($$0, new fyr($$0.a(gak.bU)), 0.2F);
      this.k = new fys($$0.a(gak.bV));
      this.b = new fyt($$0.a(gak.bW));
   }

   public alc a(guy $$0) {
      return a;
   }

   public guy c() {
      return new guy();
   }

   public void a(guy $$0, fde $$1, ghg $$2, int $$3) {
      this.h = switch ($$0.a) {
         case 0 -> this.b;
         case 1 -> this.k;
         default -> this.l;
      };
      this.f = 0.1F + 0.1F * (float)$$0.a;
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(cgt $$0, guy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gr();
   }

   protected void a(guy $$0, fde $$1, float $$2, float $$3) {
      $$1.a(0.0F, azd.b($$0.p * 0.05F) * 0.08F, 0.0F);
      super.a($$0, $$1, $$2, $$3);
   }
}
