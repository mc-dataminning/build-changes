import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class gut<S extends dye> implements dpm.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = grx.a($$0.i(), $$0.aB_());
         int $$4 = grx.a($$1.i(), $$1.aB_());
         int $$5 = grz.a($$3);
         int $$6 = grz.a($$4);
         int $$7 = grz.b($$3);
         int $$8 = grz.b($$4);
         return grz.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
