import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class kn implements kj {
   public static final Codec<kn> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.d)).apply($$0, kn::new));
   public static final ye<vr, kn> b = ye.a(yc.f, $$0 -> $$0.d, kn::new);
   public static final kj.a<kn> c = new kj.a<kn>() {
      public kn a(kk<kn> $$0, StringReader $$1, in.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         int $$3 = $$1.readInt();
         return new kn($$3);
      }
   };
   private final int d;

   public kn(int $$0) {
      this.d = $$0;
   }

   @Override
   public String a(in.a $$0) {
      return String.format(Locale.ROOT, "%s %d", kr.j.b(this.a()), this.d);
   }

   @Override
   public kk<kn> a() {
      return kl.aT;
   }

   public int b() {
      return this.d;
   }
}
