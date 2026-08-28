import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import javax.annotation.Nullable;

public class hdf implements hdo<dtq> {
   private final god a;
   private final cvm b;

   public hdf(cvm $$0, god $$1) {
      this.a = $$1;
      this.b = $$0;
   }

   @Nullable
   public dtq a(cwp $$0) {
      return $$0.a(kv.ai);
   }

   public void a(@Nullable dtq $$0, cwn $$1, ffu $$2, glx $$3, int $$4, int $$5, boolean $$6) {
      this.a.a($$2, $$3, $$4, $$5, this.b, Objects.requireNonNullElse($$0, dtq.a));
   }

   public static record a(cvm b) implements hdo.a {
      public static final MapCodec<hdf.a> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(cvm.q.fieldOf("color").forGetter(hdf.a::b)).apply($$0, hdf.a::new));

      @Override
      public MapCodec<hdf.a> a() {
         return a;
      }

      @Override
      public hdo<?> a(gey $$0) {
         return new hdf(this.b, new god($$0));
      }
   }
}
