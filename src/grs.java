public class grs<T extends cja> extends gqs<T, gye, gbu> {
   public static final aku a = aku.b("textures/entity/horse/donkey.png");
   public static final aku b = aku.b("textures/entity/horse/mule.png");
   private final aku k;

   public grs(gsc.a $$0, gfa $$1, gfa $$2, boolean $$3) {
      super($$0, new gbu($$0.a($$1)), new gbu($$0.a($$2)));
      this.k = $$3 ? b : a;
   }

   public aku a(gye $$0) {
      return this.k;
   }

   public gye a() {
      return new gye();
   }

   public void a(T $$0, gye $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
