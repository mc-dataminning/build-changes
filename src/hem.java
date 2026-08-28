import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class hem implements hep {
   private final List<hep> a;

   public hem(List<hep> $$0) {
      this.a = $$0;
   }

   @Override
   public void a(hes $$0, cys $$1, heq $$2, cyq $$3, @Nullable gjd $$4, @Nullable bwz $$5, int $$6) {
      $$0.a(this.a.size());

      for (hep $$7 : this.a) {
         $$7.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   public static record a(List<hep.b> b) implements hep.b {
      public static final MapCodec<hem.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(her.a.listOf().fieldOf("models").forGetter(hem.a::b)).apply($$0, hem.a::new)
      );

      @Override
      public MapCodec<hem.a> a() {
         return a;
      }

      @Override
      public void a(hkr.a $$0) {
         for (hep.b $$1 : this.b) {
            $$1.a($$0);
         }
      }

      @Override
      public hep a(hep.a $$0) {
         return new hem(this.b.stream().map($$1 -> $$1.a($$0)).toList());
      }
   }
}
