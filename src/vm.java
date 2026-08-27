import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record vm(vm.a b) implements vo {
   public static final aep a = new aep("debug/brain");

   public vm(sh $$0) {
      this(new vm.a($$0));
   }

   @Override
   public void a(sh $$0) {
      this.b.a($$0);
   }

   @Override
   public aep a() {
      return a;
   }

   public static record a(
      UUID a,
      int b,
      String c,
      String d,
      int e,
      float f,
      float g,
      ehf h,
      String i,
      @Nullable eaq j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<gv> q,
      Set<gv> r
   ) {
      public a(sh $$0) {
         this(
            $$0.o(),
            $$0.readInt(),
            $$0.r(),
            $$0.r(),
            $$0.readInt(),
            $$0.readFloat(),
            $$0.readFloat(),
            $$0.k(),
            $$0.r(),
            $$0.c(eaq::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(sh::r),
            $$0.a(sh::r),
            $$0.a(sh::r),
            $$0.a(sh::r),
            $$0.a(HashSet::new, sh::e),
            $$0.a(HashSet::new, sh::e)
         );
      }

      public void a(sh $$0) {
         $$0.a(this.a);
         $$0.p(this.b);
         $$0.a(this.c);
         $$0.a(this.d);
         $$0.p(this.e);
         $$0.a(this.f);
         $$0.a(this.g);
         $$0.a(this.h);
         $$0.a(this.i);
         $$0.a(this.j, ($$0x, $$1) -> $$1.a($$0x));
         $$0.a(this.k);
         $$0.p(this.l);
         $$0.a(this.m, sh::a);
         $$0.a(this.n, sh::a);
         $$0.a(this.o, sh::a);
         $$0.a(this.p, sh::a);
         $$0.a(this.q, sh::a);
         $$0.a(this.r, sh::a);
      }

      public boolean a(gv $$0) {
         return this.q.contains($$0);
      }

      public boolean b(gv $$0) {
         return this.r.contains($$0);
      }
   }
}
