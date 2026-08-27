import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class kp implements kl {
   public static final Codec<kp> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.d)).apply($$0, kp::new));
   public static final yg<vt, kp> b = yg.a(ye.f, $$0 -> $$0.d, kp::new);
   public static final kl.a<kp> c = new kl.a<kp>() {
      public kp a(km<kp> $$0, StringReader $$1, ip.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         int $$3 = $$1.readInt();
         return new kp($$3);
      }
   };
   private final int d;

   public kp(int $$0) {
      this.d = $$0;
   }

   @Override
   public String a(ip.a $$0) {
      return String.format(Locale.ROOT, "%s %d", kt.j.b(this.a()), this.d);
   }

   @Override
   public km<kp> a() {
      return kn.aT;
   }

   public int b() {
      return this.d;
   }
}
