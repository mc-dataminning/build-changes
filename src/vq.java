import java.util.Optional;

public record vq(int a, int b, int c, int d, Optional<eei> e) implements uo<ur> {
   public vq(bfj $$0, ben $$1) {
      this($$0.af(), $$0.dI().B_().d(jc.p).a($$1.j()), $$1.d() != null ? $$1.d().af() : -1, $$1.c() != null ? $$1.c().af() : -1, Optional.ofNullable($$1.i()));
   }

   public vq(sf $$0) {
      this($$0.m(), $$0.m(), b($$0), b($$0), $$0.b($$0x -> new eei($$0x.readDouble(), $$0x.readDouble(), $$0x.readDouble())));
   }

   private static void a(sf $$0, int $$1) {
      $$0.d($$1 + 1);
   }

   private static int b(sf $$0) {
      return $$0.m() - 1;
   }

   @Override
   public void a(sf $$0) {
      $$0.d(this.a);
      $$0.d(this.b);
      a($$0, this.c);
      a($$0, this.d);
      $$0.a(this.e, ($$0x, $$1) -> {
         $$0x.writeDouble($$1.a());
         $$0x.writeDouble($$1.b());
         $$0x.writeDouble($$1.c());
      });
   }

   public void a(ur $$0) {
      $$0.a(this);
   }

   public ben a(cmm $$0) {
      he<bep> $$1 = $$0.B_().d(jc.p).c(this.b).get();
      if (this.e.isPresent()) {
         return new ben($$1, this.e.get());
      } else {
         bfj $$2 = $$0.a(this.c);
         bfj $$3 = $$0.a(this.d);
         return new ben($$1, $$3, $$2);
      }
   }

   public int c() {
      return this.b;
   }

   public int d() {
      return this.c;
   }

   public int e() {
      return this.d;
   }

   public Optional<eei> f() {
      return this.e;
   }
}
