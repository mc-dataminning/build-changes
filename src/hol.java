import java.util.List;
import javax.annotation.Nullable;

public class hol {
   private final List<hok> a;
   private final boolean b;
   @Nullable
   private final String c;

   public hol(List<hok> $$0, boolean $$1, @Nullable String $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public List<hok> a() {
      return this.a;
   }

   public boolean b() {
      return this.b;
   }

   @Nullable
   public String c() {
      return this.c;
   }
}
