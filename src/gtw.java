public class gtw<T extends cnh> extends gsu<T, gyr, gdl> {
   private static final alz a = alz.b("textures/entity/spider/spider.png");

   public gtw(gro.a $$0) {
      this($$0, gel.cR);
   }

   public gtw(gro.a $$0, gek $$1) {
      super($$0, new gdl($$0.a($$1)), 0.8F);
      this.a(new gwj<>(this));
   }

   @Override
   protected float aX_() {
      return 180.0F;
   }

   @Override
   public alz b(gyr $$0) {
      return a;
   }

   public gyr b() {
      return new gyr();
   }

   public void a(T $$0, gyr $$1, float $$2) {
      super.a($$0, $$1, $$2);
   }
}
