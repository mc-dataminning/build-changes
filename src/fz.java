import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fz implements Predicate<clo> {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> uv.b("arguments.item.overstacked", $$0, $$1));
   private final ig<clj> b;
   @Nullable
   private final sd c;

   public fz(ig<clj> $$0, @Nullable sd $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public clj a() {
      return this.b.a();
   }

   public boolean a(clo $$0) {
      return $$0.a(this.b) && ss.a(this.c, $$0.v(), true);
   }

   public clo a(int $$0, boolean $$1) throws CommandSyntaxException {
      clo $$2 = new clo(this.b, $$0);
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
      return this.b.e().map(agl::a).orElseGet(() -> "unknown[" + this.b + "]").toString();
   }
}
