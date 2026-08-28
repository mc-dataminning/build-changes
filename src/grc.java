public class grc<T extends cob> extends gsw<T, gxn, gbd> {
   private static final alz a = alz.b("textures/entity/creaking/creaking.png");
   private static final alz b = alz.b("textures/entity/creaking/creaking_eyes.png");

   public grc(grq.a $$0) {
      super($$0, new gbd($$0.a(gen.ae)), 0.7F);
      this.a(new gvy<>(this, b, ($$0x, $$1) -> 1.0F, gbd::b, glv::q));
   }

   public alz a(gxn $$0) {
      return a;
   }

   public gxn a() {
      return new gxn();
   }

   public void a(T $$0, gxn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b.a($$0.bZ);
      $$1.a.a($$0.ca);
      $$1.c = $$0.x();
      $$1.d = $$0.p();
   }
}
