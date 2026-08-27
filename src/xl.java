import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public record xl(xl.a b) implements xo {
   public static final agt a = new agt("debug/brain");

   public xl(ue $$0) {
      this(new xl.a($$0));
   }

   @Override
   public void a(ue $$0) {
      this.b.a($$0);
   }

   @Override
   public agt a() {
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
      elb h,
      String i,
      @Nullable eeo j,
      boolean k,
      int l,
      List<String> m,
      List<String> n,
      List<String> o,
      List<String> p,
      Set<hv> q,
      Set<hv> r
   ) {
      public a(ue $$0) {
         this(
            $$0.p(),
            $$0.readInt(),
            $$0.s(),
            $$0.s(),
            $$0.readInt(),
            $$0.readFloat(),
            $$0.readFloat(),
            $$0.k(),
            $$0.s(),
            $$0.c(eeo::b),
            $$0.readBoolean(),
            $$0.readInt(),
            $$0.a(ue::s),
            $$0.a(ue::s),
            $$0.a(ue::s),
            $$0.a(ue::s),
            $$0.a(HashSet::new, ue::e),
            $$0.a(HashSet::new, ue::e)
         );
      }

      public void a(ue $$0) {
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
         $$0.a(this.m, ue::a);
         $$0.a(this.n, ue::a);
         $$0.a(this.o, ue::a);
         $$0.a(this.p, ue::a);
         $$0.a(this.q, ue::a);
         $$0.a(this.r, ue::a);
      }

      public boolean a(hv $$0) {
         return this.q.contains($$0);
      }

      public boolean b(hv $$0) {
         return this.r.contains($$0);
      }
   }
}
