import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hce() implements hbw {
   public static final MapCodec<hce> a = MapCodec.unit(new hce());

   @Override
   public boolean a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3, cwm $$4) {
      if ($$2 instanceof gkv $$5 && $$5.gi().f() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hce> a() {
      return a;
   }
}
