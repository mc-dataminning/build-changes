import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record jy(Optional<atk> b, Lifecycle c) {
   public static final jy a = new jy(Optional.empty(), Lifecycle.stable());

   public Optional<atk> a() {
      return this.b;
   }

   public Lifecycle b() {
      return this.c;
   }
}
