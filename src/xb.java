import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;

public interface xb extends vv {
   MapCodec<xb> a = RecordCodecBuilder.mapCodec($$0 -> $$0.group(Codec.STRING.fieldOf("text").forGetter(xb::b)).apply($$0, xb::a));
   vv.a<xb> b = new vv.a<>(a, "text");
   xb c = new xb() {
      @Override
      public String toString() {
         return "empty";
      }

      @Override
      public String b() {
         return "";
      }
   };

   static xb a(String $$0) {
      return (xb)($$0.isEmpty() ? c : new xb.a($$0));
   }

   String b();

   @Override
   default vv.a<?> a() {
      return b;
   }

   public static record a(String d) implements xb {
      @Override
      public <T> Optional<T> a(vz.a<T> $$0) {
         return $$0.accept(this.d);
      }

      @Override
      public <T> Optional<T> a(vz.b<T> $$0, wr $$1) {
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
