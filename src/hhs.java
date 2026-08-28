import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hhs() implements hia<alf<djh>> {
   public static final Codec<alf<djh>> a = alf.a(mh.bo);
   public static final hia.a<hhs, alf<djh>> b = hia.a.a(MapCodec.unit(new hhs()), a);

   @Nullable
   public alf<djh> a(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3, czi $$4) {
      return $$1 != null ? $$1.aj() : null;
   }

   @Override
   public hia.a<hhs, alf<djh>> a() {
      return b;
   }

   @Override
   public Codec<alf<djh>> b() {
      return a;
   }
}
