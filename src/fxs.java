import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fxs(alk c) implements fxq {
   public static final MapCodec<fxs> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alk.a.fieldOf("id").forGetter(fxs::c)).apply($$0, fxs::new));

   @Override
   public fxr a() {
      return fxr.e;
   }

   @Override
   public Either<fxq.b, fxq.c> b() {
      return Either.right(new fxq.c(this.c));
   }
}
