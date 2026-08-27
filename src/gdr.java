import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class gdr<S extends dnm> implements dfl.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = gbm.a($$0.i(), $$0.az_());
         int $$4 = gbm.a($$1.i(), $$1.az_());
         int $$5 = gbn.a($$3);
         int $$6 = gbn.a($$4);
         int $$7 = gbn.b($$3);
         int $$8 = gbn.b($$4);
         return gbn.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
