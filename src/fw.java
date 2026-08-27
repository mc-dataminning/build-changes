import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fw implements Predicate<ciw> {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> te.a("arguments.item.overstacked", $$0, $$1));
   private final hf<cir> b;
   @Nullable
   private final qs c;

   public fw(hf<cir> $$0, @Nullable qs $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public cir a() {
      return this.b.a();
   }

   public boolean a(ciw $$0) {
      return $$0.a(this.b) && re.a(this.c, $$0.v(), true);
   }

   public ciw a(int $$0, boolean $$1) throws CommandSyntaxException {
      ciw $$2 = new ciw(this.b, $$0);
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
      return this.b.e().map(aeo::a).orElseGet(() -> "unknown[" + this.b + "]").toString();
   }
}
