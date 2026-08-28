import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface yd extends wx {
   MapCodec<yd> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(yd::b)).apply($$0, yd::a));
   wx.a<yd> b = new wx.a<>(a, "text");
   yd c = new yd() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static yd a(String $$0) {
      return (yd)($$0.isEmpty() ? c : new yd.a($$0));
   }

   String b();

   @Override
   default wx.a<?> a() {
      return b;
   }

   public static record a(String d) implements yd {
      @Override
      public <T> Optional<T> a(xb.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(xb.b<T> $$0, xt $$1) {
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
