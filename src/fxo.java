import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class fxo<S extends dit> implements dav.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = fvj.a($$0.i(), $$0.aE_());
         int $$4 = fvj.a($$1.i(), $$1.aE_());
         int $$5 = fvk.a($$3);
         int $$6 = fvk.a($$4);
         int $$7 = fvk.b($$3);
         int $$8 = fvk.b($$4);
         return fvk.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
