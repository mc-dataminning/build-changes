import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import javax.annotation.Nullable;

public class hch implements hck {
   private final List<hck> a;

   public hch(List<hck> $$0) {
      this.a = $$0;
   }

   @Override
   public void a(hcn $$0, cxh $$1, hcl $$2, cxf $$3, @Nullable ggy $$4, @Nullable bvy $$5, int $$6) {
      $$0.a(this.a.size());

      for (hck $$7 : this.a) {
         $$7.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      }
   }

   public static record a(List<hck.b> b) implements hck.b {
      public static final MapCodec<hch.a> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(hcm.a.listOf().fieldOf("models").forGetter(hch.a::b)).apply($$0, hch.a::new)
      );

      @Override
      public MapCodec<hch.a> a() {
         return a;
      }

      @Override
      public void a(hij.a $$0) {
         for (hck.b $$1 : this.b) {
            $$1.a($$0);
         }
      }

      @Override
      public hck a(hck.a $$0) {
         return new hch(this.b.stream().map($$1 -> $$1.a($$0)).toList());
      }
   }
}
