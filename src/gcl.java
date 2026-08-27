import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class gcl<S extends dmo> implements deo.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = gag.a($$0.i(), $$0.az_());
         int $$4 = gag.a($$1.i(), $$1.az_());
         int $$5 = gah.a($$3);
         int $$6 = gah.a($$4);
         int $$7 = gah.b($$3);
         int $$8 = gah.b($$4);
         return gah.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
