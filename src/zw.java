import java.util.Optional;

public record zw(int a, int b, int c, int d, Optional<elm> e) implements xd<yx> {
   public zw(blp $$0, bkn $$1) {
      this($$0.aj(), $$0.dM().I_().d(ke.r).a($$1.j()), $$1.d() != null ? $$1.d().aj() : -1, $$1.c() != null ? $$1.c().aj() : -1, Optional.ofNullable($$1.i()));
   }

   public zw(ug $$0) {
      this($$0.n(), $$0.n(), b($$0), b($$0), $$0.b((ug.a<elm>)($$0x -> new elm($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble()))));
   }

   private static void a(ug $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int b(ug $$0) {
      return $$0.n() - 1;
   }

   @Override
   public void a(ug $$0) {
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

   public void a(yx $$0) {
      $$0.a(this);
   }

   public bkn a(cti $$0) {
      ih<bkp> $$1 = $$0.I_().d(ke.r).c(this.b).get();
      if (this.e.isPresent()) {
         return new bkn($$1, this.e.get());
      } else {
         blp $$2 = $$0.a(this.c);
         blp $$3 = $$0.a(this.d);
         return new bkn($$1, $$3, $$2);
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

   public Optional<elm> g() {
      return this.e;
   }
}
