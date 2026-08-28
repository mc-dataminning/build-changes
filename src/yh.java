import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface yh extends xb {
   MapCodec<yh> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(yh::b)).apply($$0, yh::a));
   xb.a<yh> b = new xb.a<>(a, "text");
   yh c = new yh() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static yh a(String $$0) {
      return (yh)($$0.isEmpty() ? c : new yh.a($$0));
   }

   String b();

   @Override
   default xb.a<?> a() {
      return b;
   }

   public static record a(String d) implements yh {
      @Override
      public <T> Optional<T> a(xf.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(xf.b<T> $$0, xx $$1) {
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
