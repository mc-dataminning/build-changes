import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record kd(Optional<atv> b, Lifecycle c) {
   public static final kd a = new kd(Optional.empty(), Lifecycle.stable());

   public Optional<atv> a() {
      return this.b;
   }

   public Lifecycle b() {
      return this.c;
   }
}
