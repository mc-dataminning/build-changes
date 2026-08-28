import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface yw extends xq {
   MapCodec<yw> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(yw::b)).apply($$0, yw::a));
   xq.a<yw> b = new xq.a<>(a, "text");
   yw c = new yw() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static yw a(String $$0) {
      return (yw)($$0.isEmpty() ? c : new yw.a($$0));
   }

   String b();

   @Override
   default xq.a<?> a() {
      return b;
   }

   public static record a(String d) implements yw {
      @Override
      public <T> Optional<T> a(xu.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(xu.b<T> $$0, ym $$1) {
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
