import java.util.List;
import javax.annotation.Nullable;

public class gff {
   private final List<gfe> a;
   private final boolean b;
   @Nullable
   private final String c;

   public gff(List<gfe> $$0, boolean $$1, @Nullable String $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public List<gfe> a() {
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
