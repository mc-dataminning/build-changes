public class gqv<T extends cnw> extends gsp<T, gxg, gaw> {
   private static final alz a = alz.b("textures/entity/creaking/creaking.png");
   private static final alz b = alz.b("textures/entity/creaking/creaking_eyes.png");

   public gqv(grj.a $$0) {
      super($$0, new gaw($$0.a(geg.ae)), 0.7F);
      this.a(new gvr<>(this, b, ($$0x, $$1) -> 1.0F, gaw::b, glo::p));
   }

   public alz a(gxg $$0) {
      return a;
   }

   public gxg a() {
      return new gxg();
   }

   public void a(T $$0, gxg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b.a($$0.bZ);
      $$1.a.a($$0.ca);
      $$1.c = $$0.x();
      $$1.d = $$0.p();
   }
}
