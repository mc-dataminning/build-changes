public class gsp extends gtk<clt, hbb, gco<hbb>> {
   private static final akv a = akv.b("textures/entity/zombie/zombie.png");

   public gsp(gse.a $$0, float $$1) {
      super($$0, new gch($$0.a(gfc.aS)), 0.5F * $$1);
      this.a(new gwl<>(this));
      this.a(new gwi<>(this, new gch($$0.a(gfc.aT)), new gch($$0.a(gfc.aU)), $$0.h()));
   }

   public akv a(hbb $$0) {
      return a;
   }

   public hbb b() {
      return new hbb();
   }

   public void a(clt $$0, hbb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gsv.a($$0, $$1, $$2, this.i);
   }
}
