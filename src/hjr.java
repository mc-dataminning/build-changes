import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hjr() implements hjq<alh<dil>> {
   public static final Codec<alh<dil>> a = alh.a(mh.bk);
   public static final hjq.a<hjr, alh<dil>> b = hjq.a.a(MapCodec.unit(new hjr()), a);

   @Nullable
   public alh<dil> a(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3, czw $$4) {
      dij $$5 = $$0.a(kk.W);
      return $$5 == null ? null : $$5.a().e().orElse(null);
   }

   @Override
   public hjq.a<hjr, alh<dil>> a() {
      return b;
   }

   @Override
   public Codec<alh<dil>> b() {
      return a;
   }
}
