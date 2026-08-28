import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class hfw implements hfz {
   private final List<hfz> a;

   public hfw(List<hfz> $$0) {
      this.a = $$0;
   }

   @Override
   public void a(hgc $$0, czk $$1, hga $$2, czi $$3, @Nullable gkl $$4, @Nullable bxj $$5, int $$6) {
      $$0.a(this.a.size());

      for (hfz $$7 : this.a) {
         $$7.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   public static record a(List<hfz.b> b) implements hfz.b {
      public static final MapCodec<hfw.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hgb.a.listOf().fieldOf("models").forGetter(hfw.a::b)).apply($$0, hfw.a::new)
      );

      @Override
      public MapCodec<hfw.a> a() {
         return a;
      }

      @Override
      public void a(hmb.a $$0) {
         for (hfz.b $$1 : this.b) {
            $$1.a($$0);
         }
      }

      @Override
      public hfz a(hfz.a $$0) {
         return new hfw(this.b.stream().map($$1 -> $$1.a($$0)).toList());
      }
   }
}
