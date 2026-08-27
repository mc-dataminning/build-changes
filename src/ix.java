import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public record ix(float c) implements iu {
   public static final Codec<ix> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.c)).apply($$0, ix::new));
   public static final iu.a<ix> b = new iu.a<ix>() {
      public ix a(iv<ix> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$2 = $$1.readFloat();
         return new ix($$2);
      }

      public ix a(iv<ix> $$0, sh $$1) {
         return new ix($$1.readFloat());
      }
   };

   @Override
   public iv<ix> b() {
      return iw.F;
   }

   @Override
   public void a(sh $$0) {
      $$0.a(this.c);
   }

   @Override
   public String a() {
      return String.format(Locale.ROOT, "%s %.2f", jc.k.b(this.b()), this.c);
   }
}
