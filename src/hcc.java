import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hcc() implements hbu {
   public static final MapCodec<hcc> a = MapCodec.unit(new hcc());

   @Override
   public boolean a(cwp $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3) {
      return $$2 == null ? false : $$2.fz() && $$2.fB() == $$0;
   }

   @Override
   public MapCodec<hcc> a() {
      return a;
   }
}
