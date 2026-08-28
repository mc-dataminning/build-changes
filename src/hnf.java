import java.util.List;
import javax.annotation.Nullable;

public class hnf {
   private final List<hne> a;
   private final boolean b;
   @Nullable
   private final String c;

   public hnf(List<hne> $$0, boolean $$1, @Nullable String $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public List<hne> a() {
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
