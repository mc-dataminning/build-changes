import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class gth<S extends dxr> implements doz.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = gqm.a($$0.i(), $$0.ax_());
         int $$4 = gqm.a($$1.i(), $$1.ax_());
         int $$5 = gqo.a($$3);
         int $$6 = gqo.a($$4);
         int $$7 = gqo.b($$3);
         int $$8 = gqo.b($$4);
         return gqo.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
