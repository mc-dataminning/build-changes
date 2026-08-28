import javax.annotation.Nullable;

public abstract class gay extends fyb {
   private static final int b = 100;
   private final wy c;
   @Nullable
   private final wy d;
   private final wy s;
   @Nullable
   protected fsl a;
   @Nullable
   private fsu u;
   private final fvv v;

   protected gay(wy $$0, wy $$1, wy $$2) {
      this($$0, $$1, null, $$2);
   }

   protected gay(wy $$0, wy $$1, @Nullable wy $$2, wy $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.s = $$3;
      this.v = new fvv(0, 0, this.n, this.o);
   }

   protected abstract fvy m();

   @Override
   protected void aO_() {
      fwb $$0 = this.v.a(fwb.d().a(8));
      $$0.c().b();
      $$0.a(new ftq(this.n(), this.p));
      this.u = $$0.a(new fsu(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.u.b(false);
      fwb $$1 = $$0.a(fwb.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(fsl.a(this.d, this.p).a());
      }

      $$1.a(this.m());
      this.v.a($$1x -> {
         fsh var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.u != null) {
         this.u.d(this.n - 100);
      }

      this.v.a();
      fvv.a(this.v, this.J());
   }

   @Override
   public wy i() {
      return this.s;
   }
}
