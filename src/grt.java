public class grt<T extends cja> extends gqt<T, gyf, gbu> {
   public static final akv a = akv.b("textures/entity/horse/donkey.png");
   public static final akv b = akv.b("textures/entity/horse/mule.png");
   private final akv k;

   public grt(gsd.a $$0, gfa $$1, gfa $$2, boolean $$3) {
      super($$0, new gbu($$0.a($$1)), new gbu($$0.a($$2)));
      this.k = $$3 ? b : a;
   }

   public akv a(gyf $$0) {
      return this.k;
   }

   public gyf a() {
      return new gyf();
   }

   public void a(T $$0, gyf $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
