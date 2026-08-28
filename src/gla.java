public class gla<T extends cjm> extends gjp<T, fvw<T>> {
   private static final alf a = new alf("textures/entity/skeleton/skeleton.png");

   public gla(giy.a $$0) {
      this($$0, fxa.bn, fxa.bp, fxa.bq);
   }

   public gla(giy.a $$0, fwz $$1, fwz $$2, fwz $$3) {
      this($$0, $$2, $$3, new fvw<>($$0.a($$1)));
   }

   public gla(giy.a $$0, fwz $$1, fwz $$2, fvw<T> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gna<>(this, new fvw($$0.a($$1)), new fvw($$0.a($$2)), $$0.g()));
   }

   public alf a(T $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return $$0.gs();
   }
}
