import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record jr(Optional<auj> b, Lifecycle c) {
   public static final jr a = new jr(Optional.empty(), Lifecycle.stable());

   public Optional<auj> a() {
      return this.b;
   }

   public Lifecycle b() {
      return this.c;
   }
}
