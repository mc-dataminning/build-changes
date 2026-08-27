import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface vp extends uj {
   MapCodec<vp> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(vp::b)).apply($$0, vp::a));
   uj.a<vp> b = new uj.a<>(a, "text");
   vp c = new vp() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static vp a(String $$0) {
      return (vp)($$0.isEmpty() ? c : new vp.a($$0));
   }

   String b();

   @Override
   default uj.a<?> a() {
      return b;
   }

   public static record a(String d) implements vp {
      @Override
      public <T> Optional<T> a(un.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(un.b<T> $$0, vf $$1) {
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
