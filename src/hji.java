import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hji() implements hjq<alh<djx>> {
   public static final Codec<alh<djx>> a = alh.a(mh.bp);
   public static final hjq.a<hji, alh<djx>> b = hjq.a.a(MapCodec.unit(new hji()), a);

   @Nullable
   public alh<djx> a(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3, czw $$4) {
      return $$1 != null ? $$1.aj() : null;
   }

   @Override
   public hjq.a<hji, alh<djx>> a() {
      return b;
   }

   @Override
   public Codec<alh<djx>> b() {
      return a;
   }
}
