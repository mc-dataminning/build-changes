import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class fzm {
   @Nullable
   private fzm.a a;
   @Nullable
   private fzr b;

   public void a(akp<? extends jz<?>> $$0, List<kd.a> $$1) {
      if (this.a == null) {
         this.a = new fzm.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<akp<? extends jz<?>>, aww.a> $$0) {
      if (this.b == null) {
         this.b = new fzr();
      }

      $$0.forEach(this.b::a);
   }

   public ka.b a(aug $$0, ka $$1, boolean $$2) {
      jt<fzb> $$3 = fzb.a();
      ka $$6;
      if (this.a != null) {
         ka.b $$4 = $$3.b(fzb.b);
         ka.b $$5 = this.a.a($$0, $$4).d();
         $$6 = $$3.a(fzb.b, $$5).a();
      } else {
         $$6 = $$1;
      }

      if (this.b != null) {
         this.b.a($$6, $$2);
      }

      return $$6.d();
   }

   static class a {
      private final Map<akp<? extends jz<?>>, List<kd.a>> a = new HashMap<>();

      public void a(akp<? extends jz<?>> $$0, List<kd.a> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()).addAll($$1);
      }

      public ka a(aug $$0, ka $$1) {
         return akl.a(this.a, $$0, $$1, akl.c);
      }
   }
}
