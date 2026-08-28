import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record ju(Optional<ats> b, Lifecycle c) {
   public static final ju a = new ju(Optional.empty(), Lifecycle.stable());

   public Optional<ats> a() {
      return this.b;
   }

   public Lifecycle b() {
      return this.c;
   }
}
