import java.util.function.Function;

public class hbj<S extends hdz, RM extends ggk<? super S>, EM extends ggk<? super S>> extends hbh<S, RM> {
   private final has a;
   private final hlp.d b;
   private final Function<S, czk> c;
   private final EM d;
   private final EM e;

   public hbj(gyq<S, RM> $$0, has $$1, hlp.d $$2, Function<S, czk> $$3, EM $$4, EM $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public hbj(gyq<S, RM> $$0, has $$1, EM $$2, hlp.d $$3, Function<S, czk> $$4) {
      this($$0, $$1, $$3, $$4, $$2, $$2);
   }

   public void a(fjy $$0, gqm $$1, int $$2, S $$3, float $$4, float $$5) {
      czk $$6 = this.c.apply($$3);
      dht $$7 = $$6.a(kk.D);
      if ($$7 != null && !$$7.d().isEmpty()) {
         EM $$8 = $$3.aj ? this.e : this.d;
         $$8.a($$3);
         this.a.a(this.b, $$7.d().get(), $$8, $$6, $$0, $$1, $$2);
      }
   }
}
