import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class tv implements ti {
   private final tj c;
   private final List<ti> d;
   private ue e;
   private arf f = arf.a;
   @Nullable
   private qp g;

   tv(tj $$0, List<ti> $$1, ue $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static tv a(tj $$0) {
      return new tv($$0, Lists.newArrayList(), ue.a);
   }

   @Override
   public tj b() {
      return this.c;
   }

   @Override
   public List<ti> c() {
      return this.d;
   }

   public tv b(ue $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public ue a() {
      return this.e;
   }

   public tv f(String $$0) {
      return this.b(ti.b($$0));
   }

   public tv b(ti $$0) {
      this.d.add($$0);
      return this;
   }

   public tv a(UnaryOperator<ue> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public tv c(ue $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public tv a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public tv a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   @Override
   public arf f() {
      qp $$0 = qp.a();
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
         return !($$0 instanceof tv $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
