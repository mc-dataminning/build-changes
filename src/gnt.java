public abstract class gnt<T extends cld, S extends gwy> extends gpr<T, S, gav<S>> {
   public gnt(gpa.a $$0, gca $$1, gca $$2, gca $$3) {
      this($$0, $$2, $$3, new gav<>($$0.a($$1)));
   }

   public gnt(gpa.a $$0, gca $$1, gca $$2, gav<S> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gtd<>(this, new gav($$0.a($$1)), new gav($$0.a($$2)), $$0.h()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gk();
      $$1.c = $$0.gx();
   }

   protected boolean a(S $$0) {
      return $$0.c;
   }
}
