public class gxy<T extends cpu> extends gyo<T, hef> {
   private static final alr a = alr.b("textures/entity/illager/evoker.png");

   public gxy(gxv.a $$0) {
      super($$0, new gic<>($$0.a(gkq.aV)), 0.5F);
      this.a(new hcb<hef, gic<hef>>(this) {
         public void a(fld $$0, grn $$1, int $$2, hef $$3, float $$4, float $$5) {
            if ($$3.a) {
               super.a($$0, $$1, $$2, $$3, $$4, $$5);
            }
         }
      });
   }

   public alr a(hef $$0) {
      return a;
   }

   public hef b() {
      return new hef();
   }

   public void a(T $$0, hef $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gB();
   }
}
