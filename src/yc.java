import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;

public class yc implements xo {
   private final xp c;
   private final List<xo> d;
   private yl e;
   private ayj f = ayj.a;
   @Nullable
   private um g;

   yc(xp $$0, List<xo> $$1, yl $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   public static yc a(xp $$0) {
      return new yc($$0, Lists.newArrayList(), yl.a);
   }

   @Override
   public xp b() {
      return this.c;
   }

   @Override
   public List<xo> c() {
      return this.d;
   }

   public yc b(yl $$0) {
      this.e = $$0;
      return this;
   }

   @Override
   public yl a() {
      return this.e;
   }

   public yc f(String $$0) {
      return this.b(xo.b($$0));
   }

   public yc b(xo $$0) {
      this.d.add($$0);
      return this;
   }

   public yc a(UnaryOperator<yl> $$0) {
      this.b($$0.apply(this.a()));
      return this;
   }

   public yc c(yl $$0) {
      this.b($$0.a(this.a()));
      return this;
   }

   public yc a(n... $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   public yc a(n $$0) {
      this.b(this.a().b($$0));
      return this;
   }

   public yc b(int $$0) {
      this.b(this.a().a($$0));
      return this;
   }

   @Override
   public ayj g() {
      um $$0 = um.a();
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
         return !($$0 instanceof yc $$1) ? false : this.c.equals($$1.c) && this.e.equals($$1.e) && this.d.equals($$1.d);
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
