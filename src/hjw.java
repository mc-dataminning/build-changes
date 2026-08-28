import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import javax.annotation.Nullable;

public class hjw implements hkg<dxu> {
   private final guk a;
   private final cyy b;

   public hjw(cyy $$0, guk $$1) {
      this.a = $$1;
      this.b = $$0;
   }

   @Nullable
   public dxu a(daa $$0) {
      return $$0.a(kl.am);
   }

   public void a(@Nullable dxu $$0, czy $$1, flq $$2, gsc $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, this.b, Objects.requireNonNullElse($$0, dxu.a));
   }

   public static record a(cyy b) implements hkg.a {
      public static final MapCodec<hjw.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cyy.q.fieldOf("color").forGetter(hjw.a::b)).apply($$0, hjw.a::new));

      @Override
      public MapCodec<hjw.a> a() {
         return a;
      }

      @Override
      public hkg<?> a(glc $$0) {
         return new hjw(this.b, new guk($$0));
      }
   }
}
