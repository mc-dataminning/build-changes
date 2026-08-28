import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class gha<S extends dqh> implements dif.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = gev.a($$0.i(), $$0.aD_());
         int $$4 = gev.a($$1.i(), $$1.aD_());
         int $$5 = gew.a($$3);
         int $$6 = gew.a($$4);
         int $$7 = gew.b($$3);
         int $$8 = gew.b($$4);
         return gew.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
