import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hgh() implements hgp<ald<dip>> {
   public static final Codec<ald<dip>> a = ald.a(mg.bm);
   public static final hgp.a<hgh, ald<dip>> b = hgp.a.a(MapCodec.unit(new hgh()), a);

   @Nullable
   public ald<dip> a(cys $$0, @Nullable gjd $$1, @Nullable bwz $$2, int $$3, cyq $$4) {
      return $$1 != null ? $$1.aj() : null;
   }

   @Override
   public hgp.a<hgh, ald<dip>> a() {
      return b;
   }

   @Override
   public Codec<ald<dip>> b() {
      return a;
   }
}
