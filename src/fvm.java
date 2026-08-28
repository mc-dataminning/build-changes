import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fvm {
   MapCodec<fvm> b = fvn.f.dispatchMap(fvm::a, fvn::a);

   fvn a();

   Either<fvm.b, fvm.c> b();

   public static record a(fvm b, fva.a c) {
      public static final Codec<fvm.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fvm.b.forGetter(fvm.a::a), fva.a.a.optionalFieldOf("filter", fva.a.b).forGetter(fvm.a::b)).apply($$0, fvm.a::new)
      );

      public fvm a() {
         return this.b;
      }

      public fva.a b() {
         return this.c;
      }
   }

   public interface b {
      fhj load(avd var1) throws IOException;
   }

   public static record c(alg a) {
   }
}
