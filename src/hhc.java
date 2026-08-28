import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class hhc implements hhf {
   private final List<hhf> a;

   public hhc(List<hhf> $$0) {
      this.a = $$0;
   }

   @Override
   public void a(hhi $$0, dak $$1, hhg $$2, dai $$3, @Nullable glo $$4, @Nullable byf $$5, int $$6) {
      $$0.a(this.a.size());

      for (hhf $$7 : this.a) {
         $$7.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   public static record a(List<hhf.b> b) implements hhf.b {
      public static final MapCodec<hhc.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hhh.a.listOf().fieldOf("models").forGetter(hhc.a::b)).apply($$0, hhc.a::new)
      );

      @Override
      public MapCodec<hhc.a> a() {
         return a;
      }

      @Override
      public void a(hnh.a $$0) {
         for (hhf.b $$1 : this.b) {
            $$1.a($$0);
         }
      }

      @Override
      public hhf a(hhf.a $$0) {
         return new hhc(this.b.stream().map($$1 -> $$1.a($$0)).toList());
      }
   }
}
