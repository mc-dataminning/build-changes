import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class jz implements jv {
   public static final Codec<jz> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.c)).apply($$0, jz::new));
   public static final jv.a<jz> b = new jv.a<jz>() {
      public jz a(jw<jz> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         int $$2 = $$1.readInt();
         return new jz($$2);
      }

      public jz a(jw<jz> $$0, ug $$1) {
         return new jz($$1.n());
      }
   };
   private final int c;

   public jz(int $$0) {
      this.c = $$0;
   }

   @Override
   public void a(ug $$0) {
      $$0.c(this.c);
   }

   @Override
   public String a() {
      return String.format(Locale.ROOT, "%s %d", kd.j.b(this.b()), this.c);
   }

   @Override
   public jw<jz> b() {
      return jx.aS;
   }

   public int c() {
      return this.c;
   }
}
