import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gpk implements gpf {
   public static final MapCodec<gpk> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, gpk::new)
   );
   private final String c;
   private final String d;

   public gpk(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(aup $$0, gpf.a $$1) {
      aky $$2 = new aky("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         alf $$4 = $$2.b($$2x).d(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public gph a() {
      return gpi.b;
   }
}
