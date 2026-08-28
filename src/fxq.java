import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fxq(ali c) implements fxo {
   public static final MapCodec<fxq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ali.a.fieldOf("id").forGetter(fxq::c)).apply($$0, fxq::new));

   @Override
   public fxp a() {
      return fxp.e;
   }

   @Override
   public Either<fxo.b, fxo.c> b() {
      return Either.right(new fxo.c(this.c));
   }
}
