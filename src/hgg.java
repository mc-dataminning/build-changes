import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgg() implements hga {
   public static final MapCodec<hgg> a = MapCodec.unit(new hgg());

   @Override
   public boolean get(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2, int $$3, czb $$4) {
      if ($$2 instanceof gox $$5 && $$5.bR.g() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hgg> a() {
      return a;
   }
}
