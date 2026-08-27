import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;

public class ky implements ku {
   public static final Codec<ky> a = RecordCodecBuilder.create($$0 -> $$0.group(Codec.INT.fieldOf("delay").forGetter($$0x -> $$0x.d)).apply($$0, ky::new));
   public static final yq<wd, ky> b = yq.a(yo.f, $$0 -> $$0.d, ky::new);
   public static final ku.a<ky> c = new ku.a<ky>() {
      public ky a(kv<ky> $$0, StringReader $$1, ix.a $$2) throws CommandSyntaxException {
         $$1.expect(' ');
         int $$3 = $$1.readInt();
         return new ky($$3);
      }
   };
   private final int d;

   public ky(int $$0) {
      this.d = $$0;
   }

   @Override
   public String a(ix.a $$0) {
      return String.format(Locale.ROOT, "%s %d", lc.j.b(this.a()), this.d);
   }

   @Override
   public kv<ky> a() {
      return kw.aS;
   }

   public int b() {
      return this.d;
   }
}
