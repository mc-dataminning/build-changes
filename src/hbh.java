import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class hbh implements hbk {
   private final List<hbk> a;

   public hbh(List<hbk> $$0) {
      this.a = $$0;
   }

   @Override
   public void a(hbn $$0, cwo $$1, hbl $$2, cwm $$3, @Nullable gfy $$4, @Nullable bvg $$5, int $$6) {
      $$0.a(this.a.size());

      for (hbk $$7 : this.a) {
         $$7.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   public static record a(List<hbk.b> b) implements hbk.b {
      public static final MapCodec<hbh.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hbm.a.listOf().fieldOf("models").forGetter(hbh.a::b)).apply($$0, hbh.a::new)
      );

      @Override
      public MapCodec<hbh.a> a() {
         return a;
      }

      @Override
      public void a(hhj.a $$0) {
         for (hbk.b $$1 : this.b) {
            $$1.a($$0);
         }
      }

      @Override
      public hbk a(hbk.a $$0) {
         return new hbh(this.b.stream().map($$1 -> $$1.a($$0)).toList());
      }
   }
}
