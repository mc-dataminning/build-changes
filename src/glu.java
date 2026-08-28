import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class glu<S extends dsy> implements dkx.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = gjc.a($$0.i(), $$0.aA_());
         int $$4 = gjc.a($$1.i(), $$1.aA_());
         int $$5 = gje.a($$3);
         int $$6 = gje.a($$4);
         int $$7 = gje.b($$3);
         int $$8 = gje.b($$4);
         return gje.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
