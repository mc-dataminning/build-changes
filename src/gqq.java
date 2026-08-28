public class gqq extends gpf<chm, gwh, fxz<gwh>> {
   private final fxz<gwh> a = this.e();
   private final fxz<gwh> b;
   private static final alh k = alh.b("textures/entity/fish/tropical_a.png");
   private static final alh l = alh.b("textures/entity/fish/tropical_b.png");

   public gqq(gnz.a $$0) {
      super($$0, new gag($$0.a(gba.cO)), 0.15F);
      this.b = new gah($$0.a(gba.cM));
      this.a(new gsv(this, $$0.f()));
   }

   public alh a(gwh $$0) {
      return switch ($$0.a.a()) {
         case a -> k;
         case b -> l;
      };
   }

   public gwh c() {
      return new gwh();
   }

   public void a(chm $$0, gwh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gG();
      $$1.b = $$0.gE().d();
      $$1.c = $$0.gF().d();
   }

   public void a(gwh $$0, fdt $$1, ghw $$2, int $$3) {
      this.h = switch ($$0.a.a()) {
         case a -> this.a;
         case b -> this.b;
      };
      super.a($$0, $$1, $$2, $$3);
   }

   protected int b(gwh $$0) {
      return $$0.b;
   }

   protected void a(gwh $$0, fdt $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      float $$4 = 4.3F * azj.a(0.6F * $$0.p);
      $$1.a(a.d.rotationDegrees($$4));
      if (!$$0.af) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
