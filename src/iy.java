import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public record iy(float c) implements iv {
   public static final Codec<iy> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.c)).apply($$0, iy::new));
   public static final iv.a<iy> b = new iv.a<iy>() {
      public iy a(iw<iy> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$2 = $$1.readFloat();
         return new iy($$2);
      }

      public iy a(iw<iy> $$0, so $$1) {
         return new iy($$1.readFloat());
      }
   };

   @Override
   public iw<iy> b() {
      return ix.F;
   }

   @Override
   public void a(so $$0) {
      $$0.a(this.c);
   }

   @Override
   public String a() {
      return String.format(Locale.ROOT, "%s %.2f", jd.k.b(this.b()), this.c);
   }
}
