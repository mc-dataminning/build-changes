import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class wu implements wg {
   private final wh c;
   private final List<wg> d;
   private xd e;
   private aww f = aww.a;
   @Nullable
   private th g;

   wu(wh $$0, List<wg> $$1, xd $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static wu a(wh $$0) {
      return new wu($$0, Lists.newArrayList(), xd.a);
   }

   @Override
   public wh b() {
      return this.c;
   }

   @Override
   public List<wg> c() {
      return this.d;
   }

   public wu b(xd $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public xd a() {
      return this.e;
   }

   public wu f(String $$0) {
      return this.b(wg.b($$0));
   }

   public wu b(wg $$0) {
      this.d.add($$0);
      return this;
   }

   public wu a(UnaryOperator<xd> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public wu c(xd $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public wu a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public wu a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public wu b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public aww g() {
      th $$0 = th.a();
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
         return !($$0 instanceof wu $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
