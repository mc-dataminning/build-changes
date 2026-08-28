import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gpz implements gpu {
   public static final MapCodec<gpz> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, gpz::new)
   );
   private final String c;
   private final String d;

   public gpz(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(atw $$0, gpu.a $$1) {
      akd $$2 = new akd("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         akk $$4 = $$2.b($$2x).d(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public gpw a() {
      return gpx.b;
   }
}
