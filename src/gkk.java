import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class gkk<S extends dsg> implements dkf.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = ghs.a($$0.i(), $$0.aC_());
         int $$4 = ghs.a($$1.i(), $$1.aC_());
         int $$5 = ghu.a($$3);
         int $$6 = ghu.a($$4);
         int $$7 = ghu.b($$3);
         int $$8 = ghu.b($$4);
         return ghu.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
