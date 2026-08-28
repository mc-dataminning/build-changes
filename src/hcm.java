import java.util.function.Function;

public class hcm<S extends hfe, RM extends ghn<? super S>, EM extends ghn<? super S>> extends hcj<S, RM> {
   private final hbu a;
   private final hmw.d b;
   private final Function<S, dak> c;
   private final EM d;
   private final EM e;

   public hcm(gzs<S, RM> $$0, hbu $$1, hmw.d $$2, Function<S, dak> $$3, EM $$4, EM $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public hcm(gzs<S, RM> $$0, hbu $$1, EM $$2, hmw.d $$3, Function<S, dak> $$4) {
      this($$0, $$1, $$3, $$4, $$2, $$2);
   }

   public void a(fld $$0, grn $$1, int $$2, S $$3, float $$4, float $$5) {
      dak $$6 = this.c.apply($$3);
      dit $$7 = $$6.a(kl.D);
      if ($$7 != null && !$$7.d().isEmpty()) {
         EM $$8 = $$3.am ? this.e : this.d;
         $$8.a($$3);
         this.a.a(this.b, $$7.d().get(), $$8, $$6, $$0, $$1, $$2);
      }
   }
}
