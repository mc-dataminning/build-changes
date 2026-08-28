import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface yb extends wv {
   MapCodec<yb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(yb::b)).apply($$0, yb::a));
   wv.a<yb> b = new wv.a<>(a, "text");
   yb c = new yb() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static yb a(String $$0) {
      return (yb)($$0.isEmpty() ? c : new yb.a($$0));
   }

   String b();

   @Override
   default wv.a<?> a() {
      return b;
   }

   public static record a(String d) implements yb {
      @Override
      public <T> Optional<T> a(wz.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(wz.b<T> $$0, xr $$1) {
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
