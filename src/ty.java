import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class ty implements tl {
   private final tm c;
   private final List<tl> d;
   private uh e;
   private ark f = ark.a;
   @Nullable
   private qs g;

   ty(tm $$0, List<tl> $$1, uh $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static ty a(tm $$0) {
      return new ty($$0, Lists.newArrayList(), uh.a);
   }

   @Override
   public tm b() {
      return this.c;
   }

   @Override
   public List<tl> c() {
      return this.d;
   }

   public ty b(uh $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public uh a() {
      return this.e;
   }

   public ty f(String $$0) {
      return this.b(tl.b($$0));
   }

   public ty b(tl $$0) {
      this.d.add($$0);
      return this;
   }

   public ty a(UnaryOperator<uh> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public ty c(uh $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public ty a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public ty a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   @Override
   public ark f() {
      qs $$0 = qs.a();
      if (this.g != $$0) {
         this.f = $$0.a(this);
         this.g = $$0;
      }

      return this.f;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof ty $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.c, this.e, this.d);
   }

   @Override
   public String toString() {
      StringBuilder $$0 = new StringBuilder(this.c.toString());
      boolean $$1 = !this.e.g();
      boolean $$2 = !this.d.isEmpty();
      if ($$1 || $$2) {
         $$0.append('[');
         if ($$1) {
            $$0.append("style=");
            $$0.append(this.e);
         }

         if ($$1 && $$2) {
            $$0.append(", ");
         }

         if ($$2) {
            $$0.append("siblings=");
            $$0.append(this.d);
         }

         $$0.append(']');
      }

      return $$0.toString();
   }
}
