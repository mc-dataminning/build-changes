import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record jv(Optional<atb> b, Lifecycle c) {
   public static final jv a = new jv(Optional.empty(), Lifecycle.stable());

   public Optional<atb> a() {
      return this.b;
   }

   public Lifecycle b() {
      return this.c;
   }
}
