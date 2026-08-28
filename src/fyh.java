import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

public class fyh {
   @Nullable
   private fyh.a a;
   @Nullable
   private fyl b;

   public void a(ald<? extends jv<?>> $$0, List<jz.a> $$1) {
      if (this.a == null) {
         this.a = new fyh.a();
      }

      this.a.a($$0, $$1);
   }

   public void a(Map<ald<? extends jv<?>>, axh.a> $$0) {
      if (this.b == null) {
         this.b = new fyl();
      }

      $$0.forEach(this.b::a);
   }

   public jw.b a(aur $$0, jw $$1, boolean $$2) {
      jp<fxw> $$3 = fxw.a();
      jw $$6;
      if (this.a != null) {
         jw.b $$4 = $$3.b(fxw.b);
         jw.b $$5 = this.a.a($$0, $$4).d();
         $$6 = $$3.a(fxw.b, $$5).a();
      } else {
         $$6 = $$1;
      }

      if (this.b != null) {
         this.b.a($$6, $$2);
      }

      return $$6.d();
   }

   static class a {
      private final Map<ald<? extends jv<?>>, List<jz.a>> a = new HashMap<>();

      public void a(ald<? extends jv<?>> $$0, List<jz.a> $$1) {
         this.a.computeIfAbsent($$0, $$0x -> new ArrayList<>()).addAll($$1);
      }

      public jw a(aur $$0, jw $$1) {
         return akz.a(this.a, $$0, $$1, akz.c);
      }
   }
}
