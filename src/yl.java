import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface yl extends xf {
   MapCodec<yl> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(yl::b)).apply($$0, yl::a));
   xf.a<yl> b = new xf.a<>(a, "text");
   yl c = new yl() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static yl a(String $$0) {
      return (yl)($$0.isEmpty() ? c : new yl.a($$0));
   }

   String b();

   @Override
   default xf.a<?> a() {
      return b;
   }

   public static record a(String d) implements yl {
      @Override
      public <T> Optional<T> a(xj.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(xj.b<T> $$0, yb $$1) {
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
