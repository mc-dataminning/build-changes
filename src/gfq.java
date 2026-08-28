import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class gfq<S extends dpg> implements dhf.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = gdl.a($$0.i(), $$0.ay_());
         int $$4 = gdl.a($$1.i(), $$1.ay_());
         int $$5 = gdm.a($$3);
         int $$6 = gdm.a($$4);
         int $$7 = gdm.b($$3);
         int $$8 = gdm.b($$4);
         return gdm.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
