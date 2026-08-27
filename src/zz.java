import java.util.Optional;

public record zz(int a, int b, int c, int d, Optional<elt> e) implements xf<za> {
   public zz(blv $$0, bkt $$1) {
      this($$0.aj(), $$0.dM().I_().d(ke.r).a($$1.j()), $$1.d() != null ? $$1.d().aj() : -1, $$1.c() != null ? $$1.c().aj() : -1, Optional.ofNullable($$1.i()));
   }

   public zz(ui $$0) {
      this($$0.n(), $$0.n(), b($$0), b($$0), $$0.b((ui.a<elt>)($$0x -> new elt($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble()))));
   }

   private static void a(ui $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int b(ui $$0) {
      return $$0.n() - 1;
   }

   @Override
   public void a(ui $$0) {
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

   public void a(za $$0) {
      $$0.a(this);
   }

   public bkt a(ctp $$0) {
      ih<bkv> $$1 = $$0.I_().d(ke.r).c(this.b).get();
      if (this.e.isPresent()) {
         return new bkt($$1, this.e.get());
      } else {
         blv $$2 = $$0.a(this.c);
         blv $$3 = $$0.a(this.d);
         return new bkt($$1, $$3, $$2);
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

   public Optional<elt> g() {
      return this.e;
   }
}
