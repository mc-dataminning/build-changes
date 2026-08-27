import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record iz(Optional<asl> b, Lifecycle c) {
   public static final iz a = new iz(Optional.empty(), Lifecycle.stable());

   public Optional<asl> a() {
      return this.b;
   }

   public Lifecycle b() {
      return this.c;
   }
}
