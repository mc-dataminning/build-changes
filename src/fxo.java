import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fxo {
   MapCodec<fxo> b = fxp.f.dispatchMap(fxo::a, fxp::a);

   fxp a();

   Either<fxo.b, fxo.c> b();

   public static record a(fxo b, fxc.a c) {
      public static final Codec<fxo.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fxo.b.forGetter(fxo.a::a), fxc.a.a.optionalFieldOf("filter", fxc.a.b).forGetter(fxo.a::b)).apply($$0, fxo.a::new)
      );

      public fxo a() {
         return this.b;
      }

      public fxc.a b() {
         return this.c;
      }
   }

   public interface b {
      fik load(avf var1) throws IOException;
   }

   public static record c(ali a) {
   }
}
