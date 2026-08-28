public class guv extends gqr<cja, gyi, gam<gyi>> {
   private static final aku a = aku.b("textures/entity/horse/horse_zombie.png");
   private static final aku b = aku.b("textures/entity/horse/horse_skeleton.png");
   private final aku k;

   public guv(gsb.a $$0, gey $$1, gey $$2, boolean $$3) {
      super($$0, new gcj($$0.a($$1)), new gcj($$0.a($$2)));
      this.k = $$3 ? b : a;
   }

   public aku a(gyi $$0) {
      return this.k;
   }

   public gyi b() {
      return new gyi();
   }
}
