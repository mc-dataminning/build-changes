import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hjo() implements hjq<bxl> {
   public static final Codec<bxl> a = bxl.c;
   public static final hjq.a<hjo, bxl> b = hjq.a.a(MapCodec.unit(new hjo()), a);

   @Nullable
   public bxl a(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3, czw $$4) {
      return $$2 == null ? null : $$2.fy();
   }

   @Override
   public hjq.a<hjo, bxl> a() {
      return b;
   }

   @Override
   public Codec<bxl> b() {
      return a;
   }
}
