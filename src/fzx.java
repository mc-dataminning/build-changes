import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class fzx implements aut {
   private Map<fzz, gah> a = ImmutableMap.of();

   public gab a(fzz $$0) {
      gah $$1 = this.a.get($$0);
      if ($$1 == null) {
         throw new IllegalArgumentException("No model for layer " + $$0);
      } else {
         return $$1.a();
      }
   }

   @Override
   public void a(aus $$0) {
      this.a = ImmutableMap.copyOf(fzy.a());
   }
}
