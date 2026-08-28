public class gqz<T extends cjv> extends gpz<T, gxk, gaz> {
   public static final alz a = alz.b("textures/entity/horse/donkey.png");
   public static final alz b = alz.b("textures/entity/horse/mule.png");
   private final alz k;

   public gqz(grj.a $$0, float $$1, gef $$2, gef $$3, boolean $$4) {
      super($$0, new gaz($$0.a($$2)), new gaz($$0.a($$3)), $$1);
      this.k = $$4 ? b : a;
   }

   public alz a(gxk $$0) {
      return this.k;
   }

   public gxk a() {
      return new gxk();
   }

   public void a(T $$0, gxk $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
