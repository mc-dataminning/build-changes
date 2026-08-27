import java.util.Optional;

public record zc(int a, int b, int c, int d, Optional<eju> e) implements wk<yd> {
   public zc(bkq $$0, bjo $$1) {
      this($$0.aj(), $$0.dN().H_().d(jz.q).a($$1.j()), $$1.d() != null ? $$1.d().aj() : -1, $$1.c() != null ? $$1.c().aj() : -1, Optional.ofNullable($$1.i()));
   }

   public zc(tu $$0) {
      this($$0.n(), $$0.n(), b($$0), b($$0), $$0.b((tu.a<eju>)($$0x -> new eju($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble()))));
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

   public bjo a(csa $$0) {
      ib<bjq> $$1 = $$0.H_().d(jz.q).c(this.b).get();
      if (this.e.isPresent()) {
         return new bjo($$1, this.e.get());
      } else {
         bkq $$2 = $$0.a(this.c);
         bkq $$3 = $$0.a(this.d);
         return new bjo($$1, $$3, $$2);
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

   public Optional<eju> g() {
      return this.e;
   }
}
