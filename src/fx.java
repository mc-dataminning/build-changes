import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fx implements Predicate<cjl> {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> tl.b("arguments.item.overstacked", $$0, $$1));
   private final he<cjg> b;
   @Nullable
   private final qw c;

   public fx(he<cjg> $$0, @Nullable qw $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public cjg a() {
      return this.b.a();
   }

   public boolean a(cjl $$0) {
      return $$0.a(this.b) && rj.a(this.c, $$0.v(), true);
   }

   public cjl a(int $$0, boolean $$1) throws CommandSyntaxException {
      cjl $$2 = new cjl(this.b, $$0);
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
      return this.b.e().map(aey::a).orElseGet(() -> "unknown[" + this.b + "]").toString();
   }
}
