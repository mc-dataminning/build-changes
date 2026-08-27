public class gcd extends gag<bzf, fna<bzf>> {
   private static final ahh a = new ahh("textures/entity/wolf/wolf.png");
   private static final ahh i = new ahh("textures/entity/wolf/wolf_tame.png");
   private static final ahh j = new ahh("textures/entity/wolf/wolf_angry.png");

   public gcd(fza.a $$0) {
      super($$0, new fna<>($$0.a(fni.bY)), 0.5F);
      this.a(new gea(this, $$0.f()));
      this.a(new geb(this));
   }

   protected float a(bzf $$0, float $$1) {
      return $$0.gn();
   }

   public void a(bzf $$0, float $$1, float $$2, eqk $$3, ftt $$4, int $$5) {
      if ($$0.gm()) {
         float $$6 = $$0.D($$2);
         this.f.a($$6, $$6, $$6);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if ($$0.gm()) {
         this.f.a(1.0F, 1.0F, 1.0F);
      }
   }

   public ahh a(bzf $$0) {
      if ($$0.u()) {
         return i;
      } else {
         return $$0.aa_() ? j : a;
      }
   }
}
