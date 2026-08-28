import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class gue<S extends dyo> implements dpw.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = gri.a($$0.i(), $$0.ax_());
         int $$4 = gri.a($$1.i(), $$1.ax_());
         int $$5 = grk.a($$3);
         int $$6 = grk.a($$4);
         int $$7 = grk.b($$3);
         int $$8 = grk.b($$4);
         return grk.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
