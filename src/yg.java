import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface yg extends xa {
   MapCodec<yg> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(yg::b)).apply($$0, yg::a));
   xa.a<yg> b = new xa.a<>(a, "text");
   yg c = new yg() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static yg a(String $$0) {
      return (yg)($$0.isEmpty() ? c : new yg.a($$0));
   }

   String b();

   @Override
   default xa.a<?> a() {
      return b;
   }

   public static record a(String d) implements yg {
      @Override
      public <T> Optional<T> a(xe.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(xe.b<T> $$0, xw $$1) {
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
