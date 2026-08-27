import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class fzv<S extends dki> implements dcj.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = fxq.a($$0.i(), $$0.aC_());
         int $$4 = fxq.a($$1.i(), $$1.aC_());
         int $$5 = fxr.a($$3);
         int $$6 = fxr.a($$4);
         int $$7 = fxr.b($$3);
         int $$8 = fxr.b($$4);
         return fxr.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
