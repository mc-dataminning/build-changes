import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class fvw<S extends dhd> implements czf.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = ftr.a($$0.i(), $$0.aE_());
         int $$4 = ftr.a($$1.i(), $$1.aE_());
         int $$5 = fts.a($$3);
         int $$6 = fts.a($$4);
         int $$7 = fts.b($$3);
         int $$8 = fts.b($$4);
         return fts.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
