import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record jd(alf<dja> d, iu e) {
   public static final MapCodec<jd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dja.h.fieldOf("dimension").forGetter(jd::a), iu.a.fieldOf("pos").forGetter(jd::b)).apply($$0, jd::a)
   );
   public static final Codec<jd> b = a.codec();
   public static final yw<ByteBuf, jd> c = yw.a(alf.b(mg.bo), jd::a, iu.b, jd::b, jd::a);

   public static jd a(alf<dja> $$0, iu $$1) {
      return new jd($$0, $$1);
   }

   @Override
   public String toString() {
      return this.d + " " + this.e;
   }

   public boolean a(alf<dja> $$0, iu $$1, int $$2) {
      return this.d.equals($$0) && this.e.l($$1) <= $$2;
   }

   public alf<dja> a() {
      return this.d;
   }

   public iu b() {
      return this.e;
   }
}
