import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class jy implements ju {
   public static final Codec<jy> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.c)).apply($$0, jy::new));
   public static final ju.a<jy> b = new ju.a<jy>() {
      public jy a(jv<jy> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         int $$2 = $$1.readInt();
         return new jy($$2);
      }

      public jy a(jv<jy> $$0, ty $$1) {
         return new jy($$1.n());
      }
   };
   private final int c;

   public jy(int $$0) {
      this.c = $$0;
   }

   @Override
   public void a(ty $$0) {
      $$0.c(this.c);
   }

   @Override
   public String a() {
      return String.format(Locale.ROOT, "%s %d", kc.k.b(this.b()), this.c);
   }

   @Override
   public jv<jy> b() {
      return jw.aQ;
   }

   public int c() {
      return this.c;
   }
}
