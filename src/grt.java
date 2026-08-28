import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class grt<S extends dwn> implements doc.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = goy.a($$0.i(), $$0.aw_());
         int $$4 = goy.a($$1.i(), $$1.aw_());
         int $$5 = gpa.a($$3);
         int $$6 = gpa.a($$4);
         int $$7 = gpa.b($$3);
         int $$8 = gpa.b($$4);
         return gpa.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
