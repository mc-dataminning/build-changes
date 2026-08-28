import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fvy {
   MapCodec<fvy> b = fvz.f.dispatchMap(fvy::a, fvz::a);

   fvz a();

   Either<fvy.b, fvy.c> b();

   public static record a(fvy b, fvm.a c) {
      public static final Codec<fvy.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fvy.b.forGetter(fvy.a::a), fvm.a.a.optionalFieldOf("filter", fvm.a.b).forGetter(fvy.a::b)).apply($$0, fvy.a::new)
      );

      public fvy a() {
         return this.b;
      }

      public fvm.a b() {
         return this.c;
      }
   }

   public interface b {
      fhr load(avd var1) throws IOException;
   }

   public static record c(alg a) {
   }
}
