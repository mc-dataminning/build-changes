import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class fyi {
   @Nullable
   private fyi.a a;
   @Nullable
   private fym b;

   public void a(ale<? extends jv<?>> $$0, List<jz.a> $$1) {
      if (this.a == null) {
         this.a = new fyi.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<ale<? extends jv<?>>, axi.a> $$0) {
      if (this.b == null) {
         this.b = new fym();
      }

      $$0.forEach(this.b::a);
   }

   public jw.b a(aus $$0, jw $$1, boolean $$2) {
      jp<fxx> $$3 = fxx.a();
      jw $$6;
      if (this.a != null) {
         jw.b $$4 = $$3.b(fxx.b);
         jw.b $$5 = this.a.a($$0, $$4).d();
         $$6 = $$3.a(fxx.b, $$5).a();
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
