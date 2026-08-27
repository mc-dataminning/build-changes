import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public record jy(float c) implements jv {
   public static final Codec<jy> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.c)).apply($$0, jy::new));
   public static final jv.a<jy> b = new jv.a<jy>() {
      public jy a(jw<jy> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$2 = $$1.readFloat();
         return new jy($$2);
      }

      public jy a(jw<jy> $$0, uj $$1) {
         return new jy($$1.readFloat());
      }
   };

   @Override
   public jw<jy> b() {
      return jx.H;
   }

   @Override
   public void a(uj $$0) {
      $$0.a(this.c);
   }

   @Override
   public String a() {
      return String.format(Locale.ROOT, "%s %.2f", kd.j.b(this.b()), this.c);
   }
}
