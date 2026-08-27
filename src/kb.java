import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class kb implements jx {
   public static final Codec<kb> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.d)).apply($$0, kb::new));
   public static final xo<vb, kb> b = xo.a(xm.d, $$0 -> $$0.d, kb::new);
   public static final jx.a<kb> c = new jx.a<kb>() {
      public kb a(jy<kb> $$0, StringReader $$1) throws CommandSyntaxException {
         $$1.expect(' ');
         int $$2 = $$1.readInt();
         return new kb($$2);
      }
   };
   private final int d;

   public kb(int $$0) {
      this.d = $$0;
   }

   @Override
   public String a() {
      return String.format(Locale.ROOT, "%s %d", kf.j.b(this.b()), this.d);
   }

   @Override
   public jy<kb> b() {
      return jz.aS;
   }

   public int c() {
      return this.d;
   }
}
