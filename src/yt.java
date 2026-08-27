import java.util.Optional;

public record yt(int a, int b, int c, int d, Optional<eif> e) implements wb<xu> {
   public yt(bjt $$0, bir $$1) {
      this($$0.ah(), $$0.dL().H_().d(jz.q).a($$1.j()), $$1.d() != null ? $$1.d().ah() : -1, $$1.c() != null ? $$1.c().ah() : -1, Optional.ofNullable($$1.i()));
   }

   public yt(tl $$0) {
      this($$0.n(), $$0.n(), b($$0), b($$0), $$0.b((tl.a<eif>)($$0x -> new eif($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble()))));
   }

   private static void a(tl $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int b(tl $$0) {
      return $$0.n() - 1;
   }

   @Override
   public void a(tl $$0) {
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

   public void a(xu $$0) {
      $$0.a(this);
   }

   public bir a(cqz $$0) {
      ib<bit> $$1 = $$0.H_().d(jz.q).c(this.b).get();
      if (this.e.isPresent()) {
         return new bir($$1, this.e.get());
      } else {
         bjt $$2 = $$0.a(this.c);
         bjt $$3 = $$0.a(this.d);
         return new bir($$1, $$3, $$2);
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

   public Optional<eif> g() {
      return this.e;
   }
}
