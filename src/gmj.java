public class gmj<T extends cjl> extends gky<T, fxd<T>> {
   private static final akr a = akr.b("textures/entity/skeleton/skeleton.png");

   public gmj(gkh.a $$0) {
      this($$0, fyh.bo, fyh.bq, fyh.br);
   }

   public gmj(gkh.a $$0, fyg $$1, fyg $$2, fyg $$3) {
      this($$0, $$2, $$3, new fxd<>($$0.a($$1)));
   }

   public gmj(gkh.a $$0, fyg $$1, fyg $$2, fxd<T> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new goj<>(this, new fxd($$0.a($$1)), new fxd($$0.a($$2)), $$0.g()));
   }

   public akr a(T $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return $$0.gn();
   }
}
