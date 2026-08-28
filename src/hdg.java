import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import javax.annotation.Nullable;

public class hdg implements hdq<dto> {
   private final goc a;
   private final cvk b;

   public hdg(cvk $$0, goc $$1) {
      this.a = $$1;
      this.b = $$0;
   }

   @Nullable
   public dto a(cwn $$0) {
      return $$0.a(kv.ai);
   }

   public void a(@Nullable dto $$0, cwl $$1, ffs $$2, glv $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, this.b, Objects.requireNonNullElse($$0, dto.a));
   }

   public static record a(cvk b) implements hdq.a {
      public static final MapCodec<hdg.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvk.q.fieldOf("color").forGetter(hdg.a::b)).apply($$0, hdg.a::new));

      @Override
      public MapCodec<hdg.a> a() {
         return a;
      }

      @Override
      public hdq<?> a(gew $$0) {
         return new hdg(this.b, new goc($$0));
      }
   }
}
