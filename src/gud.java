public class gud extends gsr<cio, gzv, gbh<gzv>> {
   private final gbh<gzv> a = this.c();
   private final gbh<gzv> b;
   private static final alp k = alp.b("textures/entity/fish/tropical_a.png");
   private static final alp l = alp.b("textures/entity/fish/tropical_b.png");

   public gud(grl.a $$0) {
      super($$0, new gdo($$0.a(gei.do)), 0.15F);
      this.b = new gdp($$0.a(gei.dm));
      this.a(new gwj(this, $$0.f()));
   }

   public alp a(gzv $$0) {
      return switch ($$0.a.a()) {
         case a -> k;
         case b -> l;
      };
   }

   public gzv b() {
      return new gzv();
   }

   public void a(cio $$0, gzv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gy();
      $$1.b = $$0.gw().d();
      $$1.c = $$0.gx().d();
   }

   public void a(gzv $$0, fgl $$1, glg $$2, int $$3) {
      this.h = switch ($$0.a.a()) {
         case a -> this.a;
         case b -> this.b;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   protected int b(gzv $$0) {
      return $$0.b;
   }

   protected void a(gzv $$0, fgl $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azu.a(0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.af) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
