import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record jp(alo<dgz> d, jh e) {
   public static final MapCodec<jp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(dgz.h.fieldOf("dimension").forGetter(jp::a), jh.a.fieldOf("pos").forGetter(jp::b)).apply($$0, jp::a)
   );
   public static final Codec<jp> b = a.codec();
   public static final zi<ByteBuf, jp> c = zi.a(alo.b(mb.be), jp::a, jh.b, jp::b, jp::a);

   public static jp a(alo<dgz> $$0, jh $$1) {
      return new jp($$0, $$1);
   }

   @Override
   public String toString() {
      return this.d + " " + this.e;
   }

   public boolean a(alo<dgz> $$0, jh $$1, int $$2) {
      return this.d.equals($$0) && this.e.l($$1) <= $$2;
   }

   public alo<dgz> a() {
      return this.d;
   }

   public jh b() {
      return this.e;
   }
}
