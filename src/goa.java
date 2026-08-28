public class goa<T extends ciu> extends gnb<T, guj, fye> {
   public static final ali a = ali.b("textures/entity/horse/donkey.png");
   public static final ali b = ali.b("textures/entity/horse/mule.png");
   private final ali k;

   public goa(gok.a $$0, float $$1, gbk $$2, gbk $$3, boolean $$4) {
      super($$0, new fye($$0.a($$2)), new fye($$0.a($$3)), $$1);
      this.k = $$4 ? b : a;
   }

   public ali a(guj $$0) {
      return this.k;
   }

   public guj a() {
      return new guj();
   }

   public void a(T $$0, guj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
