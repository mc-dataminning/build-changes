import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public record jw(float c) implements jt {
   public static final Codec<jw> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.c)).apply($$0, jw::new));
   public static final jt.a<jw> b = new jt.a<jw>() {
      public jw a(ju<jw> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$2 = $$1.readFloat();
         return new jw($$2);
      }

      public jw a(ju<jw> $$0, ue $$1) {
         return new jw($$1.readFloat());
      }
   };

   @Override
   public ju<jw> b() {
      return jv.H;
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.c);
   }

   @Override
   public String a() {
      return String.format(Locale.ROOT, "%s %.2f", kb.j.b(this.b()), this.c);
   }
}
