import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class hbi implements hbl {
   private final List<hbl> a;

   public hbi(List<hbl> $$0) {
      this.a = $$0;
   }

   @Override
   public void a(hbo $$0, cwp $$1, hbm $$2, cwn $$3, @Nullable gfz $$4, @Nullable bvh $$5, int $$6) {
      $$0.a(this.a.size());

      for (hbl $$7 : this.a) {
         $$7.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   public static record a(List<hbl.b> b) implements hbl.b {
      public static final MapCodec<hbi.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hbn.a.listOf().fieldOf("models").forGetter(hbi.a::b)).apply($$0, hbi.a::new)
      );

      @Override
      public MapCodec<hbi.a> a() {
         return a;
      }

      @Override
      public void a(hhk.a $$0) {
         for (hbl.b $$1 : this.b) {
            $$1.a($$0);
         }
      }

      @Override
      public hbl a(hbl.a $$0) {
         return new hbi(this.b.stream().map($$1 -> $$1.a($$0)).toList());
      }
   }
}
