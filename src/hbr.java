import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hbr() implements hbu {
   public static final MapCodec<hbr> a = MapCodec.unit(new hbr());

   @Override
   public boolean a(cwp $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3) {
      return $$0.r();
   }

   @Override
   public MapCodec<hbr> a() {
      return a;
   }
}
