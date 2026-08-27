import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public record jx(float c) implements ju {
   public static final Codec<jx> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.c)).apply($$0, jx::new));
   public static final ju.a<jx> b = new ju.a<jx>() {
      public jx a(jv<jx> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$2 = $$1.readFloat();
         return new jx($$2);
      }

      public jx a(jv<jx> $$0, ty $$1) {
         return new jx($$1.readFloat());
      }
   };

   @Override
   public jv<jx> b() {
      return jw.F;
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.c);
   }

   @Override
   public String a() {
      return String.format(Locale.ROOT, "%s %.2f", kc.k.b(this.b()), this.c);
   }
}
