import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public record iw(float c) implements it {
   public static final Codec<iw> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.c)).apply($$0, iw::new));
   public static final it.a<iw> b = new it.a<iw>() {
      public iw a(iu<iw> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$2 = $$1.readFloat();
         return new iw($$2);
      }

      public iw a(iu<iw> $$0, sf $$1) {
         return new iw($$1.readFloat());
      }
   };

   @Override
   public iu<iw> b() {
      return iv.F;
   }

   @Override
   public void a(sf $$0) {
      $$0.writeFloat(this.c);
   }

   @Override
   public String a() {
      return String.format(Locale.ROOT, "%s %.2f", jb.k.b(this.b()), this.c);
   }
}
