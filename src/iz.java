import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class iz implements iv {
   public static final Codec<iz> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.c)).apply($$0, iz::new));
   public static final iv.a<iz> b = new iv.a<iz>() {
      public iz a(iw<iz> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         int $$2 = $$1.readInt();
         return new iz($$2);
      }

      public iz a(iw<iz> $$0, sl $$1) {
         return new iz($$1.m());
      }
   };
   private final int c;

   public iz(int $$0) {
      this.c = $$0;
   }

   @Override
   public void a(sl $$0) {
      $$0.c(this.c);
   }

   @Override
   public String a() {
      return String.format(Locale.ROOT, "%s %d", jd.k.b(this.b()), this.c);
   }

   @Override
   public iw<iz> b() {
      return ix.aP;
   }

   public int c() {
      return this.c;
   }
}
