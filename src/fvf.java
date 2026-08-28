import java.util.OptionalInt;

public class fvf extends fuh {
   private OptionalInt a = OptionalInt.empty();
   private OptionalInt b = OptionalInt.empty();
   private final bag<fvf.a, fve> c;
   private boolean d = false;

   public fvf(xa $$0, ftv $$1) {
      this(0, 0, $$0, $$1);
   }

   public fvf(int $$0, int $$1, xa $$2, ftv $$3) {
      super($$0, $$1, 0, 0, $$2, $$3);
      this.c = ag.a($$1x -> $$1x.c.isPresent() ? fve.a($$3, $$1x.b, $$1x.c.getAsInt(), $$1x.a) : fve.a($$3, $$1x.a, $$1x.b));
      this.j = false;
   }

   public fvf c(int $$0) {
      super.a($$0);
      return this;
   }

   public fvf d(int $$0) {
      this.a = OptionalInt.of($$0);
      return this;
   }

   public fvf e(int $$0) {
      this.b = OptionalInt.of($$0);
      return this;
   }

   public fvf b(boolean $$0) {
      this.d = $$0;
      return this;
   }

   @Override
   public int A() {
      return this.c.a(this.c()).b();
   }

   @Override
   public int y() {
      return this.c.a(this.c()).a() * 9;
   }

   @Override
   public void b(ftx $$0, int $$1, int $$2, float $$3) {
      fve $$4 = this.c.a(this.c());
      int $$5 = this.F();
      int $$6 = this.G();
      int $$7 = 9;
      int $$8 = this.b();
      if (this.d) {
         $$4.a($$0, $$5 + this.A() / 2, $$6, $$7, $$8);
      } else {
         $$4.b($$0, $$5, $$6, $$7, $$8);
      }
   }

   private fvf.a c() {
      return new fvf.a(this.B(), this.a.orElse(Integer.MAX_VALUE), this.b);
   }

   static record a(xa a, int b, OptionalInt c) {
   }
}
