import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class gol<S extends dtz> implements dlu.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = glt.a($$0.i(), $$0.aA_());
         int $$4 = glt.a($$1.i(), $$1.aA_());
         int $$5 = glv.a($$3);
         int $$6 = glv.a($$4);
         int $$7 = glv.b($$3);
         int $$8 = glv.b($$4);
         return glv.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
