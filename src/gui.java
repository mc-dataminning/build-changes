public class gui extends gsw<cix, haa, gbm<haa>> {
   private final gbm<haa> a = this.c();
   private final gbm<haa> b;
   private static final alz k = alz.b("textures/entity/fish/tropical_a.png");
   private static final alz l = alz.b("textures/entity/fish/tropical_b.png");

   public gui(grq.a $$0) {
      super($$0, new gdt($$0.a(gen.dj)), 0.15F);
      this.b = new gdu($$0.a(gen.dh));
      this.a(new gwo(this, $$0.f()));
   }

   public alz a(haa $$0) {
      return switch ($$0.a.a()) {
         case a -> k;
         case b -> l;
      };
   }

   public haa b() {
      return new haa();
   }

   public void a(cix $$0, haa $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gy();
      $$1.b = $$0.gw().d();
      $$1.c = $$0.gx().d();
   }

   public void a(haa $$0, fgs $$1, gll $$2, int $$3) {
      this.h = switch ($$0.a.a()) {
         case a -> this.a;
         case b -> this.b;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   protected int b(haa $$0) {
      return $$0.b;
   }

   protected void a(haa $$0, fgs $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * bae.a(0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.af) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
