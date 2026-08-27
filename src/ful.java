import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class ful<S extends dgd> implements cyg.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = fsg.a($$0.i(), $$0.aB_());
         int $$4 = fsg.a($$1.i(), $$1.aB_());
         int $$5 = fsh.a($$3);
         int $$6 = fsh.a($$4);
         int $$7 = fsh.b($$3);
         int $$8 = fsh.b($$4);
         return fsh.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
