import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class fyk {
   @Nullable
   private fyk.a a;
   @Nullable
   private fyo b;

   public void a(ale<? extends jv<?>> $$0, List<jz.a> $$1) {
      if (this.a == null) {
         this.a = new fyk.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<ale<? extends jv<?>>, axi.a> $$0) {
      if (this.b == null) {
         this.b = new fyo();
      }

      $$0.forEach(this.b::a);
   }

   public jw.b a(aus $$0, jw $$1, boolean $$2) {
      jp<fxz> $$3 = fxz.a();
      jw $$6;
      if (this.a != null) {
         jw.b $$4 = $$3.b(fxz.b);
         jw.b $$5 = this.a.a($$0, $$4).d();
         $$6 = $$3.a(fxz.b, $$5).a();
      } else {
         $$6 = $$1;
      }

      if (this.b != null) {
         this.b.a($$6, $$2);
      }

      return $$6.d();
   }

   static class a {
      private final Map<ale<? extends jv<?>>, List<jz.a>> a = new HashMap<>();

      public void a(ale<? extends jv<?>> $$0, List<jz.a> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()).addAll($$1);
      }

      public jw a(aus $$0, jw $$1) {
         return ala.a(this.a, $$0, $$1, ala.c);
      }
   }
}
