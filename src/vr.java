import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class vr implements vd {
   private final ve c;
   private final List<vd> d;
   private wa e;
   private atu f = atu.a;
   @Nullable
   private sg g;

   vr(ve $$0, List<vd> $$1, wa $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static vr a(ve $$0) {
      return new vr($$0, Lists.newArrayList(), wa.a);
   }

   @Override
   public ve b() {
      return this.c;
   }

   @Override
   public List<vd> c() {
      return this.d;
   }

   public vr b(wa $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public wa a() {
      return this.e;
   }

   public vr f(String $$0) {
      return this.b(vd.b($$0));
   }

   public vr b(vd $$0) {
      this.d.add($$0);
      return this;
   }

   public vr a(UnaryOperator<wa> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public vr c(wa $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public vr a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public vr a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public vr b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public atu g() {
      sg $$0 = sg.a();
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
         return !($$0 instanceof vr $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
