import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgq() implements hgp<ald<dhf>> {
   public static final Codec<ald<dhf>> a = ald.a(mg.bi);
   public static final hgp.a<hgq, ald<dhf>> b = hgp.a.a(MapCodec.unit(new hgq()), a);

   @Nullable
   public ald<dhf> a(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3, cyq $$4) {
      dhd $$5 = $$0.a(kj.W);
      return $$5 == null ? null : $$5.a().e().orElse(null);
   }

   @Override
   public hgp.a<hgq, ald<dhf>> a() {
      return b;
   }

   @Override
   public Codec<ald<dhf>> b() {
      return a;
   }
}
