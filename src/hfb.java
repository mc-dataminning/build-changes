import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hfb implements hew {
   public static final MapCodec<hfb> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, hfb::new)
   );
   private final String c;
   private final String d;

   public hfb(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(aup $$0, hew.a $$1) {
      ako $$2 = new ako("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         akv $$4 = $$2.b($$2x).f(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public hey a() {
      return hez.b;
   }
}
