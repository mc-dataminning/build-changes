import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class hbj implements hbm {
   private final List<hbm> a;

   public hbj(List<hbm> $$0) {
      this.a = $$0;
   }

   @Override
   public void a(hbp $$0, cwq $$1, hbn $$2, cwo $$3, @Nullable gga $$4, @Nullable bvi $$5, int $$6) {
      $$0.a(this.a.size());

      for (hbm $$7 : this.a) {
         $$7.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   public static record a(List<hbm.b> b) implements hbm.b {
      public static final MapCodec<hbj.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hbo.a.listOf().fieldOf("models").forGetter(hbj.a::b)).apply($$0, hbj.a::new)
      );

      @Override
      public MapCodec<hbj.a> a() {
         return a;
      }

      @Override
      public void a(hhl.a $$0) {
         for (hbm.b $$1 : this.b) {
            $$1.a($$0);
         }
      }

      @Override
      public hbm a(hbm.a $$0) {
         return new hbj(this.b.stream().map($$1 -> $$1.a($$0)).toList());
      }
   }
}
