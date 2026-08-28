import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcc() implements hbw {
   public static final MapCodec<hcc> a = MapCodec.unit(new hcc());

   @Override
   public boolean a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3, cwm $$4) {
      if ($$2 instanceof gkv $$5 && $$5.cd.g() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hcc> a() {
      return a;
   }
}
