public class gml<T extends cjl> extends gla<T, fxf<T>> {
   private static final akr a = akr.b("textures/entity/skeleton/skeleton.png");

   public gml(gkj.a $$0) {
      this($$0, fyj.bo, fyj.bq, fyj.br);
   }

   public gml(gkj.a $$0, fyi $$1, fyi $$2, fyi $$3) {
      this($$0, $$2, $$3, new fxf<>($$0.a($$1)));
   }

   public gml(gkj.a $$0, fyi $$1, fyi $$2, fxf<T> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gol<>(this, new fxf($$0.a($$1)), new fxf($$0.a($$2)), $$0.g()));
   }

   public akr a(T $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return $$0.gm();
   }
}
