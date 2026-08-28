import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hbz() implements hbu {
   public static final MapCodec<hbz> a = MapCodec.unit(new hbz());

   @Override
   public boolean a(cwp $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3) {
      if ($$2 instanceof gkv $$4 && $$4.cd.g() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hbz> a() {
      return a;
   }
}
