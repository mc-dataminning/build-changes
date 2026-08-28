import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gyb implements gxw {
   public static final MapCodec<gyb> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, gyb::new)
   );
   private final String c;
   private final String d;

   public gyb(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ava $$0, gxw.a $$1) {
      ala $$2 = new ala("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         alh $$4 = $$2.b($$2x).f(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public gxy a() {
      return gxz.b;
   }
}
