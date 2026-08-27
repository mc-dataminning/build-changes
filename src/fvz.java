import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class fvz {
   @Nullable
   private fvz.a a;
   @Nullable
   private fwd b;

   public void a(ake<? extends ji<?>> $$0, List<jm.a> $$1) {
      if (this.a == null) {
         this.a = new fvz.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<ake<? extends ji<?>>, awg.a> $$0) {
      if (this.b == null) {
         this.b = new fwd();
      }

      $$0.forEach(this.b::a);
   }

   public jj.b a(atr $$0, jj $$1, boolean $$2) {
      jc<fvo> $$3 = fvo.a();
      jj $$6;
      if (this.a != null) {
         jj.b $$4 = $$3.b(fvo.b);
         jj.b $$5 = this.a.a($$0, $$4).d();
         $$6 = $$3.a(fvo.b, $$5).a();
      } else {
         $$6 = $$1;
      }

      if (this.b != null) {
         this.b.a($$6, $$2);
      }

      return $$6.d();
   }

   static class a {
      private final Map<ake<? extends ji<?>>, List<jm.a>> a = new HashMap<>();

      public void a(ake<? extends ji<?>> $$0, List<jm.a> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()).addAll($$1);
      }

      public jj a(atr $$0, jj $$1) {
         return aka.a(this.a, $$0, $$1, aka.c);
      }
   }
}
