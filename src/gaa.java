import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class gaa {
   @Nullable
   private gaa.a a;
   @Nullable
   private gae b;

   public void a(aks<? extends jn<?>> $$0, List<jr.a> $$1) {
      if (this.a == null) {
         this.a = new gaa.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<aks<? extends jn<?>>, aww.a> $$0) {
      if (this.b == null) {
         this.b = new gae();
      }

      $$0.forEach(this.b::a);
   }

   public jo.b a(aug $$0, jo $$1, boolean $$2) {
      jh<fzp> $$3 = fzp.a();
      jo $$6;
      if (this.a != null) {
         jo.b $$4 = $$3.b(fzp.b);
         jo.b $$5 = this.a.a($$0, $$4).d();
         $$6 = $$3.a(fzp.b, $$5).a();
      } else {
         $$6 = $$1;
      }

      if (this.b != null) {
         this.b.a($$6, $$2);
      }

      return $$6.d();
   }

   static class a {
      private final Map<aks<? extends jn<?>>, List<jr.a>> a = new HashMap<>();

      public void a(aks<? extends jn<?>> $$0, List<jr.a> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()).addAll($$1);
      }

      public jo a(aug $$0, jo $$1) {
         return ako.a(this.a, $$0, $$1, ako.c);
      }
   }
}
