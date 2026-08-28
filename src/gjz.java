import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class gjz<S extends drv> implements djt.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = ghh.a($$0.i(), $$0.aC_());
         int $$4 = ghh.a($$1.i(), $$1.aC_());
         int $$5 = ghj.a($$3);
         int $$6 = ghj.a($$4);
         int $$7 = ghj.b($$3);
         int $$8 = ghj.b($$4);
         return ghj.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
