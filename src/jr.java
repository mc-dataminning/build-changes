import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record jr(Optional<aul> b, Lifecycle c) {
   public static final jr a = new jr(Optional.empty(), Lifecycle.stable());

   public Optional<aul> a() {
      return this.b;
   }

   public Lifecycle b() {
      return this.c;
   }
}
