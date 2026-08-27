import java.util.Optional;

public record zg(int a, int b, int c, int d, Optional<ejz> e) implements wo<yh> {
   public zg(bkv $$0, bjt $$1) {
      this($$0.aj(), $$0.dN().I_().d(kd.q).a($$1.j()), $$1.d() != null ? $$1.d().aj() : -1, $$1.c() != null ? $$1.c().aj() : -1, Optional.ofNullable($$1.i()));
   }

   public zg(ty $$0) {
      this($$0.n(), $$0.n(), b($$0), b($$0), $$0.b((ty.a<ejz>)($$0x -> new ejz($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble()))));
   }

   private static void a(ty $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int b(ty $$0) {
      return $$0.n() - 1;
   }

   @Override
   public void a(ty $$0) {
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

   public void a(yh $$0) {
      $$0.a(this);
   }

   public bjt a(csf $$0) {
      ig<bjv> $$1 = $$0.I_().d(kd.q).c(this.b).get();
      if (this.e.isPresent()) {
         return new bjt($$1, this.e.get());
      } else {
         bkv $$2 = $$0.a(this.c);
         bkv $$3 = $$0.a(this.d);
         return new bjt($$1, $$3, $$2);
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

   public Optional<ejz> g() {
      return this.e;
   }
}
