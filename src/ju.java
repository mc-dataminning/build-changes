import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class ju implements jq {
   public static final Codec<ju> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.c)).apply($$0, ju::new));
   public static final jq.a<ju> b = new jq.a<ju>() {
      public ju a(jr<ju> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         int $$2 = $$1.readInt();
         return new ju($$2);
      }

      public ju a(jr<ju> $$0, tu $$1) {
         return new ju($$1.n());
      }
   };
   private final int c;

   public ju(int $$0) {
      this.c = $$0;
   }

   @Override
   public void a(tu $$0) {
      $$0.c(this.c);
   }

   @Override
   public String a() {
      return String.format(Locale.ROOT, "%s %d", jy.k.b(this.b()), this.c);
   }

   @Override
   public jr<ju> b() {
      return js.aQ;
   }

   public int c() {
      return this.c;
   }
}
