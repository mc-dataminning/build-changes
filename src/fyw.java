import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class fyw {
   @Nullable
   private fyw.a a;
   @Nullable
   private fzb b;

   public void a(akj<? extends jw<?>> $$0, List<ka.a> $$1) {
      if (this.a == null) {
         this.a = new fyw.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<akj<? extends jw<?>>, awp.a> $$0) {
      if (this.b == null) {
         this.b = new fzb();
      }

      $$0.forEach(this.b::a);
   }

   public jx.b a(atz $$0, jx $$1, boolean $$2) {
      jq<fyl> $$3 = fyl.a();
      jx $$6;
      if (this.a != null) {
         jx.b $$4 = $$3.b(fyl.b);
         jx.b $$5 = this.a.a($$0, $$4).d();
         $$6 = $$3.a(fyl.b, $$5).a();
      } else {
         $$6 = $$1;
      }

      if (this.b != null) {
         this.b.a($$6, $$2);
      }

      return $$6.d();
   }

   static class a {
      private final Map<akj<? extends jw<?>>, List<ka.a>> a = new HashMap<>();

      public void a(akj<? extends jw<?>> $$0, List<ka.a> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()).addAll($$1);
      }

      public jx a(atz $$0, jx $$1) {
         return akf.a(this.a, $$0, $$1, akf.c);
      }
   }
}
