import java.util.function.Function;

public class gyv<S extends hbk, RM extends gea<? super S>, EM extends gea<? super S>> extends gyt<S, RM> {
   private final gye a;
   private final hiy.d b;
   private final Function<S, cxy> c;
   private final EM d;
   private final EM e;

   public gyv(gwc<S, RM> $$0, gye $$1, hiy.d $$2, Function<S, cxy> $$3, EM $$4, EM $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public gyv(gwc<S, RM> $$0, gye $$1, EM $$2, hiy.d $$3, Function<S, cxy> $$4) {
      this($$0, $$1, $$3, $$4, $$2, $$2);
   }

   public void a(fho $$0, gny $$1, int $$2, S $$3, float $$4, float $$5) {
      cxy $$6 = this.c.apply($$3);
      dgc $$7 = $$6.a(kx.E);
      if ($$7 != null && !$$7.d().isEmpty()) {
         EM $$8 = $$3.aj ? this.e : this.d;
         $$8.a($$3);
         this.a.a(this.b, $$7.d().get(), $$8, $$6, $$0, $$1, $$2);
      }
   }
}
