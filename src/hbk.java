import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class hbk implements hbl {
   public static final hbl a = new hbk();

   @Override
   public void a(hbo $$0, cwp $$1, hbm $$2, cwn $$3, @Nullable gfz $$4, @Nullable bvh $$5, int $$6) {
   }

   public static record a() implements hbl.b {
      public static final MapCodec<hbk.a> a = MapCodec.unit(hbk.a::new);

      @Override
      public void a(hhk.a $$0) {
      }

      @Override
      public hbl a(hbl.a $$0) {
         return hbk.a;
      }

      @Override
      public MapCodec<hbk.a> a() {
         return a;
      }
   }
}
