import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;

public record ii(aix<cvn> c, hz d) {
   public static final Codec<ii> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(cvn.g.fieldOf("dimension").forGetter(ii::a), hz.a.fieldOf("pos").forGetter(ii::b)).apply($$0, ii::a)
   );
   public static final xo<ByteBuf, ii> b = xo.a(aix.b(kg.aM), ii::a, hz.b, ii::b, ii::a);

   public static ii a(aix<cvn> $$0, hz $$1) {
      return new ii($$0, $$1);
   }

   @Override
   public String toString() {
      return this.c + " " + this.d;
   }

   public aix<cvn> a() {
      return this.c;
   }

   public hz b() {
      return this.d;
   }
}
