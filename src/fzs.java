import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class fzs {
   @Nullable
   private fzs.a a;
   @Nullable
   private fzx b;

   public void a(akq<? extends jz<?>> $$0, List<kd.a> $$1) {
      if (this.a == null) {
         this.a = new fzs.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<akq<? extends jz<?>>, awx.a> $$0) {
      if (this.b == null) {
         this.b = new fzx();
      }

      $$0.forEach(this.b::a);
   }

   public ka.b a(auh $$0, ka $$1, boolean $$2) {
      jt<fzh> $$3 = fzh.a();
      ka $$6;
      if (this.a != null) {
         ka.b $$4 = $$3.b(fzh.b);
         ka.b $$5 = this.a.a($$0, $$4).d();
         $$6 = $$3.a(fzh.b, $$5).a();
      } else {
         $$6 = $$1;
      }

      if (this.b != null) {
         this.b.a($$6, $$2);
      }

      return $$6.d();
   }

   static class a {
      private final Map<akq<? extends jz<?>>, List<kd.a>> a = new HashMap<>();

      public void a(akq<? extends jz<?>> $$0, List<kd.a> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()).addAll($$1);
      }

      public ka a(auh $$0, ka $$1) {
         return akm.a(this.a, $$0, $$1, akm.c);
      }
   }
}
