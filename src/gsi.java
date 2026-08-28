public abstract class gsi<T extends cmd, S extends gyl> extends gsv<T, S, gbz<S>> {
   protected gsi(grp.a $$0, gbz<S> $$1, float $$2) {
      super($$0, $$1, $$2);
      this.a(new gvi<>(this, $$0.f(), $$0.b()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.bZ();
      $$1.d = $$0.fy();
      $$1.e = $$0.m();
      $$1.f = $$1.e == cmd.a.f ? cwf.b($$0.fB(), $$0) : 0;
      $$1.g = $$0.fD();
      $$1.h = $$0.D($$2);
      $$1.c = $$0.gd();
   }
}
