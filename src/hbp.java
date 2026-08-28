import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hbp implements hbk {
   public static final MapCodec<hbp> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, hbp::new)
   );
   private final String c;
   private final String d;

   public hbp(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(avl $$0, hbk.a $$1) {
      ali $$2 = new ali("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         alp $$4 = $$2.b($$2x).f(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public hbm a() {
      return hbn.b;
   }
}
