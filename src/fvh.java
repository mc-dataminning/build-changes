import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fvh(alg c) implements fvf {
   public static final MapCodec<fvh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alg.a.fieldOf("id").forGetter(fvh::c)).apply($$0, fvh::new));

   @Override
   public fvg a() {
      return fvg.e;
   }

   @Override
   public Either<fvf.b, fvf.c> b() {
      return Either.right(new fvf.c(this.c));
   }
}
