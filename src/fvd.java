import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class fvd {
   @Nullable
   private fvd.a a;
   @Nullable
   private fvh b;

   public void a(aju<? extends ja<?>> $$0, List<je.a> $$1) {
      if (this.a == null) {
         this.a = new fvd.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<aju<? extends ja<?>>, avw.a> $$0) {
      if (this.b == null) {
         this.b = new fvh();
      }

      $$0.forEach(this.b::a);
   }

   public jb.b a(ath $$0, jb $$1, boolean $$2) {
      iu<fus> $$3 = fus.a();
      jb $$6;
      if (this.a != null) {
         jb.b $$4 = $$3.b(fus.b);
         jb.b $$5 = this.a.a($$0, $$4).d();
         $$6 = $$3.a(fus.b, $$5).a();
      } else {
         $$6 = $$1;
      }

      if (this.b != null) {
         this.b.a($$6, $$2);
      }

      return $$6.d();
   }

   static class a {
      private final Map<aju<? extends ja<?>>, List<je.a>> a = new HashMap<>();

      public void a(aju<? extends ja<?>> $$0, List<je.a> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()).addAll($$1);
      }

      public jb a(ath $$0, jb $$1) {
         return ajq.a(this.a, $$0, $$1, ajq.c);
      }
   }
}
