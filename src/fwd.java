import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fwd {
   MapCodec<fwd> b = fwe.f.dispatchMap(fwd::a, fwe::a);

   fwe a();

   Either<fwd.b, fwd.c> b();

   public static record a(fwd b, fvr.a c) {
      public static final Codec<fwd.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fwd.b.forGetter(fwd.a::a), fvr.a.a.optionalFieldOf("filter", fvr.a.b).forGetter(fwd.a::b)).apply($$0, fwd.a::new)
      );

      public fwd a() {
         return this.b;
      }

      public fvr.a b() {
         return this.c;
      }
   }

   public interface b {
      fhw load(avd var1) throws IOException;
   }

   public static record c(alg a) {
   }
}
