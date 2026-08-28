import com.mojang.serialization.Lifecycle;
import java.util.Optional;

public record jy(Optional<atl> b, Lifecycle c) {
   public static final jy a = new jy(Optional.empty(), Lifecycle.stable());

   public Optional<atl> a() {
      return this.b;
   }

   public Lifecycle b() {
      return this.c;
   }
}
