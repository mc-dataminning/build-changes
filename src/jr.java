import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record jr(alc<dhp> d, jj e) {
   public static final MapCodec<jr> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dhp.h.fieldOf("dimension").forGetter(jr::a), jj.a.fieldOf("pos").forGetter(jr::b)).apply($$0, jr::a)
   );
   public static final Codec<jr> b = a.codec();
   public static final yt<ByteBuf, jr> c = yt.a(alc.b(me.bl), jr::a, jj.b, jr::b, jr::a);

   public static jr a(alc<dhp> $$0, jj $$1) {
      return new jr($$0, $$1);
   }

   @Override
   public String toString() {
      return this.d + " " + this.e;
   }

   public boolean a(alc<dhp> $$0, jj $$1, int $$2) {
      return this.d.equals($$0) && this.e.l($$1) <= $$2;
   }

   public alc<dhp> a() {
      return this.d;
   }

   public jj b() {
      return this.e;
   }
}
