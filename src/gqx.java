public class gqx extends gti<cid, gxl, gar> {
   private static final aku a = aku.b("textures/entity/allay/allay.png");

   public gqx(gsc.a $$0) {
      super($$0, new gar($$0.a(gfb.c)), 0.4F);
      this.a(new gwj<>(this));
   }

   public aku a(gxl $$0) {
      return a;
   }

   public gxl a() {
      return new gxl();
   }

   public void a(cid $$0, gxl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gxn.a($$0, $$1, this.i);
      $$1.a = $$0.x();
      $$1.b = $$0.gp();
      $$1.c = $$0.K($$2);
      $$1.d = $$0.J($$2);
   }

   protected int a(cid $$0, ji $$1) {
      return 15;
   }
}
