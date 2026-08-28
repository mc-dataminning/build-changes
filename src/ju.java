import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record ju(Optional<atw> b, Lifecycle c) {
   public static final ju a = new ju(Optional.empty(), Lifecycle.stable());

   public Optional<atw> a() {
      return this.b;
   }

   public Lifecycle b() {
      return this.c;
   }
}
