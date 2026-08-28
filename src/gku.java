public class gku<T extends cjg> extends gjj<T, fvq<T>> {
   private static final alb a = new alb("textures/entity/skeleton/skeleton.png");

   public gku(gis.a $$0) {
      this($$0, fwu.bn, fwu.bp, fwu.bq);
   }

   public gku(gis.a $$0, fwt $$1, fwt $$2, fwt $$3) {
      this($$0, $$2, $$3, new fvq<>($$0.a($$1)));
   }

   public gku(gis.a $$0, fwt $$1, fwt $$2, fvq<T> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gmu<>(this, new fvq($$0.a($$1)), new fvq($$0.a($$2)), $$0.g()));
   }

   public alb a(T $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return $$0.gs();
   }
}
