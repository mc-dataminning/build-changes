import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gb implements Predicate<cpq> {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> vs.b("arguments.item.overstacked", $$0, $$1));
   private final il<cpl> b;
   @Nullable
   private final sy c;

   public gb(il<cpl> $$0, @Nullable sy $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public cpl a() {
      return this.b.a();
   }

   public boolean a(cpq $$0) {
      return $$0.a(this.b) && tn.a(this.c, $$0.w(), true);
   }

   public cpq a(int $$0, boolean $$1) throws CommandSyntaxException {
      cpq $$2 = new cpq(this.b, $$0);
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
      return this.b.e().map(ajb::a).orElseGet(() -> "unknown[" + this.b + "]").toString();
   }
}
