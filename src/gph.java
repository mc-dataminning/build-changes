import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class gph implements gpc {
   public static final MapCodec<gph> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, gph::new)
   );
   private final String c;
   private final String d;

   public gph(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(auo $$0, gpc.a $$1) {
      akx $$2 = new akx("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         ale $$4 = $$2.b($$2x).d(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public gpe a() {
      return gpf.b;
   }
}
