import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class gju<S extends drs> implements djq.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = ghc.a($$0.i(), $$0.aB_());
         int $$4 = ghc.a($$1.i(), $$1.aB_());
         int $$5 = ghe.a($$3);
         int $$6 = ghe.a($$4);
         int $$7 = ghe.b($$3);
         int $$8 = ghe.b($$4);
         return ghe.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
