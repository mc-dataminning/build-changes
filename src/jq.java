import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record jq(Optional<auj> b, Lifecycle c) {
   public static final jq a = new jq(Optional.empty(), Lifecycle.stable());

   public Optional<auj> a() {
      return this.b;
   }

   public Lifecycle b() {
      return this.c;
   }
}
