import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgk() implements hgp<cyq> {
   public static final Codec<cyq> a = cyq.j;
   public static final hgp.a<hgk, cyq> b = hgp.a.a(MapCodec.unit(new hgk()), a);

   public cyq a(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3, cyq $$4) {
      return $$4;
   }

   @Override
   public hgp.a<hgk, cyq> a() {
      return b;
   }

   @Override
   public Codec<cyq> b() {
      return a;
   }
}
