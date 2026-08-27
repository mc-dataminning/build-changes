import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class fxe {
   @Nullable
   private fxe.a a;
   @Nullable
   private fxi b;

   public void a(akm<? extends jk<?>> $$0, List<jo.a> $$1) {
      if (this.a == null) {
         this.a = new fxe.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<akm<? extends jk<?>>, awp.a> $$0) {
      if (this.b == null) {
         this.b = new fxi();
      }

      $$0.forEach(this.b::a);
   }

   public jl.b a(aua $$0, jl $$1, boolean $$2) {
      je<fwt> $$3 = fwt.a();
      jl $$6;
      if (this.a != null) {
         jl.b $$4 = $$3.b(fwt.b);
         jl.b $$5 = this.a.a($$0, $$4).d();
         $$6 = $$3.a(fwt.b, $$5).a();
      } else {
         $$6 = $$1;
      }

      if (this.b != null) {
         this.b.a($$6, $$2);
      }

      return $$6.d();
   }

   static class a {
      private final Map<akm<? extends jk<?>>, List<jo.a>> a = new HashMap<>();

      public void a(akm<? extends jk<?>> $$0, List<jo.a> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()).addAll($$1);
      }

      public jl a(aua $$0, jl $$1) {
         return aki.a(this.a, $$0, $$1, aki.c);
      }
   }
}
