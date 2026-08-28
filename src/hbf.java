import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class hbf implements hbh {
   private final List<hbh> a;

   public hbf(List<hbh> $$0) {
      this.a = $$0;
   }

   @Override
   public void a(hbk $$0, cwn $$1, hbi $$2, cwl $$3, @Nullable gfw $$4, @Nullable bvf $$5, int $$6) {
      $$0.a(this.a.size());

      for (hbh $$7 : this.a) {
         $$7.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   public static record a(List<hbh.b> b) implements hbh.b {
      public static final MapCodec<hbf.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hbj.a.listOf().fieldOf("models").forGetter(hbf.a::b)).apply($$0, hbf.a::new)
      );

      @Override
      public MapCodec<hbf.a> a() {
         return a;
      }

      @Override
      public void a(hhe.a $$0) {
         for (hbh.b $$1 : this.b) {
            $$1.a($$0);
         }
      }

      @Override
      public hbh a(hbh.a $$0) {
         return new hbf(this.b.stream().map($$1 -> $$1.a($$0)).toList());
      }
   }
}
