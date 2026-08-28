import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record jq(akt<dgi> d, ji e) {
   public static final MapCodec<jq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgi.h.fieldOf("dimension").forGetter(jq::a), ji.a.fieldOf("pos").forGetter(jq::b)).apply($$0, jq::a)
   );
   public static final Codec<jq> b = a.codec();
   public static final ym<ByteBuf, jq> c = ym.a(akt.b(mc.be), jq::a, ji.b, jq::b, jq::a);

   public static jq a(akt<dgi> $$0, ji $$1) {
      return new jq($$0, $$1);
   }

   @Override
   public String toString() {
      return this.d + " " + this.e;
   }

   public boolean a(akt<dgi> $$0, ji $$1, int $$2) {
      return this.d.equals($$0) && this.e.l($$1) <= $$2;
   }

   public akt<dgi> a() {
      return this.d;
   }

   public ji b() {
      return this.e;
   }
}
