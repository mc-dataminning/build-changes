import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record ix(Optional<asj> b, Lifecycle c) {
   public static final ix a = new ix(Optional.empty(), Lifecycle.stable());

   public Optional<asj> a() {
      return this.b;
   }

   public Lifecycle b() {
      return this.c;
   }
}
