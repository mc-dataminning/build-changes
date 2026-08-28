import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface yq extends xk {
   MapCodec<yq> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(yq::b)).apply($$0, yq::a));
   xk.a<yq> b = new xk.a<>(a, "text");
   yq c = new yq() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static yq a(String $$0) {
      return (yq)($$0.isEmpty() ? c : new yq.a($$0));
   }

   String b();

   @Override
   default xk.a<?> a() {
      return b;
   }

   public static record a(String d) implements yq {
      @Override
      public <T> Optional<T> a(xo.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(xo.b<T> $$0, yg $$1) {
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
