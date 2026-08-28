import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class hfk implements hfn {
   private final List<hfn> a;

   public hfk(List<hfn> $$0) {
      this.a = $$0;
   }

   @Override
   public void a(hfq $$0, czd $$1, hfo $$2, czb $$3, @Nullable gjz $$4, @Nullable bxe $$5, int $$6) {
      $$0.a(this.a.size());

      for (hfn $$7 : this.a) {
         $$7.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   public static record a(List<hfn.b> b) implements hfn.b {
      public static final MapCodec<hfk.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hfp.a.listOf().fieldOf("models").forGetter(hfk.a::b)).apply($$0, hfk.a::new)
      );

      @Override
      public MapCodec<hfk.a> a() {
         return a;
      }

      @Override
      public void a(hlp.a $$0) {
         for (hfn.b $$1 : this.b) {
            $$1.a($$0);
         }
      }

      @Override
      public hfn a(hfn.a $$0) {
         return new hfk(this.b.stream().map($$1 -> $$1.a($$0)).toList());
      }
   }
}
