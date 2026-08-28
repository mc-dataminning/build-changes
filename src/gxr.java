public class gxr extends gzb<cpa, heb, ghl<heb>> {
   private static final alr a = alr.b("textures/entity/enderman/enderman.png");
   private final bai j = bai.a();

   public gxr(gxv.a $$0) {
      super($$0, new ghl<>($$0.a(gkq.aR)), 0.5F);
      this.a(new hbs(this));
      this.a(new hbk(this, $$0.d()));
   }

   public fgc a(heb $$0) {
      fgc $$1 = super.a($$0);
      if ($$0.a) {
         double $$2 = 0.02 * (double)$$0.ai;
         return $$1.b(this.j.k() * $$2, 0.0, this.j.k() * $$2);
      } else {
         return $$1;
      }
   }

   public alr b(heb $$0) {
      return a;
   }

   public heb a() {
      return new heb();
   }

   public void a(cpa $$0, heb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gym.a($$0, $$1, $$2, this.h);
      $$1.a = $$0.t();
      $$1.b = $$0.q();
   }
}
