import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class gdt implements gdu<gcl> {
   private final List<gdu<gcl>> a = Lists.newArrayList();
   @Nullable
   private final tn b;

   public gdt(aey $$0, @Nullable String $$1) {
      this.b = $$1 == null ? null : tn.c($$1);
   }

   @Override
   public int e() {
      int $$0 = 0;

      for (gdu<gcl> $$1 : this.a) {
         $$0 += $$1.e();
      }

      return $$0;
   }

   public gcl a(ase $$0) {
      int $$1 = this.e();
      if (!this.a.isEmpty() && $$1 != 0) {
         int $$2 = $$0.a($$1);

         for (gdu<gcl> $$3 : this.a) {
            $$2 -= $$3.e();
            if ($$2 < 0) {
               return $$3.b($$0);
            }
         }

         return gds.a;
      } else {
         return gds.a;
      }
   }

   public void a(gdu<gcl> $$0) {
      this.a.add($$0);
   }

   @Nullable
   public tn a() {
      return this.b;
   }

   @Override
   public void a(gdp $$0) {
      for (gdu<gcl> $$1 : this.a) {
         $$1.a($$0);
      }
   }
}
