import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hhl() implements hhn<bwx> {
   public static final Codec<bwx> a = bwx.c;
   public static final hhn.a<hhl, bwx> b = hhn.a.a(MapCodec.unit(new hhl()), a);

   @Nullable
   public bwx a(czd $$0, @Nullable gjz $$1, @Nullable bxe $$2, int $$3, czb $$4) {
      return $$2 == null ? null : $$2.fy();
   }

   @Override
   public hhn.a<hhl, bwx> a() {
      return b;
   }

   @Override
   public Codec<bwx> b() {
      return a;
   }
}
