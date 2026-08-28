import com.google.common.collect.ImmutableList;
import java.util.function.UnaryOperator;

public class glm {
   private final glo a;

   public glm() {
      this(new glo(ImmutableList.of(), glg.a));
   }

   private glm(glo $$0) {
      this.a = $$0;
   }

   public glo a() {
      return this.a;
   }

   public glm a(UnaryOperator<glg> $$0) {
      return new glm(this.a.a($$0));
   }

   public glm a(gln $$0) {
      return $$0.apply(this);
   }
}
