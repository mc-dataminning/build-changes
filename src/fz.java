import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fz implements Predicate<ckj> {
   private static final Dynamic2CommandExceptionType a = new Dynamic2CommandExceptionType(($$0, $$1) -> ui.b("arguments.item.overstacked", $$0, $$1));
   private final ib<cke> b;
   @Nullable
   private final rt c;

   public fz(ib<cke> $$0, @Nullable rt $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public cke a() {
      return this.b.a();
   }

   public boolean a(ckj $$0) {
      return $$0.a(this.b) && sg.a(this.c, $$0.v(), true);
   }

   public ckj a(int $$0, boolean $$1) throws CommandSyntaxException {
      ckj $$2 = new ckj(this.b, $$0);
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
      return this.b.e().map(afv::a).orElseGet(() -> "unknown[" + this.b + "]").toString();
   }
}
