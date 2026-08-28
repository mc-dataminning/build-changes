import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record ke(Optional<aug> b, Lifecycle c) {
   public static final ke a = new ke(Optional.empty(), Lifecycle.stable());

   public Optional<aug> a() {
      return this.b;
   }

   public Lifecycle b() {
      return this.c;
   }
}
