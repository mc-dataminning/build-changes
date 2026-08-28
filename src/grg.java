public class grg<T extends cka> extends gqg<T, gxr, gbg> {
   public static final alz a = alz.b("textures/entity/horse/donkey.png");
   public static final alz b = alz.b("textures/entity/horse/mule.png");
   private final alz k;

   public grg(grq.a $$0, float $$1, gem $$2, gem $$3, boolean $$4) {
      super($$0, new gbg($$0.a($$2)), new gbg($$0.a($$3)), $$1);
      this.k = $$4 ? b : a;
   }

   public alz a(gxr $$0) {
      return this.k;
   }

   public gxr a() {
      return new gxr();
   }

   public void a(T $$0, gxr $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
