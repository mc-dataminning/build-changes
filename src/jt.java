import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public record jt(float c) implements jq {
   public static final Codec<jt> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.c)).apply($$0, jt::new));
   public static final jq.a<jt> b = new jq.a<jt>() {
      public jt a(jr<jt> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$2 = $$1.readFloat();
         return new jt($$2);
      }

      public jt a(jr<jt> $$0, tl $$1) {
         return new jt($$1.readFloat());
      }
   };

   @Override
   public jr<jt> b() {
      return js.F;
   }

   @Override
   public void a(tl $$0) {
      $$0.a(this.c);
   }

   @Override
   public String a() {
      return String.format(Locale.ROOT, "%s %.2f", jy.k.b(this.b()), this.c);
   }
}
