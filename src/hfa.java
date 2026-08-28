import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hfa implements hff {
   static final hff a = new hfa();

   @Override
   public void a(hfi $$0, cyy $$1, hfg $$2, cyw $$3, @Nullable gjr $$4, @Nullable bxc $$5, int $$6) {
      cyy $$7 = cxn.i($$1);
      if (!$$7.f()) {
         $$2.a($$0, $$7, $$3, $$4, $$5, $$6);
      }
   }

   public static record a() implements hff.b {
      public static final MapCodec<hfa.a> a = MapCodec.unit(new hfa.a());

      @Override
      public MapCodec<hfa.a> a() {
         return a;
      }

      @Override
      public hff a(hff.a $$0) {
         return hfa.a;
      }

      @Override
      public void a(hlh.a $$0) {
      }
   }
}
