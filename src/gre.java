public class gre<T extends cjz> extends gqe<T, gxp, gbe> {
   public static final alz a = alz.b("textures/entity/horse/donkey.png");
   public static final alz b = alz.b("textures/entity/horse/mule.png");
   private final alz k;

   public gre(gro.a $$0, float $$1, gek $$2, gek $$3, boolean $$4) {
      super($$0, new gbe($$0.a($$2)), new gbe($$0.a($$3)), $$1);
      this.k = $$4 ? b : a;
   }

   public alz a(gxp $$0) {
      return this.k;
   }

   public gxp a() {
      return new gxp();
   }

   public void a(T $$0, gxp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }
}
