public class gwf extends guj<clj, hbx, gfq> {
   private static final aku a = aku.b("textures/entity/wither/wither_invulnerable.png");
   private static final aku b = aku.b("textures/entity/wither/wither.png");

   public gwf(gtd.a $$0) {
      super($$0, new gfq($$0.a(ggb.dC)), 1.0F);
      this.a(new gyf(this, $$0.f()));
   }

   protected int a(clj $$0, ji $$1) {
      return 15;
   }

   public aku a(hbx $$0) {
      int $$1 = ayz.d($$0.c);
      return $$1 > 0 && ($$1 > 80 || $$1 / 5 % 2 != 1) ? a : b;
   }

   public hbx b() {
      return new hbx();
   }

   protected void a(hbx $$0, fgr $$1) {
      float $$2 = 2.0F;
      if ($$0.c > 0.0F) {
         $$2 -= $$0.c / 220.0F * 0.5F;
      }

      $$1.b($$2, $$2, $$2);
   }

   public void a(clj $$0, hbx $$1, float $$2) {
      super.a($$0, $$1, $$2);
      int $$3 = $$0.t();
      $$1.c = $$3 > 0 ? (float)$$3 - $$2 : 0.0F;
      System.arraycopy($$0.q(), 0, $$1.a, 0, $$1.a.length);
      System.arraycopy($$0.n(), 0, $$1.b, 0, $$1.b.length);
      $$1.d = $$0.x();
   }
}
