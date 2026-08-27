import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public record kc(float d) implements jz {
   public static final Codec<kc> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.d)).apply($$0, kc::new));
   public static final xq<vd, kc> b = xq.a(xo.f, $$0 -> $$0.d, kc::new);
   public static final jz.a<kc> c = new jz.a<kc>() {
      public kc a(ka<kc> $$0, StringReader $$1, in.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$3 = $$1.readFloat();
         return new kc($$3);
      }
   };

   @Override
   public ka<kc> a() {
      return kb.H;
   }

   @Override
   public String a(in.a $$0) {
      return String.format(Locale.ROOT, "%s %.2f", kh.j.b(this.a()), this.d);
   }

   public float b() {
      return this.d;
   }
}
