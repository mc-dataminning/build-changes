import java.util.function.Function;

public class hap<S extends hdf, RM extends gfq<? super S>, EM extends gfq<? super S>> extends han<S, RM> {
   private final gzy a;
   private final hkv.d b;
   private final Function<S, cyy> c;
   private final EM d;
   private final EM e;

   public hap(gxw<S, RM> $$0, gzy $$1, hkv.d $$2, Function<S, cyy> $$3, EM $$4, EM $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public hap(gxw<S, RM> $$0, gzy $$1, EM $$2, hkv.d $$3, Function<S, cyy> $$4) {
      this($$0, $$1, $$3, $$4, $$2, $$2);
   }

   public void a(fjc $$0, gps $$1, int $$2, S $$3, float $$4, float $$5) {
      cyy $$6 = this.c.apply($$3);
      dhh $$7 = $$6.a(kj.D);
      if ($$7 != null && !$$7.d().isEmpty()) {
         EM $$8 = $$3.aj ? this.e : this.d;
         $$8.a($$3);
         this.a.a(this.b, $$7.d().get(), $$8, $$6, $$0, $$1, $$2);
      }
   }
}
