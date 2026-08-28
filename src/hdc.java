import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hdc() implements hdb<akt<dex>> {
   public static final hdb.a<hdc, akt<dex>> a = hdb.a.a(MapCodec.unit(new hdc()), akt.a(mc.aZ));

   @Nullable
   public akt<dex> a(cwp $$0, @Nullable gfy $$1, @Nullable bvg $$2, int $$3, cwn $$4) {
      dew $$5 = $$0.a(kv.U);
      return $$5 == null ? null : $$5.a().e().orElse(null);
   }

   @Override
   public hdb.a<hdc, akt<dex>> a() {
      return a;
   }
}
