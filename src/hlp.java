import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record hlp(bab c) implements hlh {
   public static final MapCodec<hlp> b = RecordCodecBuilder.mapCodec($$0 -> $$0.group(bab.a.fieldOf("pattern").forGetter(hlp::b)).apply($$0, hlp::new));

   @Override
   public void a(avh $$0, hlh.a $$1) {
      $$1.a(this.c.c());
   }

   @Override
   public MapCodec<hlp> a() {
      return b;
   }

   public bab b() {
      return this.c;
   }
}
