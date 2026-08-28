import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hih() implements hid {
   public static final MapCodec<hih> a = MapCodec.unit(new hih());

   @Override
   public boolean get(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3, czw $$4) {
      if ($$2 instanceof crx $$5 && $$5.ck != null) {
         bxl $$6 = gyp.a($$5);
         return $$2.a($$6) == $$0;
      }

      return false;
   }

   @Override
   public MapCodec<hih> a() {
      return a;
   }
}
