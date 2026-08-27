import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fv implements Predicate<ciy> {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> tf.a("arguments.item.overstacked", $$0, $$1));
   private final he<cit> b;
   @Nullable
   private final qr c;

   public fv(he<cit> $$0, @Nullable qr $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public cit a() {
      return this.b.a();
   }

   public boolean a(ciy $$0) {
      return $$0.a(this.b) && rd.a(this.c, $$0.v(), true);
   }

   public ciy a(int $$0, boolean $$1) throws CommandSyntaxException {
      ciy $$2 = new ciy(this.b, $$0);
      if (this.c != null) {
         $$2.c(this.c);
      }

      if ($$1 && $$0 > $$2.g()) {
         throw a.create(this.c(), $$2.g());
      } else {
         return $$2;
      }
   }

   public String b() {
      StringBuilder $$0 = new StringBuilder(this.c());
      if (this.c != null) {
         $$0.append(this.c);
      }

      return $$0.toString();
   }

   private String c() {
      return this.b.e().map(aeq::a).orElseGet(() -> "unknown[" + this.b + "]").toString();
   }
}
