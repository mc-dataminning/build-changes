import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hhv() implements hia<czi> {
   public static final Codec<czi> a = czi.j;
   public static final hia.a<hhv, czi> b = hia.a.a(MapCodec.unit(new hhv()), a);

   public czi a(czk $$0, @Nullable gkl $$1, @Nullable bxj $$2, int $$3, czi $$4) {
      return $$4;
   }

   @Override
   public hia.a<hhv, czi> a() {
      return b;
   }

   @Override
   public Codec<czi> b() {
      return a;
   }
}
