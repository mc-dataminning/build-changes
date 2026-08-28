import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hek implements hep {
   static final hep a = new hek();

   @Override
   public void a(hes $$0, cys $$1, heq $$2, cyq $$3, @Nullable gjd $$4, @Nullable bwz $$5, int $$6) {
      cys $$7 = cxh.i($$1);
      if (!$$7.f()) {
         $$2.a($$0, $$7, $$3, $$4, $$5, $$6);
      }
   }

   public static record a() implements hep.b {
      public static final MapCodec<hek.a> a = MapCodec.unit(new hek.a());

      @Override
      public MapCodec<hek.a> a() {
         return a;
      }

      @Override
      public hep a(hep.a $$0) {
         return hek.a;
      }

      @Override
      public void a(hkr.a $$0) {
      }
   }
}
