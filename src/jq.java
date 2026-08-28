import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record jq(Optional<auh> b, Lifecycle c) {
   public static final jq a = new jq(Optional.empty(), Lifecycle.stable());

   public Optional<auh> a() {
      return this.b;
   }

   public Lifecycle b() {
      return this.c;
   }
}
