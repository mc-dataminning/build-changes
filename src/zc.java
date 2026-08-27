import java.util.Optional;

public record zc(int a, int b, int c, int d, Optional<eji> e) implements wk<yd> {
   public zc(bki $$0, bjg $$1) {
      this($$0.ah(), $$0.dL().H_().d(jz.q).a($$1.j()), $$1.d() != null ? $$1.d().ah() : -1, $$1.c() != null ? $$1.c().ah() : -1, Optional.ofNullable($$1.i()));
   }

   public zc(tu $$0) {
      this($$0.n(), $$0.n(), b($$0), b($$0), $$0.b((tu.a<eji>)($$0x -> new eji($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble()))));
   }

   private static void a(tu $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int b(tu $$0) {
      return $$0.n() - 1;
   }

   @Override
   public void a(tu $$0) {
      $$0.c(this.a);
      $$0.c(this.b);
      a($$0, this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$0x, $$1) -> {
         $$0x.a($$1.a());
         $$0x.a($$1.b());
         $$0x.a($$1.c());
      });
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public bjg a(crs $$0) {
      ib<bji> $$1 = $$0.H_().d(jz.q).c(this.b).get();
      if (this.e.isPresent()) {
         return new bjg($$1, this.e.get());
      } else {
         bki $$2 = $$0.a(this.c);
         bki $$3 = $$0.a(this.d);
         return new bjg($$1, $$3, $$2);
      }
   }

   public int d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public Optional<eji> g() {
      return this.e;
   }
}
