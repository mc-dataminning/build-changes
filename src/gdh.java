import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class gdh<S extends dnd> implements dfc.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = gbc.a($$0.i(), $$0.az_());
         int $$4 = gbc.a($$1.i(), $$1.az_());
         int $$5 = gbd.a($$3);
         int $$6 = gbd.a($$4);
         int $$7 = gbd.b($$3);
         int $$8 = gbd.b($$4);
         return gbd.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
