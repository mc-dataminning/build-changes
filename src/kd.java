import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record kd(Optional<atw> b, Lifecycle c) {
   public static final kd a = new kd(Optional.empty(), Lifecycle.stable());

   public Optional<atw> a() {
      return this.b;
   }

   public Lifecycle b() {
      return this.c;
   }
}
