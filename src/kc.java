import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record kc(Optional<aur> b, Lifecycle c) {
   public static final kc a = new kc(Optional.empty(), Lifecycle.stable());

   public Optional<aur> a() {
      return this.b;
   }

   public Lifecycle b() {
      return this.c;
   }
}
