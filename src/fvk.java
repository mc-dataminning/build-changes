import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class fvk<S extends dgv> implements cyx.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = ftf.a($$0.i(), $$0.aB_());
         int $$4 = ftf.a($$1.i(), $$1.aB_());
         int $$5 = ftg.a($$3);
         int $$6 = ftg.a($$4);
         int $$7 = ftg.b($$3);
         int $$8 = ftg.b($$4);
         return ftg.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
