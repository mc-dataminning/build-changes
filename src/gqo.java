import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class gqo<S extends dvl> implements dnc.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = gnu.a($$0.i(), $$0.aw_());
         int $$4 = gnu.a($$1.i(), $$1.aw_());
         int $$5 = gnw.a($$3);
         int $$6 = gnw.a($$4);
         int $$7 = gnw.b($$3);
         int $$8 = gnw.b($$4);
         return gnw.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
