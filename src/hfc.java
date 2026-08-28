import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class hfc implements hff {
   private final List<hff> a;

   public hfc(List<hff> $$0) {
      this.a = $$0;
   }

   @Override
   public void a(hfi $$0, cyy $$1, hfg $$2, cyw $$3, @Nullable gjr $$4, @Nullable bxc $$5, int $$6) {
      $$0.a(this.a.size());

      for (hff $$7 : this.a) {
         $$7.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   public static record a(List<hff.b> b) implements hff.b {
      public static final MapCodec<hfc.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hfh.a.listOf().fieldOf("models").forGetter(hfc.a::b)).apply($$0, hfc.a::new)
      );

      @Override
      public MapCodec<hfc.a> a() {
         return a;
      }

      @Override
      public void a(hlh.a $$0) {
         for (hff.b $$1 : this.b) {
            $$1.a($$0);
         }
      }

      @Override
      public hff a(hff.a $$0) {
         return new hfc(this.b.stream().map($$1 -> $$1.a($$0)).toList());
      }
   }
}
