import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fwf(alg c) implements fwd {
   public static final MapCodec<fwf> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alg.a.fieldOf("id").forGetter(fwf::c)).apply($$0, fwf::new));

   @Override
   public fwe a() {
      return fwe.e;
   }

   @Override
   public Either<fwd.b, fwd.c> b() {
      return Either.right(new fwd.c(this.c));
   }
}
