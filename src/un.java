import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.logging.LogUtils;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class un implements tg {
   private static final Logger c = LogUtils.getLogger();
   private final String d;
   @Nullable
   private final ga e;
   protected final Optional<tf> b;

   public un(String $$0, Optional<tf> $$1) {
      this.d = $$0;
      this.b = $$1;
      this.e = a($$0);
   }

   @Nullable
   private static ga a(String $$0) {
      ga $$1 = null;

      try {
         gb $$2 = new gb(new StringReader($$0));
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
   public ga b() {
      return this.e;
   }

   public Optional<tf> c() {
      return this.b;
   }

   @Override
   public ts a(@Nullable dr $$0, @Nullable bii $$1, int $$2) throws CommandSyntaxException {
      if ($$0 != null && this.e != null) {
         Optional<? extends tf> $$3 = th.a($$0, this.b, $$1, $$2);
         return th.a(this.e.b($$0), $$3, bii::H_);
      } else {
         return tf.h();
      }
   }

   @Override
   public <T> Optional<T> a(tj.b<T> $$0, ub $$1) {
      return $$0.accept($$1, this.d);
   }

   @Override
   public <T> Optional<T> a(tj.a<T> $$0) {
      return $$0.accept(this.d);
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof un $$1 && this.d.equals($$1.d) && this.b.equals($$1.b)) {
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
