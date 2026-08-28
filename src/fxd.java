import com.mojang.datafixers.util.Either;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record fxd(alr c) implements fxb {
   public static final MapCodec<fxd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(alr.a.fieldOf("id").forGetter(fxd::c)).apply($$0, fxd::new));

   @Override
   public fxc a() {
      return fxc.e;
   }

   @Override
   public Either<fxb.b, fxb.c> b() {
      return Either.right(new fxb.c(this.c));
   }
}
