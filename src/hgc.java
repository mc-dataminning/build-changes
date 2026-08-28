import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class hgc implements hgf {
   private final List<hgf> a;

   public hgc(List<hgf> $$0) {
      this.a = $$0;
   }

   @Override
   public void a(hgi $$0, czn $$1, hgg $$2, czl $$3, @Nullable gkq $$4, @Nullable bxj $$5, int $$6) {
      $$0.a(this.a.size());

      for (hgf $$7 : this.a) {
         $$7.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   public static record a(List<hgf.b> b) implements hgf.b {
      public static final MapCodec<hgc.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hgh.a.listOf().fieldOf("models").forGetter(hgc.a::b)).apply($$0, hgc.a::new)
      );

      @Override
      public MapCodec<hgc.a> a() {
         return a;
      }

      @Override
      public void a(hmi.a $$0) {
         for (hgf.b $$1 : this.b) {
            $$1.a($$0);
         }
      }

      @Override
      public hgf a(hgf.a $$0) {
         return new hgc(this.b.stream().map($$1 -> $$1.a($$0)).toList());
      }
   }
}
