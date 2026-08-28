public class grf<T extends cjz> extends gqf<T, gxq, gbf> {
   public static final alz a = alz.b("textures/entity/horse/donkey.png");
   public static final alz b = alz.b("textures/entity/horse/mule.png");
   private final alz k;

   public grf(grp.a $$0, float $$1, gel $$2, gel $$3, boolean $$4) {
      super($$0, new gbf($$0.a($$2)), new gbf($$0.a($$3)), $$1);
      this.k = $$4 ? b : a;
   }

   public alz a(gxq $$0) {
      return this.k;
   }

   public gxq a() {
      return new gxq();
   }

   public void a(T $$0, gxq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
