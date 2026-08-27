import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class wg implements vs {
   private final vt c;
   private final List<vs> d;
   private wp e;
   private avy f = avy.a;
   @Nullable
   private st g;

   wg(vt $$0, List<vs> $$1, wp $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static wg a(vt $$0) {
      return new wg($$0, Lists.newArrayList(), wp.a);
   }

   @Override
   public vt b() {
      return this.c;
   }

   @Override
   public List<vs> c() {
      return this.d;
   }

   public wg b(wp $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public wp a() {
      return this.e;
   }

   public wg f(String $$0) {
      return this.b(vs.b($$0));
   }

   public wg b(vs $$0) {
      this.d.add($$0);
      return this;
   }

   public wg a(UnaryOperator<wp> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public wg c(wp $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public wg a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public wg a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public wg b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public avy g() {
      st $$0 = st.a();
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
         return !($$0 instanceof wg $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
