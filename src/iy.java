import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class iy implements iu {
   public static final Codec<iy> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.c)).apply($$0, iy::new));
   public static final iu.a<iy> b = new iu.a<iy>() {
      public iy a(iv<iy> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         int $$2 = $$1.readInt();
         return new iy($$2);
      }

      public iy a(iv<iy> $$0, sh $$1) {
         return new iy($$1.m());
      }
   };
   private final int c;

   public iy(int $$0) {
      this.c = $$0;
   }

   @Override
   public void a(sh $$0) {
      $$0.c(this.c);
   }

   @Override
   public String a() {
      return String.format(Locale.ROOT, "%s %d", jc.k.b(this.b()), this.c);
   }

   @Override
   public iv<iy> b() {
      return iw.aP;
   }

   public int c() {
      return this.c;
   }
}
