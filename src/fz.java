import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fz implements Predicate<cmy> {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> vf.b("arguments.item.overstacked", $$0, $$1));
   private final ih<cmt> b;
   @Nullable
   private final sn c;

   public fz(ih<cmt> $$0, @Nullable sn $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public cmt a() {
      return this.b.a();
   }

   public boolean a(cmy $$0) {
      return $$0.a(this.b) && tc.a(this.c, $$0.v(), true);
   }

   public cmy a(int $$0, boolean $$1) throws CommandSyntaxException {
      cmy $$2 = new cmy(this.b, $$0);
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
      return this.b.e().map(ahf::a).orElseGet(() -> "unknown[" + this.b + "]").toString();
   }
}
