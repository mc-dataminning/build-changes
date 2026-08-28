import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public record hjk() implements hjs<alj<djz>> {
   public static final Codec<alj<djz>> a = alj.a(mi.bp);
   public static final hjs.a<hjk, alj<djz>> b = hjs.a.a(MapCodec.unit(new hjk()), a);

   @Nullable
   public alj<djz> a(daa $$0, @Nullable gmd $$1, @Nullable bxw $$2, int $$3, czy $$4) {
      return $$1 != null ? $$1.aj() : null;
   }

   @Override
   public hjs.a<hjk, alj<djz>> a() {
      return b;
   }

   @Override
   public Codec<alj<djz>> b() {
      return a;
   }
}
