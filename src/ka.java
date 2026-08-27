import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public record ka(float d) implements jx {
   public static final Codec<ka> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.d)).apply($$0, ka::new));
   public static final xo<vb, ka> b = xo.a(xm.f, $$0 -> $$0.d, ka::new);
   public static final jx.a<ka> c = new jx.a<ka>() {
      public ka a(jy<ka> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$2 = $$1.readFloat();
         return new ka($$2);
      }
   };

   @Override
   public jy<ka> b() {
      return jz.H;
   }

   @Override
   public String a() {
      return String.format(Locale.ROOT, "%s %.2f", kf.j.b(this.b()), this.d);
   }

   public float c() {
      return this.d;
   }
}
