import java.util.Optional;

public record zn(int a, int b, int c, int d, Optional<elb> e) implements wu<yo> {
   public zn(blf $$0, bkd $$1) {
      this($$0.aj(), $$0.dM().I_().d(kc.r).a($$1.j()), $$1.d() != null ? $$1.d().aj() : -1, $$1.c() != null ? $$1.c().aj() : -1, Optional.ofNullable($$1.i()));
   }

   public zn(ue $$0) {
      this($$0.n(), $$0.n(), b($$0), b($$0), $$0.b((ue.a<elb>)($$0x -> new elb($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble()))));
   }

   private static void a(ue $$0, int $$1) {
      $$0.c($$1 + 1);
   }

   private static int b(ue $$0) {
      return $$0.n() - 1;
   }

   @Override
   public void a(ue $$0) {
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

   public void a(yo $$0) {
      $$0.a(this);
   }

   public bkd a(csy $$0) {
      ie<bkf> $$1 = $$0.I_().d(kc.r).c(this.b).get();
      if (this.e.isPresent()) {
         return new bkd($$1, this.e.get());
      } else {
         blf $$2 = $$0.a(this.c);
         blf $$3 = $$0.a(this.d);
         return new bkd($$1, $$3, $$2);
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

   public Optional<elb> g() {
      return this.e;
   }
}
