public class gsa extends gsv<cmr, haj, gby<haj>> {
   private static final alz a = alz.b("textures/entity/zombie/zombie.png");

   public gsa(grp.a $$0, float $$1) {
      super($$0, new gbr($$0.a(gem.aP)), 0.5F * $$1);
      this.a(new gvw<>(this, $$0.b()));
      this.a(new gvt<>(this, new gbr($$0.a(gem.aQ)), new gbr($$0.a(gem.aR)), $$0.h()));
   }

   public alz a(haj $$0) {
      return a;
   }

   public haj b() {
      return new haj();
   }

   public void a(cmr $$0, haj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gsg.a($$0, $$1, $$2);
   }
}
