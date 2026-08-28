import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hlj(String c, String d) implements hlf {
   public static final MapCodec<hlj> b = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("source").forGetter(hlj::b), Codec.STRING.fieldOf("prefix").forGetter(hlj::c)).apply($$0, hlj::new)
   );

   @Override
   public void a(avf $$0, hlf.a $$1) {
      alb $$2 = new alb("textures/" + this.c, ".png");
      $$2.a($$0).forEach(($$2x, $$3) -> {
         ali $$4 = $$2.b($$2x).f(this.d);
         $$1.a($$4, $$3);
      });
   }

   @Override
   public MapCodec<hlj> a() {
      return b;
   }

   public String b() {
      return this.c;
   }

   public String c() {
      return this.d;
   }
}
