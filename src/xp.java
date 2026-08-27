import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface xp extends wj {
   MapCodec<xp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(xp::b)).apply($$0, xp::a));
   wj.a<xp> b = new wj.a<>(a, "text");
   xp c = new xp() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static xp a(String $$0) {
      return (xp)($$0.isEmpty() ? c : new xp.a($$0));
   }

   String b();

   @Override
   default wj.a<?> a() {
      return b;
   }

   public static record a(String d) implements xp {
      @Override
      public <T> Optional<T> a(wn.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(wn.b<T> $$0, xf $$1) {
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
