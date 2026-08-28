import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class gsi<S extends dwx> implements doi.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = gpn.a($$0.i(), $$0.aw_());
         int $$4 = gpn.a($$1.i(), $$1.aw_());
         int $$5 = gpp.a($$3);
         int $$6 = gpp.a($$4);
         int $$7 = gpp.b($$3);
         int $$8 = gpp.b($$4);
         return gpp.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
