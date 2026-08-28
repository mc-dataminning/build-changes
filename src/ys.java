import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface ys extends xm {
   MapCodec<ys> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(ys::b)).apply($$0, ys::a));
   xm.a<ys> b = new xm.a<>(a, "text");
   ys c = new ys() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static ys a(String $$0) {
      return (ys)($$0.isEmpty() ? c : new ys.a($$0));
   }

   String b();

   @Override
   default xm.a<?> a() {
      return b;
   }

   public static record a(String d) implements ys {
      @Override
      public <T> Optional<T> a(xq.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(xq.b<T> $$0, yi $$1) {
         return $$0.accept($$1, this.d);
      }

      @Override
      public String toString() {
         return "literal{" + this.d + "}";
      }

      @Override
      public String b() {
         return this.d;
      }
   }
}
