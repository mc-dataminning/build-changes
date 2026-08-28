public class guw extends gtk<chy, har, gcb<har>> {
   private final gcb<har> a = this.c();
   private final gcb<har> b;
   private static final akv k = akv.b("textures/entity/fish/tropical_a.png");
   private static final akv l = akv.b("textures/entity/fish/tropical_b.png");

   public guw(gse.a $$0) {
      super($$0, new gei($$0.a(gfc.do)), 0.15F);
      this.b = new gej($$0.a(gfc.dm));
      this.a(new gxc(this, $$0.f()));
   }

   public akv a(har $$0) {
      return switch ($$0.a.a()) {
         case a -> k;
         case b -> l;
      };
   }

   public har b() {
      return new har();
   }

   public void a(chy $$0, har $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gC();
      $$1.b = $$0.gA().d();
      $$1.c = $$0.gB().d();
   }

   public void a(har $$0, ffu $$1, gly $$2, int $$3) {
      this.h = switch ($$0.a.a()) {
         case a -> this.a;
         case b -> this.b;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   protected int b(har $$0) {
      return $$0.b;
   }

   protected void a(har $$0, ffu $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * ayz.a(0.6F * $$0.u);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.ak) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
