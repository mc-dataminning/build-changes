public class gru extends gsp<cmn, had, gbs<had>> {
   private static final alz a = alz.b("textures/entity/zombie/zombie.png");

   public gru(grj.a $$0, float $$1) {
      super($$0, new gbl($$0.a(geg.aP)), 0.5F * $$1);
      this.a(new gvq<>(this, $$0.b()));
      this.a(new gvn<>(this, new gbl($$0.a(geg.aQ)), new gbl($$0.a(geg.aR)), $$0.h()));
   }

   public alz a(had $$0) {
      return a;
   }

   public had b() {
      return new had();
   }

   public void a(cmn $$0, had $$1, float $$2) {
      super.a($$0, $$1, $$2);
      gsa.a($$0, $$1, $$2);
   }
}
