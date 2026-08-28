import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hew implements her {
   public static final MapCodec<hew> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, hew::new)
   );
   private final String c;
   private final String d;

   public hew(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(auo $$0, her.a $$1) {
      akn $$2 = new akn("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         aku $$4 = $$2.b($$2x).f(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public het a() {
      return heu.b;
   }
}
