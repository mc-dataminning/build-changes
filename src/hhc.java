import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class hhc implements hgx {
   public static final MapCodec<hhc> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter($$0x -> $$0x.c), Codec.STRING.fieldOf("prefix").forGetter($$0x -> $$0x.d)).apply($$0, hhc::new)
   );
   private final String c;
   private final String d;

   public hhc(String $$0, String $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   @Override
   public void a(ava $$0, hgx.a $$1) {
      akw $$2 = new akw("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         ald $$4 = $$2.b($$2x).f(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public hgz a() {
      return hha.b;
   }
}
