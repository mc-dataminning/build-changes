import javax.annotation.Nullable;

public abstract class gbk extends fyn {
   private static final int b = 100;
   private final wy c;
   @Nullable
   private final wy d;
   private final wy s;
   @Nullable
   protected fsx a;
   @Nullable
   private ftg u;
   private final fwh v;

   protected gbk(wy $$0, wy $$1, wy $$2) {
      this($$0, $$1, null, $$2);
   }

   protected gbk(wy $$0, wy $$1, @Nullable wy $$2, wy $$3) {
      super($$0);
      this.c = $$1;
      this.d = $$2;
      this.s = $$3;
      this.v = new fwh(0, 0, this.n, this.o);
   }

   protected abstract fwk m();

   @Override
   protected void aO_() {
      fwn $$0 = this.v.a(fwn.d().a(8));
      $$0.c().b();
      $$0.a(new fuc(this.n(), this.p));
      this.u = $$0.a(new ftg(this.n - 100, this.c, this.p, 12), $$0x -> $$0x.a(12));
      this.u.b(false);
      fwn $$1 = $$0.a(fwn.d().a(8));
      $$1.c().b();
      if (this.d != null) {
         this.a = $$1.a(fsx.a(this.d, this.p).a());
      }

      $$1.a(this.m());
      this.v.a($$1x -> {
         fst var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      if (this.u != null) {
         this.u.d(this.n - 100);
      }

      this.v.a();
      fwh.a(this.v, this.J());
   }

   @Override
   public wy i() {
      return this.s;
   }
}
