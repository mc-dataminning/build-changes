import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class gfm<S extends dpc> implements dhb.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = gdh.a($$0.i(), $$0.aA_());
         int $$4 = gdh.a($$1.i(), $$1.aA_());
         int $$5 = gdi.a($$3);
         int $$6 = gdi.a($$4);
         int $$7 = gdi.b($$3);
         int $$8 = gdi.b($$4);
         return gdi.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
