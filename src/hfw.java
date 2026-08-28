import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hfw() implements hga {
   public static final MapCodec<hfw> a = MapCodec.unit(new hfw());

   @Override
   public boolean get(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2, int $$3, czb $$4) {
      return $$0.r();
   }

   @Override
   public MapCodec<hfw> a() {
      return a;
   }
}
