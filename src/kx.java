import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public record kx(float d) implements ku {
   public static final Codec<kx> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.d)).apply($$0, kx::new));
   public static final yq<wd, kx> b = yq.a(yo.h, $$0 -> $$0.d, kx::new);
   public static final ku.a<kx> c = new ku.a<kx>() {
      public kx a(kv<kx> $$0, StringReader $$1, ix.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$3 = $$1.readFloat();
         return new kx($$3);
      }
   };

   @Override
   public kv<kx> a() {
      return kw.H;
   }

   @Override
   public String a(ix.a $$0) {
      return String.format(Locale.ROOT, "%s %.2f", lc.j.b(this.a()), this.d);
   }

   public float b() {
      return this.d;
   }
}
