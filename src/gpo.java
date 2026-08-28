public class gpo extends gmu<chd, gvl, fyz> {
   private static final alh a = alh.b("textures/entity/pig/pig.png");

   public gpo(gnz.a $$0) {
      super($$0, new fyz($$0.a(gba.bt)), new fyz($$0.a(gba.bu)), 0.7F);
      this.a(new gsn<>(this, new fyz($$0.a(gba.bv)), new fyz($$0.a(gba.bw)), alh.b("textures/entity/pig/pig_saddle.png")));
   }

   public alh a(gvl $$0) {
      return a;
   }

   public gvl c() {
      return new gvl();
   }

   public void a(chd $$0, gvl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.i();
   }
}
