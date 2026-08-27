import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class gen<S extends doi> implements dgh.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = gci.a($$0.i(), $$0.aA_());
         int $$4 = gci.a($$1.i(), $$1.aA_());
         int $$5 = gcj.a($$3);
         int $$6 = gcj.a($$4);
         int $$7 = gcj.b($$3);
         int $$8 = gcj.b($$4);
         return gcj.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
