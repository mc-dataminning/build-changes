import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record jz(Optional<atz> b, Lifecycle c) {
   public static final jz a = new jz(Optional.empty(), Lifecycle.stable());

   public Optional<atz> a() {
      return this.b;
   }

   public Lifecycle b() {
      return this.c;
   }
}
