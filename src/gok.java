import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class gok<S extends dtx> implements dls.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = glr.a($$0.i(), $$0.aA_());
         int $$4 = glr.a($$1.i(), $$1.aA_());
         int $$5 = glt.a($$3);
         int $$6 = glt.a($$4);
         int $$7 = glt.b($$3);
         int $$8 = glt.b($$4);
         return glt.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
