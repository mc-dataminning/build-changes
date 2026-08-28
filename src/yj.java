import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface yj extends xd {
   MapCodec<yj> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(yj::b)).apply($$0, yj::a));
   xd.a<yj> b = new xd.a<>(a, "text");
   yj c = new yj() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static yj a(String $$0) {
      return (yj)($$0.isEmpty() ? c : new yj.a($$0));
   }

   String b();

   @Override
   default xd.a<?> a() {
      return b;
   }

   public static record a(String d) implements yj {
      @Override
      public <T> Optional<T> a(xh.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(xh.b<T> $$0, xz $$1) {
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
