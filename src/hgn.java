import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgn() implements hgp<bws> {
   public static final Codec<bws> a = bws.c;
   public static final hgp.a<hgn, bws> b = hgp.a.a(MapCodec.unit(new hgn()), a);

   @Nullable
   public bws a(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3, cyq $$4) {
      return $$2 == null ? null : $$2.fx();
   }

   @Override
   public hgp.a<hgn, bws> a() {
      return b;
   }

   @Override
   public Codec<bws> b() {
      return a;
   }
}
