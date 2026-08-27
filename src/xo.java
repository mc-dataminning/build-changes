import java.util.Optional;

public record xo(int a, int b, int c, int d, Optional<ehf> e) implements uw<wo> {
   public xo(big $$0, bhe $$1) {
      this($$0.ah(), $$0.dK().B_().d(jd.p).a($$1.j()), $$1.d() != null ? $$1.d().ah() : -1, $$1.c() != null ? $$1.c().ah() : -1, Optional.ofNullable($$1.i()));
   }

   public xo(sh $$0) {
      this($$0.m(), $$0.m(), b($$0), b($$0), $$0.b((sh.a<ehf>)($$0x -> new ehf($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble()))));
   }

   private static void a(sh $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int b(sh $$0) {
      return $$0.m() - 1;
   }

   @Override
   public void a(sh $$0) {
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

   public void a(wo $$0) {
      $$0.a(this);
   }

   public bhe a(cpk $$0) {
      hf<bhg> $$1 = $$0.B_().d(jd.p).c(this.b).get();
      if (this.e.isPresent()) {
         return new bhe($$1, this.e.get());
      } else {
         big $$2 = $$0.a(this.c);
         big $$3 = $$0.a(this.d);
         return new bhe($$1, $$3, $$2);
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

   public Optional<ehf> g() {
      return this.e;
   }
}
