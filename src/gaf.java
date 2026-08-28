import javax.annotation.Nullable;

public abstract class gaf extends fxi {
   private static final int b = 100;
   private final ww c;
   @Nullable
   private final ww d;
   private final ww s;
   @Nullable
   protected frs a;
   @Nullable
   private fsb u;
   private final fvc v;

   protected gaf(ww $$0, ww $$1, ww $$2) {
      this($$0, $$1, null, $$2);
   }

   protected gaf(ww $$0, ww $$1, @Nullable ww $$2, ww $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.s = $$3;
      this.v = new fvc(0, 0, this.n, this.o);
   }

   protected abstract fvf m();

   @Override
   protected void aN_() {
      fvi $$0 = this.v.a(fvi.d().a(8));
      $$0.c().b();
      $$0.a(new fsx(this.n(), this.p));
      this.u = $$0.a(new fsb(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.u.b(false);
      fvi $$1 = $$0.a(fvi.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(frs.a(this.d, this.p).a());
      }

      $$1.a(this.m());
      this.v.a($$1x -> {
         fro var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.u != null) {
         this.u.d(this.n - 100);
      }

      this.v.a();
      fvc.a(this.v, this.J());
   }

   @Override
   public ww i() {
      return this.s;
   }
}
