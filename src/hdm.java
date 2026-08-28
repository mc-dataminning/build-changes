import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import javax.annotation.Nullable;

public class hdm implements hdw<dtq> {
   private final gof a;
   private final cvm b;

   public hdm(cvm $$0, gof $$1) {
      this.a = $$1;
      this.b = $$0;
   }

   @Nullable
   public dtq a(cwp $$0) {
      return $$0.a(kv.ai);
   }

   public void a(@Nullable dtq $$0, cwn $$1, ffu $$2, gly $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, this.b, Objects.requireNonNullElse($$0, dtq.a));
   }

   public static record a(cvm b) implements hdw.a {
      public static final MapCodec<hdm.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvm.q.fieldOf("color").forGetter(hdm.a::b)).apply($$0, hdm.a::new));

      @Override
      public MapCodec<hdm.a> a() {
         return a;
      }

      @Override
      public hdw<?> a(gez $$0) {
         return new hdm(this.b, new gof($$0));
      }
   }
}
