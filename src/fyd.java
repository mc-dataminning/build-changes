import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class fyd {
   @Nullable
   private fyd.a a;
   @Nullable
   private fyh b;

   public void a(ala<? extends jv<?>> $$0, List<jz.a> $$1) {
      if (this.a == null) {
         this.a = new fyd.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<ala<? extends jv<?>>, axe.a> $$0) {
      if (this.b == null) {
         this.b = new fyh();
      }

      $$0.forEach(this.b::a);
   }

   public jw.b a(auo $$0, jw $$1, boolean $$2) {
      jp<fxs> $$3 = fxs.a();
      jw $$6;
      if (this.a != null) {
         jw.b $$4 = $$3.b(fxs.b);
         jw.b $$5 = this.a.a($$0, $$4).d();
         $$6 = $$3.a(fxs.b, $$5).a();
      } else {
         $$6 = $$1;
      }

      if (this.b != null) {
         this.b.a($$6, $$2);
      }

      return $$6.d();
   }

   static class a {
      private final Map<ala<? extends jv<?>>, List<jz.a>> a = new HashMap<>();

      public void a(ala<? extends jv<?>> $$0, List<jz.a> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()).addAll($$1);
      }

      public jw a(auo $$0, jw $$1) {
         return akw.a(this.a, $$0, $$1, akw.c);
      }
   }
}
