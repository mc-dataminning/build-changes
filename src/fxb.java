import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.io.IOException;

public interface fxb {
   MapCodec<fxb> b = fxc.f.dispatchMap(fxb::a, fxc::a);

   fxc a();

   Either<fxb.b, fxb.c> b();

   public static record a(fxb b, fwp.a c) {
      public static final Codec<fxb.a> a = RecordCodecBuilder.create(
         $$0 -> $$0.group(fxb.b.forGetter(fxb.a::a), fwp.a.a.optionalFieldOf("filter", fwp.a.b).forGetter(fxb.a::b)).apply($$0, fxb.a::new)
      );

      public fxb a() {
         return this.b;
      }

      public fwp.a b() {
         return this.c;
      }
   }

   public interface b {
      fis load(avo var1) throws IOException;
   }

   public static record c(alr a) {
   }
}
