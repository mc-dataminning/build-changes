import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record ix(Optional<arv> b, Lifecycle c) {
   public static final ix a = new ix(Optional.empty(), Lifecycle.stable());

   public Optional<arv> a() {
      return this.b;
   }

   public Lifecycle b() {
      return this.c;
   }
}
