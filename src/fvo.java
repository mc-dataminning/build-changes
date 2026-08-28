import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fvo(alg c) implements fvm {
   public static final MapCodec<fvo> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alg.a.fieldOf("id").forGetter(fvo::c)).apply($$0, fvo::new));

   @Override
   public fvn a() {
      return fvn.e;
   }

   @Override
   public Either<fvm.b, fvm.c> b() {
      return Either.right(new fvm.c(this.c));
   }
}
