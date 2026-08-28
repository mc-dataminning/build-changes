import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record js(Optional<aun> b, Lifecycle c) {
   public static final js a = new js(Optional.empty(), Lifecycle.stable());

   public Optional<aun> a() {
      return this.b;
   }

   public Lifecycle b() {
      return this.c;
   }
}
