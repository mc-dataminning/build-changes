import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class gga<S extends dpn> implements dhm.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = gdv.a($$0.i(), $$0.az_());
         int $$4 = gdv.a($$1.i(), $$1.az_());
         int $$5 = gdw.a($$3);
         int $$6 = gdw.a($$4);
         int $$7 = gdw.b($$3);
         int $$8 = gdw.b($$4);
         return gdw.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
