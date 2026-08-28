import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class gon<S extends dtz> implements dlu.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = glu.a($$0.i(), $$0.aA_());
         int $$4 = glu.a($$1.i(), $$1.aA_());
         int $$5 = glw.a($$3);
         int $$6 = glw.a($$4);
         int $$7 = glw.b($$3);
         int $$8 = glw.b($$4);
         return glw.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
