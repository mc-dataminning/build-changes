import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hjn() implements hjs<czy> {
   public static final Codec<czy> a = czy.j;
   public static final hjs.a<hjn, czy> b = hjs.a.a(MapCodec.unit(new hjn()), a);

   public czy a(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3, czy $$4) {
      return $$4;
   }

   @Override
   public hjs.a<hjn, czy> a() {
      return b;
   }

   @Override
   public Codec<czy> b() {
      return a;
   }
}
