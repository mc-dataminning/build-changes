import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class fxw<S extends dix> implements daz.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = fvr.a($$0.i(), $$0.aE_());
         int $$4 = fvr.a($$1.i(), $$1.aE_());
         int $$5 = fvs.a($$3);
         int $$6 = fvs.a($$4);
         int $$7 = fvs.b($$3);
         int $$8 = fvs.b($$4);
         return fvs.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
