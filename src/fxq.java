import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fxq {
   MapCodec<fxq> b = fxr.f.dispatchMap(fxq::a, fxr::a);

   fxr a();

   Either<fxq.b, fxq.c> b();

   public static record a(fxq b, fxe.a c) {
      public static final Codec<fxq.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fxq.b.forGetter(fxq.a::a), fxe.a.a.optionalFieldOf("filter", fxe.a.b).forGetter(fxq.a::b)).apply($$0, fxq.a::new)
      );

      public fxq a() {
         return this.b;
      }

      public fxe.a b() {
         return this.c;
      }
   }

   public interface b {
      fim load(avh var1) throws IOException;
   }

   public static record c(alk a) {
   }
}
