import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record jh(Optional<asv> b, Lifecycle c) {
   public static final jh a = new jh(Optional.empty(), Lifecycle.stable());

   public Optional<asv> a() {
      return this.b;
   }

   public Lifecycle b() {
      return this.c;
   }
}
