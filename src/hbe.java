import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hbe implements hbi {
   static final hbi a = new hbe();

   @Override
   public void a(hbl $$0, cwp $$1, hbj $$2, cwn $$3, @Nullable gfy $$4, @Nullable bvg $$5, int $$6) {
      cwp $$7 = cvc.i($$1);
      if (!$$7.f()) {
         $$2.a($$0, $$7, $$3, $$4, $$5, $$6);
      }
   }

   public static record a() implements hbi.b {
      public static final MapCodec<hbe.a> a = MapCodec.unit(new hbe.a());

      @Override
      public MapCodec<hbe.a> a() {
         return a;
      }

      @Override
      public hbi a(hbi.a $$0) {
         return hbe.a;
      }

      @Override
      public void a(hhd.a $$0) {
      }
   }
}
