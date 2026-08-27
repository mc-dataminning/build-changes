import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface wi extends vc {
   MapCodec<wi> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(wi::b)).apply($$0, wi::a));
   vc.a<wi> b = new vc.a<>(a, "text");
   wi c = new wi() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static wi a(String $$0) {
      return (wi)($$0.isEmpty() ? c : new wi.a($$0));
   }

   String b();

   @Override
   default vc.a<?> a() {
      return b;
   }

   public static record a(String d) implements wi {
      @Override
      public <T> Optional<T> a(vg.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(vg.b<T> $$0, vy $$1) {
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
