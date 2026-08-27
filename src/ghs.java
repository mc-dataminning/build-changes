public class ghs<T extends cgo> extends ggi<T, fsq<T>> {
   private static final ajv a = new ajv("textures/entity/skeleton/skeleton.png");

   public ghs(gfr.a $$0) {
      this($$0, ftu.bn, ftu.bp, ftu.bq);
   }

   public ghs(gfr.a $$0, ftt $$1, ftt $$2, ftt $$3) {
      this($$0, $$2, $$3, new fsq<>($$0.a($$1)));
   }

   public ghs(gfr.a $$0, ftt $$1, ftt $$2, fsq<T> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gjs<>(this, new fsq($$0.a($$1)), new fsq($$0.a($$2)), $$0.g()));
   }

   public ajv a(T $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return $$0.gp();
   }
}
