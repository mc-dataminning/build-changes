import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record js(Optional<auu> b, Lifecycle c) {
   public static final js a = new js(Optional.empty(), Lifecycle.stable());

   public Optional<auu> a() {
      return this.b;
   }

   public Lifecycle b() {
      return this.c;
   }
}
