public abstract class gpz<T extends cjw, S extends gxp, M extends gbf<? super S>> extends gqd<T, S, M> {
   private final float a;

   public gpz(grj.a $$0, M $$1, M $$2, float $$3) {
      super($$0, $$1, $$2, 0.75F);
      this.a = $$3;
   }

   protected void a(S $$0, fgl $$1) {
      $$1.b(this.a, this.a, this.a);
      super.a($$0, $$1);
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.j();
      $$1.c = $$0.ca();
      $$1.e = $$0.J($$2);
      $$1.f = $$0.K($$2);
      $$1.g = $$0.L($$2);
      $$1.d = $$0.cr > 0;
   }
}
