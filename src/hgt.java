import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgt() implements hgn {
   public static final MapCodec<hgt> a = MapCodec.unit(new hgt());

   @Override
   public boolean get(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3, czi $$4) {
      if ($$2 instanceof gpj $$5 && $$5.bR.g() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hgt> a() {
      return a;
   }
}
