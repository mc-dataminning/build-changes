import java.util.Optional;

public record xv(int a, int b, int c, int d, Optional<ehn> e) implements vd<ww> {
   public xv(biq $$0, bho $$1) {
      this($$0.ah(), $$0.dL().G_().d(jc.p).a($$1.j()), $$1.d() != null ? $$1.d().ah() : -1, $$1.c() != null ? $$1.c().ah() : -1, Optional.ofNullable($$1.i()));
   }

   public xv(so $$0) {
      this($$0.m(), $$0.m(), b($$0), b($$0), $$0.b((so.a<ehn>)($$0x -> new ehn($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble()))));
   }

   private static void a(so $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int b(so $$0) {
      return $$0.m() - 1;
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

   public void a(ww $$0) {
      $$0.a(this);
   }

   public bho a(cpv $$0) {
      he<bhq> $$1 = $$0.G_().d(jc.p).c(this.b).get();
      if (this.e.isPresent()) {
         return new bho($$1, this.e.get());
      } else {
         biq $$2 = $$0.a(this.c);
         biq $$3 = $$0.a(this.d);
         return new bho($$1, $$3, $$2);
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

   public Optional<ehn> g() {
      return this.e;
   }
}
