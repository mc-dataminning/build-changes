import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class gtc<S extends dxm> implements dou.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = gqh.a($$0.i(), $$0.ax_());
         int $$4 = gqh.a($$1.i(), $$1.ax_());
         int $$5 = gqj.a($$3);
         int $$6 = gqj.a($$4);
         int $$7 = gqj.b($$3);
         int $$8 = gqj.b($$4);
         return gqj.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
