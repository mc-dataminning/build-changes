import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fut {
   MapCodec<fut> b = fuu.f.dispatchMap(fut::a, fuu::a);

   fuu a();

   Either<fut.b, fut.c> b();

   public static record a(fut b, fuh.a c) {
      public static final Codec<fut.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fut.b.forGetter(fut.a::a), fuh.a.a.optionalFieldOf("filter", fuh.a.b).forGetter(fut.a::b)).apply($$0, fut.a::new)
      );

      public fut a() {
         return this.b;
      }

      public fuh.a b() {
         return this.c;
      }
   }

   public interface b {
      fgp load(avb var1) throws IOException;
   }

   public static record c(ale a) {
   }
}
