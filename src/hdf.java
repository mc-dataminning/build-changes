import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hdf() implements hdh<bva> {
   public static final hdh.a<hdf, bva> a = hdh.a.a(MapCodec.unit(new hdf()), bva.c);

   @Nullable
   public bva a(cwo $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3, cwm $$4) {
      return $$2 == null ? null : $$2.fy();
   }

   @Override
   public hdh.a<hdf, bva> a() {
      return a;
   }
}
