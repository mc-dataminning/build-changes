import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class hbg implements hbi {
   private final List<hbi> a;

   public hbg(List<hbi> $$0) {
      this.a = $$0;
   }

   @Override
   public void a(hbl $$0, cwp $$1, hbj $$2, cwn $$3, @Nullable gfy $$4, @Nullable bvg $$5, int $$6) {
      $$0.a(this.a.size());

      for (hbi $$7 : this.a) {
         $$7.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   public static record a(List<hbi.b> b) implements hbi.b {
      public static final MapCodec<hbg.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hbk.a.listOf().fieldOf("models").forGetter(hbg.a::b)).apply($$0, hbg.a::new)
      );

      @Override
      public MapCodec<hbg.a> a() {
         return a;
      }

      @Override
      public void a(hhd.a $$0) {
         for (hbi.b $$1 : this.b) {
            $$1.a($$0);
         }
      }

      @Override
      public hbi a(hbi.a $$0) {
         return new hbg(this.b.stream().map($$1 -> $$1.a($$0)).toList());
      }
   }
}
