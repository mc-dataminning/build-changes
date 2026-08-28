import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hbu implements hbp {
   public static final MapCodec<hbu> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, hbu::new)
   );
   private final String c;
   private final String d;

   public hbu(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(avv $$0, hbp.a $$1) {
      als $$2 = new als("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         alz $$4 = $$2.b($$2x).f(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public hbr a() {
      return hbs.b;
   }
}
