import java.util.function.Function;

public class hax<S extends hdn, RM extends gfy<? super S>, EM extends gfy<? super S>> extends hav<S, RM> {
   private final hag a;
   private final hld.d b;
   private final Function<S, czd> c;
   private final EM d;
   private final EM e;

   public hax(gye<S, RM> $$0, hag $$1, hld.d $$2, Function<S, czd> $$3, EM $$4, EM $$5) {
      super($$0);
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.d = $$4;
      this.e = $$5;
   }

   public hax(gye<S, RM> $$0, hag $$1, EM $$2, hld.d $$3, Function<S, czd> $$4) {
      this($$0, $$1, $$3, $$4, $$2, $$2);
   }

   public void a(fjj $$0, gqa $$1, int $$2, S $$3, float $$4, float $$5) {
      czd $$6 = this.c.apply($$3);
      dhm $$7 = $$6.a(kj.D);
      if ($$7 != null && !$$7.d().isEmpty()) {
         EM $$8 = $$3.aj ? this.e : this.d;
         $$8.a($$3);
         this.a.a(this.b, $$7.d().get(), $$8, $$6, $$0, $$1, $$2);
      }
   }
}
