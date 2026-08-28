import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record ka(Optional<auc> b, Lifecycle c) {
   public static final ka a = new ka(Optional.empty(), Lifecycle.stable());

   public Optional<auc> a() {
      return this.b;
   }

   public Lifecycle b() {
      return this.c;
   }
}
