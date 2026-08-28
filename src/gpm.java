import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class gpm<S extends dus> implements dmm.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = gmt.a($$0.i(), $$0.aA_());
         int $$4 = gmt.a($$1.i(), $$1.aA_());
         int $$5 = gmv.a($$3);
         int $$6 = gmv.a($$4);
         int $$7 = gmv.b($$3);
         int $$8 = gmv.b($$4);
         return gmv.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
