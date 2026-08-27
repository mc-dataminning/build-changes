import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public record kd(float d) implements ka {
   public static final Codec<kd> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.d)).apply($$0, kd::new));
   public static final xs<vf, kd> b = xs.a(xq.f, $$0 -> $$0.d, kd::new);
   public static final ka.a<kd> c = new ka.a<kd>() {
      public kd a(kb<kd> $$0, StringReader $$1, in.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$3 = $$1.readFloat();
         return new kd($$3);
      }
   };

   @Override
   public kb<kd> a() {
      return kc.I;
   }

   @Override
   public String a(in.a $$0) {
      return String.format(Locale.ROOT, "%s %.2f", ki.j.b(this.a()), this.d);
   }

   public float b() {
      return this.d;
   }
}
