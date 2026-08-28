import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class gfp<S extends dpf> implements dhe.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = gdk.a($$0.i(), $$0.az_());
         int $$4 = gdk.a($$1.i(), $$1.az_());
         int $$5 = gdl.a($$3);
         int $$6 = gdl.a($$4);
         int $$7 = gdl.b($$3);
         int $$8 = gdl.b($$4);
         return gdl.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
