import java.util.function.Function;

public class hdb<S extends hfr, RM extends gic<? super S>, EM extends gic<? super S>> extends hcy<S, RM> {
   private final hcj a;
   private final hni.d b;
   private final Function<S, daa> c;
   private final EM d;
   private final EM e;

   public hdb(hah<S, RM> $$0, hcj $$1, hni.d $$2, Function<S, daa> $$3, EM $$4, EM $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public hdb(hah<S, RM> $$0, hcj $$1, EM $$2, hni.d $$3, Function<S, daa> $$4) {
      this($$0, $$1, $$3, $$4, $$2, $$2);
   }

   public void a(flq $$0, gsc $$1, int $$2, S $$3, float $$4, float $$5) {
      daa $$6 = this.c.apply($$3);
      dij $$7 = $$6.a(kl.D);
      if ($$7 != null && !$$7.d().isEmpty()) {
         EM $$8 = $$3.aj ? this.e : this.d;
         $$8.a($$3);
         this.a.a(this.b, $$7.d().get(), $$8, $$6, $$0, $$1, $$2);
      }
   }
}
