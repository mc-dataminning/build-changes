import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hbg implements hbl {
   static final hbl a = new hbg();

   @Override
   public void a(hbo $$0, cwp $$1, hbm $$2, cwn $$3, @Nullable gfz $$4, @Nullable bvh $$5, int $$6) {
      cwp $$7 = cvc.i($$1);
      if (!$$7.f()) {
         $$2.a($$0, $$7, $$3, $$4, $$5, $$6);
      }
   }

   public static record a() implements hbl.b {
      public static final MapCodec<hbg.a> a = MapCodec.unit(new hbg.a());

      @Override
      public MapCodec<hbg.a> a() {
         return a;
      }

      @Override
      public hbl a(hbl.a $$0) {
         return hbg.a;
      }

      @Override
      public void a(hhk.a $$0) {
      }
   }
}
