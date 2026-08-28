public class gqf extends gou<chd, gvv, fxo<gvv>> {
   private final fxo<gvv> a = this.e();
   private final fxo<gvv> b;
   private static final ale k = ale.b("textures/entity/fish/tropical_a.png");
   private static final ale l = ale.b("textures/entity/fish/tropical_b.png");

   public gqf(gno.a $$0) {
      super($$0, new fzv($$0.a(gap.cO)), 0.15F);
      this.b = new fzw($$0.a(gap.cM));
      this.a(new gsk(this, $$0.f()));
   }

   public ale a(gvv $$0) {
      return switch ($$0.a.a()) {
         case a -> k;
         case b -> l;
      };
   }

   public gvv c() {
      return new gvv();
   }

   public void a(chd $$0, gvv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gz();
      $$1.b = $$0.gx().d();
      $$1.c = $$0.gy().d();
   }

   public void a(gvv $$0, fdi $$1, ghl $$2, int $$3) {
      this.h = switch ($$0.a.a()) {
         case a -> this.a;
         case b -> this.b;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   protected int b(gvv $$0) {
      return $$0.b;
   }

   protected void a(gvv $$0, fdi $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azf.a(0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.af) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
