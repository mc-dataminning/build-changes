public class glj extends gjy<cga, ftn<cga>> {
   private final ftn<cga> a = this.a();
   private final ftn<cga> i;
   private static final alb j = new alb("textures/entity/fish/tropical_a.png");
   private static final alb k = new alb("textures/entity/fish/tropical_b.png");

   public glj(gis.a $$0) {
      super($$0, new fwb<>($$0.a(fwu.bL)), 0.15F);
      this.i = new fwc<>($$0.a(fwu.bJ));
      this.a(new gno(this, $$0.f()));
   }

   public alb a(cga $$0) {
      return switch ($$0.gB().a()) {
         case a -> j;
         case b -> k;
      };
   }

   public void a(cga $$0, float $$1, float $$2, ezt $$3, gdj $$4, int $$5) {
      ftn<cga> $$6 = switch ($$0.gB().a()) {
         case a -> this.a;
         case b -> this.i;
      };
      this.f = $$6;
      float[] $$7 = $$0.gz().d();
      $$6.a($$7[0], $$7[1], $$7[2]);
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      $$6.a(1.0F, 1.0F, 1.0F);
   }

   protected void a(cga $$0, ezt $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      float $$6 = 4.3F * ayu.a(0.6F * $$2);
      $$1.a(a.d.rotationDegrees($$6));
      if (!$$0.be()) {
         $$1.a(0.2F, 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(90.0F));
      }
   }
}
