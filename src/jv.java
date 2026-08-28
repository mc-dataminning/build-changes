import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record jv(Optional<atd> b, Lifecycle c) {
   public static final jv a = new jv(Optional.empty(), Lifecycle.stable());

   public Optional<atd> a() {
      return this.b;
   }

   public Lifecycle b() {
      return this.c;
   }
}
