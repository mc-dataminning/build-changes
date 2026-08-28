import java.util.function.Function;

public class hcz<S extends hfp, RM extends gia<? super S>, EM extends gia<? super S>> extends hcw<S, RM> {
   private final hch a;
   private final hng.d b;
   private final Function<S, czy> c;
   private final EM d;
   private final EM e;

   public hcz(haf<S, RM> $$0, hch $$1, hng.d $$2, Function<S, czy> $$3, EM $$4, EM $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public hcz(haf<S, RM> $$0, hch $$1, EM $$2, hng.d $$3, Function<S, czy> $$4) {
      this($$0, $$1, $$3, $$4, $$2, $$2);
   }

   public void a(flo $$0, gsa $$1, int $$2, S $$3, float $$4, float $$5) {
      czy $$6 = this.c.apply($$3);
      dih $$7 = $$6.a(kk.D);
      if ($$7 != null && !$$7.d().isEmpty()) {
         EM $$8 = $$3.aj ? this.e : this.d;
         $$8.a($$3);
         this.a.a(this.b, $$7.d().get(), $$8, $$6, $$0, $$1, $$2);
      }
   }
}
