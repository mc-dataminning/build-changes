import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record kb(Optional<aug> b, Lifecycle c) {
   public static final kb a = new kb(Optional.empty(), Lifecycle.stable());

   public Optional<aug> a() {
      return this.b;
   }

   public Lifecycle b() {
      return this.c;
   }
}
