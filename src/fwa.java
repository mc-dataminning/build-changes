import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fwa(alg c) implements fvy {
   public static final MapCodec<fwa> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alg.a.fieldOf("id").forGetter(fwa::c)).apply($$0, fwa::new));

   @Override
   public fvz a() {
      return fvz.e;
   }

   @Override
   public Either<fvy.b, fvy.c> b() {
      return Either.right(new fvy.c(this.c));
   }
}
