import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class jx implements jt {
   public static final Codec<jx> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.c)).apply($$0, jx::new));
   public static final jt.a<jx> b = new jt.a<jx>() {
      public jx a(ju<jx> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         int $$2 = $$1.readInt();
         return new jx($$2);
      }

      public jx a(ju<jx> $$0, ue $$1) {
         return new jx($$1.n());
      }
   };
   private final int c;

   public jx(int $$0) {
      this.c = $$0;
   }

   @Override
   public void a(ue $$0) {
      $$0.c(this.c);
   }

   @Override
   public String a() {
      return String.format(Locale.ROOT, "%s %d", kb.j.b(this.b()), this.c);
   }

   @Override
   public ju<jx> b() {
      return jv.aS;
   }

   public int c() {
      return this.c;
   }
}
