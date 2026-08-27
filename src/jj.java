import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record jj(Optional<atd> b, Lifecycle c) {
   public static final jj a = new jj(Optional.empty(), Lifecycle.stable());

   public Optional<atd> a() {
      return this.b;
   }

   public Lifecycle b() {
      return this.c;
   }
}
