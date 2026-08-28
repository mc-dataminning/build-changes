public abstract class gnr<T extends ciz, S extends gve, M extends fza<? super S>> extends gnv<T, S, M> {
   private final float a;

   public gnr(gpa.a $$0, M $$1, M $$2, float $$3) {
      super($$0, $$1, $$2, 0.75F);
      this.a = $$3;
   }

   protected void a(S $$0, fek $$1) {
      $$1.b(this.a, this.a, this.a);
      super.a($$0, $$1);
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.i();
      $$1.c = $$0.cc();
      $$1.e = $$0.J($$2);
      $$1.f = $$0.K($$2);
      $$1.g = $$0.L($$2);
      $$1.d = $$0.cq > 0;
   }
}
