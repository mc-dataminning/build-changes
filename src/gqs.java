public class gqs extends gmq<ciq, gud, fwq<gud>> {
   private static final alh a = alh.b("textures/entity/horse/horse_zombie.png");
   private static final alh b = alh.b("textures/entity/horse/horse_skeleton.png");
   private final alh k;

   public gqs(gnz.a $$0, gaz $$1, gaz $$2, boolean $$3) {
      super($$0, new fyk($$0.a($$1)), new fyk($$0.a($$2)), 1.0F);
      this.k = $$3 ? b : a;
   }

   public alh a(gud $$0) {
      return this.k;
   }

   public gud c() {
      return new gud();
   }
}
