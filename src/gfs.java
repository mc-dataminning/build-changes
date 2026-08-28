import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class gfs<S extends dpi> implements dhh.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = gdn.a($$0.i(), $$0.ay_());
         int $$4 = gdn.a($$1.i(), $$1.ay_());
         int $$5 = gdo.a($$3);
         int $$6 = gdo.a($$4);
         int $$7 = gdo.b($$3);
         int $$8 = gdo.b($$4);
         return gdo.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
