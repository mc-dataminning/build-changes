import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class gfr<S extends dph> implements dhg.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = gdm.a($$0.i(), $$0.ay_());
         int $$4 = gdm.a($$1.i(), $$1.ay_());
         int $$5 = gdn.a($$3);
         int $$6 = gdn.a($$4);
         int $$7 = gdn.b($$3);
         int $$8 = gdn.b($$4);
         return gdn.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
