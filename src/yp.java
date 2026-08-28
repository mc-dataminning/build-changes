import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface yp extends xj {
   MapCodec<yp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(yp::b)).apply($$0, yp::a));
   xj.a<yp> b = new xj.a<>(a, "text");
   yp c = new yp() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static yp a(String $$0) {
      return (yp)($$0.isEmpty() ? c : new yp.a($$0));
   }

   String b();

   @Override
   default xj.a<?> a() {
      return b;
   }

   public static record a(String d) implements yp {
      @Override
      public <T> Optional<T> a(xn.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(xn.b<T> $$0, yf $$1) {
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
