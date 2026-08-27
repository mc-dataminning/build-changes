import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class ix implements it {
   public static final Codec<ix> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.c)).apply($$0, ix::new));
   public static final it.a<ix> b = new it.a<ix>() {
      public ix a(iu<ix> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         int $$2 = $$1.readInt();
         return new ix($$2);
      }

      public ix a(iu<ix> $$0, sf $$1) {
         return new ix($$1.m());
      }
   };
   private final int c;

   public ix(int $$0) {
      this.c = $$0;
   }

   @Override
   public void a(sf $$0) {
      $$0.d(this.c);
   }

   @Override
   public String a() {
      return String.format(Locale.ROOT, "%s %d", jb.k.b(this.b()), this.c);
   }

   @Override
   public iu<ix> b() {
      return iv.aP;
   }

   public int c() {
      return this.c;
   }
}
