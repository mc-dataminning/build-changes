import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgz() implements hgt {
   public static final MapCodec<hgz> a = MapCodec.unit(new hgz());

   @Override
   public boolean get(czn $$0, @Nullable gkq $$1, @Nullable bxj $$2, int $$3, czl $$4) {
      if ($$2 instanceof gpo $$5 && $$5.bR.g() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hgz> a() {
      return a;
   }
}
