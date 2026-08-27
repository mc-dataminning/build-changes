import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public record ky(float d) implements kv {
   public static final Codec<ky> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.d)).apply($$0, ky::new));
   public static final ys<wf, ky> b = ys.a(yq.h, $$0 -> $$0.d, ky::new);
   public static final kv.a<ky> c = new kv.a<ky>() {
      public ky a(kw<ky> $$0, StringReader $$1, iy.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$3 = $$1.readFloat();
         return new ky($$3);
      }
   };

   @Override
   public kw<ky> a() {
      return kx.H;
   }

   @Override
   public String a(iy.a $$0) {
      return String.format(Locale.ROOT, "%s %.2f", ld.j.b(this.a()), this.d);
   }

   public float b() {
      return this.d;
   }
}
