import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Optional;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class up implements tm {
   public static final MapCodec<up> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(Codec.STRING.fieldOf("keybind").forGetter($$0x -> $$0x.c)).apply($$0, up::new)
   );
   public static final tm.a<up> b = new tm.a<>(a, "keybind");
   private final String c;
   @Nullable
   private Supplier<tl> d;

   public up(String $$0) {
      this.c = $$0;
   }

   private tl c() {
      if (this.d == null) {
         this.d = uq.a.apply(this.c);
      }

      return this.d.get();
   }

   @Override
   public <T> Optional<T> a(tq.a<T> $$0) {
      return this.c().a($$0);
   }

   @Override
   public <T> Optional<T> a(tq.b<T> $$0, ui $$1) {
      return this.c().a($$0, $$1);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof up $$1 && this.c.equals($$1.c)) {
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
   public tm.a<?> a() {
      return b;
   }
}
