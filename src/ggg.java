import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class ggg<S extends dpp> implements dho.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = geb.a($$0.i(), $$0.az_());
         int $$4 = geb.a($$1.i(), $$1.az_());
         int $$5 = gec.a($$3);
         int $$6 = gec.a($$4);
         int $$7 = gec.b($$3);
         int $$8 = gec.b($$4);
         return gec.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
