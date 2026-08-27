import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface wx extends vr {
   MapCodec<wx> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(wx::b)).apply($$0, wx::a));
   vr.a<wx> b = new vr.a<>(a, "text");
   wx c = new wx() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static wx a(String $$0) {
      return (wx)($$0.isEmpty() ? c : new wx.a($$0));
   }

   String b();

   @Override
   default vr.a<?> a() {
      return b;
   }

   public static record a(String d) implements wx {
      @Override
      public <T> Optional<T> a(vv.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(vv.b<T> $$0, wn $$1) {
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
