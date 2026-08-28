import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hib() implements hia<alf<dhx>> {
   public static final Codec<alf<dhx>> a = alf.a(mh.bk);
   public static final hia.a<hib, alf<dhx>> b = hia.a.a(MapCodec.unit(new hib()), a);

   @Nullable
   public alf<dhx> a(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3, czi $$4) {
      dhv $$5 = $$0.a(kk.W);
      return $$5 == null ? null : $$5.a().e().orElse(null);
   }

   @Override
   public hia.a<hib, alf<dhx>> a() {
      return b;
   }

   @Override
   public Codec<alf<dhx>> b() {
      return a;
   }
}
