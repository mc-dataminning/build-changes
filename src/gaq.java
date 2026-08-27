import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record gaq(gar d) {
   public static final gaq a = new gaq(gar.b);
   public static final Codec<gaq> b = RecordCodecBuilder.create($$0 -> $$0.group(arb.a(gar.a, "scaling", gar.b).forGetter(gaq::a)).apply($$0, gaq::new));
   public static final amq<gaq> c = amq.a("gui", b);

   public gar a() {
      return this.d;
   }
}
