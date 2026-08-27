import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class fzt<S extends dkg> implements dch.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = fxo.a($$0.i(), $$0.aC_());
         int $$4 = fxo.a($$1.i(), $$1.aC_());
         int $$5 = fxp.a($$3);
         int $$6 = fxp.a($$4);
         int $$7 = fxp.b($$3);
         int $$8 = fxp.b($$4);
         return fxp.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
