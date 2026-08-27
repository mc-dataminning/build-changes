import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class fxp<S extends dit> implements dav.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = fvk.a($$0.i(), $$0.aE_());
         int $$4 = fvk.a($$1.i(), $$1.aE_());
         int $$5 = fvl.a($$3);
         int $$6 = fvl.a($$4);
         int $$7 = fvl.b($$3);
         int $$8 = fvl.b($$4);
         return fvl.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
