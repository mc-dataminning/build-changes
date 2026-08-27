import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class fyt<S extends djl> implements dbm.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = fwo.a($$0.i(), $$0.aD_());
         int $$4 = fwo.a($$1.i(), $$1.aD_());
         int $$5 = fwp.a($$3);
         int $$6 = fwp.a($$4);
         int $$7 = fwp.b($$3);
         int $$8 = fwp.b($$4);
         return fwp.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
