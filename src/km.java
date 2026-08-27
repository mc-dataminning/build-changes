import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public record km(float d) implements kj {
   public static final Codec<km> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.d)).apply($$0, km::new));
   public static final ye<vr, km> b = ye.a(yc.h, $$0 -> $$0.d, km::new);
   public static final kj.a<km> c = new kj.a<km>() {
      public km a(kk<km> $$0, StringReader $$1, in.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$3 = $$1.readFloat();
         return new km($$3);
      }
   };

   @Override
   public kk<km> a() {
      return kl.I;
   }

   @Override
   public String a(in.a $$0) {
      return String.format(Locale.ROOT, "%s %.2f", kr.j.b(this.a()), this.d);
   }

   public float b() {
      return this.d;
   }
}
