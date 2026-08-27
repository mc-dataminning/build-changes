import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record ji(Optional<asy> b, Lifecycle c) {
   public static final ji a = new ji(Optional.empty(), Lifecycle.stable());

   public Optional<asy> a() {
      return this.b;
   }

   public Lifecycle b() {
      return this.c;
   }
}
