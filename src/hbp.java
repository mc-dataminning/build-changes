import java.util.function.Function;

public class hbp<S extends hef, RM extends ggp<? super S>, EM extends ggp<? super S>> extends hbm<S, RM> {
   private final hax a;
   private final hlw.d b;
   private final Function<S, czn> c;
   private final EM d;
   private final EM e;

   public hbp(gyv<S, RM> $$0, hax $$1, hlw.d $$2, Function<S, czn> $$3, EM $$4, EM $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public hbp(gyv<S, RM> $$0, hax $$1, EM $$2, hlw.d $$3, Function<S, czn> $$4) {
      this($$0, $$1, $$3, $$4, $$2, $$2);
   }

   public void a(fkd $$0, gqr $$1, int $$2, S $$3, float $$4, float $$5) {
      czn $$6 = this.c.apply($$3);
      dhw $$7 = $$6.a(kk.D);
      if ($$7 != null && !$$7.d().isEmpty()) {
         EM $$8 = $$3.aj ? this.e : this.d;
         $$8.a($$3);
         this.a.a(this.b, $$7.d().get(), $$8, $$6, $$0, $$1, $$2);
      }
   }
}
