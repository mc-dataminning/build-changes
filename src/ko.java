import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public record ko(float d) implements kl {
   public static final Codec<ko> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.FLOAT.fieldOf("roll").forGetter($$0x -> $$0x.d)).apply($$0, ko::new));
   public static final yg<vt, ko> b = yg.a(ye.h, $$0 -> $$0.d, ko::new);
   public static final kl.a<ko> c = new kl.a<ko>() {
      public ko a(km<ko> $$0, StringReader $$1, ip.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         float $$3 = $$1.readFloat();
         return new ko($$3);
      }
   };

   @Override
   public km<ko> a() {
      return kn.I;
   }

   @Override
   public String a(ip.a $$0) {
      return String.format(Locale.ROOT, "%s %.2f", kt.j.b(this.a()), this.d);
   }

   public float b() {
      return this.d;
   }
}
