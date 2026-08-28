import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hjl() implements hjq<czw> {
   public static final Codec<czw> a = czw.j;
   public static final hjq.a<hjl, czw> b = hjq.a.a(MapCodec.unit(new hjl()), a);

   public czw a(czy $$0, @Nullable gmb $$1, @Nullable bxu $$2, int $$3, czw $$4) {
      return $$4;
   }

   @Override
   public hjq.a<hjl, czw> a() {
      return b;
   }

   @Override
   public Codec<czw> b() {
      return a;
   }
}
