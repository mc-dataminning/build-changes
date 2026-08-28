import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fuv(ale c) implements fut {
   public static final MapCodec<fuv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(ale.a.fieldOf("id").forGetter(fuv::c)).apply($$0, fuv::new));

   @Override
   public fuu a() {
      return fuu.e;
   }

   @Override
   public Either<fut.b, fut.c> b() {
      return Either.right(new fut.c(this.c));
   }
}
