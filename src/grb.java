public class grb<T extends coa> extends gsv<T, gxm, gbc> {
   private static final alz a = alz.b("textures/entity/creaking/creaking.png");
   private static final alz b = alz.b("textures/entity/creaking/creaking_eyes.png");

   public grb(grp.a $$0) {
      super($$0, new gbc($$0.a(gem.ae)), 0.7F);
      this.a(new gvx<>(this, b, ($$0x, $$1) -> 1.0F, gbc::b, glu::q));
   }

   public alz a(gxm $$0) {
      return a;
   }

   public gxm a() {
      return new gxm();
   }

   public void a(T $$0, gxm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b.a($$0.bZ);
      $$1.a.a($$0.ca);
      $$1.c = $$0.x();
      $$1.d = $$0.p();
   }
}
