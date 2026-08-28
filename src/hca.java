import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hca() implements hbu {
   public static final MapCodec<hca> a = MapCodec.unit(new hca());

   @Override
   public boolean a(cwp $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3) {
      if ($$2 instanceof gkv $$4 && $$4.gi().f() == $$0) {
         return true;
      }

      return false;
   }

   @Override
   public MapCodec<hca> a() {
      return a;
   }
}
