import java.util.Optional;

public record xs(int a, int b, int c, int d, Optional<ehi> e) implements va<ws> {
   public xs(bil $$0, bhj $$1) {
      this($$0.ah(), $$0.dK().B_().d(je.p).a($$1.j()), $$1.d() != null ? $$1.d().ah() : -1, $$1.c() != null ? $$1.c().ah() : -1, Optional.ofNullable($$1.i()));
   }

   public xs(sl $$0) {
      this($$0.m(), $$0.m(), b($$0), b($$0), $$0.b((sl.a<ehi>)($$0x -> new ehi($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble()))));
   }

   private static void a(sl $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int b(sl $$0) {
      return $$0.m() - 1;
   }

   @Override
   public void a(sl $$0) {
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

   public void a(ws $$0) {
      $$0.a(this);
   }

   public bhj a(cpq $$0) {
      hg<bhl> $$1 = $$0.B_().d(je.p).c(this.b).get();
      if (this.e.isPresent()) {
         return new bhj($$1, this.e.get());
      } else {
         bil $$2 = $$0.a(this.c);
         bil $$3 = $$0.a(this.d);
         return new bhj($$1, $$3, $$2);
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

   public Optional<ehi> g() {
      return this.e;
   }
}
