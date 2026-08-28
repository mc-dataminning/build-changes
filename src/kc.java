import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record kc(Optional<avc> b, Lifecycle c) {
   public static final kc a = new kc(Optional.empty(), Lifecycle.stable());

   public Optional<avc> a() {
      return this.b;
   }

   public Lifecycle b() {
      return this.c;
   }
}
