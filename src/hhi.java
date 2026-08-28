import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hhi() implements hhn<czb> {
   public static final Codec<czb> a = czb.j;
   public static final hhn.a<hhi, czb> b = hhn.a.a(MapCodec.unit(new hhi()), a);

   public czb a(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2, int $$3, czb $$4) {
      return $$4;
   }

   @Override
   public hhn.a<hhi, czb> a() {
      return b;
   }

   @Override
   public Codec<czb> b() {
      return a;
   }
}
