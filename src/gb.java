import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class gb implements Predicate<cqm> {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> vu.b("arguments.item.overstacked", $$0, $$1));
   private final il<cqh> b;
   @Nullable
   private final ta c;

   public gb(il<cqh> $$0, @Nullable ta $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public cqh a() {
      return this.b.a();
   }

   public boolean a(cqm $$0) {
      return $$0.a(this.b) && tp.a(this.c, $$0.w(), true);
   }

   public cqm a(int $$0, boolean $$1) throws CommandSyntaxException {
      cqm $$2 = new cqm(this.b, $$0);
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
      return this.b.e().map(ajg::a).orElseGet(() -> "unknown[" + this.b + "]").toString();
   }
}
