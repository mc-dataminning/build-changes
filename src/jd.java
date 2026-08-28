import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record jd(ald<dip> d, iu e) {
   public static final MapCodec<jd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dip.h.fieldOf("dimension").forGetter(jd::a), iu.a.fieldOf("pos").forGetter(jd::b)).apply($$0, jd::a)
   );
   public static final Codec<jd> b = a.codec();
   public static final yu<ByteBuf, jd> c = yu.a(ald.b(mg.bm), jd::a, iu.b, jd::b, jd::a);

   public static jd a(ald<dip> $$0, iu $$1) {
      return new jd($$0, $$1);
   }

   @Override
   public String toString() {
      return this.d + " " + this.e;
   }

   public boolean a(ald<dip> $$0, iu $$1, int $$2) {
      return this.d.equals($$0) && this.e.l($$1) <= $$2;
   }

   public ald<dip> a() {
      return this.d;
   }

   public iu b() {
      return this.e;
   }
}
