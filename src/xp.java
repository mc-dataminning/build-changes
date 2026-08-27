import java.util.Optional;

public record xp(int a, int b, int c, int d, Optional<ehd> e) implements ux<wp> {
   public xp(bii $$0, bhg $$1) {
      this($$0.ah(), $$0.dK().B_().d(jc.p).a($$1.j()), $$1.d() != null ? $$1.d().ah() : -1, $$1.c() != null ? $$1.c().ah() : -1, Optional.ofNullable($$1.i()));
   }

   public xp(si $$0) {
      this($$0.m(), $$0.m(), b($$0), b($$0), $$0.b((si.a<ehd>)($$0x -> new ehd($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble()))));
   }

   private static void a(si $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int b(si $$0) {
      return $$0.m() - 1;
   }

   @Override
   public void a(si $$0) {
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

   public void a(wp $$0) {
      $$0.a(this);
   }

   public bhg a(cpl $$0) {
      he<bhi> $$1 = $$0.B_().d(jc.p).c(this.b).get();
      if (this.e.isPresent()) {
         return new bhg($$1, this.e.get());
      } else {
         bii $$2 = $$0.a(this.c);
         bii $$3 = $$0.a(this.d);
         return new bhg($$1, $$3, $$2);
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

   public Optional<ehd> g() {
      return this.e;
   }
}
