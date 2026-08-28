public class gux extends gtl<chz, has, gcc<has>> {
   private final gcc<has> a = this.c();
   private final gcc<has> b;
   private static final akv k = akv.b("textures/entity/fish/tropical_a.png");
   private static final akv l = akv.b("textures/entity/fish/tropical_b.png");

   public gux(gsf.a $$0) {
      super($$0, new gej($$0.a(gfd.do)), 0.15F);
      this.b = new gek($$0.a(gfd.dm));
      this.a(new gxd(this, $$0.f()));
   }

   public akv a(has $$0) {
      return switch ($$0.a.a()) {
         case a -> k;
         case b -> l;
      };
   }

   public has b() {
      return new has();
   }

   public void a(chz $$0, has $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gC();
      $$1.b = $$0.gA().d();
      $$1.c = $$0.gB().d();
   }

   public void a(has $$0, ffv $$1, glz $$2, int $$3) {
      this.h = switch ($$0.a.a()) {
         case a -> this.a;
         case b -> this.b;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   protected int b(has $$0) {
      return $$0.b;
   }

   protected void a(has $$0, ffv $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * ayz.a(0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.ak) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
