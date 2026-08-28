import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fvf {
   MapCodec<fvf> b = fvg.f.dispatchMap(fvf::a, fvg::a);

   fvg a();

   Either<fvf.b, fvf.c> b();

   public static record a(fvf b, fut.a c) {
      public static final Codec<fvf.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fvf.b.forGetter(fvf.a::a), fut.a.a.optionalFieldOf("filter", fut.a.b).forGetter(fvf.a::b)).apply($$0, fvf.a::new)
      );

      public fvf a() {
         return this.b;
      }

      public fut.a b() {
         return this.c;
      }
   }

   public interface b {
      fhb load(avd var1) throws IOException;
   }

   public static record c(alg a) {
   }
}
