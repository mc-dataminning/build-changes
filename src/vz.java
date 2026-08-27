import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class vz implements uw {
   public static final MapCodec<vz> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("keybind").forGetter($$0x -> $$0x.c)).apply($$0, vz::new)
   );
   public static final uw.a<vz> b = new uw.a<>(a, "keybind");
   private final String c;
   @Nullable
   private Supplier<uv> d;

   public vz(String $$0) {
      this.c = $$0;
   }

   private uv c() {
      if (this.d == null) {
         this.d = wa.a.apply(this.c);
      }

      return this.d.get();
   }

   @Override
   public <T> Optional<T> a(va.a<T> $$0) {
      return this.c().a($$0);
   }

   @Override
   public <T> Optional<T> a(va.b<T> $$0, vs $$1) {
      return this.c().a($$0, $$1);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof vz $$1 && this.c.equals($$1.c)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.c.hashCode();
   }

   @Override
   public String toString() {
      return "keybind{" + this.c + "}";
   }

   public String b() {
      return this.c;
   }

   @Override
   public uw.a<?> a() {
      return b;
   }
}
