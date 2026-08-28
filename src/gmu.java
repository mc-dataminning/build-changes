public class gmu extends glj<cgc, fuw<cgc>> {
   private final fuw<cgc> a = this.a();
   private final fuw<cgc> i;
   private static final akq j = akq.b("textures/entity/fish/tropical_a.png");
   private static final akq k = akq.b("textures/entity/fish/tropical_b.png");

   public gmu(gkd.a $$0) {
      super($$0, new fxk<>($$0.a(fyd.bM)), 0.15F);
      this.i = new fxl<>($$0.a(fyd.bK));
      this.a(new goz(this, $$0.f()));
   }

   public akq a(cgc $$0) {
      return switch ($$0.gx().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(cgc $$0, float $$1, float $$2, fbc $$3, get $$4, int $$5) {
      fuw<cgc> $$6 = switch ($$0.gx().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      $$6.a($$0.gv().d());
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(-1);
   }

   protected void a(cgc $$0, fbc $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * ayn.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.bf()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
