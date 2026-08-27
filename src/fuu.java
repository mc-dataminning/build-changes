import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class fuu {
   @Nullable
   private fuu.a a;
   @Nullable
   private fuy b;

   public void a(ajs<? extends iy<?>> $$0, List<jc.a> $$1) {
      if (this.a == null) {
         this.a = new fuu.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<ajs<? extends iy<?>>, avu.a> $$0) {
      if (this.b == null) {
         this.b = new fuy();
      }

      $$0.forEach(this.b::a);
   }

   public iz.b a(atf $$0, iz $$1, boolean $$2) {
      is<fuj> $$3 = fuj.a();
      iz $$6;
      if (this.a != null) {
         iz.b $$4 = $$3.b(fuj.b);
         iz.b $$5 = this.a.a($$0, $$4).d();
         $$6 = $$3.a(fuj.b, $$5).a();
      } else {
         $$6 = $$1;
      }

      if (this.b != null) {
         this.b.a($$6, $$2);
      }

      return $$6.d();
   }

   static class a {
      private final Map<ajs<? extends iy<?>>, List<jc.a>> a = new HashMap<>();

      public void a(ajs<? extends iy<?>> $$0, List<jc.a> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()).addAll($$1);
      }

      public iz a(atf $$0, iz $$1) {
         return ajo.a(this.a, $$0, $$1, ajo.c);
      }
   }
}
