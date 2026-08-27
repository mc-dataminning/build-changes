import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fz implements Predicate<clj> {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> ur.b("arguments.item.overstacked", $$0, $$1));
   private final ib<cle> b;
   @Nullable
   private final rz c;

   public fz(ib<cle> $$0, @Nullable rz $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public cle a() {
      return this.b.a();
   }

   public boolean a(clj $$0) {
      return $$0.a(this.b) && so.a(this.c, $$0.v(), true);
   }

   public clj a(int $$0, boolean $$1) throws CommandSyntaxException {
      clj $$2 = new clj(this.b, $$0);
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
      return this.b.e().map(agh::a).orElseGet(() -> "unknown[" + this.b + "]").toString();
   }
}
