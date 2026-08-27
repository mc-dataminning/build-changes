import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class kd implements jz {
   public static final Codec<kd> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.d)).apply($$0, kd::new));
   public static final xq<vd, kd> b = xq.a(xo.d, $$0 -> $$0.d, kd::new);
   public static final jz.a<kd> c = new jz.a<kd>() {
      public kd a(ka<kd> $$0, StringReader $$1, in.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         int $$3 = $$1.readInt();
         return new kd($$3);
      }
   };
   private final int d;

   public kd(int $$0) {
      this.d = $$0;
   }

   @Override
   public String a(in.a $$0) {
      return String.format(Locale.ROOT, "%s %d", kh.j.b(this.a()), this.d);
   }

   @Override
   public ka<kd> a() {
      return kb.aS;
   }

   public int b() {
      return this.d;
   }
}
