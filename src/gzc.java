import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gzc implements gyx {
   public static final MapCodec<gzc> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, gzc::new)
   );
   private final String c;
   private final String d;

   public gzc(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ave $$0, gyx.a $$1) {
      ale $$2 = new ale("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         all $$4 = $$2.b($$2x).f(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public gyz a() {
      return gza.b;
   }
}
