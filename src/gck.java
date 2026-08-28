import com.google.common.collect.ImmutableList;
import java.util.function.UnaryOperator;

public class gck {
   private final gcm a;

   public gck() {
      this(new gcm(ImmutableList.of(), gce.a));
   }

   private gck(gcm $$0) {
      this.a = $$0;
   }

   public gcm a() {
      return this.a;
   }

   public gck a(UnaryOperator<gce> $$0) {
      return new gck(this.a.a($$0));
   }
}
