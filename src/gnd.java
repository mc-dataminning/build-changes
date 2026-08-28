public abstract class gnd<T extends ckz, S extends gwi> extends gpb<T, S, gaf<S>> {
   public gnd(gok.a $$0, gbk $$1, gbk $$2, gbk $$3) {
      this($$0, $$2, $$3, new gaf<>($$0.a($$1)));
   }

   public gnd(gok.a $$0, gbk $$1, gbk $$2, gaf<S> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gsn<>(this, new gaf($$0.a($$1)), new gaf($$0.a($$2)), $$0.h()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gj();
      $$1.c = $$0.gw();
   }

   protected boolean a(S $$0) {
      return $$0.c;
   }
}
