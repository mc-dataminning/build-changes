import java.util.function.Function;

public class haa<S extends hcp, RM extends gfd<? super S>, EM extends gfd<? super S>> extends gzy<S, RM> {
   private final gzj a;
   private final hkf.d b;
   private final Function<S, cys> c;
   private final EM d;
   private final EM e;

   public haa(gxh<S, RM> $$0, gzj $$1, hkf.d $$2, Function<S, cys> $$3, EM $$4, EM $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public haa(gxh<S, RM> $$0, gzj $$1, EM $$2, hkf.d $$3, Function<S, cys> $$4) {
      this($$0, $$1, $$3, $$4, $$2, $$2);
   }

   public void a(fiq $$0, gpd $$1, int $$2, S $$3, float $$4, float $$5) {
      cys $$6 = this.c.apply($$3);
      dhb $$7 = $$6.a(kj.D);
      if ($$7 != null && !$$7.d().isEmpty()) {
         EM $$8 = $$3.aj ? this.e : this.d;
         $$8.a($$3);
         this.a.a(this.b, $$7.d().get(), $$8, $$6, $$0, $$1, $$2);
      }
   }
}
