public class gni extends gki<cof> {
   private static final float a = ayo.k(3.5F);
   private static final akr g = akr.b("textures/entity/projectiles/wind_charge.png");
   private final fxy h;

   public gni(gkj.a $$0) {
      super($$0);
      this.h = new fxy($$0.a(fyj.bU));
   }

   public void a(cof $$0, float $$1, float $$2, fbi $$3, gez $$4, int $$5) {
      if ($$0.ai >= 2 || !(this.d.b.g().g($$0) < (double)a)) {
         float $$6 = (float)$$0.ai + $$2;
         fbm $$7 = $$4.getBuffer(gfh.a(g, this.a($$6) % 1.0F, 0.0F));
         this.h.a($$0, 0.0F, 0.0F, $$6, 0.0F, 0.0F);
         this.h.a($$3, $$7, $$5, gqc.d);
         super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   public akr a(cof $$0) {
      return g;
   }
}
