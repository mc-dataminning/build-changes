public class gnp<T extends cip> extends gmq<T, gty, fxt> {
   public static final alh a = alh.b("textures/entity/horse/donkey.png");
   public static final alh b = alh.b("textures/entity/horse/mule.png");
   private final alh k;

   public gnp(gnz.a $$0, float $$1, gaz $$2, gaz $$3, boolean $$4) {
      super($$0, new fxt($$0.a($$2)), new fxt($$0.a($$3)), $$1);
      this.k = $$4 ? b : a;
   }

   public alh a(gty $$0) {
      return this.k;
   }

   public gty a() {
      return new gty();
   }

   public void a(T $$0, gty $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
