import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ut implements tm {
   private static final Logger c = LogUtils.getLogger();
   private final String d;
   @Nullable
   private final gc e;
   protected final Optional<tl> b;

   public ut(String $$0, Optional<tl> $$1) {
      this.d = $$0;
      this.b = $$1;
      this.e = a($$0);
   }

   @Nullable
   private static gc a(String $$0) {
      gc $$1 = null;

      try {
         gd $$2 = new gd(new StringReader($$0));
         $$1 = $$2.t();
      } catch (CommandSyntaxException var3) {
         c.warn("Invalid selector component: {}: {}", $$0, var3.getMessage());
      }

      return $$1;
   }

   public String a() {
      return this.d;
   }

   @Nullable
   public gc b() {
      return this.e;
   }

   public Optional<tl> c() {
      return this.b;
   }

   @Override
   public ty a(@Nullable dt $$0, @Nullable biq $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.e != null) {
         Optional<? extends tl> $$3 = tn.a($$0, this.b, $$1, $$2);
         return tn.a(this.e.b($$0), $$3, biq::N_);
      } else {
         return tl.h();
      }
   }

   @Override
   public <T> Optional<T> a(tp.b<T> $$0, uh $$1) {
      return $$0.accept($$1, this.d);
   }

   @Override
   public <T> Optional<T> a(tp.a<T> $$0) {
      return $$0.accept(this.d);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof ut $$1 && this.d.equals($$1.d) && this.b.equals($$1.b)) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      int $$0 = this.d.hashCode();
      return 31 * $$0 + this.b.hashCode();
   }

   @Override
   public String toString() {
      return "pattern{" + this.d + "}";
   }
}
