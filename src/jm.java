import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record jm(Optional<atk> b, Lifecycle c) {
   public static final jm a = new jm(Optional.empty(), Lifecycle.stable());

   public Optional<atk> a() {
      return this.b;
   }

   public Lifecycle b() {
      return this.c;
   }
}
