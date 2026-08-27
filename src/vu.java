import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class vu implements vg {
   private final vh c;
   private final List<vg> d;
   private wd e;
   private aub f = aub.a;
   @Nullable
   private sj g;

   vu(vh $$0, List<vg> $$1, wd $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static vu a(vh $$0) {
      return new vu($$0, Lists.newArrayList(), wd.a);
   }

   @Override
   public vh b() {
      return this.c;
   }

   @Override
   public List<vg> c() {
      return this.d;
   }

   public vu b(wd $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public wd a() {
      return this.e;
   }

   public vu f(String $$0) {
      return this.b(vg.b($$0));
   }

   public vu b(vg $$0) {
      this.d.add($$0);
      return this;
   }

   public vu a(UnaryOperator<wd> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public vu c(wd $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public vu a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public vu a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public vu b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public aub g() {
      sj $$0 = sj.a();
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
         return !($$0 instanceof vu $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
