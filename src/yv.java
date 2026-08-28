import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface yv extends xp {
   MapCodec<yv> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(yv::b)).apply($$0, yv::a));
   xp.a<yv> b = new xp.a<>(a, "text");
   yv c = new yv() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static yv a(String $$0) {
      return (yv)($$0.isEmpty() ? c : new yv.a($$0));
   }

   String b();

   @Override
   default xp.a<?> a() {
      return b;
   }

   public static record a(String d) implements yv {
      @Override
      public <T> Optional<T> a(xt.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(xt.b<T> $$0, yl $$1) {
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
