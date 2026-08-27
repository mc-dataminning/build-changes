import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface xn extends wh {
   MapCodec<xn> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(xn::b)).apply($$0, xn::a));
   wh.a<xn> b = new wh.a<>(a, "text");
   xn c = new xn() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static xn a(String $$0) {
      return (xn)($$0.isEmpty() ? c : new xn.a($$0));
   }

   String b();

   @Override
   default wh.a<?> a() {
      return b;
   }

   public static record a(String d) implements xn {
      @Override
      public <T> Optional<T> a(wl.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(wl.b<T> $$0, xd $$1) {
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
