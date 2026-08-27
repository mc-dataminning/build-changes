import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public record kz(float d) implements kw {
   public static final MapCodec<kz> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.d)).apply($$0, kz::new));
   public static final yv<wi, kz> b = yv.a(yt.h, $$0 -> $$0.d, kz::new);
   public static final kw.a<kz> c = new kw.a<kz>() {
      public kz a(kx<kz> $$0, StringReader $$1, iz.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$3 = $$1.readFloat();
         return new kz($$3);
      }
   };

   @Override
   public kx<kz> a() {
      return ky.J;
   }

   @Override
   public String a(iz.a $$0) {
      return String.format(Locale.ROOT, "%s %.2f", le.j.b(this.a()), this.d);
   }

   public float b() {
      return this.d;
   }
}
