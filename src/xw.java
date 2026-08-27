import java.util.Optional;

public record xw(int a, int b, int c, int d, Optional<ehh> e) implements ve<wx> {
   public xw(biw $$0, bhu $$1) {
      this($$0.ah(), $$0.dL().G_().d(jc.q).a($$1.j()), $$1.d() != null ? $$1.d().ah() : -1, $$1.c() != null ? $$1.c().ah() : -1, Optional.ofNullable($$1.i()));
   }

   public xw(so $$0) {
      this($$0.n(), $$0.n(), b($$0), b($$0), $$0.b((so.a<ehh>)($$0x -> new ehh($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble()))));
   }

   private static void a(so $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int b(so $$0) {
      return $$0.n() - 1;
   }

   @Override
   public void a(so $$0) {
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

   public void a(wx $$0) {
      $$0.a(this);
   }

   public bhu a(cqb $$0) {
      he<bhw> $$1 = $$0.G_().d(jc.q).c(this.b).get();
      if (this.e.isPresent()) {
         return new bhu($$1, this.e.get());
      } else {
         biw $$2 = $$0.a(this.c);
         biw $$3 = $$0.a(this.d);
         return new bhu($$1, $$3, $$2);
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

   public Optional<ehh> g() {
      return this.e;
   }
}
