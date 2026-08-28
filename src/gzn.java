import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gzn implements gzi {
   public static final MapCodec<gzn> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, gzn::new)
   );
   private final String c;
   private final String d;

   public gzn(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(avd $$0, gzi.a $$1) {
      alc $$2 = new alc("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         alj $$4 = $$2.b($$2x).f(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public gzk a() {
      return gzl.b;
   }
}
